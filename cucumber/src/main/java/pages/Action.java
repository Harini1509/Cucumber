package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {
	WebDriver driver;
	public Action(WebDriver driver) {
		this.driver=driver;
	}
	public void windowMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void enterText(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public void pressEnter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	public void goToUrl(String url) {
		driver.get(url);
		
	}
	

}
