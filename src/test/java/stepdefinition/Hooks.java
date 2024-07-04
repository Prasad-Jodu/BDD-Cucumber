package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp()
	{
		System.out.println("Executed Before Scenario");
	}
	
	@After
	public  void tearDown()
	{
		System.out.println("Executed After Scenario");
	}
	
	@Before("@Regression")
	public void RegressionsetUp()
	{
		System.out.println("Executed Before Regression Scenario");
	}
	
	@After("@Regression")
	public  void RegressiontearDown()
	{
		System.out.println("Executed After Regression Scenario");
	}
}
