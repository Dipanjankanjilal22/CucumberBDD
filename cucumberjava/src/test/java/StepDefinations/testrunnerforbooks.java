package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Backgrounddemo"
,glue= {"stepsforbackground"}
,monochrome=true
,plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/htmlReports",
		"json:target/JSONReports/report.json"})
public class testrunnerforbooks {

}
