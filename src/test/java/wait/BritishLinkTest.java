package wait;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class BritishLinkTest extends RunTestBAse {
    @Test
    public void testBritishLink(){
        homePage.clickRemovePopUp();
        homePage.clickBritishCompanyLink();
    }
}
