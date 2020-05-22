package week3.day2.collection;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();

		WebElement SrcText = driver.findElementById("src");
		
		SrcText.sendKeys("Chennai");
		
		Thread.sleep(2000);
		
		SrcText.sendKeys(Keys.TAB);
					
		WebElement destText = driver.findElementById("dest");
		
		destText.sendKeys("Trichy");
		
		Thread.sleep(2000);
		
	    destText.sendKeys(Keys.TAB);
				
		driver.findElementByXPath("//label[@for='onward_cal']").click();
		
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		
		driver.findElementByXPath("//label[@for='return_cal']").click();
		
		driver.findElementByXPath("(//td[text()='20'])[2]").click();
				
		driver.findElementById("search_btn").click();
		
		System.out.println("Oops! No buses found");
		
		driver.close();
	}

}
