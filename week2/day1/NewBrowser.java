package week2.day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	}

}
