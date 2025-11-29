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
	private List<WebElement> lnkSubjectId;

	@FindBy(css = "input[placeholder='Search forms...']")
	private WebElement txtSearch;
	
	@FindBy(css="div > small")
	private WebElement lblNoFormsFound;
	
	@FindBy(css="i.forms-clear-btn")
	private WebElement btnClear;

	public void clickOnSubjectId(String subjectId) {
		waitForAllElementVisible(lnkSubjectId);
		selectValueFromList(lnkSubjectId, subjectId);
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
}
