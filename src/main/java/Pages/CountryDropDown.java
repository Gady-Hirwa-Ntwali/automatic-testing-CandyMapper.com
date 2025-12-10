package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class CountryDropDown {
    WebDriver driver;
    public By dropDown = By.cssSelector("#tCounty");
    public String dropDownFrame = "iframe-undefined11";

    public CountryDropDown(WebDriver driver){
        this.driver = driver;
    }

    public Select findElement(){
        switchIframe();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropDown));
        WebElement country = driver.findElement(dropDown);
        return new Select(country);
    }
    public void selectOptions(String options){
        findElement().selectByVisibleText(options);
    }
    public List<String> selectElement(){
        List<WebElement>  elements = findElement().getAllSelectedOptions();
        return elements.stream().map( e-> e.getText()).collect(Collectors.toList());
    }
    private void  switchIframe(){
        driver.switchTo().frame("iframe-undefined11");
    }
}
