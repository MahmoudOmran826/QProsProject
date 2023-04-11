package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WebElementLocators;

import java.time.Duration;

public class PalestinePage {
    private WebDriver driver;
    WebDriverWait wait;

    public PalestinePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //    Locators
    private By premiumPackage = WebElementLocators.premiumPackage;
    private By premiumPrice = WebElementLocators.premiumPrice;
    private By premiumCurrency = WebElementLocators.premiumCurrency;
    //***********************************//
    private By classicPackage = WebElementLocators.classicPackage;

    private By classicPrice = WebElementLocators.classicPrice;
    private By classicCurrency = WebElementLocators.classicCurrency;
    //***********************************//
    private By litePackage = WebElementLocators.litePackage;
    private By litePrice = WebElementLocators.litePrice;
    private By liteCurrency = WebElementLocators.liteCurrency;
    //***********************************//

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

    private String getElementText(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).getText();
    }
}
