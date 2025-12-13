package steps_definations;

import com.edctool.po.DataEntryForm2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_DataEntryForm2 {

	DataEntryForm2 dataEntryForm2 = new DataEntryForm2();

	@When("user click on Form 2 option")
	public void user_click_on_form_option() {
		dataEntryForm2.clickOnForm2Link();
	}

	@Then("verify that Form 2 title should be displayed in header")
	public void verify_that_title_should_be_displayed_in_header() {
		dataEntryForm2.verifyHeading();
	}

	@When("user select today date from dropdown")
	public void user_select_today_date_from_dropdown() {
		dataEntryForm2.clickOnDate();
	}

	@When("user select the unknown date checkbox")
	public void user_select_the_unknown_date_checkbox() {
		dataEntryForm2.clickOnUnknownDate();
	}

	@When("verify that date, month and year checkbox should be displayed")
	public void verify_that_date_month_and_year_checkbox_should_be_displayed() {
		dataEntryForm2.verifyUnknownDateDropdown();
	}

	@When("user sleect the date {string} from from date dropdown")
	public void user_sleect_the_date_from_from_date_dropdown(String date) {
		dataEntryForm2.clickOnDate(date);
	}

	@When("user select the month {string} from date dropdown")
	public void user_select_the_month_from_date_dropdown(String month) {
		dataEntryForm2.clickOnMonth(month);
	}

	@When("user select the year {string} from date dropdown")
	public void user_select_the_year_from_date_dropdown(String year) {
		dataEntryForm2.clickOnYear(year);
	}

	@Then("verify that Submit for review button should be displayed")
	public void verify_that_submit_for_review_button_should_be_displayed() {
		dataEntryForm2.verifySubmitForReview();
	}

	@When("user select {string} from hours dropdown")
	public void user_select_from_hours_dropdown(String hours) {
		dataEntryForm2.selectHrs(hours);
	}

	@When("user select the {string} from minutes dropdown")
	public void user_select_the_from_minutes_dropdown(String minute) {
		dataEntryForm2.selectMinutes(minute);
	}

	@Then("verify that {string} should be shown in hours dropdown")
	public void verify_that_maximum_should_be_shown_in_hours_dropdown(String hrs) {
		dataEntryForm2.verifyMaxHrs(hrs);
	}

	@Then("verify that {string} should be shown in mins dropdown")
	public void verify_that_should_be_shown_in_mins_dropdown(String mins) {
		dataEntryForm2.verifyMaxMins(mins);
	}

	@When("user select {string} from time 24 hours dropdown")
	public void user_select_from_time_hours_dropdown(String hrs) {
		dataEntryForm2.selectTime24Hrs(hrs);
	}

	@When("user select the {string} from time 24 minutes dropdown")
	public void user_select_the_from_time_minutes_dropdown(String mins) {
		dataEntryForm2.selectMinutes(mins);
	}

	@Then("verify that {string} should not be shown in time 24 hours dropdown")
	public void verify_that_should_not_be_shown_in_time_hours_dropdown(String hrs) {
		dataEntryForm2.verifyTime24MaxHrs(hrs);
	}

	@Then("verify that {string} should not be shown in time 24 mins dropdown")
	public void verify_that_should_not_be_shown_in_time_mins_dropdown(String mins) {
		dataEntryForm2.verifyTime24MaxMins(mins);
	}

	@When("user select {string} hrs from time 12 hrs with sec dropdown")
	public void user_select_hrs_from_time_hrs_with_sec_dropdown(String hrs) {
		dataEntryForm2.selectHrsTime12WithSec(hrs);
	}

	@When("user select the {string} mins from time 12 hrs with sec dropdown")
	public void user_select_the_mins_from_time_hrs_with_sec_dropdown(String mins) {
		dataEntryForm2.selectMinsTime12WithSec(mins);
	}

	@When("user select the {string} sec from time 12 hrs with sec dropdown")
	public void user_select_the_sec_from_time_hrs_with_sec_dropdown(String sec) {
		dataEntryForm2.selectSecTime12WithSec(sec);
	}

	@When("user select the {string} from time 12 hrs with sec AMPM dropdown")
	public void user_select_the_from_time_hrs_with_sec_am_pm_dropdown(String AMPM) {
		dataEntryForm2.selectAMPMTime12WithSec(AMPM);
	}

	@Then("verify that {string} should not be shown in time 12 hours with sec dropdown")
	public void verify_that_should_not_be_shown_in_time_hours_with_sec_dropdown(String hrs) {
		dataEntryForm2.verifyMaxHrsForTime12HrsWithSec(hrs);
	}

	@Then("verify that {string} mins should not be shown in time 12 hours with sec dropdown")
	public void verify_that_mins_should_not_be_shown_in_time_hours_with_sec_dropdown(String mins) {
		dataEntryForm2.verifyMaxMinsForTime12HrsWithSec(mins);
	}

	@Then("verify that {string} sec should not be shown in time 12 hours with sec dropdown")
	public void verify_that_sec_should_not_be_shown_in_time_hours_with_sec_dropdown(String sec) {
		dataEntryForm2.verifyMaxSecForTime12HrsWithSec(sec);
	}

	@Then("verify that {string} should be shown in time 12 hours with sec dropdown")
	public void verify_that_should_be_shown_in_time_hours_with_sec_dropdown(String hrs) {
		dataEntryForm2.verifyMinHrsForTime12HrsWithSec(hrs);
	}

	@Then("verify that {string} mins should be shown in time 12 hours with sec dropdown")
	public void verify_that_mins_should_be_shown_in_time_hours_with_sec_dropdown(String mins) {
		dataEntryForm2.verifyMinMinsForTime12HrsWithSec(mins);
	}

	@Then("verify that {string} sec should be shown in time 12 hours with sec dropdown")
	public void verify_that_sec_should_be_shown_in_time_hours_with_sec_dropdown(String sec) {
		dataEntryForm2.verifyMinSecForTime12HrsWithSec(sec);
	}

	@When("user click on today date from date and time textbox")
	public void user_click_on_today_date_from_date_and_time_textbox() {
		dataEntryForm2.clickOnDateTime();
	}

	@When("user select the {string} hrs from the date time dropdown")
	public void user_select_the_hrs_from_the_date_time_dropdown(String hrs) {
		dataEntryForm2.selectHrsDateTime(hrs);
	}

	@When("user select the {string} mins from the date time dropdown")
	public void user_select_the_mins_from_the_date_time_dropdown(String mins) {
		dataEntryForm2.selectMinsDateTime(mins);
	}

	@Then("verify that user should not be able to select the next date")
	public void verify_that_user_should_not_be_able_to_select_the_next_date() {
		dataEntryForm2.verifyNextDateDisableAndNotClickable();
	}
}
