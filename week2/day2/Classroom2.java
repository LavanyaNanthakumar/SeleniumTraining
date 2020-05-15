package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2 {

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
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
	
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("//a[contains(@href,'ComboBox_partyIdFrom')]").click();
		
		driver.findElementByXPath("//a[contains(@href,'ComboBox_partyIdTo')]").click();
		
		
	
	}

}
