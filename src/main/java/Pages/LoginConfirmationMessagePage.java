package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginConfirmationMessagePage {
    WebDriver driver;
    final private By loginText = By.className("x-el-h1");
    public LoginConfirmationMessagePage(WebDriver driver){
        this.driver = driver;
    }
    public String loginTextMessage(){
        return driver.findElement(loginText).getText();
    }
}
