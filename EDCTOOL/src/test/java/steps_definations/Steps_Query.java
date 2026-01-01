package steps_definations;

import java.util.ArrayList;

import com.edctool.po.QueryPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Query {

	QueryPage queryPage = new QueryPage();

	@Then("verify that {string}, {string}, {string} and {string} query validation message should be appear")
	public void verify_that_and_query_validation_message_should_be_appear(String field1, String field2, String field3,
			String field4) {
		ArrayList<String> lstFields = new ArrayList<String>();
		lstFields.add(field1);
		lstFields.add(field2);
		lstFields.add(field3);
		lstFields.add(field4);

		queryPage.verifyAllFieldQuery(lstFields);
	}

	@When("user click on yes button")
	public void user_click_on_yes_button() {
		queryPage.clickOnYesButton();
	}

	@Then("verify that query raised icon should be displayed")
	public void verify_that_query_raised_icon_should_be_displayed() {
		queryPage.verifyQueryIcon();
	}

	@Then("verify that Updated data points pop up should be displayed")
	public void verify_that_updated_data_points_pop_up_should_be_displayed() {
		queryPage.verifyUpdatedDataPointPopup();
	}

	@When("user select the {string} from common reason dropdown")
	public void user_select_the_from_common_reason_dropdown(String reason) {
		queryPage.selectCommonReason(reason);
	}

	@Then("verify that {string} should be displayed for the Textview field")
	public void verify_that_should_be_displayed_for_the_textview_field(String reason) {
		queryPage.verifyTextViewSelectReason(reason);
	}

	@Then("verify that {string} should be displayed for the Number All field")
	public void verify_that_should_be_displayed_for_the_number_all_field(String reason) {
		queryPage.verifyNumberAllSelectReason(reason);
	}

	@Then("verify that {string} should be displayed for the Checkbox Mandatory field")
	public void verify_that_should_be_displayed_for_the_checkbox_mandatory_field(String reason) {
		queryPage.verifyCheckboxMandtorySelectReason(reason);
	}

	@Then("verify that {string} should be displayed for the Radio button Mandatory field")
	public void verify_that_should_be_displayed_for_the_radio_button_mandatory_field(String reason) {
		queryPage.verifyRadioButtonMandtorySelectReason(reason);
	}

	@Then("verify that {string} should be displayed in common reason dropdown")
	public void verify_that_should_be_displayed_in_common_reason_dropdown(String reason) {
		queryPage.verifyCommonReasonOption(reason);
	}

	@When("user click on No button")
	public void user_click_on_no_button() {
		queryPage.clickOnNoButton();
	}
}
