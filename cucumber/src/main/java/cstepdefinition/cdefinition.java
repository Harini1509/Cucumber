package cstepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;


public class cdefinition{
	 WebDriver driver;
	 
	@BeforeTest
	public void setup() {
		System.out.println("initiate");
	}
	GooglePage obj1;
	
	
	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
	    driver=new ChromeDriver();
	    obj1=new GooglePage(driver);
	    obj1.goToUrl("https://www.google.com/");
	   
	}
	@When("user enters search text")
	public void user_enters_search_text() {
		
	    obj1.Search("Harini");
	}
	@When("hits enter")
	public void hits_enter() {
		 System.out.println("Harini");
	}
	@Then("search results should display")
	public void search_results_should_display() {
		 System.out.println("Harini");
	}


}
