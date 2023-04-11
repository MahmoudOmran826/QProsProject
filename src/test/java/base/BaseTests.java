package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
//     System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://subscribe.stctv.com/");
        driver.manage().window().maximize();

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests baseTestsObject = new BaseTests();
        baseTestsObject.setup();
    }
}
