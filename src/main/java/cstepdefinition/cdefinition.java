package cstepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.GooglePage;


public class cdefinition extends BasePage{
	 WebDriver driver;
		GooglePage obj1;
		String inputText;
	
	
	@Given("User is on google search page")
	public void user_is_on_google_search_page() throws IOException {
	    driver=initialiWebDriver();
	    obj1=new GooglePage(driver);
	    obj1.goToUrl("https://www.google.com/");
	   
	}
	@When("user enters the search text")
	public void user_enters_search_text() {
		
	    obj1.Search("Harini");
	}
	@When("hits enter")
	public void hits_enter() {
		obj1.Enter();

	}
	@When("^user enters search (.+)$")
	public void user_enters_search(String inputs) {
	   
		obj1.Search(inputs);
		inputText=inputs;
		// xpath = "//*[contains(@text='"+inputs+"')]";
	}
	@Then("search results should display")
	public void search_results_should_display() {
	    obj1.validateSearchResult(inputText);
	}
	@After()
	public void close() {
		
		driver.close();
	}


}
