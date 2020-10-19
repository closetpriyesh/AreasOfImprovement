package com.epam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingPage {

    final static Logger LOG = Logger.getLogger(ShoppingPage.class.getName());

    @FindBy(xpath = "//*[contains(@class,'card')]//following::*[contains(@class,'title')]")
    List<WebElement> mobiles;

    @FindBy(xpath = " //*[contains(@class,'title')]/following-sibling::*[contains(text(),'$')]")
    List<WebElement> mobilePrices;


    // alternate xpath: "//*[contains(@class,'row')]/descendant::app-card"
    @FindBy(xpath = "//*[contains(@class,'row')]/child::app-card")
    List<WebElement> mobileCards;

    public List<String> getAllMobileNames() {
        LOG.info("Getting all mobiles...");
        List<String> mobileNames = mobiles.stream().map(mobile -> mobile.getText()).collect(Collectors.toList());
        return mobileNames;
    }

    public List<String> getAllMobilePrices() {
        LOG.info("Getting all mobiles' prices...");
        List<String> mobilePriceList = mobilePrices.stream().map(price -> price.getText()).collect(Collectors.toList());
        return mobilePriceList;
    }

    public List<WebElement> getAllMobileCards() {
        LOG.info("Getting all mobile cards...");
        return mobileCards;
    }
}
