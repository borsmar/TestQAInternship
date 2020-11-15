package steps;

import config.EndPoints;
import config.TestConfig;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;



public class CreateUserSteps extends TestConfig {
    private Response response;

    @Step
    public void sentRequestForCreatingNewUser(String json){
        response = SerenityRest.given().body(json).contentType("application/json")
                .header("Content-Type", "application/json").when().post(EndPoints.USERS);
    }

    @Step
    public void creatingIsExecutedSuccesfully(){
        response.then().statusCode(201);
    }
}
