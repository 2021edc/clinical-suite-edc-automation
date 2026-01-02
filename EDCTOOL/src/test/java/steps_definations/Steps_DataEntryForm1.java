package steps_definations;

import com.edctool.po.DataEntryForm1;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_DataEntryForm1 {

	DataEntryForm1 subjectVisit = new DataEntryForm1();

	@When("user click on {string} to open the subject visit page")
	public void user_click_on_to_open_the_subject_visit_page(String subjectId) {
		subjectVisit.clickOnSubjectId(subjectId);
	}

	@Then("verify that subject visit page should be opened")
	public void verify_that_subject_visit_page_should_be_opened() {
		subjectVisit.verifyResetButton();
	}

	@When("user enter {string} in search textbox")
	public void user_enter_in_search_textbox(String searchText) {
		subjectVisit.enterSearchText(searchText);
	}

	@Then("verify that {string} message should be displayed")
	public void verify_that_message_should_be_displayed(String message) {
		subjectVisit.verifyNoFormFoundMessage(message);
	}

	@When("user click on X icon")
	public void user_click_on_x_icon() {
		subjectVisit.clickOnClearButton();
	}

	@Then("verify that text should be cleared")
	public void verify_that_text_should_be_cleared() {
		subjectVisit.verifyEmptyTextbox();
	}

	@When("user click on close button")
	public void user_click_on_close_button() {
		subjectVisit.clickOnCloseButton();
	}

	@Then("verify that page should be closed")
	public void verify_that_page_should_be_closed() {
		subjectVisit.verifyFormClose();
	}

	@When("user enter the {string} in the textview textbox")
	public void user_enter_the_in_the_textview_textbox(String text) {
		subjectVisit.enterTextView(text);
	}

	@When("user enter the {string} in the textarea")
	public void user_enter_the_in_the_textarea(String text) {
		subjectVisit.enterTextArea(text);
	}

	@When("user enter the {string} in number textbox")
	public void user_enter_the_in_number_textbox(String number) {
		subjectVisit.enterTextNumber(number);
	}

	@When("user click on save button to save the form")
	public void user_click_on_save_button_to_save_the_form() {
		subjectVisit.clickOnSaveButton();
	}

	@Then("verify that number all field query should be given")
	public void verify_that_number_all_field_query_should_be_given() {
		subjectVisit.verifyNumberAllQuery();
	}

	@Then("verify that {string} message should be displayed if mandatory fields not entered")
	public void verify_that_message_should_be_displayed_if_mandatory_fields_not_entered(String headerMessage) {
		subjectVisit.verifySystemGeneratedQueryLabel(headerMessage);
	}

	@Then("verify that {string} query description should be displayed")
	public void verify_that_query_description_should_be_displayed(String message) {
		subjectVisit.verifyQueryDesc(message);
	}

	@When("user enter the {string} in Number all textbox")
	public void user_enter_the_in_number_all_textbox(String number) {
		subjectVisit.enterNumberAll(number);
	}

	@Then("verify that alphabets should not be entered")
	public void verify_that_alphabets_should_not_be_entered() {
		subjectVisit.verifyNumberInNumberAllTextbox();
	}

	@Then("verify that help text should be displayed")
	public void verify_that_help_text_should_be_displayed() {
		subjectVisit.verifyHelpIcon();
	}

	@Then("verify that {string} label pop up should be displayed")
	public void verify_that_label_pop_up_should_be_displayed(String label) {
		subjectVisit.verifySystemGeneratedQueryLabel(label);
	}

	@Then("verify that checkbox should be displayed")
	public void verify_that_checkbox_should_be_displayed() {
		subjectVisit.verifyCheckbox();
	}

	@When("user select {string} checkbox")
	public void user_select_checkbox(String option) {
		subjectVisit.selectCheckboxOption(option);
	}

	@When("user select {string} checkbox mandatory")
	public void user_select_checkbox_mandatory(String option) {
		subjectVisit.selectCheckboxMandtory(option);
	}

	@When("user select the {string} from radio button mandatory")
	public void user_select_the_from_radio_button_mandatory(String option) {
		subjectVisit.selectRadioButton(option);
	}

	@Then("verify that select dropdown should be disabled")
	public void verify_that_select_dropdown_should_be_disabled() {
		subjectVisit.ddlSelectDisabled();
	}

	@Then("verify that select dropdown should be enabled")
	public void verify_that_select_dropdown_should_be_enabled() {
		subjectVisit.ddlSelectEnabled();
	}
	
	@When("user click on dropdown")
	public void user_click_on_dropdown() {
	    subjectVisit.clickOnDropdown();
	}

	@Then("verify that {string} should be displayed in dropdown")
	public void verify_that_should_be_displayed_in_dropdown(String option) {
	    subjectVisit.verifyOptionInList(option);
	}
	
	@Then("verify that confirmation pop up should be displayed")
	public void verify_that_confirmation_pop_up_should_be_displayed() {
	  subjectVisit.verifyConfirmationTitle();
	}
	
	@Then("verify that cancel button should be displayed in confirmation popup")
	public void verify_that_cancel_button_should_be_displayed_in_confirmation_popup() {
	  subjectVisit.verifyCancelButtonInConfirmationPopup();
	}

	@Then("verify that Yes button should be displayed in confirmation popup")
	public void verify_that_yes_button_should_be_displayed_in_confirmation_popup() {
	   subjectVisit.verifyYesButtonInConfirmationPopup();
	}
	
	@When("user remove the text from the textview textbox")
	public void user_remove_the_text_from_the_textview_textbox() {
	   subjectVisit.clearTextView();
	}

}
