package week2.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.findElementById("home").click();
		
		driver.findElementByPartialLinkText("Button").click();
					
		Point location = driver.findElementById("position").getLocation();	
		
		System.out.println(location);
				
		String color = driver.findElementById("color").getCssValue("background-color");
		
		System.out.println(color);
		
		org.openqa.selenium.Dimension size = driver.findElementById("size").getSize();
		
		System.out.println(size);	
		
	}

}
