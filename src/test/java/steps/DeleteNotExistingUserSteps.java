package steps;

import config.EndPoints;
import config.TestConfig;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.jsoup.Connection;

import static config.EndPoints.*;
import static org.hamcrest.Matchers.equalTo;

public class DeleteNotExistingUserSteps extends TestConfig {
    private Response response;
    @Step
    public void DeleteNotExistingUser(){
        response = SerenityRest.given().pathParam("userId", INVALID_USER_ID).when().delete("/users/{userId}");
    }

    @Step
    public void deleteRequestIsExecutedWith404AndNotFoundErrorMessage(){
        response.then().statusCode(404).body("error", equalTo(USER_NOT_FOUND_TEXT));
    }
}
