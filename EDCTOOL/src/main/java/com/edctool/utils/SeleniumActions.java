package com.edctool.utils;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public void waitForAllElementVisible(List<WebElement> lstElements) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(lstElements));
	}
	
	public void waitForClickOnElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void staticWait(long waitInSeconds) {
		try {
			TimeUnit.SECONDS.sleep(waitInSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public void selectValueFromList(List<WebElement> lstItems, String option) {
		for (WebElement element : lstItems) {
			String getOption=element.getText();
			
			if(getOption.equals(option)) {
				element.click();
				break;
			}
		}
	}
	
	public void mouseHover(WebElement element) {
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
	}

	public void clearText(WebElement element) {
		element.clear();
	}
	
	public String getAttrtibuteValue(WebElement element, String attrtibuteName) {
		return element.getAttribute(attrtibuteName);
	}
	
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
