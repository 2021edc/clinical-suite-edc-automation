package steps_definations;

import com.edctool.po.SubjectVisitForm2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Form2 {

	SubjectVisitForm2 subjectVisitForm2 = new SubjectVisitForm2();

	@When("user click on Form 2 option")
	public void user_click_on_form_option() {
		subjectVisitForm2.clickOnForm2Link();
	}

	@Then("verify that Form 2 title should be displayed in header")
	public void verify_that_title_should_be_displayed_in_header() {
		subjectVisitForm2.verifyHeading();
	}

	@When("user select today date from dropdown")
	public void user_select_today_date_from_dropdown() {
		subjectVisitForm2.clickOnDate();
	}

	@When("user select the unknown date checkbox")
	public void user_select_the_unknown_date_checkbox() {
		subjectVisitForm2.clickOnUnknownDate();
	}

	@When("verify that date, month and year checkbox should be displayed")
	public void verify_that_date_month_and_year_checkbox_should_be_displayed() {
		subjectVisitForm2.verifyUnknownDateDropdown();
	}

	@When("user sleect the date {string} from from date dropdown")
	public void user_sleect_the_date_from_from_date_dropdown(String date) {
		subjectVisitForm2.clickOnDate(date);
	}

	@When("user select the month {string} from date dropdown")
	public void user_select_the_month_from_date_dropdown(String month) {
		subjectVisitForm2.clickOnMonth(month);
	}

	@When("user select the year {string} from date dropdown")
	public void user_select_the_year_from_date_dropdown(String year) {
		subjectVisitForm2.clickOnYear(year);
	}

	@Then("verify that Submit for review button should be displayed")
	public void verify_that_submit_for_review_button_should_be_displayed() {
		subjectVisitForm2.verifySubmitForReview();
	}

	@When("user select {string} from hours dropdown")
	public void user_select_from_hours_dropdown(String hours) {
		subjectVisitForm2.selectHrs(hours);
	}

	@When("user select the {string} from minutes dropdown")
	public void user_select_the_from_minutes_dropdown(String minute) {
		subjectVisitForm2.selectMinutes(minute);
	}

	@Then("verify that {string} should be shown in hours dropdown")
	public void verify_that_maximum_should_be_shown_in_hours_dropdown(String hrs) {
		subjectVisitForm2.verifyMaxHrs(hrs);
	}

	@Then("verify that {string} should be shown in mins dropdown")
	public void verify_that_should_be_shown_in_mins_dropdown(String mins) {
		subjectVisitForm2.verifyMaxMins(mins);
	}

	@When("user select {string} from time 24 hours dropdown")
	public void user_select_from_time_hours_dropdown(String hrs) {
		subjectVisitForm2.selectTime24Hrs(hrs);
	}

	@When("user select the {string} from time 24 minutes dropdown")
	public void user_select_the_from_time_minutes_dropdown(String mins) {
		subjectVisitForm2.selectMinutes(mins);
	}

	@Then("verify that {string} should not be shown in time 24 hours dropdown")
	public void verify_that_should_not_be_shown_in_time_hours_dropdown(String hrs) {
		subjectVisitForm2.verifyTime24MaxHrs(hrs);
	}

	@Then("verify that {string} should not be shown in time 24 mins dropdown")
	public void verify_that_should_not_be_shown_in_time_mins_dropdown(String mins) {
		subjectVisitForm2.verifyTime24MaxMins(mins);
	}

}
