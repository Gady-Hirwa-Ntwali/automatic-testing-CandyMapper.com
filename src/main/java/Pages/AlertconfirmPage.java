package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertconfirmPage {
    WebDriver driver;
    public AlertconfirmPage(WebDriver driver){
        this.driver = driver;
    }
    public void Alertconfirm(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.switchTo().alert().accept();
    }
}
