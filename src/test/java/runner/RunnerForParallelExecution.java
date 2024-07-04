package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/java/featurefiles/LoginFeature.feature",glue = "stepdefinition",
plugin = {"pretty","html:target/cucumber.html"}) 
public class RunnerForParallelExecution extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
