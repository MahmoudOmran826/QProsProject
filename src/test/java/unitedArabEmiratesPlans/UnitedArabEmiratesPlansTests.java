package unitedArabEmiratesPlans;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.UnitedArabEmiratesPage;
import utilities.ExpectedPackagesData;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UnitedArabEmiratesPlansTests extends BaseTests {
    @Test
    public void testPremiumPlan(){
        UnitedArabEmiratesPage unitedArabEmiratesPage=homePage.
                clickCountryButton().selectUAEFlag();
        String premiumPackage =unitedArabEmiratesPage.getPremiumPackageText();

        assertTrue(premiumPackage.contains(ExpectedPackagesData.premiumPackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.premiumPackageType,premiumPackage));

        String premiumPackagePrice = unitedArabEmiratesPage.getPremiumPackagePrice();
        assertEquals(premiumPackagePrice,ExpectedPackagesData.premiumPackagePriceUAE,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.premiumPackagePriceUAE, premiumPackagePrice));

        String premiumPackageCurrency = unitedArabEmiratesPage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains(ExpectedPackagesData.packageCurrencyUAE),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyUAE,premiumPackageCurrency));

    }

    @Test
    public void testClassicPlan(){
        UnitedArabEmiratesPage unitedArabEmiratesPage=homePage.
                clickCountryButton().selectUAEFlag();
        String classicPackage =unitedArabEmiratesPage.getClassicPackageText();

        assertTrue(classicPackage.contains(ExpectedPackagesData.classicPackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.classicPackageType,classicPackage));

        String classicPackagePrice = unitedArabEmiratesPage.getClassicPackagePrice();
        assertEquals(classicPackagePrice,ExpectedPackagesData.classicPackagePriceUAE,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.classicPackagePriceUAE, classicPackagePrice));

        String classicPackageCurrency = unitedArabEmiratesPage.getClassicPackageCurrency();
        assertTrue(classicPackageCurrency.contains(ExpectedPackagesData.packageCurrencyUAE),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyUAE,classicPackageCurrency));

    }

    @Test
    public void testLitePlan(){
        UnitedArabEmiratesPage unitedArabEmiratesPage=homePage.
                clickCountryButton().selectUAEFlag();
        String litePackage =unitedArabEmiratesPage.getLitePackageText();

        assertTrue(litePackage.contains(ExpectedPackagesData.litePackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.litePackageType,litePackage));

        String litePackagePrice = unitedArabEmiratesPage.getLitePackagePrice();
        assertEquals(litePackagePrice,ExpectedPackagesData.litePackagePriceUAE,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.litePackagePriceUAE, litePackagePrice));

        String litePackageCurrency = unitedArabEmiratesPage.getLitePackageCurrency();
        assertTrue(litePackageCurrency.contains(ExpectedPackagesData.packageCurrencyUAE),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyUAE,litePackageCurrency));

    }
}
