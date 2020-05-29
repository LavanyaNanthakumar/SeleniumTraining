package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement men = driver.findElementByLinkText("Men's Fashion");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(men).perform();
		
		driver.findElementByXPath("//a[text()='Shirts']").click();
	
		WebElement shirt = driver.findElementByXPath("//p[text()='Red Tape 100 Percent Cotton Blue Checks Shirt']");
		
		builder.moveToElement(shirt).perform();
		
		driver.findElementByXPath("(//div[contains(@class,'center quick-view-bar')])[1]").click();
				
		driver.close();
	}

}
