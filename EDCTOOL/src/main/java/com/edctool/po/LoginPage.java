package com.edctool.po;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class LoginPage extends SeleniumActions {

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	AssertUtils assertUtils = new AssertUtils();

	@FindBy(tagName = "h4")
	private WebElement loginPageHeader;

	@FindBy(css = "#userName")
	private WebElement txtUsername;

	@FindBy(css = "#password")
	private WebElement txtPassword;

	@FindBy(css = "button[type='submit']")
	private WebElement btnLogin;

	@FindBy(css = "div.text-danger")
	private WebElement lblErrorMessage;
	
	@FindBy(css = "div[role='alert']")
	private WebElement lblErrorMessageToaster;


	@FindBy(css = "h5.loginH5")
	private WebElement lblStudyAndRole;

	@FindBy(css = "[ng-reflect-bind-value='studyId']")
	private WebElement ddlStudy;

	@FindBy(css = "[ng-reflect-placeholder='Select Role']")
	private WebElement ddlRole;

	@FindBy(css = "button[type='reset']")
	private WebElement btnCancel;
	
	@FindBy(css="div[role='option'] span")
	private List<WebElement> selectOption;

	@FindBy(css="[ng-reflect-placeholder='Select Study'] input[type='text']")
	private WebElement txtStudy;
	
	@FindBy(css="[ng-reflect-placeholder='Select Role'] input[type='text']")
	private WebElement txtRole;
	
	@FindBy(css="div.ng-option")
	private WebElement lblErrorOption;
	

	public void verifyLoginPageHeader(String header) {
		assertUtils.assertEquals(getVisibleText(loginPageHeader), header);
	}

	public void validateLoginPageTitle(String title) {
		assertUtils.assertEqualsPageTitle(title);
	}

	public void clickOnLoginButton() {
		clickOnElement(btnLogin);
	}

	public void verifyErrorMessage(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorMessage), message);
	}
	
	public void verifyErrorMessageToaster(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorMessageToaster), message);
	}

	public void enterUsername(String username) {
		enterTextIntoTextbox(txtUsername, username);
	}

	public void enterPassword(String password) {
		enterTextIntoTextbox(txtPassword, password);
	}

	public void verifyIncorrectCredErrorMessage(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorMessage), message);
	}

	public void verifyStudyAndRole() {
		assertUtils.isElementDisplayed(lblStudyAndRole);
	}

	public void verifyStudyDropdown() {
		assertUtils.isElementDisplayed(ddlStudy);
	}

	public void verifyRoleDropdown() {
		assertUtils.isElementDisplayed(ddlRole);
	}

	public void clickOnCancelButton() {
		clickOnElement(btnCancel);
	}
	
	public void selectStudy() {
		staticWait(1);
		clickOnElement(ddlStudy);
	}
	
	public void selectRole() {
		clickOnElement(ddlRole);
	}
	
	public void selectValueFromDropdown(String option) {
		selectValueFromList(selectOption, option);
	}
	
	public void enterStudy(String study) {
		enterTextIntoTextbox(txtStudy, study);
	}
	
	public void enterRole(String role) {
		enterTextIntoTextbox(txtRole, role);
	}
	
	public void validateErrorMessage(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorOption), message);
	}
}
