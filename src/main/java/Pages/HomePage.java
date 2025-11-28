package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By removePop = By.cssSelector("#popup-widget183-close-icon");
    private By joinUsLink = By.cssSelector("#bs-2 > span > a");
    private By moreLink = By.cssSelector("#\\32 ");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickRemovePopUp(){
        driver.findElement(removePop).click();
    }
    public LoginPage clickJoinUsLink(){
        driver.findElement(joinUsLink).click();
        return new LoginPage(driver);
    }
    public MoreDropDownpage clickMore(){
        driver.findElement(moreLink).click();
        return new MoreDropDownpage(driver);
    }
}
