package HomePage;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class HomePageTest extends RunTestBAse {
    @Test
    public void removePopUp(){
        homePage.clickRemovePopUp();
        var joinUspage = homePage.clickJoinUsLink();
    }
}
