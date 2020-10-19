package com.epam.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	private static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public static WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		if (driver == null)
			driver = new ChromeDriver();
		tdriver.set(driver);
		return driver;
	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
}
