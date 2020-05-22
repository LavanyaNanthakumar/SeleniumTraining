package week3.day2.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("txtStationFrom").clear();
		
		Thread.sleep(1000);
		
		driver.findElementById("txtStationFrom").sendKeys("Chennai Egmore",Keys.ENTER);
		
		driver.findElementById("txtStationTo").clear();
		
		Thread.sleep(1000);
		
		driver.findElementById("txtStationTo").sendKeys("Bangalore East",Keys.ENTER);
						
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cells = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td");
				
		for (int j = 1; j <= cells.size(); j++) 
		{
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]").getText();
								
			System.out.print(text+" ");
								
		}
		
		System.out.println();
		
		}
		
		
	}

	
}
