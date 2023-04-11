package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
//    Validate the Subscription Packages – Type & Price and Currency for all Countries
//    Locators
    By premiumPackage = By.id("name-بريميوم");
    By premiumPrice=By.xpath("//div[@id='currency-بريميوم']/b");
    By premiumCurrency=By.xpath("//div[@id='currency-بريميوم']/i");
    //***********************************//
    By classicPackage = By.id("name-الأساسية");
    By classicPrice = By.xpath("//div[@id='currency-الأساسية']/b");
    By classicCurrency= By.xpath("//div[@id='currency-الأساسية']/i");
    //***********************************//
    By litePackage = By.id("name-لايت");
    By litePrice = By.xpath("//div[@id='currency-لايت']/b");
    By liteCurrency = By.xpath("//div[@id='currency-لايت']/i");
    //***********************************//

    By countryButton= By.id("country-btn");
    By unitedArabEmiratesFlag= By.id("ae");

    //********************************************************************************************************//
//    Actions
    public String getPremiumPackageText(){
        return getElementText(premiumPackage);
    }

    public String getPremiumPackagePrice(){
        return getElementText(premiumPrice);
    }

    public String getPremiumPackageCurrency(){
        return getElementText(premiumCurrency);
    }

    //********************************************************/
    public String getClassicPackageText(){
        return getElementText(classicPackage);
    }

    public String getClassicPackagePrice(){
        return getElementText(classicPrice);
    }

    public String getClassicPackageCurrency(){
        return getElementText(classicCurrency);
    }

    //*****************************************************//

    public String getLitePackageText(){
        return getElementText(litePackage);
    }

    public String getLitePackagePrice(){
        return getElementText(litePrice);
    }

    public String getLitePackageCurrency(){
        return getElementText(liteCurrency);
    }

    public HomePage clickCountryButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(countryButton));
        driver.findElement(countryButton).click();
        return new HomePage(driver);
    }

    public UnitedArabEmiratesPage selecetUAEFlag(){
        selectFlag(unitedArabEmiratesFlag);
        return new UnitedArabEmiratesPage(driver);
    }


    private String getElementText(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).getText();
    }
    private void selectFlag(By flagId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(flagId));
        driver.findElement(flagId).click();
    }
}
