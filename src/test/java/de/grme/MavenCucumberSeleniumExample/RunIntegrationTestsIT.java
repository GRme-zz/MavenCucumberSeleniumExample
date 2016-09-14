package de.grme.MavenCucumberSeleniumExample;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json"},
				glue = { "de.grme.MavenCucumberSeleniumExample"},
				features = {"classpath:features"})
public class RunIntegrationTestsIT {

}
