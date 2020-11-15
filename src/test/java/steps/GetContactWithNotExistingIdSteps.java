package steps;

import config.TestConfig;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static config.EndPoints.*;
import static org.hamcrest.Matchers.equalTo;

public class GetContactWithNotExistingIdSteps extends TestConfig {
    private Response response;


    @Step
    public void getNotExistingContact(){
        response = SerenityRest.given().pathParam("userId", VALID_USER_ID).pathParam("contactId", INVALID_CONTACT_ID).when().get("/users/{userId}/contacts/{contactId}");
    }

    @Step
    public void getRequestIsExecutedWith404AndNotFoundErrorMessage(){
        response.then().statusCode(404).body("error", equalTo(CONTACT_NOT_FOUND_TEXT));
    }
}
