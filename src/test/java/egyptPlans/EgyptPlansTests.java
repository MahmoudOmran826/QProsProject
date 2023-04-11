package egyptPlans;

import base.BaseTests;
import org.testng.annotations.Test;
import utilities.ExpectedPackagesData;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EgyptPlansTests extends BaseTests {

    @Test
    public void testPremiumPlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String premiumPackage = homePage.getPremiumPackageText();
        assertTrue(premiumPackage.contains(ExpectedPackagesData.premiumPackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.premiumPackageType,premiumPackage));

        String premiumPackagePrice = homePage.getPremiumPackagePrice();
        assertEquals(premiumPackagePrice,ExpectedPackagesData.premiumPackagePriceEgypt,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.premiumPackagePriceEgypt, premiumPackagePrice));

        String premiumPackageCurrency = homePage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains(ExpectedPackagesData.packageCurrencyEgypt),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyEgypt,premiumPackageCurrency));

    }

    @Test
    public void testClassicPlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String classicPackage = homePage.getClassicPackageText();
        assertTrue(classicPackage.contains(ExpectedPackagesData.classicPackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.classicPackageType,classicPackage));

        String classicPackagePrice = homePage.getClassicPackagePrice();
        assertEquals(classicPackagePrice,ExpectedPackagesData.classicPackagePriceEgypt,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.classicPackagePriceEgypt, classicPackagePrice));

        String classicPackageCurrency = homePage.getClassicPackageCurrency();
        assertTrue(classicPackageCurrency.contains(ExpectedPackagesData.packageCurrencyEgypt),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyEgypt, classicPackageCurrency));

    }

    @Test
    public void testLitePlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String litePackage = homePage.getLitePackageText();
        assertTrue(litePackage.contains(ExpectedPackagesData.litePackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.litePackageType,litePackage));

        String litePackagePrice = homePage.getLitePackagePrice();
        assertEquals(litePackagePrice,ExpectedPackagesData.litePackagePriceEgypt,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.litePackagePriceEgypt, litePackagePrice));

        String litePackageCurrency = homePage.getPremiumPackageCurrency();
        assertTrue(litePackageCurrency.contains(ExpectedPackagesData.packageCurrencyEgypt),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyEgypt, litePackageCurrency));

    }
}
