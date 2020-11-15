package tests.positive;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.CreateUserSteps;
import steps.GetAllUsersSteps;


@RunWith(SerenityRunner.class)
public class PositiveTests {

    @Steps
    GetAllUsersSteps getAllUsersSteps;
    @Steps
    CreateUserSteps createUserSteps;

    @Test
    public void verifyThatWeGetAllUsersBySearch(){
        getAllUsersSteps.getAllUsers();
        getAllUsersSteps.getRequestIsExecutedSuccesfully();
    }

    @Test
    public void createNewUser() {
        String newUserJson = "{\n" +
                "  \"id\": 21,\n" +
                "  \"firstName\": \"Boris\",\n" +
                "  \"lastName\": \"Marin\"\n" +
                "}";


        createUserSteps.sentRequestForCreatingNewUser(newUserJson);
        createUserSteps.creatingIsExecutedSuccesfully();
    }


}