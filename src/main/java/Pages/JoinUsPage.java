package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JoinUsPage {
    WebDriver driver;
    private By createAccount = By.cssSelector("#bs-6 > span > div > div > div > p.x-el.x-el-p.c2-1.c2-2.c2-j.c2-k.c2-38.c2-1t.c2-1u.c2-39.c2-1v.c2-3.c2-3a.c2-4.c2-17.c2-5.c2-4w.c2-6.c2-7.c2-8 > a");
    public JoinUsPage(WebDriver driver){
        this.driver = driver;
    }
    public CreateAccountPage clickCreateAccount(){
        driver.findElement(createAccount).click();
        return new CreateAccountPage(driver);
    }
}
