package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WebElementLocators;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
//    Validate the Subscription Packages – Type & Price and Currency for all Countries
//    Locators
    private By premiumPackage = WebElementLocators.premiumPackage;
    private By premiumPrice=WebElementLocators.premiumPrice;
    private By premiumCurrency=WebElementLocators.premiumCurrency;
    //***********************************//
    private By classicPackage = WebElementLocators.classicPackage;

    private By classicPrice = WebElementLocators.classicPrice;
    private By classicCurrency= WebElementLocators.classicCurrency;
    //***********************************//
    private By litePackage = WebElementLocators.litePackage;
    private By litePrice = WebElementLocators.litePrice;
    private By liteCurrency = WebElementLocators.liteCurrency;
    //***********************************//

    private By countryButton= By.id("country-btn");
    private By unitedArabEmiratesFlag= By.id("ae");
    private By palestineFlag= By.id("ps");

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
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).getText();
    }
    private void selectFlag(By flagId){

        wait.until(ExpectedConditions.elementToBeClickable(flagId));
        driver.findElement(flagId).click();
    }
}
