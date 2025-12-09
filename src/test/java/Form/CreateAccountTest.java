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
           var text =  createAccount.clickCreate();
           assertEquals(text.confirmationMessage(),
                   "You're almost there! We sent an email to hirwagad767@gmail.com with a link to activate your account. Please check your email and click the activation link.",
                   "Incorrect confirmation message");
    }
}
