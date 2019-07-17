package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = { "stepdefinitions" }, features = { "scenarios/test.feature" })
public class Runner extends AbstractTestNGCucumberTests {

}
