package DropDown;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class CountryDropDownTest extends RunTestBAse {
@Test
    public void testCountDropDown(){
        var countryDrop= homePage.clickDropDown();
        countryDrop.findElement();
        countryDrop.findElement();
        countryDrop.selectOptions("Cornwall");
        countryDrop.selectElement();

    }
}
