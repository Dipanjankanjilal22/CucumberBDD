package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinations"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/htmlReports",
		"json:target/JSONReports/report.json"})
public class testRunner {

}
