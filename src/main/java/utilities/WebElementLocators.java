package utilities;

import org.openqa.selenium.By;

public class WebElementLocators {
    public static By premiumPackage = By.id("name-بريميوم");
    public static By premiumPrice=By.xpath("//div[@id='currency-بريميوم']/b");
    public static By premiumCurrency=By.xpath("//div[@id='currency-بريميوم']/i");
    //***********************************//
   public static By classicPackage = By.id("name-الأساسية");
    public static By classicPrice = By.xpath("//div[@id='currency-الأساسية']/b");
    public static By classicCurrency= By.xpath("//div[@id='currency-الأساسية']/i");
    //***********************************//
    public static By litePackage = By.id("name-لايت");
    public static By litePrice = By.xpath("//div[@id='currency-لايت']/b");
    public static By liteCurrency = By.xpath("//div[@id='currency-لايت']/i");
    //***********************************//

    public static By unitedArabEmiratesFlag= By.id("ae");
    public static By palestineFlag= By.id("ps");
}
