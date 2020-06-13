package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass{

	/*
	 * @Given("launch the chrome browser") public void openBrowser() {
	 * 
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * driver.manage().window().maximize(); }
	 * 
	 * @Given("Load application Url") public void loadUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 */
	
	@Given("enter username as (.*)")
	public void enterUsername(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	
	@Given("enter password as (.*)")
	public void enterPassword(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}
	
	@When("Click login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Homepage should be displayed")
	public void homepageDisplayed() {
		System.out.println("Homepage is Displayed");
	}
	
	@But("Homepage should not be displayed")
	public void errorMessage() {
		System.out.println("Homepage is not Displayed");
	}
}
