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
	
	@FindBy(xpath="//*[@class='modal-body']//*[text()='Number All']")
	private WebElement numberAllQuery;
	
	@FindBy(css="div.modal-body p")
	private WebElement lblSystemGeneratedQuery;
	
	@FindBy(css="#myTable  td:nth-child(5)")
	private WebElement lblQueryDesc;
	
	@FindBy(css="[name='Number All'][type='Number']")
	private WebElement txtNumberAll;
	
	@FindBy(css="[name='Number All'][placeholder='Number']")
	private WebElement txtNumberAllWithPlaceHolder;
	
	@FindBy(css="span[title='Help Text']")
	private WebElement lblHelpText;

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
	
	public void verifyNumberAllQuery() {
		assertUtils.isElementDisplayed(numberAllQuery);
	}
	
	public void verifySystemGeneratedQueryLabel(String headerMessage) {
		assertUtils.assertEquals(getVisibleText(lblSystemGeneratedQuery), headerMessage);
	}
	
	public void verifyQueryDesc(String message) {
		assertUtils.assertContainsMessage(lblQueryDesc, message);
	}
	
	public void enterNumberAll(String number) {
		enterTextIntoTextbox(txtNumberAll, number);
	}
	
	public void verifyNumberInNumberAllTextbox() {
		assertUtils.isElementDisplayed(txtNumberAllWithPlaceHolder);
	}
	
	public void verifyHelpIcon() {
		assertUtils.isElementDisplayed(lblHelpText);
	}
}
