package Form;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class SignInTest extends RunTestBAse {
    @Test
    public void testSignIn(){
        homePage.clickRemovePopUp();
        var signIn = homePage.clickJoinUsLink();
        signIn.login("hirwagad767@gmail.com", "yeahmanigg");
        signIn.clickSignInButton();
    }
}
