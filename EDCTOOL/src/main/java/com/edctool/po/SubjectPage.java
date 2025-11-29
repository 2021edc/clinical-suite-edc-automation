package com.edctool.po;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class SubjectPage extends SeleniumActions {
	
	public SubjectPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	AssertUtils assertUtils= new AssertUtils();
	
	@FindBy(css = "button.btn-outline-primary")
	private WebElement btnAddSubject;
	
	@FindBy(css = "h5")
	private WebElement lblSubjectDetails;
	
	@FindBy(css="h5")
	private List<WebElement> lstSubjectDetails;

	@FindBy(css="div.modal-footer button:nth-child(2)")
	private WebElement btnSave;

	@FindBy(css="div.modal-footer button:nth-child(1)")
	private WebElement btnCancel;

	@FindBy(css="[placeholder='Select Site']")
	private WebElement selectSubject;

	@FindBy(css="[aria-label='Options list'] div[role='option']")
	private List<WebElement> lstSiteOptions;

	@FindBy(css="[formcontrolname='subjectId']")
	private WebElement txtSubject;
	
	public void verifySubjectButton() {
		assertUtils.isElementDisplayed(btnAddSubject);
	}
	
	public void clickOnAddSubjectButton() {
		waitForClickOnElement(btnAddSubject);
		clickOnElement(btnAddSubject);
	}

	public void verifyAddSubjectDetails(String subject) {
		assertUtils.assertEquals(getVisibleText(lblSubjectDetails), subject);
	}

	public void clickOnSaveButton() {
		clickOnElement(btnSave);
	}

	public void clickOnCancelButton() {
		clickOnElement(btnCancel);
	}

	public void selectSiteOption(String site) {
		clickOnElement(selectSubject);
		selectValueFromList(lstSiteOptions, site);
	}

	public void removeSubjectName() {
		clearText(txtSubject);
	}

	public void enterSubjectName(String subjectName) {
		enterTextIntoTextbox(txtSubject, subjectName);
	}
	
	public void clickSubjectName() {
		clickOnElement(txtSubject);
		staticWait(2);
	}
	
	public void verifyClosePopup() {
		assertUtils.isElementNotDisplayed(lstSubjectDetails);
	}
}
