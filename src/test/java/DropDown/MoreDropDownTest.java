package DropDown;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class MoreDropDownTest extends RunTestBAse {
    @Test
    public void testMore(){
        homePage.clickRemovePopUp();
        var morepage = homePage.clickMore();
    }
}
