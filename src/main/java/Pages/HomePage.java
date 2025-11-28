package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By removePop = By.cssSelector("#popup-widget183-close-icon");
    private By joinUsLink = By.cssSelector("#bs-2 > span > a");
    private By moreLink = By.cssSelector("#\\32 ");
    private By britishLink = By.cssSelector("#nav-67 > li:nth-child(3) > a");
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
    public void clickBritishCompanyLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(britishLink).click();
    }
}
