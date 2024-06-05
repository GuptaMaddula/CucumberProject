package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DemoSteps {
	
	WebDriver driver = null;
	
	@Given("user is on login")
	public void user_is_on_login() {
	    System.out.print("Hello");
	    driver = new ChromeDriver();
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
