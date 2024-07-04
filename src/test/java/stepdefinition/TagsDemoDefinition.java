package stepdefinition;

import io.cucumber.java.en.Given;

public class TagsDemoDefinition {

	@Given("Execute Scenario_One")
	public void execute_scenario_one() {
	    System.out.println("Scenario_One is Executed");
	}
	
	@Given("Execute Scenario_Two")
	public void execute_scenario_two() {
		System.out.println("Scenario_Two is Executed");
	}
	
	@Given("Execute Scenario_Three")
	public void execute_scenario_three() {
		System.out.println("Scenario_Three is Executed");
	}
	
	@Given("Execute Scenario_Four")
	public void execute_scenario_four() {
		System.out.println("Scenario_Four is Executed"); 
	}

	
	@Given("Execute Scenario_Five")
	public void execute_scenario_five() {
		System.out.println("Scenario_Five is Executed"); 
	}
}
