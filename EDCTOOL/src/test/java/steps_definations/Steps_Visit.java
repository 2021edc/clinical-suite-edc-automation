package steps_definations;

import com.edctool.po.SubjectVisit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Visit {
	
	SubjectVisit subjectVisit= new SubjectVisit();
	
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

}
