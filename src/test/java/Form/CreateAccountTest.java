package Form;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateAccountTest extends RunTestBAse {
    @Test
    public void testAccountPage(){
            homePage.clickRemovePopUp();
            var joinUs = homePage.clickJoinUsLink();
            var createAccount = joinUs.clickCreateAccount();
            createAccount.enterCridentials("Hirwa", "Gady", "hirwagad767@gmail.com");
            createAccount.clickCreate();
    }
}
