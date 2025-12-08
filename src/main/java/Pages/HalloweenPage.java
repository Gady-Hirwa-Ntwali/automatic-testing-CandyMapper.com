package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HalloweenPage {
    WebDriver driver;
    final private By halloweenTitle = By.cssSelector("#\\35 f23ce1d-14db-46b1-8658-fc035c3cf0f3 > div > section > div > div:nth-child(1) > div > div > h1");
  public HalloweenPage(WebDriver driver){
      this.driver = driver;
  }
  public String headText(){
      return driver.findElement(halloweenTitle).getText();
  }
}
