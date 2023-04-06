package com.andy.usRetail.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.andy.usRetail.pages.HomePageAll;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class BaseClass {
	 
	public WebDriver driver;
	public static Logger logger = LogManager.getLogger(BaseClass.class);
	
	@BeforeTest
	public void preConditions() {
		
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
//		driver.findElement(By.id("closeButton")).click();
	}
	
	@AfterTest
	public void postConditions() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		logger.info("Closed the session");
	}
}
