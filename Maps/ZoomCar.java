package week6.day2.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.zoomcar.com/chennai");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("(//div[@class='items'])[1]").click();

		driver.findElementByClassName("proceed").click();

		Thread.sleep(2000);

		driver.findElementByXPath("(//div[@class='days']//div)[3]").click();

		String date = driver.findElementByXPath("(//div[@class='text'])[2]").getText();

		System.out.println(date);

		driver.findElementByClassName("proceed").click();

		String wed = driver.findElementByXPath("//div[@class='text']").getText();

		System.out.println(wed);

		if (date.equals(wed)) {
			
			driver.findElementByClassName("proceed").click();
		}

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		List<WebElement> results=driver.findElementsByXPath("//div[@class='car-listing']//h3");
		System.out.println("The number of results displayed are: "+results.size());
		
		for (WebElement carDetails : results) 
		{	
			String carName = carDetails.getText();
			//System.out.println(carName);
							
		  List<WebElement> price = driver.findElementsByXPath("//div[@class='price']");
		  
		  for (WebElement eachPrice : price) 
		  {
			  String cost= eachPrice.getText();		  
			  cost = cost.replaceAll("[^0-9.]", "");	
			  int amount = Integer.parseInt(cost);
			  //System.out.println(amount); 				  
			  map.put(carName, amount);
		  }
		}

		//System.out.println(map.size());
		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		
		Thread.sleep(1000);

		String car = driver.findElementByXPath("(//div[@class='details']//h3)[1]").getText();

		System.out.println("Highest priced car ride is: "+car);

		driver.findElementByXPath("(//button[@name='book-now'])[1]").click();

		driver.close();
	}

}
