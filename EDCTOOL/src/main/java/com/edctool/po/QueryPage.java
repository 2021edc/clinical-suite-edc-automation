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
	
	@FindBy(css=".btn.btn-outline-success.no-focus")
	private WebElement btnYes;
	
	@FindBy(css="[title='Query Raised']")
	private WebElement lnkQueryIcon;
	
	@FindBy(xpath="//*[text()=' Updated Data Points ']")
	private WebElement updatedDataPointPopup;
	
	@FindBy(css=".modal-body select[class='form-select']")
	private WebElement ddlCommonReason;
	
	@FindBy(css="[name='reason-155828']")
	private WebElement ddlTextViewReason;
	
	@FindBy(css="[name='reason-155828']")
	private WebElement ddlNumberAllReason;
	
	@FindBy(css="[name='reason-155829']")
	private WebElement ddlCheckboxMandtoryReason;
	
	@FindBy(css="[name='reason-155832']")
	private WebElement ddlRadioButtonMandtory;
	
	@FindBy(css="#queryModalClose")
	private WebElement btnNo;

	AssertUtils assertUtils = new AssertUtils();

	public void verifyAllFieldQuery(ArrayList<String> expectedList) {
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
}
