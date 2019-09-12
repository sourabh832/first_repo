package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

public static WebDriver driver;

@Given("^user is on Home Page$")
public void user_is_on_Home_Page()  {
    // Write code here that turns the phrase above into concrete actions
	String path = "C:/Users/Sourabh/Downloads/chromedriver_win32 (1)/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("12345");
	//driver.findElement(By.name("submit")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 3 /*timeout in seconds*/);
	if(wait.until(ExpectedConditions.alertIsPresent())==null)
	    System.out.println("alert was not present");
	else
	    System.out.println("alert was present");
	
	byte b=126;
    
}

@When("^user enters credentials$")
public void user_enters_credentials()  {
    // Write code here that turns the phrase above into concrete actions
	
    
}

@When("^user log into Gmail$")
public void user_log_into_Gmail()  {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^user reads inbox$")
public void user_reads_inbox()  {
    // Write code here that turns the phrase above into concrete actions
    
}

}
