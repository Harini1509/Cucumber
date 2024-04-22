package demo1.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\harini.g\\eclipse-workspace\\cucumber\\src\\test\\java\\demo1\\cucumber\\search1.feature",glue="cstepdefinition",monochrome=true,plugin = { "pretty", "html:target/htmlreports.html" })
public class Ctestrunner extends AbstractTestNGCucumberTests {

}