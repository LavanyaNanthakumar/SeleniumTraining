package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

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
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("lavanya@gmail.com");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		String FirstName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		
		System.out.println(FirstName);
		
		String LastName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a)[1]").getText();
		
		System.out.println(LastName);
		
		String CompanyName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a)[1]").getText();
		
		System.out.println(CompanyName);
		
		
		String email = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)[1]").getText();
		
		System.out.println(email);
		
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)[1]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		String foreName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		
		if(foreName.equals(FirstName))
		{
			System.out.println("Duplicate name is same as the captured name");
		}
		else
		{
			System.out.println("Duplicate name is not same as the captured name");
		}
		
		driver.close();
	}

}
