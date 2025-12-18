package steps_definations;

import com.edctool.po.DataEntryForm3;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_DataEntryForm3 {

	DataEntryForm3 dataEntryForm3 = new DataEntryForm3();

	@When("user click on form option")
	public void user_click_on_form_option() {
		dataEntryForm3.clickOnForm3();
	}

	@Then("verify that form 3 should be opened")
	public void verify_that_form_should_be_opened() {
		dataEntryForm3.verifyForm3();
	}

	@Then("verify that {string} form 3 title message should be displayed")
	public void verify_that_form_title_message_should_be_displayed(String message) {
		dataEntryForm3.verifyTitle(message);
	}

	@When("user click on plus icon")
	public void user_click_on_plus_icon() {
		dataEntryForm3.clickOnPlusIcon();
	}

	@Then("verify that multirow table should be opened")
	public void verify_that_multirow_table_should_be_opened() {
		dataEntryForm3.verifyMultiRowTable();
	}

	@Then("verify that Sr no textbox should be displayed")
	public void verify_that_sr_no_textbox_should_be_displayed() {
		dataEntryForm3.verifySrNo();
	}

	@Then("verify that bp textbox should be displayed")
	public void verify_that_bp_textbox_should_be_displayed() {
		dataEntryForm3.verifyBp();
	}

	@Then("verify that Heart Rate checkbox should be displayed")
	public void verify_that_heart_rate_checkbox_should_be_displayed() {
		dataEntryForm3.verifyHeartRateCheckbox();
	}

	@When("user enter {string} in sr no textbox")
	public void user_enter_in_sr_no_textbox(String srNo) {
		dataEntryForm3.enterSrNo(srNo);
	}

	@When("user enter {string} in bp textbox")
	public void user_enter_in_bp_textbox(String bp) {
		dataEntryForm3.enterBp(bp);
	}

	@When("user select {string} checkbox from heart rate")
	public void user_select_checkbox_from_heart_rate(String heartRate) {
		dataEntryForm3.selectHeartRate(heartRate);
	}

	@When("user select {string} from treatment checkbox")
	public void user_select_from_treatment_checkbox(String treatement) {
		dataEntryForm3.selectTreatment(treatement);
	}

	@When("user select {string} from Respiratory Rate dropdown")
	public void user_select_from_respiratory_rate_dropdown(String respiratory) {
		dataEntryForm3.selectRespiratoryRate(respiratory);
	}

	@When("user click on close icon")
	public void user_click_on_close_icon() {
		dataEntryForm3.clickOnCloseIcon();
	}

	@Then("verify that form should be closed")
	public void verify_that_form_should_be_closed() {
		dataEntryForm3.formClosedAfterClickingOnCloseIcon();
	}

	@Then("verify that plus icon should be disabled")
	public void verify_that_plus_icon_should_be_disabled() {
		dataEntryForm3.verifyPlusIconDisable();
	}

	@When("user click on save button to save the form {int}")
	public void user_click_on_save_button_to_save_the_form(Integer int1) {
		dataEntryForm3.clickOnSaveButton();
	}

	@Then("verify that {string} validation message should be appear while save the form")
	public void verify_that_validation_message_should_be_appear_while_save_the_form(String message) {
		dataEntryForm3.verifyErrorMessage(message);
	}

	@Then("verify that {string} added log should be displayed with today date")
	public void verify_that_added_log_should_be_displayed_with_today_date(String log) {
		dataEntryForm3.validateTestTableForToday(log);
	}

	@When("user click on save button to save the table")
	public void user_click_on_save_button_to_save_the_table() {
		dataEntryForm3.clickOnSaveIcon();
	}

	@When("user click on delete")
	public void user_click_on_delete() {
		dataEntryForm3.clickOnCloseIcon();
	}

	@Then("verify that + icon should be enabled")
	public void verify_that_icon_should_be_enabled() {
		dataEntryForm3.plusIconEnabled();
	}

	@Then("verify that Add button should be disabled")
	public void verify_that_add_button_should_be_disabled() {
		dataEntryForm3.addButtonDisable();
	}

	@Then("verify that add button should be enabled")
	public void verify_that_add_button_should_be_enabled() {
		dataEntryForm3.addButtonEnable();
	}

	@When("user click on add button")
	public void user_click_on_add_button() {
		dataEntryForm3.clickOnAddButton();
	}

	@When("user enter the {string} in sr no textbox")
	public void user_enter_the_in_sr_no_textbox(String srNo) {
		dataEntryForm3.enterSrNoInMultiRaw(srNo);
	}

	@When("user click on save button to save the multi raw form {int}")
	public void user_click_on_save_button_to_save_the_multi_raw_form(Integer int1) {
		dataEntryForm3.clickOnSaveForMultiRaw();
	}
	
	@When("user click on multi raw close button")
	public void user_click_on_multi_raw_close_button() {
	  dataEntryForm3.clickOnMultiRawClose();
	}

	@Then("verify that multi raw form should be closed")
	public void verify_that_multi_raw_form_should_be_closed() {
	   dataEntryForm3.verifyCloseForm();
	}

}
