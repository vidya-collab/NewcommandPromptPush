package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Tutorial_Ninja_launch {
	WebDriver cromedriver= new ChromeDriver();
	@Given("opening browser and launchin tutorialninja.com")
	public void opening_browser_and_launchin_tutorialninja_com() {
		String url ="https://tutorialsninja.com/demo/";	
		
		
		
		cromedriver.manage().window().maximize();
		cromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cromedriver.get(url);
	}

	@When("navigate to select euro currency")
	public void navigate_to_select_euro_currency() {
		cromedriver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
	   
	}

	@When("click on euro currency")
	public void click_on_euro_currency() {
	    // Write code here that turns the phrase above into concrete actions
		cromedriver.findElement(By.xpath("//button[@name='EUR']")).click();
	  
	}




}
