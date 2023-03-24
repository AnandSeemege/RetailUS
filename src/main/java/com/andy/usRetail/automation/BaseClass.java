package com.andy.usRetail.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class BaseClass {
	
	static WebDriver driver;
	private static Logger logger = LogManager.getLogger(BaseClass.class);
	
	@BeforeTest
	public static void preConditions() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anand/Documents/TestingEssentials/selenium/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("Opened Browser and maximised");
		String url = "https://www.macys.com";
		driver.get(url);
		System.out.println("Macys...");
		logger.info("Opened Macys Web Application");
	}
	
	@AfterTest
	public static void postConditions() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		logger.info("Closed the session");
	}
}
