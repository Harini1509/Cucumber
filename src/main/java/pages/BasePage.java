package pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	WebDriver driver;
	public WebDriver initialiWebDriver() throws IOException {
		String currentDir = System.getProperty("user.dir");
		String filePath = currentDir + "/src/test/java/demo1/cucumber/Data1.properties";

		FileReader reader=new FileReader(filePath); 
        Properties props=new Properties(); 
        props.load(reader); 
        String browsername=props.getProperty("browser");
        if(browsername.trim().equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
        }
        else {
        	driver = new EdgeDriver();
        }
        return driver;
		
	}
	
	

}
