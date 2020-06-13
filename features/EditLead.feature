Feature: Login functionality of leaf taps application
@smoke
Scenario Outline: TC004_Login functionality of leaf taps application

Given enter username as demosalesmanager
And enter password as crmsfa 
When Click login button
Then Homepage should be displayed 
When click on crmsfalink 
When click on leads   
When click on Find Leads
When click on Phone 
Given enter phoneNumber as <number>
When click on findSubmitButton
When click on firstResult
When click on edit
Given enter company Name as <companyName>  
Then click on update button

Examples:

|number|companyName|
|9|TCS|