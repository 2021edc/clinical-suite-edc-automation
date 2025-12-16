package steps_definations;

import java.io.InputStream;
import java.util.Properties;
import com.edctool.framework.WebBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class Steps_Background {

	WebBase webBase = new WebBase();

	private static Properties properties;

	static {
		try {
			properties = new Properties();
			InputStream input = WebBase.class.getClassLoader().getResourceAsStream("config/config.properties");

			if (input == null) {
				throw new RuntimeException("config.properties not found");
			}

			properties.load(input);
		} catch (Exception e) {
			throw new RuntimeException("Failed to load config.properties", e);
		}
	}

	@Given("user open browser and enter url")
	public void user_open_browser_and_enter_url() {
		webBase.createDriver(properties.getProperty("browser"));
		webBase.openWebsite(properties.getProperty("url"));
	}

	@After
	public void tearDown() {
		webBase.closeBrowser();
	}

}
