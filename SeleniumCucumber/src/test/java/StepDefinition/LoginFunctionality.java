package StepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFunctionality {
	
	WebDriver driver;
	
	@Given("user loads orangeHRM url")
	public void user_loads_orangeHRM_url()
	{
		
		System.setProperty("webdriver.chrome.driver",
			              "C:\\Users\\khushbu.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("New change");
		System.out.println("My first commit");
		
	}

	@When("user enters {string} and {string} login credentials")
	public void user_enters_and_login_credentials(String string1, String string2) 
	{
		WebElement userid = driver.findElement(By.id("txtUsername"));
		userid.sendKeys(string1);
	
		WebElement pasword = driver.findElement(By.id("txtPassword"));
		pasword.sendKeys(string2);
		
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		    
	}
	
	
	@Then("login is successfull")
	public void login_is_successfull() 
	{
		
		Boolean status = driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertEquals(true, status);
	
	}
	
	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}
	
}