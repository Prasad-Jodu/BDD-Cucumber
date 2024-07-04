package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt",glue = "stepdefinition",dryRun = false,
plugin = {"pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerForFailedTestNg extends AbstractTestNGCucumberTests{

}
