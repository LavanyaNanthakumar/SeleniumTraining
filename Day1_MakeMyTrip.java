
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1_MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//div[contains(@class,'loginModal displayBlock')]").click();
		
		WebElement hotel = driver.findElementByXPath("(//span[contains(@class,'chNavIcon appendBottom2')])[2]");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", hotel);
		
		Thread.sleep(2000);
		
		driver.findElementById("city").click();
		
		driver.findElementByXPath("//div[@role='combobox']/input").sendKeys("Goa");
		
		driver.findElementByXPath("//p[text()='Goa, India']").click();
		
		driver.findElementByXPath("(//div[text()='15'])[2]").click();
		
		driver.findElementByXPath("(//div[text()='19'])[2]").click();
		
		driver.findElementByXPath("//span[text()=' Room ']").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("(//ul[@class='guestCounter font12 darkText'])[2]/li[2]").click();
		
		driver.findElementByXPath("//button[@class='primaryBtn btnApply']").click();
		
		driver.findElementById("hsw_search_button").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//a[@class='mapCont']").click();
		
		driver.findElementByXPath("//span[@class='mapClose']").click();
		
		driver.findElement(By.xpath("//label[text()='Baga']")).click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//label[text()='3 & above (Good)']").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//span[contains(@class,'customSelectTitle blueText')]").click();
		
		driver.findElementByXPath("//ul[@class='customSelectOptions latoBold']/li[text()='Price - Low to High']").click();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);

		driver.findElementByXPath("//span[@id='htl_id_seo_201902170501047015']").click();
		
		String currenturl = driver.getCurrentUrl();
		
		driver.get(currenturl);

		Thread.sleep(4000);

		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> allhandles = new ArrayList<String>(allWindows);
				
		driver.switchTo().window(allhandles.get(1));

		String Hotelname = driver.findElementById("detpg_hotel_name").getText();

		System.out.println(Hotelname);

		driver.findElementByXPath("//button[text()='VIEW THIS COMBO']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//span[@class='primaryBtn overlapBtn']").click();

		Thread.sleep(4000);

		String Totalpayableamount = driver.findElementByXPath("//span[@id='revpg_total_payable_amt']").getText();

		System.out.println(Totalpayableamount);

		driver.quit();

		}
}
