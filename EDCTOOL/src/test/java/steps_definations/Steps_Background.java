package steps_definations;

import com.edctool.framework.WebBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class Steps_Background {

	WebBase webBase = new WebBase();

	@Given("user open {string} browser and enter url {string}")
	public void user_open_browser_and_enter_url(String browser, String url) {
		webBase.createDriver(browser);
		webBase.openWebsite(url);
	}

	@After
	public void tearDown() {
		webBase.closeBrowser();
	}

}
