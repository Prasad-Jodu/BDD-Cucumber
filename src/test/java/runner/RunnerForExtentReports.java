package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test
@CucumberOptions(features = "./src/test/java/featurefiles/LoginFeature.feature",glue = "stepdefinition",
plugin = {"pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"})
public class RunnerForExtentReports extends AbstractTestNGCucumberTests{

}
