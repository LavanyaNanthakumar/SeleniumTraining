package week2.day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByPartialLinkText("Go to Home Page").click();
		
		driver.findElementByPartialLinkText("HyperLink").click();
		
		driver.findElementByPartialLinkText("Find where am supposed to go without clicking me?").sendKeys(Keys.TAB);
		
		driver.findElementByXPath("//a[@href='error.html']").click();
		
		String text = driver.findElementByXPath("//h1[text()='HTTP Status 404 – Not Found']").getText();
		
		System.out.println(text);			
		
		driver.navigate().back();
		
		driver.findElementByPartialLinkText("Go to Home Page").click();
		
		driver.findElementByPartialLinkText("HyperLink").click();
		
		List<WebElement> alllinkspresent=driver.findElements(By.tagName("a"));
		
		System.out.println(text);	

		System.out.println("Number of links on this page are :"+alllinkspresent.size());
				
	}

}
