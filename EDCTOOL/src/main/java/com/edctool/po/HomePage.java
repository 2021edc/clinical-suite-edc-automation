package com.edctool.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class HomePage extends SeleniumActions{
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	AssertUtils assertUtils = new AssertUtils();
	
	@FindBy(css="b.fontHiddenInMobile")
	private WebElement lblUserHeader;
	
	public void verifyNameInHeader() {
		assertUtils.isElementDisplayed(lblUserHeader);
	}

}
