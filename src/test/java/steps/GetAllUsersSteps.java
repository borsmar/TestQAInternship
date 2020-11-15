package steps;
import config.EndPoints;
import config.TestConfig;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;

public class GetAllUsersSteps extends TestConfig {
    private Response response;

    @Step
    public void getAllUsers(){
        response = SerenityRest.when().get(EndPoints.USERS);
    }

    @Step
    public void getRequestIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }


}
