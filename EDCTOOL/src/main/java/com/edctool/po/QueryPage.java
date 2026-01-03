package com.edctool.po;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class QueryPage extends SeleniumActions {

	public QueryPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(css = "table:nth-child(1) > tbody > tr > td:nth-child(1)")
	private List<WebElement> lstQueryLabel;

	@FindBy(css = ".btn.btn-outline-success.no-focus")
	private WebElement btnYes;

	@FindBy(css = "[title='Query Raised']")
	private WebElement lnkQueryIcon;

	@FindBy(xpath = "//*[text()=' Updated Data Points ']")
	private WebElement updatedDataPointPopup;

	@FindBy(css = ".modal-body select[class='form-select']")
	private WebElement ddlCommonReason;

	@FindBy(css = "[name='reason-155828']")
	private WebElement ddlTextViewReason;

	@FindBy(css = "[name='reason-155828']")
	private WebElement ddlNumberAllReason;

	@FindBy(css = "[name='reason-155829']")
	private WebElement ddlCheckboxMandtoryReason;

	@FindBy(css = "[name='reason-155832']")
	private WebElement ddlRadioButtonMandtory;

	@FindBy(css = "#queryModalClose")
	private WebElement btnNo;

	@FindBy(css = "input[id='155588'][name='TV']")
	private WebElement txtTextView;

	@FindBy(css = "[title='Query Close']")
	private WebElement queryCloseIcon;

	@FindBy(xpath = "//div[1]/div[1]/div/button[1]")
	private WebElement textViewQueryValidationIcon;

	@FindBy(css = "h5[class='modal-title']")
	private WebElement lblQueryModal;

	@FindBy(xpath = "//div[@class='modal-body py-0']//div[2]//p[2]")
	private WebElement lblQueryField;

	@FindBy(css = "#closePopup")
	private WebElement btnCancel;

	@FindBy(css = "div[role='heading'] > button")
	private WebElement btnQNArea;

	@FindBy(css = "thead > tr > th")
	private List<WebElement> lstHeadersQN;

	@FindBy(css = "button[class='btn btn-base']")
	private WebElement btnRespond;
	
	@FindBy(css="[ng-reflect-name='status']")
	private WebElement ddlStatus;
	
	@FindBy(css="div[role='region'] form button.btn.btn-outline-danger")
	private WebElement btnRespondCancel;

	AssertUtils assertUtils = new AssertUtils();

	public void verifyAllFieldQuery(ArrayList<String> expectedList) {
		staticWait(2);
		List<String> actualList = new ArrayList<String>();

		for (WebElement element : lstQueryLabel) {
			actualList.add(getVisibleText(element));
		}

		assertUtils.assertListEquals(expectedList, actualList);
	}

	public void clickOnYesButton() {
		clickOnElement(btnYes);
	}

	public void verifyQueryIcon() {
		assertUtils.verifyListCount(lstQueryLabel, 4);
	}

	public void verifyUpdatedDataPointPopup() {
		assertUtils.isElementDisplayed(updatedDataPointPopup);
	}

	public void selectCommonReason(String reason) {
		selectValueFromDropdown(ddlCommonReason, reason);
	}

	public void verifyTextViewSelectReason(String reason) {
		assertUtils.assertContainsMessage(ddlTextViewReason, reason);
	}

	public void verifyNumberAllSelectReason(String reason) {
		assertUtils.assertContainsMessage(ddlNumberAllReason, reason);
	}

	public void verifyCheckboxMandtorySelectReason(String reason) {
		assertUtils.assertContainsMessage(ddlCheckboxMandtoryReason, reason);
	}

	public void verifyRadioButtonMandtorySelectReason(String reason) {
		assertUtils.assertContainsMessage(ddlRadioButtonMandtory, reason);
	}

	public void verifyCommonReasonOption(String reason) {
		assertUtils.assertContainsMessage(ddlCommonReason, reason);
	}

	public void clickOnNoButton() {
		clickOnElement(btnNo);
	}

	public void verifyCloseQueryPopup() {
		assertUtils.isElementNotDisplayed(lstQueryLabel);
	}

	public void verifyTextViewText(String text) {
		assertUtils.assertEquals(getAttrtibuteValue(txtTextView, "value"), text);
	}

	public void queryCloseIcon() {
		assertUtils.isElementDisplayed(queryCloseIcon);
	}

	public void clickOnTextViewOpEnQueryIcon() {
		waitForClickOnElement(textViewQueryValidationIcon);
		clickOnElement(textViewQueryValidationIcon);
	}

	public void verifyQueryModalTitle(String title) {
		assertUtils.assertEquals(getVisibleText(lblQueryModal), title);
	}

	public void verifyFieldNameQueryLabel(String label) {
		waitForElementVisible(lblQueryField);
		assertUtils.assertContainsMessage(lblQueryField, label);
	}

	public void verifyCancelButton() {
		assertUtils.isElementDisplayed(btnCancel);
	}

	public void clickOnCancelButton() {
		clickOnElement(btnCancel);
	}

	public void clickOnQNArea() {
		staticWait(5);
		clickUsingJavascript(btnQNArea);
	}

	public void verifyQueryListHeaderItem(List<String> expectedList) {
		List<String> actualList = new ArrayList<String>();

		for (WebElement element : lstHeadersQN) {
			actualList.add(getVisibleText(element));
		}
		assertUtils.assertListEquals(actualList, expectedList);
	}

	public void verifyRespondButton() {
		assertUtils.isElementDisplayed(btnRespond);
	}

	public void clickOnRespondButton() {
		clickOnElement(btnRespond);
	}
	
	public void verifyDisableSelectResponse() {
		assertUtils.isElementDisabled(ddlStatus, "disabled");
	}
	
	public void clickOnRespondCancel() {
		scrollToElement(btnCancel);
		staticWait(1);
		clickOnElement(btnRespondCancel);
	}
}
