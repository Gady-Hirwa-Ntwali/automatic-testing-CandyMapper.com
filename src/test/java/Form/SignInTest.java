package Form;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignInTest extends RunTestBAse {
    @Test
    public void testSignIn(){
        homePage.clickRemovePopUp();
        var signIn = homePage.clickJoinUsLink();
        signIn.login("hirwagad767@gmail.com", "yeahmanigg");
        var confirmMessage = signIn.clickSignInButton();
        assertEquals(confirmMessage.loginTextMessage(), "Account Login", "not your account");
    }
}
