package com.edctool.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class AuditLogDataPoint extends SeleniumActions {
	
	public AuditLogDataPoint() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[@ng-reflect-router-link='/layout/data-point-auditlog']")
	private WebElement lnkDataPoint;

	@FindBy(xpath = "//td[@title='Respiratory Rate']")
	private WebElement lblRespiratoryRate;

	AssertUtils assertUtils= new AssertUtils();
	
	public void clickOnDataPoint() {
		staticWait(2);
		clickOnElement(lnkDataPoint);
	}
	
	public void verifyRespiratoryRateInDataPoint() {
		assertUtils.validateTableColumnValueForToday(7, 14, "Respiratory Rate");
	}

	public void verifyRespiratoryRateDeleteMessageInDataPoint() {
		assertUtils.validateTableColumnValueForToday(10, 14, "DELETE");
	}
	
}
