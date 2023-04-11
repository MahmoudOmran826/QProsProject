package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainPage;

import java.time.Duration;

public class BaseTests {
    protected String packageErrorMessage = "Expected package to be %s but found %s ";
    protected String priceErrorMessage = "Expected package price to be %s but found %s ";
    protected String currencyErrorMessage = "Expected package currency to be %s but found %s ";
    private WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
//     System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.get("https://subscribe.stctv.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
