package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//select[@class='form-control ng-valid ng-touched ng-dirty']").sendKeys("E");
		
		driver.findElementByXPath("//option[@value='56']").click();
		
		
		
		//option[@value="56"]
	}

}
