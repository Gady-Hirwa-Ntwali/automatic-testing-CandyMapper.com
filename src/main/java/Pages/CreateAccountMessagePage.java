package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountMessagePage {
    WebDriver driver;
    private By createAccountMessage = By.cssSelector("#bs-6 > span > div > div > div > div > div:nth-child(3) > p");

    public CreateAccountMessagePage(WebDriver driver){
        this.driver = driver;
    }
    public String confirmationMessage(){
        return driver.findElement(createAccountMessage).getText();
    }

}
