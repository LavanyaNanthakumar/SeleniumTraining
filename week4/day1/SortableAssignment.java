package week4.day1;

import java.awt.Desktop.Action;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SortableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/sortable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		Point location = item4.getLocation();
		
		int xloc = location.getX();
		int yloc = location.getY();

		Actions action = new Actions(driver);
		
	    action.dragAndDropBy(item1, xloc, yloc).perform();
	}

}
