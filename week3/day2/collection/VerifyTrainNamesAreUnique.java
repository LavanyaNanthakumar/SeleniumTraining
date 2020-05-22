package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElementById("txtStationTo").sendKeys("New Delhi",Keys.ENTER);
						
		Thread.sleep(2000);
						
		List<String> list = new ArrayList<String>();
		
	    List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
	    
	    int size = rows.size();
	   		
		for (int i = 1; i <=size; i++) 
		{
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]").getText();
		
			list.add(text);				
		}		
				
		int listSize = list.size();
		System.out.println(listSize);
		
		Set<String> set = new TreeSet<String>(list);
		
		int setSize = set.size();
		System.out.println(setSize);
		
		if(listSize == setSize) 
		{
			System.out.println(list);
		}
		else
		{
			System.out.println(set);
		}
		
		
	}

}
