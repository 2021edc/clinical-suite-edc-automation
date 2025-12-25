package com.edctool.po;

import java.time.LocalDate;
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

	@FindBy(css = "th[class='table-column'] span[title='Heart Rate']")
	private WebElement lblHeartRate;

	@FindBy(xpath = "//*[@id='myTable']/tbody[1]//td[5]")
	private WebElement lblErrorMessage;

	@FindBy(css = "span[class='saveIcon']")
	private WebElement iconSave;

	@FindBy(xpath = "//*[text()='Add']")
	private WebElement btnAdd;

	@FindBy(css = "input[id='Sr. No']")
	private WebElement txtMultiRawSrNo;

	@FindBy(css = "input[id='Sr. No']")
	private List<WebElement> lstMultiRawSrNo;

	@FindBy(css = "div[class='card-footer text-end'] button[class='btn btn-outline-success']")
	private WebElement btnMultiRawSave;

	@FindBy(css = "div[class='card-footer text-end'] button[class='btn btn-outline-danger']")
	private WebElement btnMultiRawClose;

	@FindBy(css = "[title='Delete']")
	private WebElement btnDelete;

	@FindBy(css = "#reason")
	private WebElement txtReason;
	
	@FindBy(css="[placeholder='RowId']")
	private WebElement ddlRowId;
	
	@FindBy(css="[title='1']")
	private WebElement lblRowIdFilter;
	
	@FindBy  (xpath="//*[text()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//*[text()='Clear Filter']")
	private WebElement btnClearFilters;
	
	@FindBy(css="[title='Clear all']")
	private WebElement clearAll;
	
	@FindBy(xpath="//div[contains(@class,'form-check')]//label[@class='form-check-label']//b")
	private List<WebElement> lstTreatmentCategoryVertical;
	
	@FindBy(css="input[placeholder='DD/MMM/YYYY'][name='Date1']")
	private WebElement date1;
	
	@FindBy(css="input[placeholder='DD/MMM/YYYY'][name='Date 2']")
	private WebElement date2;
	
	@FindBy(css = "span.ngb-dp-day")
	private List<WebElement> dateOption;
	
	@FindBy(css="div.card-footer button:nth-child(1)")
	private WebElement btnSaveVertical;
	
	@FindBy(css="input[id='Heart Rate, if abnormal']")
	private WebElement txtHeartRateAbnormal;
	
	@FindBy(css="div[class='row'] div[class='col']")
	private WebElement lblDateValidation;
	
	@FindBy(xpath="//button[@class='btn btn-outline-success no-focus']")
	private WebElement btnOk;
	
	@FindBy(xpath="//button[@class='btn btn-outline-danger no-focus']")
	private WebElement btnCancel;

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
	
	public void selectTreatmentVertical(String option) {
		selectValueFromList(lstTreatmentCategoryVertical, option);
	}

	public void selectRespiratoryRate(String option) {
		selectValueFromDropdown(ddlRespiratoryRate, option);
	}

	public void clickOnSaveButton() {
		clickOnElement(btnSave);
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

	public void verifyErrorMessage(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorMessage), message);
	}

	public void verifyField(String log) {
		assertUtils.validateTableColumnValueForToday(5,10, log);
	}

	public void verifyMessage(String message) {
		assertUtils.validateTableColumnValueForToday(8,10, message);
	}

	public void clickOnSaveIcon() {
		clickOnElement(iconSave);
	}

	public void plusIconEnabled() {
		assertUtils.isElementEnabled(btnPlus);
	}

	public void addButtonDisable() {
		assertUtils.isElementDisabledNullCheck(btnAdd);
	}

	public void addButtonEnable() {
		staticWait(2);
		assertUtils.isElementEnabled(btnAdd);
	}

	public void clickOnAddButton() {
		clickOnElement(btnAdd);
	}

	public void enterSrNoInMultiRaw(String srNo) {
		enterTextIntoTextbox(txtMultiRawSrNo, srNo);
	}

	public void clickOnSaveForMultiRaw() {
		clickOnElement(btnMultiRawSave);
	}

	public void clickOnMultiRawClose() {
		clickOnElement(btnMultiRawClose);
	}

	public void verifyCloseForm() {
		assertUtils.isElementNotDisplayed(lstMultiRawSrNo);
	}

	public void clickOnDelete() {
		clickOnElement(btnDelete);
	}

	public void enterReason(String reason) {
		enterTextIntoTextbox(txtReason, reason);
	}
	
	public void clickOnRowId() {
		staticWait(3);
		clickOnElement(ddlRowId);
		clickOnElement(lblRowIdFilter);
	}
	
	public void verifyRowId() {
		assertUtils.isElementDisplayed(ddlRowId);
	}
	
	public void verifySearchButton() {
		assertUtils.isElementDisplayed(btnSearch);
	}
	
	public void verifyClearFitlerButton() {
		assertUtils.isElementDisplayed(btnClearFilters);
	}
	
	public void clickOnSearch() {
		clickOnElement(btnSearch);
	}
	
	public void clickOnclearFilter() {
		clickOnElement(btnClearFilters);
	}
	
	public void clickOnClearSearch() {
		clickOnElement(clearAll);
	}
	
	public int getTodayDate() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}

	public void clickOnDate1() {
		clickOnElement(date1);

		selectValueFromList(dateOption, String.valueOf(getTodayDate()));
	}
	
	public void clickOnDate2() {
		clickOnElement(date2);

		selectValueFromList(dateOption, String.valueOf(getTodayDate()));
	}
	
	public void clickOnSaveVertical() {
		clickOnElement(btnSaveVertical);
	}
	
	public void verifyDisableHeartRateTextbox() {
		assertUtils.isElementDisabled(txtHeartRateAbnormal, "disabled");
	}
	
	public void verifyHeartRateTextboxIsEnabled() {
		assertUtils.isElementEnabled(txtHeartRateAbnormal);
	}
	
	public void enterAbnoramlHeartRate(String heartRate) {
		enterTextIntoTextbox(txtHeartRateAbnormal, heartRate);
	}
	
	public int getYesterdayDate() {
	    LocalDate yesterday = LocalDate.now().minusDays(1);
	    return yesterday.getDayOfMonth();
	}

	public void clickOnYesterdayDate2() {
	    clickOnElement(date2);
	    selectValueFromList(dateOption, String.valueOf(getYesterdayDate()));
	}
	
	public void verifyDateValidation() {
		assertUtils.isElementDisplayed(lblDateValidation);
	}
	
	public void verifyOkButton() {
		assertUtils.isElementDisplayed(btnOk);
	}
	
	public void verifyCancelButton() {
		assertUtils.isElementDisplayed(btnCancel);
	}
	
	public void clickOnOkButton() {
		clickOnElement(btnOk);
	}
	
	public void clickOnCancelButton() {
		clickOnElement(btnCancel);
	}
	
	public void verifyPopUpClosed() {
		assertUtils.isElementDisplayed(btnAdd);
	}
}
