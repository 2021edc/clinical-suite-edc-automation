package com.edctool.utils;

import java.util.List;
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

	public void assertValueFromList(List<WebElement> options, String expectedOption) {
		boolean getOption = options.stream().anyMatch(opt -> opt.getText().trim().equals(expectedOption));
		Assert.assertTrue(expectedOption + " not found in list..!", getOption);
	}

	public void isElementNotDisplayed(List<WebElement> element) {
		staticWait(2);
		Assert.assertTrue(element.size() == 0);
	}

	public void assertContainsMessage(WebElement element, String message) {
		Assert.assertTrue(getVisibleText(element).contains(message));
	}

	public void isElementSelected(WebElement element) {
		waitForElementVisible(element);
		Assert.assertTrue(element.isSelected());
	}

	public void isElementDisabled(WebElement element, String attrtibuteName) {
		Assert.assertEquals(getAttrtibuteValue(element, attrtibuteName), "true");
	}

	public void isElementEnabled(WebElement element, String attrtibuteName) {
		Assert.assertEquals(getAttrtibuteValue(element, attrtibuteName), null);
	}
}
