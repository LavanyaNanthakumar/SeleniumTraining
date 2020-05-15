package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByPartialLinkText("CRM").click();
		
		driver.findElementByPartialLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro Limited");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Lavanya");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Nanthakumar");
		
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("conference");;
		
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Finance");
		
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Corporation");
				
		driver.findElementByName("submitButton").click();			
		
	}

}
