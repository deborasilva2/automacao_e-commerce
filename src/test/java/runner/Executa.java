package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		dryRun = false,
		tags = "@Positivo",
		monochrome = false,
		plugin = {"pretty", "html:target/cucumber-report.html"}
		)






public class Executa extends Driver {
 
	
	public static void abrirNavegador() {
		String site = "https://www.saucedemo.com/v1/";
		String navegador = "Edge";
		
		if (navegador.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
						
		}else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		driver.get(site);
		driver.manage().window().maximize();
	
		}
	
	public static void fecharNavegador() {
		driver.quit();
	}
		
	
}
