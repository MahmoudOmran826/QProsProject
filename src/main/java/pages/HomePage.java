package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WebElementLocators;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
//    Validate the Subscription Packages – Type & Price and Currency for all Countries
//    Locators
    By premiumPackage = WebElementLocators.premiumPackage;
    By premiumPrice=WebElementLocators.premiumPrice;
    By premiumCurrency=WebElementLocators.premiumCurrency;
    //***********************************//
    By classicPackage = WebElementLocators.classicPackage;

    By classicPrice = WebElementLocators.classicPrice;
    By classicCurrency= WebElementLocators.classicCurrency;
    //***********************************//
    By litePackage = WebElementLocators.litePackage;
    By litePrice = WebElementLocators.litePrice;
    By liteCurrency = WebElementLocators.liteCurrency;
    //***********************************//

    By countryButton= By.id("country-btn");
    By unitedArabEmiratesFlag= By.id("ae");
    By palestineFlag= By.id("ps");

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

    public UnitedArabEmiratesPage selectUAEFlag(){
        selectFlag(unitedArabEmiratesFlag);
        return new UnitedArabEmiratesPage(driver);
    }

    public PalestinePage selectPalestineFlag(){
        selectFlag(palestineFlag);
        return new PalestinePage(driver);
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
