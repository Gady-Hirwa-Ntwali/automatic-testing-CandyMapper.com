package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountMessagePage {
    private WebDriver driver;
    private By returnedMessage =By.cssSelector("#bs-6 > span > div > div > div > div > div:nth-child(3) > p");
    public AccountMessagePage(WebDriver driver){
        this.driver = driver;
    }

    public String getReturnedMessage() {
        return driver.findElement(returnedMessage).getText();
    }
}
