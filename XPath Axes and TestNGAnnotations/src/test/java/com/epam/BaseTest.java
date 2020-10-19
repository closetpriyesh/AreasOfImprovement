package com.epam;

import com.epam.configurations.ConfigDriver;
import com.epam.configurations.WebDriverFactory;
import com.epam.constants.WebConstants;
import com.epam.pages.HomePage;
import com.epam.pages.ShoppingPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    static Logger LOG = Logger.getLogger(BaseTest.class.getName());
    protected WebDriver driver;
    protected final String BASE_URL = WebConstants.BASE_URL;
    ShoppingPage shoppingPage;
    HomePage homePage;
    static int testCount;

    @BeforeSuite
    public void init() {
        LOG.info("Suite execution started");
    }

    @BeforeTest
    public void testSetUp() {
        testCount++;
        LOG.info("New test setup");
        LOG.info("This is test no. "+ testCount);
        driver = WebDriverFactory.getWebDriver();
        ConfigDriver.initialize(driver);
        shoppingPage = PageFactory.initElements(driver, ShoppingPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @AfterTest
    public void testTearDown() {
        LOG.info("Test tear down");
        LOG.info("This was test no. "+ testCount);
        driver.quit();
    }

    @AfterSuite
    public void teardown() {
        LOG.info("Suite teardown");
    }
}
