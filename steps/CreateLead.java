package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass{
	
	
	@When("click on crmsfa link")
	public void crmLink() throws InterruptedException
	{

		driver.findElementByXPath("//div[@for='crmsfa']//a[1]").click();		
	}
	@When("click on Leads")
	public void clickOnLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@When("click on create lead")
	public void clickOnCreate() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@Given("enter companyName as (.*)")
	public void companyName(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@Given("enter firstName as (.*)")
	public void firstName(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@Given("enter lastName as (.*)")
	public void lastName(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@Then("click on submit button")
	public void submitButton()
	{
		driver.findElementByName("submitButton").click();
	}
	

}
