package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstName = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(1) > input");
    private By lastName = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(2) > input");
    private By emailfield = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(3) > input");
    private By createButton = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(6) > button");
    //private By returnStirng = By.cssSelector("#bs-6 > span > div > div > div > div > div:nth-child(3) > p");
    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterCridentials(String fName, String lName, String email){
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(emailfield).sendKeys(email);
    }
    public AccountMessagePage clickCreate(){
        driver.findElement(createButton).click();
        return new AccountMessagePage(driver);
    }

}
