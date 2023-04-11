package palestinePlans;

import base.BaseTests;
import org.testng.annotations.Test;
import utilities.ExpectedPackagesData;
import utilities.WebElementLocators;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PalestinePlansTests extends BaseTests {

    @Test
    public void testPremiumPlan() {

        String premiumPackage = mainPage.
                clickCountryButton().
                selectFlag(WebElementLocators.palestineFlag).
                getPremiumPackageText();

        assertTrue(premiumPackage.contains(ExpectedPackagesData.premiumPackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.premiumPackageType, premiumPackage));

        String premiumPackagePrice = mainPage.getPremiumPackagePrice();
        assertEquals(premiumPackagePrice, ExpectedPackagesData.premiumPackagePricePalestine,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.premiumPackagePricePalestine, premiumPackagePrice));

        String premiumPackageCurrency = mainPage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains(ExpectedPackagesData.packageCurrencyPalestine),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyPalestine, premiumPackageCurrency));

    }

    @Test
    public void testClassicPlan() {

        String classicPackage = mainPage.
                clickCountryButton().
                selectFlag(WebElementLocators.palestineFlag).
                getClassicPackageText();

        assertTrue(classicPackage.contains(ExpectedPackagesData.classicPackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.classicPackageType, classicPackage));

        String classicPackagePrice = mainPage.getClassicPackagePrice();
        assertEquals(classicPackagePrice, ExpectedPackagesData.classicPackagePricePalestine,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.classicPackagePricePalestine, classicPackagePrice));

        String classicPackageCurrency = mainPage.getClassicPackageCurrency();
        assertTrue(classicPackageCurrency.contains(ExpectedPackagesData.packageCurrencyPalestine),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyPalestine, classicPackageCurrency));

    }

    @Test
    public void testLitePlan() {
        String litePackage = mainPage.
                clickCountryButton().
                selectFlag(WebElementLocators.palestineFlag).getLitePackageText();


        assertTrue(litePackage.contains(ExpectedPackagesData.litePackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.litePackageType, litePackage));

        String litePackagePrice = mainPage.getLitePackagePrice();
        assertEquals(litePackagePrice, ExpectedPackagesData.litePackagePricePalestine,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.litePackagePricePalestine, litePackagePrice));

        String litePackageCurrency = mainPage.getLitePackageCurrency();
        assertTrue(litePackageCurrency.contains(ExpectedPackagesData.packageCurrencyPalestine),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyPalestine, litePackageCurrency));

    }
}
