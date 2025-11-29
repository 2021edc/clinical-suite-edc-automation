package steps_definations;

import com.edctool.po.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Login {

	LoginPage loginPage = new LoginPage();

	@Then("verify that {string} header should be visible")
	public void verify_that_header_should_be_visible(String header) {
		loginPage.verifyLoginPageHeader(header);
	}

	@Then("Verify that {string} page title should be displayed")
	public void verify_that_page_title_should_be_displayed(String pageTitle) {
		loginPage.validateLoginPageTitle(pageTitle);
	}

	@When("user click on login button")
	public void user_click_on_login_button_without_entering_the_username() {
		loginPage.clickOnLoginButton();
	}

	@Then("Verify that {string} error message should be displayed")
	public void verify_that_error_message_should_be_displayed(String message) {
		loginPage.verifyErrorMessage(message);
	}

	@When("user enter the {string} in username textbox")
	public void user_enter_the_in_username_textbox(String username) {
		loginPage.enterUsername(username);
	}

	@When("user enter the {string} in password textbox")
	public void user_enter_the_in_password_textbox(String password) {
		loginPage.enterPassword(password);
	}

	@Then("Verify that {string} error message should be appear while enter incorrect credentials")
	public void verify_that_error_message_should_be_appear_while_enter_incorrect_credentials(String errorMessage) {
		loginPage.verifyIncorrectCredErrorMessage(errorMessage);
	}

	@Then("Verify that Study & Role page should be opened")
	public void verify_that_home_page_should_be_opened() {
		loginPage.verifyStudyAndRole();
	}

	@Then("verify that Study dropdown should be displayed")
	public void verify_that_study_dropdown_should_be_displayed() {
		loginPage.verifyStudyDropdown();
	}

	@Then("verify that role dropdown should be displayed")
	public void verify_that_role_dropdown_should_be_displayed() {
		loginPage.verifyRoleDropdown();
	}

	@When("user click on cancel button")
	public void user_click_on_cancel_button() {
		loginPage.clickOnCancelButton();
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		loginPage.clickOnLoginButton();
	}

	@When("user click on {string} from dropdown")
	public void user_click_on_from_dropdown(String option) {
		loginPage.selectStudy();
		loginPage.selectValueFromDropdown(option);
	}

	@When("user click on {string} from role dropdown")
	public void user_click_on_from_role_dropdown(String option) {
		loginPage.selectRole();
		loginPage.selectValueFromDropdown(option);
	}

	@When("user enter the {string} in study textbox")
	public void user_enter_the_in_study_textbox(String studyText) {
		loginPage.selectStudy();
		loginPage.enterStudy(studyText);
	}

	@When("user enter the {string} in role textbox")
	public void user_enter_the_in_role_textbox(String roleText) {
		loginPage.selectRole();
		loginPage.enterRole(roleText);
	}

	@Then("verify that {string} error message should be displayed while enter incorrect term")
	public void verify_that_error_message_should_be_displayed_while_enter_incorrect_term(String message) {
		loginPage.validateErrorMessage(message);
	}

}
