package com.edctool.po;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class SubjectVisit extends SeleniumActions {

	public SubjectVisit() {
		PageFactory.initElements(getDriver(), this);
	}

	AssertUtils assertUtils = new AssertUtils();

	@FindBy(css = "span:nth-child(4) > button")
	private WebElement btnReset;

	@FindBy(css = "span:nth-child(2) > button")
	private WebElement btnFormSave;

	@FindBy(css = "#cancel")
	private WebElement btnFormCancel;

	@FindBy(css = "td.pointer")
	private List<WebElement> lstSubjectId;
	
	@FindBy(css = "td.pointer")
	private WebElement lnkSubjectId;

	@FindBy(css = "input[placeholder='Search forms...']")
	private WebElement txtSearch;
	
	@FindBy(css="div > small")
	private WebElement lblNoFormsFound;
	
	@FindBy(css="i.forms-clear-btn")
	private WebElement btnClear;
	
	@FindBy(css="input[id='155588']")
	private WebElement txtTextView;
	
	@FindBy(css="textarea[placeholder='Test']")
	private WebElement txtTextArea;
	
	@FindBy(css="input[name='Number']")
	private WebElement txtNumber;

	public void clickOnSubjectId(String subjectId) {
		waitForAllElementVisible(lstSubjectId);
		selectValueFromList(lstSubjectId, subjectId);
	}

	public void verifyResetButton() {
		assertUtils.isElementDisplayed(btnReset);
	}

	public void enterSearchText(String searchText) {
		staticWait(2);
		enterTextIntoTextbox(txtSearch, searchText);
	}
	
	public void verifyNoFormFoundMessage(String message) {
		assertUtils.assertContainsMessage(lblNoFormsFound, message);
	}
	
	public void clickOnClearButton() {
		clickOnElement(btnClear);
	}
	
	public void verifyEmptyTextbox() {
		assertUtils.isElementDisplayed(txtSearch);
	}
	
	public void clickOnCloseButton() {
		clickOnElement(btnFormCancel);
	}
	
	public void verifyFormClose() {
		assertUtils.isElementDisplayed(lnkSubjectId);
	}
	
	public void enterTextView(String textView) {
		enterTextIntoTextbox(txtTextView, textView);
	}
	
	public void enterTextArea(String textArea) {
		enterTextIntoTextbox(txtTextArea, textArea);
	}
	
	public void enterTextNumber(String textNumber) {
		enterTextIntoTextbox(txtNumber, textNumber);
	}
	
	public void clickOnSaveButton() {
		clickOnElement(btnFormSave);
	}
}
