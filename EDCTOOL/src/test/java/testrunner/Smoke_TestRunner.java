package testrunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps_definations")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-smoke-20-test-report.html")

public class Smoke_TestRunner {

}
