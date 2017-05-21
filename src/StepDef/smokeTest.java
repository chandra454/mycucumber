package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest implements driverclass  {
	//driverclass dd = new smokeTest();
	WebDriver d =driverclass.driverc();
	
	@Given("^Open Firefox  and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
		d.get("http://www.facebook.com");
		Thread.sleep(3000);
	   
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_username_and_password(String username, String password) throws Throwable {
	   
		d.findElement(By.id("email")).sendKeys(username);
		d.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable {
		
		d.findElement(By.id("loginbutton")).click();
	   
	}

	@Override
	public String toString() {
		return "smokeTest [d=" + d + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
