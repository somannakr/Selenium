package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testRunner.ExtentReportListener;


public class LoginPage extends ExtentReportListener{
	public WebDriver driver;
	@Given("^I launch the browser with correct URL$")
	public void i_launch_the_browser_with_correct_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
      System.out.println("Launch URL");
      ExtentTest LoginInfo=null;
      try {
    	  test=extent.createTest(Feature.class, "feature name");
    	  test=test.createNode(Scenario.class, "Scenario name");
    	  LoginInfo=test.createNode(new GherkinKeyword("Given"),"Given Step name");
    	  LoginInfo.pass("launch the browser##############");
      }catch (AssertionError | Exception e) {
    	  testStepHandle("FAIL",driver,LoginInfo,e);
      }
	}

	@When("^I Click on login button$")
	public void i_Click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click Login"); 
	}

	@When("^I Enter Username$")
	public void i_Enter_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter Username");
	}

	@When("^I Enter password$")
	public void i_Enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter password"); 
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click submit button");
	}

	@Then("^User successfully logs into the application$")
	public void user_successfully_logs_into_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click successful");
	}
	
	@Given("^I am in the home Page$")
	public void i_am_in_the_home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click home page");
		System.out.println("Launch URL");
	      ExtentTest LoginInfo=null;
	      try {
	    	  test=extent.createTest(Feature.class, "feature name");
	    	  test=test.createNode(Scenario.class, "Scenario name");
	    	  LoginInfo=test.createNode(new GherkinKeyword("Given"),"I am in the home Page");
	    	  LoginInfo.pass("launch the browser##############");
	      }catch (AssertionError | Exception e) {
	    	  testStepHandle("FAIL",driver,LoginInfo,e);
	      }
	}

	@When("^i click on next button$")
	public void i_click_on_next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click next button");
	}

}
