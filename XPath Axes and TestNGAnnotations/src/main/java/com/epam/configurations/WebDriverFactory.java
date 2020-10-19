package com.epam.configurations;

import com.epam.constants.LocationConstants;
import com.epam.constants.WebConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	private static WebDriver driver;

	public static WebDriver getWebDriver() {
		System.setProperty(WebConstants.CHROME_DRIVER, LocationConstants.CHROME_DRIVER_LOCATION);
		driver = new ChromeDriver();
		return driver;
	}
}
