package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/featurewithtags"
,glue= {"StepDefinations"}
,tags="@smoke or @regression"
)
public class testRunner2_withsingletags {

}
