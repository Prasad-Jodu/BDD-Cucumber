package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Executables\\chromedriver-win64\\chromedriver.exe");
	}

	@Given("the browser is launched")
	public void the_browser_is_launched() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@Given("application is loaded")
	public void application_is_loaded() {
	    driver.get("https://online.actitime.com/pjodu/login.do");
	}

	@When("the user enters the valid username")
	public void the_user_enters_the_valid_username() {
	    
		driver.findElement(By.id("username")).sendKeys("prasadjodu12@gmail.com");
	}

	@When("the user enters the valid password")
	public void the_user_enters_the_valid_password() throws Throwable {
	    driver.findElement(By.name("pwd")).sendKeys("Prasad@123");
	    Thread.sleep(3000);
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("dashboard should be displayed")
	public void dashboard_should_be_displayed() throws Throwable {
	    Assert.assertEquals("", "");
	    Thread.sleep(3000);
	    driver.close();
	}
	@When("user clicks on Forgot your password link")
	public void user_clicks_on_forgot_your_password_link() {
	    driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	}

	@Then("forgot your password component should be displayed")
	public void forgot_your_password_component_should_be_displayed() throws Throwable {
	   String actText = driver.findElement(By.xpath("//td[text()='Forgot your password?']")).getText();
	   String exptText="Forgot your password?";
	   Assert.assertEquals(actText, exptText);
	   Thread.sleep(3000);
	   driver.close();
	}
	
	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("prasadjodu12@gmail.com");
		 driver.findElement(By.name("pwd")).sendKeys("Prasad@123");
		    Thread.sleep(3000);
	}
	
	@When("the user enters the Credentails as {string} and {string}")
	public void the_user_enters_the_credentails_as_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
		 driver.findElement(By.name("pwd")).sendKeys(arg2);
		    Thread.sleep(3000);
	}
	
	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password(io.cucumber.datatable.DataTable data) throws Throwable {
	    
		List<List<String>> dataTable = data.asLists(String.class);
		driver.findElement(By.id("username")).sendKeys(dataTable.get(0).get(0));
		 driver.findElement(By.name("pwd")).sendKeys(dataTable.get(0).get(1));
		    Thread.sleep(3000);
	}

	@When("the user enters valid username and password using Map")
	public void the_user_enters_valid_username_and_password_using_map(io.cucumber.datatable.DataTable data) throws Throwable {
	    
		List<Map<String, String>> dataTable = data.asMaps();
		driver.findElement(By.id("username")).sendKeys(dataTable.get(0).get("username"));
		driver.findElement(By.name("pwd")).sendKeys(dataTable.get(0).get("password"));
		Thread.sleep(3000);
	}
}
