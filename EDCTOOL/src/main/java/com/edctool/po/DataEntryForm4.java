package com.edctool.po;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class DataEntryForm4 extends SeleniumActions {
	
	public DataEntryForm4() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//input[@type='file' and contains(@class,'dz-hidden-input')]")
	private WebElement fileUplaod;
	
	@FindBy(linkText = "Remove file")
	private WebElement lnkRemoveFile;
	
	@FindBy(linkText = "Remove file")
	private List<WebElement> lstRemoveFile;

	@FindBy(xpath="//*[text()='Remove All']")
	private WebElement btnRemoveAll;
	
	@FindBy(xpath="//*[text()='Start Upload']")
	private WebElement btnStartUpload;
	
	@FindBy(xpath="//*[text()='Pause']")
	private WebElement btnPause;
	
	@FindBy(xpath="//*[text()='Resume']")
	private WebElement btnResume;
	
	@FindBy(xpath="//*[text()='Stop & Cancel']")
	private WebElement btnStopAndCancel;
	
	AssertUtils assertUtils= new AssertUtils();
	
	public void verifyFileUpload() {
		assertUtils.isElementDisplayed(fileUplaod);
	}
	
	public void uploadFileToForm4(String fileName) {
		staticWait(5);
		uploadFile(fileUplaod, fileName);
	}
	
	public void verifyRemoveFileDisplay() {
		assertUtils.isElementDisplayed(lnkRemoveFile);
	}
	
	public void clickOnRemoveFile() {
		clickOnElement(lnkRemoveFile);
	}
	
	public void removeLinkShouldNotDisplay() {
		assertUtils.isElementNotDisplayed(lstRemoveFile);
	}
	
	public void verifyRemoveAllButton() {
		assertUtils.isElementDisplayed(btnRemoveAll);
	}
	
	public void verifyStartAllButton() {
		assertUtils.isElementDisplayed(btnStartUpload);
	}
	
	public void verifyPauseButton() {
		assertUtils.isElementDisplayed(btnPause);
	}
	
	public void verifyPauseAndCancelButton() {
		assertUtils.isElementDisplayed(btnStopAndCancel);
	}
	
	public void verifyResumeButton() {
		assertUtils.isElementDisplayed(btnResume);
	}
	
	public void verifyDisablePauseButton() {
		assertUtils.isElementDisabledNullCheck(btnPause);
	}

	public void verifyDisableResumeButton() {
		assertUtils.isElementDisabledNullCheck(btnResume);
	}
	
	public void verifyDisableStopAndCancelButton() {
		assertUtils.isElementDisabledNullCheck(btnStopAndCancel);
	}
}
