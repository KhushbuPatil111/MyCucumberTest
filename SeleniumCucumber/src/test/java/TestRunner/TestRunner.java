package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "D://Eclipse workspace//SeleniumCucumber//Features//OrangeHRMLogin.feature",
				  glue = "StepDefinition" ,	
				  dryRun = false, 
				  monochrome = true,
				 plugin= { "pretty", "html:target/cucumber-htmlreport",
						  "json:target/cucumber-report.json" }
		)

public class TestRunner {

}
