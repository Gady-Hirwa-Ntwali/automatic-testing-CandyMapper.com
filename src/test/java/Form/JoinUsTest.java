package Form;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class JoinUsTest extends RunTestBAse {
    @Test
    public void testJoinUs(){
        homePage.clickRemovePopUp();
        var createAccount = homePage.clickJoinUsLink();
        createAccount.clickCreateAccount();
    }
}
