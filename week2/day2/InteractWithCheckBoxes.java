package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InteractWithCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://leafground.com/pages/checkbox.html");
			
		driver.manage().window().maximize();
		
		WebElement Java = driver.findElementByXPath("(//input[@type='checkbox'])[1]");
		
		Java.click();		
		
		WebElement Clang = driver.findElementByXPath("(//input[@type='checkbox'])[4]");
	
		Clang.click();
		
		Boolean select = driver.findElementByXPath("(//div[contains(text(),'Selenium')])").isSelected();
		
		System.out.println(select);	
	
	
		WebElement CheckBox =  driver.findElementByXPath("(//input[@type='checkbox'])[8]");
	    
        if(CheckBox.isSelected())
        {        	
        	driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
        	
        	System.out.println("Checked radio button is selected by default");
        }
        else 
        {
        	System.out.println("Not Selected");
        }
        
        driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
        
        driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
        
        driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
        
        driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
        
        driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
	
	
	}


}
