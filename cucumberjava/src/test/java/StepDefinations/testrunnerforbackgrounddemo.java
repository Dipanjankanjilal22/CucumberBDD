package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Backgrounddemo/backgrounddemo.feature"
,glue= {"stepsforbackground"},
plugin= {"pretty"
		,"junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports",
		"json:target/JSONReports/report.json"})

public class testrunnerforbackgrounddemo {

}
