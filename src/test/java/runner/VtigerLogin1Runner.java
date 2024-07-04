package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/featurefiles/VtigerLogin.feature",
glue="stepdefinition",dryRun=false)
public class VtigerLogin1Runner extends AbstractTestNGCucumberTests {

}
