package egyptPlans;

import base.BaseTests;
import org.testng.annotations.Test;
import utilities.ExpectedPackagesData;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EgyptPlansTests extends BaseTests {
//    TODO: we have a UI issue on the prices of the three packages that should be reported.

    @Test
    public void testPremiumPlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String premiumPackage = mainPage.getPremiumPackageText();
        assertTrue(premiumPackage.contains(ExpectedPackagesData.premiumPackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.premiumPackageType,premiumPackage));

        String premiumPackagePrice = mainPage.getPremiumPackagePrice();
        assertEquals(premiumPackagePrice,ExpectedPackagesData.premiumPackagePriceEgypt,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.premiumPackagePriceEgypt, premiumPackagePrice));

        String premiumPackageCurrency = mainPage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains(ExpectedPackagesData.packageCurrencyEgypt),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyEgypt,premiumPackageCurrency));

    }

    @Test
    public void testClassicPlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String classicPackage = mainPage.getClassicPackageText();
        assertTrue(classicPackage.contains(ExpectedPackagesData.classicPackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.classicPackageType,classicPackage));

        String classicPackagePrice = mainPage.getClassicPackagePrice();
        assertEquals(classicPackagePrice,ExpectedPackagesData.classicPackagePriceEgypt,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.classicPackagePriceEgypt, classicPackagePrice));

        String classicPackageCurrency = mainPage.getClassicPackageCurrency();
        assertTrue(classicPackageCurrency.contains(ExpectedPackagesData.packageCurrencyEgypt),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyEgypt, classicPackageCurrency));

    }

    @Test
    public void testLitePlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String litePackage = mainPage.getLitePackageText();
        assertTrue(litePackage.contains(ExpectedPackagesData.litePackageType),
                String.format(packageErrorMessage,
                        ExpectedPackagesData.litePackageType,litePackage));

        String litePackagePrice = mainPage.getLitePackagePrice();
        assertEquals(litePackagePrice,ExpectedPackagesData.litePackagePriceEgypt,
                String.format(priceErrorMessage,
                        ExpectedPackagesData.litePackagePriceEgypt, litePackagePrice));

        String litePackageCurrency = mainPage.getLitePackageCurrency();
        assertTrue(litePackageCurrency.contains(ExpectedPackagesData.packageCurrencyEgypt),
                String.format(currencyErrorMessage,
                        ExpectedPackagesData.packageCurrencyEgypt, litePackageCurrency));

    }
}
