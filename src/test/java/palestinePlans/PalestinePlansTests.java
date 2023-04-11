package palestinePlans;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.PalestinePage;
import pages.UnitedArabEmiratesPage;
import utilities.ExpectedPackagesData;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PalestinePlansTests extends BaseTests {
    @Test
    public void testPremiumPlan(){
        PalestinePage palestinePage=homePage.
                clickCountryButton().selectPalestineFlag();

        String premiumPackage =palestinePage.getPremiumPackageText();

        assertTrue(premiumPackage.contains(ExpectedPackagesData.premiumPackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.premiumPackageType,premiumPackage));

        String premiumPackagePrice = palestinePage.getPremiumPackagePrice();
        assertEquals(premiumPackagePrice,ExpectedPackagesData.premiumPackagePricePalestine,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.premiumPackagePricePalestine, premiumPackagePrice));

        String premiumPackageCurrency = palestinePage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains(ExpectedPackagesData.packageCurrencyPalestine),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyPalestine,premiumPackageCurrency));

    }

    @Test
    public void testClassicPlan(){
        PalestinePage palestinePage=homePage.
                clickCountryButton().selectPalestineFlag();
        String classicPackage =palestinePage.getClassicPackageText();

        assertTrue(classicPackage.contains(ExpectedPackagesData.classicPackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.classicPackageType,classicPackage));

        String classicPackagePrice = palestinePage.getClassicPackagePrice();
        assertEquals(classicPackagePrice,ExpectedPackagesData.classicPackagePricePalestine,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.classicPackagePricePalestine, classicPackagePrice));

        String classicPackageCurrency = palestinePage.getClassicPackageCurrency();
        assertTrue(classicPackageCurrency.contains(ExpectedPackagesData.packageCurrencyPalestine),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyPalestine,classicPackageCurrency));

    }

    @Test
    public void testLitePlan(){
        PalestinePage palestinePage=homePage.
                clickCountryButton().selectPalestineFlag();
        String litePackage =palestinePage.getLitePackageText();

        assertTrue(litePackage.contains(ExpectedPackagesData.litePackageType),
                String.format("Expected package to be %s but found %s ",
                        ExpectedPackagesData.litePackageType,litePackage));

        String litePackagePrice = palestinePage.getLitePackagePrice();
        assertEquals(litePackagePrice,ExpectedPackagesData.litePackagePricePalestine,
                String.format("Expected package price to be %s but found %s ",
                        ExpectedPackagesData.litePackagePricePalestine, litePackagePrice));

        String litePackageCurrency = palestinePage.getLitePackageCurrency();
        assertTrue(litePackageCurrency.contains(ExpectedPackagesData.packageCurrencyPalestine),
                String.format("Expected package currency to be %s but found %s ",
                        ExpectedPackagesData.packageCurrencyPalestine,litePackageCurrency));

    }
}
