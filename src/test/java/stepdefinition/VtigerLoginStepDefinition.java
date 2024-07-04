package stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VtigerLoginStepDefinition {

	WebDriver driver=null;
	@Given("The User should be on login page")
	public void the_user_should_be_on_login_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8888");
	}
	@When("The User enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("The User clicks on login button")
	public void the_user_clicks_on_login_button() {
	    driver.findElement(By.id("submitButton")).click();;
	}
	@Then("The should be redirected to home page")
	public void the_should_be_redirected_to_home_page() {
	    
	}
	@Then("Administrator should be displayed on homepage")
	public void administrator_should_be_displayed_on_homepage() {
	   String actText = driver.findElement(By.xpath("//span[text()=' Administrator']")).getText();
	   Assert.assertEquals(actText, "Administrator");
	   driver.close();
	}
	
	@When("The User enters the valid {string} and {string}")
	public void the_user_enters_the_valid_and(String username, String password) {
		driver.findElement(By.name("user_name")).sendKeys(username);
	    driver.findElement(By.name("user_password")).sendKeys(password);
	}
	
	@When("The User enters the valid {string} and {string} \\/\\/Parameterization")
	public void the_user_enters_the_valid_and_parameterization(String username, String password) {
	 
		driver.findElement(By.name("user_name")).sendKeys(username);
	    driver.findElement(By.name("user_password")).sendKeys(password);
	}
	

	@Then("It should display You must specify a valid username and password.")
	public void it_should_display_you_must_specify_a_valid_username_and_password() {
		
	}
	@When("The User enter the invalid {string} and {string}")
	public void the_user_enter_the_invalid_and(String un, String pwd) throws Throwable {
		driver.findElement(By.name("user_name")).sendKeys(un);
	    driver.findElement(By.name("user_password")).sendKeys(pwd);
	    Thread.sleep(5000);
	    
	}
	
	@When("The User enter the valid username and password")
	public void the_user_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists(String.class);
	    
	    driver.findElement(By.name("user_name")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("user_password")).sendKeys(data.get(0).get(1));
	}
	
	@When("The User enter the valid userName and password")
	public void the_user_enter_the_valid_user_name_and_password(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> dataMap = dataTable.asMaps(String.class, String.class);
	    driver.findElement(By.name("user_name")).sendKeys(dataMap.get(0).get("username"));
	    driver.findElement(By.name("user_password")).sendKeys(dataMap.get(0).get("password"));
	}

	@Then("It should display homepage")
	public void it_should_display_homepage() {
	    System.out.println("******");
	}
}
