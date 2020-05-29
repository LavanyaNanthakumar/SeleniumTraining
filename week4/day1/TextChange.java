package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//h5[text()='Wait for Text Change']").click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.textToBe(By.id("btn"),  "Click ME!"));
		
		System.out.println("Button Clicked");
		
	}

}
