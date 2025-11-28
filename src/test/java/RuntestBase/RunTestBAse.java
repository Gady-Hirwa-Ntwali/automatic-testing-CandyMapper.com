package RuntestBase;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RunTestBAse {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void runSite(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://candymapper.com/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void stopRun(){
        driver.quit();
    }
}
