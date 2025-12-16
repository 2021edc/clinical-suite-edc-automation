package com.edctool.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class AuditLogDataEntry extends SeleniumActions {
	
	public AuditLogDataEntry() {
		PageFactory.initElements(getDriver(), this);
	}
	
	AssertUtils assertUtils= new AssertUtils();
	
	@FindBy(css="a[class='list-group-item cursor-pointer'] b")
	private WebElement lnkAuditLog;
	
	@FindBy(css="a[class='list-group-item'] div[class='label mx-3'] b")
	private WebElement lnkDataEntry;
	
	@FindBy(css="tbody tr:nth-child(1) td:nth-child(5)")
	private WebElement lblField;
	
	public void OpenAuditLogPage() {
		mouseHover(lnkAuditLog);
		clickOnElement(lnkAuditLog);
		clickOnElement(lnkDataEntry);
	}
	
	public void verifyField(String expectedValue) {
		assertUtils.assertEquals(getVisibleText(lblField), expectedValue);
	}

}
