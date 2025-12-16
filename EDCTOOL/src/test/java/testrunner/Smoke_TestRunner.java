package testrunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps_definations")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@smoke96")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-smoke-13-test-report.html")

public class Smoke_TestRunner {

}
