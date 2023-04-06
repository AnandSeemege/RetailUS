package com.andy.usRetail.homeHeaderFooter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.andy.usRetail.automation.BaseClass;
import com.andy.usRetail.pages.HomePageAll;

public class CategoryFlyOuts extends BaseClass {
	
	HomePageAll homePageAll = new HomePageAll(driver);

	@Test
	public void verifyPresenceOfCategories() {

		String[] expectedCats = { "Women", "Men", "Kids & Baby", "Home", "Shoes", "Handbags & Accessories", "Jewelry",
				"Sale" };
		List<String> expected = Arrays.asList(expectedCats);
		List<WebElement> categoryElements = driver.findElements(By.cssSelector("#mainNavigationFobs>.fob"));

		List<String> actual = new ArrayList<String>();
		for (WebElement ele : categoryElements) {
			actual.add(ele.getText());
		}
		Boolean b = expected.equals(actual);
		logger.info("Checking if categories are matching...");
		Assert.assertTrue(b);
		logger.info("Categories are as expected");
		
//		driver.findElement(By.xpath("(//a[text()='Order Tracking'])[1]")).click();
		homePageAll.clickOnOrderTracking();
	}

}
