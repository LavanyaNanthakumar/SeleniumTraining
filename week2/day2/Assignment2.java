package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
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
	
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Lavanya");
	
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	
		Thread.sleep(1000);
		
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)[1]").click();
		
		String title = driver.getTitle();
					
		driver.findElementByXPath("//a[@href='updateLeadForm?partyId=10123']").click();
		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Infosys");
	
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		System.out.println(title);
		
		System.out.println(text);
		
		driver.close();					
	}

}
