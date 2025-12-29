package steps_definations;

import com.edctool.po.DataEntryForm3;
import com.edctool.po.DataEntryForm4;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_DataEntryForm4 {

	DataEntryForm4 dataEntryForm4 = new DataEntryForm4();
	DataEntryForm3 dataEntryForm3= new DataEntryForm3();

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

	@When("user select today date from date 1 in form")
	public void user_select_today_date_from_date_in_form() {
		dataEntryForm4.clickOnTodayDate1();
	}

	@When("user select the yesterday date from date 2 in form")
	public void user_select_the_yesterday_date_from_date_in_form() {
		dataEntryForm4.clickOnYesterdayDate2();
	}

	@When("user select today date from date 2 in form")
	public void user_select_today_date_from_date_2_in_form() {
		dataEntryForm4.clickOnYesterdayDate1();
	}

	@When("user select the yesterday date from date 1 in form")
	public void user_select_the_yesterday_date_from_date_1_in_form() {
		dataEntryForm4.clickOnTodayDate2();
	}
	
	@When("user select today date from date 3 in form")
	public void user_select_today_date_from_date_3_in_form() {
	   dataEntryForm4.clickOnTodayDate3();
	}

	@Then("verify that validation message should not be appear")
	public void verify_that_validation_message_should_not_be_appear() {
	    dataEntryForm3.verifyDateValidationNotAppear();
	}

	@When("user select today date from date 4 in form")
	public void user_select_today_date_from_date_4_in_form() {
	   dataEntryForm4.clickOnTodayDate4();
	}
}
