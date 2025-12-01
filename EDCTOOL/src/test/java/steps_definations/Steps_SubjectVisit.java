package steps_definations;

import com.edctool.po.SubjectVisit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_SubjectVisit {

	SubjectVisit subjectVisit = new SubjectVisit();

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

}
