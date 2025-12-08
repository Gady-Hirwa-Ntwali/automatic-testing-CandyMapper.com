package DropDown;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class MoreDropDownTest extends RunTestBAse {
    @Test
    public void testMore(){
        homePage.clickRemovePopUp();
       var dropdown = homePage.clickMore();
       var Halloween = dropdown.getDropDown();
        assertEquals(Halloween.headText(), "Halloween Party", "incorrect head");
    }
}
