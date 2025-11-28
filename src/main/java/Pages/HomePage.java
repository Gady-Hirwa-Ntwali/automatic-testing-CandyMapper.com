package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By userIcon = By.cssSelector("#\\34  > div");
    private By removePop = By.cssSelector("#popup-widget183-close-icon");
    private By joinUsLink = By.cssSelector("#bs-2 > span > a");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickRemovePopUp(){
        driver.findElement(removePop).click();
    }
    public JoinUsPage clickJoinUsLink(){
        driver.findElement(joinUsLink).click();
        return new JoinUsPage(driver);
    }

}
