package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
	}

}
