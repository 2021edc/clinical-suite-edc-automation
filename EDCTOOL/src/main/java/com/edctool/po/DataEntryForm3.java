package com.edctool.po;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class DataEntryForm3 extends SeleniumActions {

	public DataEntryForm3() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(css = ".form-row.p-2")
	private WebElement lblForm3Search;

	@FindBy(css = ".plusIcon")
	private WebElement btnPlus;

	@FindBy(css = "h5")
	private WebElement lblHeader;

	@FindBy(css = "input[id='Sr. No']")
	private WebElement txtSrNo;

	@FindBy(css = "#BP")
	private WebElement txtBp;

	@FindBy(css = "label[for='213915'] b")
	private WebElement chkHeartRate;

	@FindBy(xpath = "//input[@name='check-2']/following-sibling::label/b")
	private List<WebElement> lstHeartRateCheckbox;

	@FindBy(xpath = "input[name='check-3']/following-sibling::label/b")
	private List<WebElement> lstTreatmentCheckbox;

	@FindBy(css = "div[class='form-group row'] select[class='form-select']")
	private WebElement ddlRespiratoryRate;

	@FindBy(css = "button[title='Save']")
	private WebElement btnSave;

	@FindBy(xpath = "//button[@class='control-buttons'][2]")
	private WebElement closeIcon;

	@FindBy(css = "th[class='table-column'] span[title='Heart Rate']")
	private WebElement lblHeartRate;

	AssertUtils assertUtils = new AssertUtils();

	public void clickOnForm3() {
		clickOnElement(lblForm3Search);
	}

	public void clickOnPlusIcon() {
		clickOnElement(btnPlus);
	}

	public void verifyForm3() {
		assertUtils.isElementDisplayed(btnPlus);
	}

	public void verifyTitle(String message) {
		assertUtils.assertEquals(getVisibleText(lblHeader), message);
	}

	public void enterSrNo(String srNo) {
		enterTextIntoTextbox(txtSrNo, srNo);
	}

	public void enterBp(String bp) {
		enterTextIntoTextbox(txtBp, bp);
	}

	public void selectHeartRate(String option) {
		selectValueFromList(lstHeartRateCheckbox, option);
	}

	public void selectTreatment(String option) {
		selectValueFromList(lstTreatmentCheckbox, option);
	}

	public void selectRespiratoryRate(String option) {
		selectValueFromDropdown(ddlRespiratoryRate, option);
	}

	public void clickOnSaveButton() {
		clickOnElement(btnSave);
	}

	public void clickOnCloseIcon() {
		clickOnElement(closeIcon);
	}

	public void verifyMultiRowTable() {
		assertUtils.isElementDisplayed(txtSrNo);
	}

	public void verifySrNo() {
		assertUtils.isElementDisplayed(txtSrNo);
	}

	public void verifyBp() {
		assertUtils.isElementDisplayed(txtBp);
	}

	public void verifyHeartRateCheckbox() {
		assertUtils.isElementDisplayed(lblHeartRate);
	}

	public void formClosedAfterClickingOnCloseIcon() {
		assertUtils.isElementNotDisplayed(lstTreatmentCheckbox);
	}
	
	public void verifyPlusIconDisable() {
		assertUtils.isElementDisabledNullCheck(btnPlus);
	}
}
