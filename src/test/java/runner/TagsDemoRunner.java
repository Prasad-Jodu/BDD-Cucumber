package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/featurefiles/TagsDemo.feature",glue = "stepdefinition",
dryRun = false,tags = "@Smoke or @Regression",plugin = {"pretty","html:target/cucumer-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TagsDemoRunner extends AbstractTestNGCucumberTests{

}
