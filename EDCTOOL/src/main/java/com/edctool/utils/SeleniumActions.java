package com.edctool.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edctool.framework.WebBase;

public class SeleniumActions extends WebBase{
	
	public SeleniumActions() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForClickOnElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public String getVisibleText(WebElement element) {
		waitForClickOnElement(element);
		return element.getText();
	}
	
	public void clickOnElement(WebElement element) {
		waitForClickOnElement(element);
		element.click();
	}
	
	public void enterTextIntoTextbox(WebElement element, String text) {
		waitForElementVisible(element);
		element.click();
		element.clear();
		element.sendKeys(text);
	}

}
