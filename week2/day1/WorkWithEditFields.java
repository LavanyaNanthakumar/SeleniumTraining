package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("lavanyanandhakumar.n@gmail.com");
		
		driver.findElementByXPath("(//input)[2]").sendKeys("Text");
		
		String name = driver.findElementByXPath("(//input)[3]").getAttribute("value");
		
		System.out.println(name);
		
		driver.findElementByXPath("(//input)[4]").clear();
		
		if(isEnabled(true))
		{
			System.out.println("Enabled");
		}
		else {
			System.out.println("Disabled");
		}
	}

	private static boolean isEnabled(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

}
