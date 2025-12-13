package steps_definations;

import com.edctool.po.LoginPage;
import com.edctool.po.SubjectPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Subjects {

	SubjectPage subjectPage = new SubjectPage();
	LoginPage loginPage = new LoginPage();

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

	@When("user click on subject filter")
	public void user_click_on_subject_filter() {
		subjectPage.clickOnSubjectFilterDropdown();
	}

	@When("user select {string} from site filter dropdown")
	public void user_select_from_site_filter_dropdown(String site) {
		subjectPage.clickOnSiteDropdown();
		subjectPage.selectItemFromSiteFilterDropdown(site);
	}

	@When("user select the {string} subject id")
	public void user_select_the_subject_id(String subjectId) {
		subjectPage.clickOnSubjectDropdown();
		subjectPage.selectItemFromSiteFilterDropdown(subjectId);
	}

	@When("user click on apply button")
	public void user_click_on_apply_button() {
		subjectPage.clickOnApplyButton();
	}

	@Then("verify that {string} subject id should be displayed in list")
	public void verify_that_subject_id_should_be_displayed_in_list(String subjectId) {
		subjectPage.verifySubjectList(subjectId);
	}

	@When("verify that site filter dropdown should be displayed")
	public void verify_that_site_filter_dropdown_should_be_displayed() {
		subjectPage.verifySiteFilterDropdown();
	}

	@When("verify that subject filter dropdown should be displayed")
	public void verify_that_subject_filter_dropdown_should_be_displayed() {
		subjectPage.verifySubjectsFilterDropdown();
	}

	@When("verify that status filter dropdown should be displayed")
	public void verify_that_status_filter_dropdown_should_be_displayed() {
		subjectPage.verifyStatusFilterDropdown();
	}

	@When("verify that local status filter dropdown should be displayed")
	public void verify_that_local_status_filter_dropdown_should_be_displayed() {
		subjectPage.verifyLockFilterDropdown();
	}

	@When("verify that apply button should be displayed")
	public void verify_that_apply_button_should_be_displayed() {
		subjectPage.verifyApplyFilterButton();
	}

	@When("verify that clear filter button should be displayed")
	public void verify_that_clear_filter_button_should_be_displayed() {
		subjectPage.verifyClearAllFilterButton();
	}

	@When("verify that close button should be displayed")
	public void verify_that_close_button_should_be_displayed() {
		subjectPage.verifyCloseFilterButton();
	}

}
