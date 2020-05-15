package week2.day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

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
	
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
	
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(2000);
	
		String id =driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)[1]").getText();
		
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]").click();
				
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(1000);
		
		String output = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		System.out.println(id);
		System.out.println(output);
		
		driver.close();
		
		
		
	}

}
