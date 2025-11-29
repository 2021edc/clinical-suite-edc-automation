package steps_definations;

import com.edctool.po.HomePage;

import io.cucumber.java.en.Then;

public class Steps_Home {
	
	HomePage homePage = new HomePage();
	
	@Then("Verify that username should be displayed into home page")
	public void verify_that_username_should_be_displayed_into_home_page() {
	   homePage.verifyNameInHeader();
	}


}
