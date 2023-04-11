package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //    Validate the Subscription Packages – Type & Price and Currency for all Countries
//    Locators
    private By premiumPackage = By.id("name-بريميوم");
    private By premiumPrice = By.xpath("//div[@id='currency-بريميوم']/b");
    private By premiumCurrency = By.xpath("//div[@id='currency-بريميوم']/i");
    //***********************************//
    private By classicPackage = By.id("name-الأساسية");

    private By classicPrice = By.xpath("//div[@id='currency-الأساسية']/b");
    private By classicCurrency = By.xpath("//div[@id='currency-الأساسية']/i");
    //***********************************//
    private By litePackage = By.id("name-لايت");
    private By litePrice = By.xpath("//div[@id='currency-لايت']/b");
    private By liteCurrency = By.xpath("//div[@id='currency-لايت']/i");
    //***********************************//

    private By countryButton = By.id("country-btn");


    //********************************************************************************************************//
//    Actions
    public String getPremiumPackageText() {
        return getElementText(premiumPackage);
    }

    public String getPremiumPackagePrice() {
        return getElementText(premiumPrice);
    }

    public String getPremiumPackageCurrency() {
        return getElementText(premiumCurrency);
    }

    //********************************************************/
    public String getClassicPackageText() {
        return getElementText(classicPackage);
    }

    public String getClassicPackagePrice() {
        return getElementText(classicPrice);
    }

    public String getClassicPackageCurrency() {
        return getElementText(classicCurrency);
    }

    //*****************************************************//

    public String getLitePackageText() {
        return getElementText(litePackage);
    }

    public String getLitePackagePrice() {
        return getElementText(litePrice);
    }

    public String getLitePackageCurrency() {
        return getElementText(liteCurrency);
    }

    public MainPage clickCountryButton() {
        wait.until(ExpectedConditions.elementToBeClickable(countryButton));
        driver.findElement(countryButton).click();
        return new MainPage(driver);
    }


    private String getElementText(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).getText();
    }

    public MainPage selectFlag(By flagId) {

        wait.until(ExpectedConditions.elementToBeClickable(flagId));
        driver.findElement(flagId).click();
        return new MainPage(driver);
    }
}
