package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class EditLead extends BaseClass{
	
	
	@When("click on crmsfalink")
	public void crmLink() throws InterruptedException
	{

		driver.findElementByXPath("//div[@for='crmsfa']//a[1]").click();		
	}
	@When("click on leads")
	public void clickOnLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@When("click on Find Leads")
	public void clickOnFindLeads() 
	{		
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
	}
	
	@When("click on Phone")
	public void clickOnPhone() 
	{		
		driver.findElementByXPath("//span[text()='Phone']").click();
	}
	
	@Given("enter phoneNumber as (.*)")
	public void companyName(String number) 
	{
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(number);
		
	}
	
	@When("click on findSubmitButton")
	public void findButton() throws InterruptedException 
	{		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	
	@When("click on firstResult")
	public void clickFirstResult() 
	{		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	@When("click on edit")
	public void clickEdit() 
	{		
		driver.findElementByLinkText("Edit").click();
	}
	
	@When("enter company Name as (.*)")
	public void enterCompanyName(String companyName) 
	{		
		driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
	}
		
	@Then("click on update button")
	public void updateButton()
	{
		driver.findElementByName("submitButton").click();
	}
	
}
