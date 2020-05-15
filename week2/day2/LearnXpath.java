package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@class='inputLogin' and @id='username']").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("//input[@class='inputLogin' and @id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
	
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Wipro Technologies");
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Lavanya");
		
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Nanthakumar");
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}

}
