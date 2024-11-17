package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import dsutilities.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Tutorial_Ninja_POM {
	WebDriver cromedriver= new ChromeDriver();
	String url ="https://tutorialsninja.com/demo/";	
	String expectedErrorMessage = "Select required!";
	static By currencySelectBtn = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	static By euroSelectBtn = By.xpath("//button[@name='EUR']");

	
	@Given("opening browser and launchin tutorialninja.com POM")
	public void opening_browser_and_launchin_tutorialninja_com_pom() {
		
		cromedriver.manage().window().maximize();
		System.out.println("ORANGE IS GETTING PRINTED");
		try {
			LoggerLoad.info("Method opening_browser_and_launchin_tutorialninja_com_pom");
			System.out.println("RUNNING POM");
			System.out.println("ORANGE IS GETTING PRINTED");
			cromedriver.get(url);
			//System.err.println("RUNNING POM");
		
		
		}
		catch(Exception e) {
			System.out.println("Test case opening_browser_and_launchin_tutorialninja_com_pom failed ");
			e.printStackTrace();
		}
		

	   
	}

	@When("navigate to select euro currency POM")
	public void navigate_to_select_euro_currency_pom() {
		//2.  Select the currency in the left top corner to Euro
		
		try {
			LoggerLoad.info("Method navigate_to_select_euro_currency_pom");
			System.err.println("RUNNING POM");

			cromedriver.findElement(currencySelectBtn).click();
			
		
		
		}
		catch(Exception e) {
			System.out.println("Test case navigate_to_select_euro_currency_pom failed ");
			e.printStackTrace();
		}
	}
		

	@When("click on euro currency POM")
	public void click_on_euro_currency_pom() {
		try {
			LoggerLoad.info("Method click_on_euro_currency_pom");
			System.err.println("RUNNING POM");
		cromedriver.findElement(euroSelectBtn).click();
		}
		catch(Exception e) {
			System.err.println("Test case click_on_euro_currency_pom failed ");
			e.printStackTrace();
		}
		
	
	   
	}




}
