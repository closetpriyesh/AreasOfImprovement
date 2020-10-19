package com.epam;

import com.epam.pages.HomePage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomeTest extends BaseTest {

    final static Logger LOG = Logger.getLogger(HomePage.class.getName());
    
    @BeforeClass
    public void homeClassSetUp() {
        LOG.info("Home class set up");
        driver.get(BASE_URL);
    }

    @BeforeMethod
    public void methodSetUp() {
        LOG.info("Home method set up");
    }

    @Test(priority = 0)
    public void verifyHomePageUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), BASE_URL);
    }

    @AfterMethod
    public void methodTeardown() {
        LOG.info("Home method teardown");
    }

    @AfterClass
    public void classTearDown() {
        LOG.info("Home method teardown");
        driver.quit();
    }
}
