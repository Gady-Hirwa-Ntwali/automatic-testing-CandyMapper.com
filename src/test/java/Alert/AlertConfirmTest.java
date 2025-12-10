package Alert;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

@Test
public class AlertConfirmTest extends RunTestBAse {
    public void testConfirm(){
        var home = homePage.clickAlert();
        home.Alertconfirm();
    }
}
