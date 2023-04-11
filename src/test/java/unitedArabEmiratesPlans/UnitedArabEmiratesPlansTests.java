package unitedArabEmiratesPlans;

import base.BaseTests;
import org.testng.annotations.Test;
import utilities.ExpectedPackagesData;
import utilities.WebElementLocators;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UnitedArabEmiratesPlansTests extends BaseTests {
    @Test
    public void testPremiumPlan() {

        String premiumPackage = mainPage.
                clickCountryButton().
                selectFlag(WebElementLocators.unitedArabEmiratesFlag).
                getPremiumPackageText();

        assertTrue(premiumPackage.contains(ExpectedPackagesData.premiumPackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.premiumPackageType, premiumPackage));

        String premiumPackagePrice = mainPage.getPremiumPackagePrice();
        assertEquals(premiumPackagePrice, ExpectedPackagesData.premiumPackagePriceUAE,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.premiumPackagePriceUAE, premiumPackagePrice));

        String premiumPackageCurrency = mainPage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains(ExpectedPackagesData.packageCurrencyUAE),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyUAE, premiumPackageCurrency));

    }

    @Test
    public void testClassicPlan() {


        String classicPackage = mainPage.
                clickCountryButton().
                selectFlag(WebElementLocators.unitedArabEmiratesFlag).
                getClassicPackageText();

        assertTrue(classicPackage.contains(ExpectedPackagesData.classicPackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.classicPackageType, classicPackage));

        String classicPackagePrice = mainPage.getClassicPackagePrice();
        assertEquals(classicPackagePrice, ExpectedPackagesData.classicPackagePriceUAE,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.classicPackagePriceUAE, classicPackagePrice));

        String classicPackageCurrency = mainPage.getClassicPackageCurrency();
        assertTrue(classicPackageCurrency.contains(ExpectedPackagesData.packageCurrencyUAE),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyUAE, classicPackageCurrency));

    }

    @Test
    public void testLitePlan() {


        String litePackage = mainPage.
                clickCountryButton().
                selectFlag(WebElementLocators.unitedArabEmiratesFlag).
                getLitePackageText();

        assertTrue(litePackage.contains(ExpectedPackagesData.litePackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.litePackageType, litePackage));

        String litePackagePrice = mainPage.getLitePackagePrice();
        assertEquals(litePackagePrice, ExpectedPackagesData.litePackagePriceUAE,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.litePackagePriceUAE, litePackagePrice));

        String litePackageCurrency = mainPage.getLitePackageCurrency();
        assertTrue(litePackageCurrency.contains(ExpectedPackagesData.packageCurrencyUAE),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyUAE, litePackageCurrency));

    }
}
