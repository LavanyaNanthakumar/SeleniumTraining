package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement1 {

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
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro Technologies");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Lavanya");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Nandhakumar");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
				
		Select dropDown1 = new Select(source);
		
		dropDown1.selectByVisibleText("Employee");
		

		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
				
		Select dropDown2 = new Select(marketing);
		
		dropDown2.selectByValue("9001");
		

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
				
		Select dropDown3 = new Select(ownership);
		
		dropDown3.selectByIndex(5);
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select dropDown4 = new Select(country);
		
		dropDown4.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}

}
