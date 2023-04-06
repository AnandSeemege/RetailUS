package com.andy.usRetail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageAll {

	WebDriver driver;

	public HomePageAll(WebDriver driver) {
		this.driver=driver;
	}
	
	By shipConfirmationPopup = By.id("closeButton");
	
	public void closeShippingConfirmationPopup() {
		driver.findElement(shipConfirmationPopup).click();
	}
}
