package steps_definations;

import com.edctool.po.SubjectVisitForm2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Form2 {
	
	SubjectVisitForm2 subjectVisitForm2= new SubjectVisitForm2();
	
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

}
