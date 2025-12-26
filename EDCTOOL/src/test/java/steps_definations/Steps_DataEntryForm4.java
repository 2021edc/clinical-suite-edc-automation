package steps_definations;

import com.edctool.po.DataEntryForm4;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_DataEntryForm4 {

	DataEntryForm4 dataEntryForm4 = new DataEntryForm4();

	@Then("verify that file upload option should be displayed")
	public void verify_that_file_upload_option_should_be_displayed() {
		dataEntryForm4.verifyFileUpload();
	}

	@When("user upload the {string} file")
	public void user_upload_the_file(String fileName) {
		dataEntryForm4.uploadFileToForm4(fileName);
	}

	@Then("verify that file should be uploaded")
	public void verify_that_file_should_be_uploaded() {
		dataEntryForm4.verifyRemoveFileDisplay();
	}

	@When("user click on remove file button")
	public void user_click_on_remove_file_button() {
		dataEntryForm4.clickOnRemoveFile();
	}

	@Then("verify that file should be removed")
	public void verify_that_file_should_be_removed() {
		dataEntryForm4.removeLinkShouldNotDisplay();
	}

	@Then("verify that start upload button should be displayed")
	public void verify_that_start_upload_button_should_be_displayed() {
		dataEntryForm4.verifyStartAllButton();
	}

	@Then("verify that pause button should be displayed")
	public void verify_that_pause_button_should_be_displayed() {
		dataEntryForm4.verifyPauseButton();
	}

	@Then("verify that resume button should be displayed")
	public void verify_that_resume_button_should_be_displayed() {
		dataEntryForm4.verifyResumeButton();
	}

	@Then("verify that Stop & Cancel button should be displayed")
	public void verify_that_stop_cancel_button_should_be_displayed() {
		dataEntryForm4.verifyPauseAndCancelButton();
	}

	@Then("verify that remove all button should be displayed")
	public void verify_that_remove_all_button_should_be_displayed() {
		dataEntryForm4.verifyRemoveAllButton();
	}

	@Then("verify that resume button should be disabled")
	public void verify_that_resume_button_should_be_disabled() {
		dataEntryForm4.verifyDisableResumeButton();
	}

	@Then("verify that stop & cancel button should be disabled")
	public void verify_that_stop_cancel_button_should_be_disabled() {
		dataEntryForm4.verifyDisableStopAndCancelButton();
	}

	@Then("verify that pause button should be disabled")
	public void verify_that_pause_button_should_be_disabled() {
		dataEntryForm4.verifyDisablePauseButton();
	}
	
	@When("user select yesterday date from date {int} in form")
	public void user_select_yesterday_date_from_date_in_form(Integer int1) {
	   
	}

	@When("user select the today date from date {int} in form")
	public void user_select_the_today_date_from_date_in_form(Integer int1) {
	  
	}
}
