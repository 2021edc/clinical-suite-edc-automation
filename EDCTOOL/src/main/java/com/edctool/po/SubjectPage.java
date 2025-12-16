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

	AssertUtils assertUtils = new AssertUtils();

	@FindBy(css = "button.btn-outline-success")
	private WebElement btnAddSubject;

	@FindBy(css = "h5")
	private WebElement lblSubjectDetails;

	@FindBy(css = "h5")
	private List<WebElement> lstSubjectDetails;

	@FindBy(css = "div.modal-footer button:nth-child(2)")
	private WebElement btnSave;

	@FindBy(css = "div.modal-footer button:nth-child(1)")
	private WebElement btnCancel;

	@FindBy(css = "[placeholder='Select Site']")
	private WebElement selectSubject;

	@FindBy(css = "[aria-label='Options list'] div[role='option'] span")
	private List<WebElement> lstSiteOptions;
	
	@FindBy(css = "td.pointer")
	private List<WebElement> lstSubjectIdInListingPage;

	@FindBy(css = "[formcontrolname='subjectId']")
	private WebElement txtSubject;

	@FindBy(css = "[title='Filter Search']")
	private WebElement btnSearchFilter;

	@FindBy(css = "[ng-reflect-name='sites']")
	private WebElement ddlSitesFilter;

	@FindBy(css = "[ng-reflect-name='subjects']")
	private WebElement ddlSubjectsFilter;

	@FindBy(css = "[ng-reflect-name='status']")
	private WebElement ddlStatusFilter;

	@FindBy(css = "[ng-reflect-name='isLocked']")
	private WebElement ddlLocksFilter;

	@FindBy(css = "button[id='applyBtn']")
	private WebElement btnApplyFilter;

	@FindBy(css = "button[id='clearFilterBtn']")
	private WebElement btnClearAllFilter;

	@FindBy(css = "button[id='filterToggleBtn']")
	private WebElement btnCloseFilter;
	
	@FindBy(css="span.dropdown-item-label")
	private List<WebElement> lstFilterOptions;
	
	@FindBy(css="div[role='alert']")
	private WebElement lblToaster;
	
	@FindBy(css="ng-select[id='siteId'] div[class='ng-select-container']")
	private WebElement txtSite;

	public void verifySubjectButton() {
		assertUtils.isElementDisplayed(btnAddSubject);
	}

	public void clickOnAddSubjectButton() {
		staticWait(3);
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
		staticWait(3);
		clickOnElement(txtSite);
		staticWait(1);
		selectValueFromList(lstSiteOptions, site);
	}
	
	public void verifySubjectList(String subjectId) {
		waitForAllElementVisible(lstSubjectIdInListingPage);
		assertUtils.assertValueFromList(lstSubjectIdInListingPage, subjectId);
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

	public void clickOnSubjectFilterDropdown() {
		waitForClickOnElement(btnSearchFilter);
		staticWait(2);
		clickOnElement(btnSearchFilter);
	}

	public void verifySiteFilterDropdown() {
		assertUtils.isElementDisplayed(ddlSitesFilter);
	}

	public void verifySubjectsFilterDropdown() {
		assertUtils.isElementDisplayed(ddlSubjectsFilter);
	}

	public void verifyStatusFilterDropdown() {
		assertUtils.isElementDisplayed(ddlStatusFilter);
	}

	public void verifyLockFilterDropdown() {
		assertUtils.isElementDisplayed(ddlLocksFilter);
	}

	public void verifyApplyFilterButton() {
		assertUtils.isElementDisplayed(btnApplyFilter);
	}

	public void verifyClearAllFilterButton() {
		assertUtils.isElementDisplayed(btnClearAllFilter);
	}

	public void verifyCloseFilterButton() {
		assertUtils.isElementDisplayed(btnCloseFilter);
	}
	
	public void clickOnSiteDropdown() {
		clickOnElement(ddlSitesFilter);
	}
	
	public void clickOnSubjectDropdown() {
		clickOnElement(ddlSubjectsFilter);
	}
	
	public void clickOnStatusDropdown() {
		clickOnElement(ddlStatusFilter);
	}
	
	public void clickOnLockDropdown() {
		clickOnElement(ddlLocksFilter);
	}
	
	public void selectItemFromSiteFilterDropdown(String option) {
		selectValueFromList(lstFilterOptions, option);
	}
	
	public void clickOnApplyButton() {
		clickOnElement(btnApplyFilter);
	}
	
	public void clickOnClearAllButton() {
		clickOnElement(btnClearAllFilter);
	}
	
	public void clickOnCloseButton() {
		clickOnElement(btnCloseFilter);
	}
	
	public void verifyToaster() {
		assertUtils.isElementDisplayed(lblToaster);
	}
}
