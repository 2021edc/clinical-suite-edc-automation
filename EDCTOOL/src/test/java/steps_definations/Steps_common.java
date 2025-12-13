package steps_definations;

import com.edctool.po.HomePage;
import com.edctool.po.LoginPage;
import com.edctool.po.SubjectPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_common {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	SubjectPage subjectPage = new SubjectPage();

	@Given("user login with {string} username and {string} as a password")
	public void user_login_with_username_and_as_a_password(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLoginButton();
	}

	@Given("user select study {string} and role {string} from dropdown and click on submit button")
	public void user_select_study_and_role_from_dropdown_and_click_on_submit_button(String study, String role) {
		loginPage.selectStudy();
		loginPage.selectValueFromDropdown(study);
		loginPage.selectRole();
		loginPage.selectValueFromDropdown(role);
		loginPage.clickOnLoginButton();
		homePage.verifyNameInHeader();
	}

	@Then("verify that {string} title should be displayed")
	public void verify_that_title_should_be_displayed(String title) {
		homePage.verifyHeader(title);
	}

	@When("user apply filter with site {string} and subject {string}")
	public void user_apply_filter_with_site_and_subject(String site, String subject) {
		subjectPage.clickOnSubjectFilterDropdown();
		subjectPage.clickOnSiteDropdown();
		subjectPage.selectItemFromSiteFilterDropdown(site);
		subjectPage.clickOnSubjectDropdown();
		subjectPage.selectItemFromSiteFilterDropdown(subject);
		subjectPage.clickOnApplyButton();
	}
	
	@Then("Verify that {string} error message should be displayed")
	public void verify_that_error_message_should_be_displayed(String message) {
		loginPage.verifyErrorMessage(message);
	}
	
	@Then("Verify that {string} error message should be displayed in toaster")
	public void verify_that_error_message_should_be_displayed_in_toaster(String message) {
		loginPage.verifyErrorMessageToaster(message);
	}
	
	
}
