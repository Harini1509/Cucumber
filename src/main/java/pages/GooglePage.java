package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;





public class GooglePage extends Action{
	WebDriver driver;
	public GooglePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id ="APjFqb")
	WebElement input;
	public void Search(String a) {
		
		windowMaximize(driver);
		enterText(input,a);
		
		
	}
	public void Enter() {
		pressEnter(input);
	}
	public void validateSearchResult(String inputText) {
		
		String xpath = "//*[contains(text(),'"+inputText+"')]";
		List<WebElement> searchResult=driver.findElements(By.xpath(xpath));
		Assert.assertTrue(searchResult.size()>0);
		System.out.println(inputText+":"+searchResult.size());
		
		
	}
	
	

}
