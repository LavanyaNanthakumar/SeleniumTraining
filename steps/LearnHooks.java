package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks extends BaseClass {	
	
	@Before
	public void preCondition(Scenario sc) {
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("http://leaftaps.com/opentaps/control/main");	
		  System.out.println(sc.getId());
	}

	@After
	public void postCondition(Scenario sc) {
		
		driver.close();
		System.out.println(sc.getStatus());
	}
	
}
