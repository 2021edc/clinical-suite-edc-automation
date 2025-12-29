package com.edctool.po;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class DataEntryForm1 extends SeleniumActions {

	public DataEntryForm1() {
		PageFactory.initElements(getDriver(), this);
	}

	AssertUtils assertUtils = new AssertUtils();

	@FindBy(css = ".btn.btn-outline-secondary.mb-1")
	private WebElement btnReset;

	@FindBy(css = "span:nth-child(1) > button")
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
	
	@FindBy(xpath="//*[text()='Checkbox']")
	private WebElement lblChkeckbox;
	
	@FindBy(xpath="//*[@id='155806']//input[@type='checkbox']/following-sibling::label")
	private List<WebElement> chkCheckbox;
	
	@FindBy(css="input[name='check-4']")
	private WebElement chkCheckboxSelect;
	
	@FindBy(xpath="//*[@id='155829']//input[@type='checkbox']/following-sibling::label")
	private List<WebElement> chkCheckboxMandtory;
	
	@FindBy(css="input[name='check-5']")
	private WebElement chkCheckboxSelectMandtory;
	
	@FindBy(xpath="//*[@id='155832']//input/following-sibling::label")
	private List<WebElement> lstRadioButton;
	
	@FindBy(xpath="//*[@id='155836']/div/select")
	private WebElement ddlSelect;
	
	@FindBy(xpath="//*[@id='155836']//select/option")
	private List<WebElement> lstOPtions;
	
	@FindBy(css="h5.modal-title")
	private WebElement confirmationTitle;
	
	@FindBy(css="div.modal-footer button.btn-outline-success")
	private WebElement btnYesConformation;
	
	@FindBy(css="div.modal-footer button.btn-outline-danger")
	private WebElement btnCancelConfirmation;
	

	public void clickOnSubjectId(String subjectId) {
		waitForAllElementVisible(lstSubjectId);
		selectValueFromList(lstSubjectId, subjectId);
	}

	public void verifyResetButton() {
		staticWait(5);
		assertUtils.isElementDisplayed(btnReset);
	}

	public void enterSearchText(String searchText) {
		staticWait(7);
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
	
	public void verifyCheckbox() {
		assertUtils.isElementDisplayed(lblChkeckbox);
	}
	
	public void selectCheckboxOption(String option) {
		selectValueFromList(chkCheckbox, option);
	}
	
	public void selectCheckboxMandtory(String option) {
		selectValueFromList(chkCheckboxMandtory, option);
	}
	
	public void selectRadioButton(String option) {
		waitForAllElementVisible(lstRadioButton);
		scrollToElement(ddlSelect);
		selectValueFromList(lstRadioButton, option);
	}
	
	public void ddlSelectDisabled() {
		staticWait(3);
		assertUtils.isElementDisabled(ddlSelect, "disabled");
	}
	
	public void ddlSelectEnabled() {
		staticWait(3);
		assertUtils.isElementEnabled(ddlSelect, "disabled");
	}
	
	public void clickOnDropdown() {
		clickOnElement(ddlSelect);
	}
	
	public void verifyOptionInList(String option) {
		assertUtils.assertValueFromList(lstOPtions, option);
	}
	
	public void verifyConfirmationTitle() {
		assertUtils.isElementDisplayed(confirmationTitle);
	}
	
	public void verifyCancelButtonInConfirmationPopup() {
		assertUtils.isElementDisplayed(btnCancelConfirmation);
	}
	
	public void verifyYesButtonInConfirmationPopup() {
		assertUtils.isElementDisplayed(btnYesConformation);
	}
}
