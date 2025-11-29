package steps_definations;

import com.edctool.po.LoginPage;
import com.edctool.po.SubjectPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Subjects {

	SubjectPage subjectPage = new SubjectPage();
	LoginPage loginPage= new LoginPage();

	@Then("verify that Add Subject button should be displayed")
	public void verify_that_add_subject_button_should_be_displayed() {
		subjectPage.verifySubjectButton();
	}

	@When("user click on Add Subject button")
	public void user_click_on_add_subject_button() {
		subjectPage.clickOnAddSubjectButton();
	}

	@Then("verify that {string} pop up should be opened")
	public void verify_that_pop_up_should_be_opened(String subjectLabel) {
		subjectPage.verifyAddSubjectDetails(subjectLabel);
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		subjectPage.clickOnSaveButton();
	}

	@When("select the {string} option from site dropdown")
	public void select_the_option_from_site_dropdown(String option) {
		subjectPage.selectSiteOption(option);
	}

	@When("user remove the default from subject name textbox")
	public void user_remove_the_default_from_subject_name_textbox() {
		subjectPage.removeSubjectName();
	}

	@When("user enter the {string} as a subject name")
	public void user_enter_the_as_a_subject_name(String subjectName) {
		subjectPage.enterSubjectName(subjectName);
	}
	
	@When("user click on cancel button to close the pop up")
	public void user_click_on_cancel_button_to_close_the_pop_up() {
	   subjectPage.clickOnCancelButton();
	}
	
	@Then("verify that pop up should be closed")
	public void verify_that_pop_up_should_be_closed() {
	   subjectPage.verifyClosePopup();
	}

	@Then("Verify that {string} message should be displayed")
	public void verify_that_message_should_be_displayed(String message) {
		loginPage.verifyErrorMessage(message);
	}
	
	@When("user click on subject id textbox")
	public void user_click_on_subject_id_textbox() {
	   subjectPage.clickSubjectName();
	}

}
