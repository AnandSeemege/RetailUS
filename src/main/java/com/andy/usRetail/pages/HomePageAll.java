package com.andy.usRetail.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAll {

	WebDriver driver;

	public HomePageAll(WebDriver driver) {
		this.driver=driver;
	}
	
	By shipConfirmationPopup = By.id("closeButton");
	By orderTracking = By.xpath("(//a[text()='Order Tracking'])[1]");
	
	public void closeShippingConfirmationPopup() {
		driver.findElement(shipConfirmationPopup).click();
	}
	
	public void clickOnOrderTracking(){
		driver.findElement(orderTracking).click();
	}
	
}
