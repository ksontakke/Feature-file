package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/unacademySearch.feature", glue= {"testDefinition"}, plugin= {"pretty","junit: target/junit-report/cucumberlogin.xml"})
public class testRunner 
{

}
