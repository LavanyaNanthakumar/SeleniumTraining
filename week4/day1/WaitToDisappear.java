package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		driver.manage().window().maximize();
			
		driver.findElementByXPath("//h5[text()='Wait to Disappear']").click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
				
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn")));
		
		String text = driver.findElementByXPath("//strong[contains(text(),'Button is disappeared')]").getText();
		
		System.out.println(text);
			
		
	}

}
