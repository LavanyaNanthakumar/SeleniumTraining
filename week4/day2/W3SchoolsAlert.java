package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolsAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Lavanya");
		
		Thread.sleep(1000);
					
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		
		System.out.println(text);
		
		Thread.sleep(1000);
		
		String value = driver.findElementByXPath("//p[contains(text(),'Lavanya')]").getText();
		
		String name = "Lavanya";
		
		if(value.contains(name))
		{
			System.out.println("Contains Lavanya");
		}
		else {
			System.out.println("Does Not Contain Lavanya");
		}
		
	}

}
