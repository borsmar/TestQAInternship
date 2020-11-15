package tests.negative;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.DeleteNotExistingUserSteps;
import steps.GetContactWithNotExistingIdSteps;

@RunWith(SerenityRunner.class)
public class NegativeTests {
    @Steps
    DeleteNotExistingUserSteps deleteNotExistingUserSteps;
    @Steps
    GetContactWithNotExistingIdSteps getContactWithNotExistingIdSteps;

    @Test
    public void tryToDeleteUserWithNotExistingId(){
        deleteNotExistingUserSteps.DeleteNotExistingUser();
        deleteNotExistingUserSteps.deleteRequestIsExecutedWith404AndNotFoundErrorMessage();
    }

    @Test
    public void tryToGetContactWithNotExistingId(){
        getContactWithNotExistingIdSteps.getNotExistingContact();
        getContactWithNotExistingIdSteps.getRequestIsExecutedWith404AndNotFoundErrorMessage();
    }
}
