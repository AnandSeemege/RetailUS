package com.andy.usRetail.automation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.andy.usRetail.pages.HomePageAll;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class BaseClass {

	public static WebDriver driver;
	public static Logger logger = LogManager.getLogger(BaseClass.class);

	@BeforeSuite
	public static void preConditions() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		logger.info("Opened Browser and maximised");
		String url = "https://www.macys.com";
		driver.get(url);
		System.out.println("Macys...");
		logger.info("Opened Macys Web Application");

		HomePageAll homePageAll = new HomePageAll(driver);
		homePageAll.closeShippingConfirmationPopup();
	}

	@AfterSuite
	public void postConditions() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		logger.info("Closed the session");
	}
}
