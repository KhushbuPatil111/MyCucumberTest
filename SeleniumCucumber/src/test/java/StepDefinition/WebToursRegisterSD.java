package StepDefinition;

import java.util.concurrent.TimeUnit;
import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class WebToursRegisterSD {

	WebDriver driver;

	@Given("user is on Webtours application")
	public void user_is_on_Webtours_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khushbu.patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Utility.CaptureScreenshot(driver, "WebTours");

	}

	@When("user clicks on registration button")
	public void user_clicks_on_registration_button() {
	}

	@Then("user is navigated to registration page")
	public void user_is_navigated_to_registration_page() {
	}

}
