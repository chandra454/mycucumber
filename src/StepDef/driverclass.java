package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface driverclass {
 
	
	public static WebDriver driverc(){
		
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		//driver = new FirefoxDriver();
		final WebDriver driver = new FirefoxDriver();
		return driver;
	   

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
