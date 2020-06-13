Feature: Login functionality of leaf taps application

#Background:
#Given launch the chrome browser
#Given Maximise the browser
#And Load application URL

@sanity @regression
Scenario Outline: TC003_Login functionality of leaf taps application

Given enter username as demosalesmanager
And enter password as crmsfa 
When Click login button
Then Homepage should be displayed 
When click on crmsfa link
When click on Leads
When click on create lead 
Given enter companyName as <companyName>
Given enter firstName as <firstName>
Given enter lastName as <lastName>
Then click on submit button

Examples:

|companyName|firstName|lastName|
|Wipro Technologies|Lavanya|Nanthakumar|