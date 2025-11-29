package com.edctool.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AssertUtils extends SeleniumActions {
	
	public AssertUtils() {
		PageFactory.initElements(getDriver(), this);
	}

	public void assertEquals(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}
	
	public void assertEqualsPageTitle(String expectedTitle) {
		Assert.assertEquals(getDriver().getTitle(), expectedTitle);
	}
	
	public void isElementDisplayed(WebElement element) {
		waitForElementVisible(element);
		Assert.assertTrue(element.isDisplayed());
	}
}
