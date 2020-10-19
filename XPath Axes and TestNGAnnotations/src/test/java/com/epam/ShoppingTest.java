package com.epam;

import com.epam.pages.ShoppingPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class ShoppingTest extends BaseTest {

    final static Logger LOG = Logger.getLogger(ShoppingPage.class.getName());

    @BeforeClass
    public void classSetUp() {
        LOG.info("Shopping class set up");
        driver.get(BASE_URL);
    }

    @BeforeMethod
    public void methodSetUp() {
        LOG.info("Shopping method set up");
    }

    @Test(priority = 0)
    public void openShoppingPage() {
        homePage.openShoppingPage();
        Assert.assertEquals(driver.getCurrentUrl(), BASE_URL+ "shop");
    }

    @Test(priority = 1)
    public void verifyNumberOfMobiles() {
        homePage.openShoppingPage();
        Assert.assertEquals(shoppingPage.getAllMobileNames().size(), 4);
    }

    @Test(priority = 2)
    public void verifyMobileNames() {
        List<String> expectedMobileList = Arrays.asList("iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry");
        Assert.assertEquals(shoppingPage.getAllMobileNames(), expectedMobileList);
    }

    @Test(priority = 3)
    public void verifyMobilePrices() {
        List<String> expectedMobilePriceList = Arrays.asList("$24.99", "$24.99", "$24.99", "$24.99");
        Assert.assertEquals(shoppingPage.getAllMobilePrices(), expectedMobilePriceList);
    }

    @Test(priority = 4)
    public void verifyNumberOfMobileCards() {
        homePage.openShoppingPage();
        Assert.assertEquals(shoppingPage.getAllMobileCards().size(), 4);
    }

    @AfterMethod
    public void methodTeardown() {
        LOG.info("Shopping method teardown");
    }

    @AfterClass
    public void classTearDown() {
        LOG.info("Shopping method teardown");
        driver.quit();
    }
}
