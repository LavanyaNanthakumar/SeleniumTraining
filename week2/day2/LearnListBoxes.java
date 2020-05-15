package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement usingIndex = driver.findElementByXPath("//select[@id='dropdown1']");
		
		Select dropDown1 = new Select(usingIndex);
		
		dropDown1.selectByIndex(1);
		
		WebElement usingText = driver.findElementByXPath("//select[@name='dropdown2']");
		
		Select dropDown2 = new Select(usingText);
		
		dropDown2.selectByVisibleText("Appium");
		
		WebElement usingValue = driver.findElementByXPath("//select[@id='dropdown3']");
		
		Select dropDown3 = new Select(usingValue);
		
		dropDown3.selectByValue("3");
		
		driver.findElementByXPath("//option[contains(text(),'Get the number of dropdown options')]").sendKeys("Selenium",Keys.ENTER);
		
		driver.findElementByXPath("//option[contains(text(),'You can also use sendKeys to select')]").sendKeys("Selenium",Keys.ENTER);
		
		driver.findElementByXPath("//a[option(text(),'Loadrunner')]").click();
		
		
		
	}

}
