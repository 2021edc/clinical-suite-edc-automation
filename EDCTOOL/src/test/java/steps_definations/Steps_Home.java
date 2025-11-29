package steps_definations;

import com.edctool.po.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Home {
	
	HomePage homePage = new HomePage();
	
	@Then("Verify that username should be displayed into home page")
	public void verify_that_username_should_be_displayed_into_home_page() {
	   homePage.verifyNameInHeader();
	}

	@Then("verify that {string} should be displayed")
	public void verify_that_should_be_displayed(String option) {
		 homePage.verifySubjectInLeftSideMenu(option);
	}
	
	@When("user click on {string} opion from left side menu")
	public void user_click_on_opion_from_left_side_menu(String option) {
	    homePage.clickOnMenuItem(option);
	}

}
