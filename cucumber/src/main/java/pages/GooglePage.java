package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
	
	

}
