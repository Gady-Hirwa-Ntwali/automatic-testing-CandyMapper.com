package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MoreDropDownpage {
    private WebDriver driver;

    public MoreDropDownpage(WebDriver driver){
        this.driver = driver;
    }
    public HalloweenPage getDropDown(){
        driver.findElement(By.cssSelector("#more-68 > li:nth-child(4) > a")).click();
        return new HalloweenPage(driver);
    }
}
