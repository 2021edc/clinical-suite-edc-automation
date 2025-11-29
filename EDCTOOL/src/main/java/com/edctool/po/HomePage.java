package com.edctool.po;

import java.util.List;

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
	
	@FindBy(css="a span > b")
	private List<WebElement> lstLeftSideMenu;
	
	@FindBy(css="a[data-tooltip='Dashboard']")
	private WebElement lnkLeftSideMenu;
	
	@FindBy(css="p.heading")
	private WebElement lblHeader;
	
	public void verifyNameInHeader() {
		assertUtils.isElementDisplayed(lblUserHeader);
	}
	
	public void verifySubjectInLeftSideMenu(String menuOption) {
		mouseHover(lnkLeftSideMenu);
		assertUtils.assertValueFromList(lstLeftSideMenu, menuOption);
	}
	
	public void clickOnMenuItem(String option) {
		mouseHover(lnkLeftSideMenu);
		selectValueFromList(lstLeftSideMenu, option);
	}

	public void verifyHeader(String header) {
		staticWait(2);
		assertUtils.assertEquals(getVisibleText(lblHeader), header);
	}

}
