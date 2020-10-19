package com.epam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    final static Logger LOG = Logger.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//*[contains(text(),'Shop')]")
    WebElement shop;

    public void openShoppingPage() {
        LOG.info("Opening shopping page...");
        shop.click();
    }


}
