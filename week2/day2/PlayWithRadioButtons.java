package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
				driver.findElementByXPath("//label[@for='yes']").click();
		
				WebElement CheckedRadioBtn =  driver.findElementByXPath("//input[@value='1']");
	    
	            if(CheckedRadioBtn.isSelected()){
	            	System.out.println("Checked radio button is selected by default");
	            }
	            else {
	            	// Click the radio button
	            	CheckedRadioBtn.click();
	            }
	        
	            WebElement ageGroup =  driver.findElementByXPath("//input[@value='1']");
		
	            if(ageGroup.isSelected()){
	            	System.out.println("Age Group is selected");
	            }
	            else{
	            	ageGroup.click();
	            }
	}

}
