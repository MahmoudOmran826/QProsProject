package egyptPlans;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EgyptPlansTests extends BaseTests {

    @Test
    public void testPremiumPlan(){
//        after launching the browser to the home page in the setup method in bas class we assert on the following
        String premiumPackage = homePage.getPremiumPackageText();
        assertTrue(premiumPackage.contains("بريميوم"),
                String.format("Expected package to be بريميوم but found %s ", premiumPackage));

        String premiumPackagePrice = homePage.getPremiumPackagePrice();
        assertTrue(premiumPackagePrice.contains("1"),
                String.format("Expected package price to be 1 but found %s ", premiumPackagePrice));

        String premiumPackageCurrency = homePage.getPremiumPackageCurrency();
        assertTrue(premiumPackageCurrency.contains("دولار أمريكي"),
                String.format("Expected package currency to be دولار أمريكي but found %s ", premiumPackageCurrency));

    }
}
