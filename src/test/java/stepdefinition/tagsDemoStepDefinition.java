package stepdefinition;

import io.cucumber.java.en.Given;

public class tagsDemoStepDefinition {

	@Given("Executing scenario_one")
	public void executing_scenario_one() {
	    System.out.println("Executing Scenaio_1");
	}
	
	@Given("Executing scenario_two")
	public void executing_scenario_two() {
		 System.out.println("Executing Scenaio_2");
	}
	
	@Given("Executing scenario_three")
	public void executing_scenario_three() {
		 System.out.println("Executing Scenaio_3");
	}
	
	@Given("Executing scenario_four")
	public void executing_scenario_four() {
		 System.out.println("Executing Scenaio_4"); 
	}
	
	@Given("Executing scenario_five")
	public void executing_scenario_five() {
		 System.out.println("Executing Scenaio_5");  
	}

}
