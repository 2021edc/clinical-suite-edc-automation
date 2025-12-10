package com.edctool.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class ForgotPasswordPage extends SeleniumActions {
	
	public ForgotPasswordPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	AssertUtils assertUtils= new AssertUtils();
	
	@FindBy(css = "a.login-label")
	private WebElement lnkForgotPassword;
	
	@FindBy(tagName = "h4")
	private WebElement lblForgotPasswordHeader;
	
	@FindBy(css="#name")
	private WebElement txtEmail;
	
	@FindBy(css="div.text-danger")
	private WebElement lblErrorMessage;
	
	@FindBy(css="button[type='submit']")
	private WebElement btnReset;
	
	@FindBy(css="button[type='reset']")
	private WebElement btnLogin;
	
	public void verifyForgotPasswordLink() {
		assertUtils.isElementDisplayed(lnkForgotPassword);
	}
	
	public void clickOnForgotPasswordLink() {
		clickOnElement(lnkForgotPassword);
	}
	
	public void verifyForgotPasswordPage(String message) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertUtils.assertEquals(getVisibleText(lblForgotPasswordHeader), message);
	}
	
	public void enterEmail(String email) {
		enterTextIntoTextbox(txtEmail, email);
	}
	
	public void verifyErrorMessage(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorMessage), message);
	}
	
	public void clickOnResetButton() {
		clickOnElement(btnReset);
	}
	
	public void clickOnLoginButton() {
		clickOnElement(btnLogin);
	}
	
	// TO do once success message received need to fix this method. May be eliminate this method 
	public void verifySuccessMessage(String message) {
		assertUtils.assertEquals(getVisibleText(lblErrorMessage), message);
	}

}
