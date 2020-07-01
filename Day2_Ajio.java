import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2_Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ajio.com/shop/sale");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElementByTagName("input").click();
		
		driver.findElementByTagName("input").sendKeys("Bags");
		
		driver.findElementByXPath("(//span[text()='Women Handbags'])[1]").click();
		
		driver.findElementByClassName("five-grid").click();
		
		WebElement usingText = driver.findElementByTagName("select"); 
		
		Select dropDown = new Select(usingText);
		
		dropDown.selectByVisibleText("What's New"); 
		
		driver.findElementByXPath("//span[text()='price']").click();
		
		driver.findElementById("minPrice").sendKeys("2500");
		
		driver.findElementById("maxPrice").sendKeys("5000");
		
		driver.findElementByXPath("//button[@class='rilrtl-button ic-toparw']").click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement slingbag = driver.findElementByXPath("//div[text()='Sling Bag with Chain Strap']");
		
		js.executeScript("arguments[0].scrollIntoView(false);",slingbag);
		
		slingbag.click();
		
		Thread.sleep(2000);
		
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		List<String> list = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
	
		String coupon_apply = driver.findElementByXPath("//div[@class = 'promo-desc']").getText();
		
		String coupon_code = null;
		
		String discount_price = null;
		
		if(coupon_apply.contains("2890"))
		{			
			coupon_code = driver.findElementByXPath("//div[@class = 'promo-title']").getText();
			
			coupon_code = coupon_code.replaceAll("Use Code", "");
			
			System.out.println(coupon_code);
			
			discount_price = driver.findElementByXPath("//div[@class = 'promo-discounted-price']/span").getText();
			
			discount_price = discount_price.replaceAll("[^0-9]", "");
			
			System.out.println("Discount price " + discount_price);
		}
		
		String Code = "GRAB";
		
		driver.findElement(By.xpath("//span[text()='Enter Pin-code To Know Estimated Delivery Date']")).click();
		 
		driver.findElementByName("pincode").sendKeys("560043");
		
		driver.findElement(By.className("edd-pincode-modal-submit-btn")).click();
		
		Thread.sleep(1000);
		
		String expectedDate = driver.findElement(By.xpath("//span[text()='06 Jul']")).getText();
		
		System.out.println("Expected Date of Delivery is : "+expectedDate);
		
		driver.findElementByClassName("other-info-toggle").click();
		
		String customerCareAddress = driver.findElement(By.xpath("//span[text()='AJIO, c/o Reliance Retail Limited, SS Plaza, 74/2 Outer Ring Road, 29th Main Road, BTM 1st Stage, BTM Layout, Bangalore 560068, Karnataka, INDIA. Ph. 1800-889-9991, 1800-419-8998. E-mail - customercare@ajio.com']")).getText();
	
		System.out.println(customerCareAddress);
				
		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
		
		Thread.sleep(10000);
		
		driver.findElementByXPath("//span[text()='GO TO BAG']").click();
		
		String Totalprice1=driver.findElementByXPath("//span[@class='price-value bold-font']").getText().replaceAll("[^0-9]", "");
		
		int Totalprice=Integer.parseInt(Totalprice1);
		
		System.out.println("Total Price:"+Totalprice);
		
		driver.findElementById("couponCodeInput").sendKeys(Code);
		
		driver.findElementByXPath("//button[@class='rilrtl-button button apply-button ']").click();
		
		String product_price  = driver.findElementByXPath("//div[@class = 'orignal-price']").getText();
		
		product_price = product_price.substring(4, 9);
		
		product_price = product_price.replaceAll(",", "");
		
		System.out.println("Product Price is: "+product_price);
		
		if(!product_price.equals(discount_price))
		{
			System.out.println("Product price doesn't match with discount price");
		}
		
		driver.findElementByXPath("//div[@class = 'delete-btn']").click();
		
		driver.findElementByXPath("//div[text() = 'DELETE']").click();
		
		driver.quit();
	}

}
