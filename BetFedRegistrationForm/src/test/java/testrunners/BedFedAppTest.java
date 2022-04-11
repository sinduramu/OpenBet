package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/betfedfeatures/BetFedAppPassword.feature"},
		glue = {"betfed.stepdefinitions","MyHooks"}
		
		)
		
public class BedFedAppTest {

}
