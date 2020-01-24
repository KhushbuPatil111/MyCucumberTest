package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Users\\khushbu.patil\\gitCucumberGit\\SeleniumCucumber\\Features\\OrangeHRMLogin.feature",
				  glue = "StepDefinition" ,	
				  dryRun = false, 
				  monochrome = true,
				  tags= {"@ignore"},
				 plugin= { "pretty", "html:target/cucumber-htmlreport",
						  "json:target/cucumber-report.json" }
		)

public class TestRunner {

}
