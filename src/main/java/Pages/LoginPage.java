package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By emailField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(1) > input");
    private By passwordField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(2) > input");
    private By signInButton = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(5) > button");
    private By createAccount = By.cssSelector("#bs-6 > span > div > div > div > p.x-el.x-el-p.c2-1.c2-2.c2-j.c2-k.c2-38.c2-1t.c2-1u.c2-39.c2-1v.c2-3.c2-3a.c2-4.c2-17.c2-5.c2-4w.c2-6.c2-7.c2-8 > a");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public CreateAccountPage clickCreateAccount(){
        driver.findElement(createAccount).click();
        return new CreateAccountPage(driver);
    }
    public void login(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickSignInButton(){

        driver.findElement(signInButton).click();
    }

}
