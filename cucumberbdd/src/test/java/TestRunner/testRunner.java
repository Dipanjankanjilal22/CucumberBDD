package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Dipanjan Kanjilal\\eclipse-workspace\\cucumberbdd\\src\\main\\java\\feature\\Login.feature",  
		glue="StepDefination", //the path of the step definition files
		dryRun = false,
		plugin = {"pretty", "html:htmlReport.html"},
		monochrome = true//format= {"pretty","html:test-outout“}		
		)
public class testRunner {

}
