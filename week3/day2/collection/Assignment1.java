package week3.day2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> columnsCount = driver.findElements(By.tagName("th"));
		
		List<WebElement> rowsCount = driver.findElements(By.tagName("tr"));
		
		System.out.println("No of columns present in the table is: "+columnsCount.size());
		
		System.out.println("No of rows present in the table is: "+rowsCount.size());
		
		String text = driver.findElementByXPath("(//td[contains(text(),'Elements')]/following-sibling::td)[1]").getText();
		
		System.out.println("The progress value of Learn to interact with Elements: " +text);	
		
		List<WebElement> row = driver.findElementsByXPath("//table//tr/td[2]");
		
		List<Integer> vital = new ArrayList<Integer>();
		
		for (WebElement mark : row)
		{
			String least = mark.getText().replaceAll("%", "");
			
			vital.add(Integer.parseInt(least));
		}
		
		Collections.sort(vital);
		
		Integer lowest = vital.get(0);
		
		System.out.println("The least progress value is: "+lowest+"%");
		
		driver.findElementByXPath("//table[@id='table_id']//tr[4]/td[3]/input").click();
		}		
				
	

}
