package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementById("buttonLogin").click();
		
		Thread.sleep(2000);
		
		WebElement vendors = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");	
		
		Actions builder = new Actions(driver);		
		
		builder.moveToElement(vendors).perform();
		
		driver.findElementByLinkText("Search for Vendor").click();	
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		driver.findElementById("buttonSearch").click();
		
		String country = driver.findElementByXPath("//td[5]").getText();
		
		System.out.println("Country name is: "+country);
		
		driver.findElementByXPath("//a[@href='/account/logout/']").click();
		
		driver.close();
	}

}
