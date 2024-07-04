package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToVtiger {
	WebDriver driver;
	@Given("when the user open the browser and enter the url as {string}")
	public void when_the_user_open_the_browser_and_enter_the_url_as(String url) {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.get(url);
	}
	@When("user enter the valid username as {string} and password as {string}")
	public void user_enter_the_valid_username_as_and_password_as(String username, String password) throws Throwable {
	   driver.findElement(By.name("user_name")).sendKeys(username);
	   Thread.sleep(3000);
	   driver.findElement(By.name("user_password")).sendKeys(password);
	   Thread.sleep(3000);
	}
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.id("submitButton")).click();
	}
	@Then("home page should display")
	public void home_page_should_display() {
	    String url = driver.getCurrentUrl();
	    if(url.contains("Home"))
	    {
	    	System.out.println("Home Page is Displayed");
	    }
	    else {
	    	System.out.println("Home is not displayed");
	    }
	}


}
