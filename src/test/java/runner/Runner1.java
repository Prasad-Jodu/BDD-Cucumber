package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = ".\\src\\test\\java\\featurefiles\\LoginFeature.feature",glue = "stepdefinition")
public class Runner1 extends AbstractTestNGCucumberTests {

}
