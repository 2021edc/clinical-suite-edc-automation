package steps_definations;

import com.edctool.po.ForgotPasswordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_ForgotPassword {

	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

	@Then("Verify that Forgot password link should be displayed")
	public void verify_that_forgot_password_link_should_be_displayed() {
		forgotPasswordPage.verifyForgotPasswordLink();
	}

	@When("user click on forgot password link")
	public void user_click_on_forgot_password_link() {
		forgotPasswordPage.clickOnForgotPasswordLink();
	}

	@Then("Verify that {string} page should be opened")
	public void verify_that_page_should_be_opened(String message) {
		forgotPasswordPage.verifyForgotPasswordPage(message);
	}

	@When("user enter the {string} in email address textbox for forgot password")
	public void user_enter_the_in_email_address_textbox_for_forgot_password(String email) {
	    forgotPasswordPage.enterEmail(email);
	}

	@When("user click on reset button")
	public void user_click_on_reset_button() {
		forgotPasswordPage.clickOnResetButton();
	}
	
	@Then("Verify that {string} error message should be displayed for incorrect email")
	public void verify_that_error_message_should_be_displayed_for_incorrect_email(String message) {
	    forgotPasswordPage.verifyErrorMessage(message);
	}

	@When("user click on login button from forgot password page")
	public void user_click_on_login_button_from_forgot_password_page() {
	  forgotPasswordPage.clickOnLoginButton();
	}
	
	@Then("verify that success toast should be displayed")
	public void verify_that_success_toast_should_be_displayed() {
	   
	}

}
