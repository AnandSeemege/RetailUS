package com.andy.usRetail.homeHeaderFooter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.andy.usRetail.automation.BaseClass;
import com.andy.usRetail.pages.HomePageAll;

public class CategoryFlyOuts extends BaseClass {
	HomePageAll homePageAll;

	@BeforeTest
	public void setup() {
		homePageAll = new HomePageAll(driver);
	}

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
		boolean result = actual.equals(expected);
		logger.info("Checking if categories are matching...");
		Assert.assertTrue(result);
		logger.info("Categories are as expected");

		homePageAll.clickOnOrderTracking();
		System.out.println("Order tracking");
	}

}
