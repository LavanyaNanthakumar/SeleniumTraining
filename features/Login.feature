Feature: Login functionality of leaf taps application

#Background:
#Given launch the chrome browser  
#And Load application Url

@smoke
Scenario Outline: TC001_Test Login with valid credentials

Given enter username as <username>                 
And enter password as <password>  
When Click login button    
Then Homepage should be displayed 

Examples:
|username|password|
|Demosalesmanager|crmsfa|

@regression
Scenario Outline: TC001_Test Login with invalid credentials

Given enter username as <uName>             
And enter password as <pWord>  
When Click login button    
But Homepage should not be displayed  

Examples:
|uName|pWord|
|DemoCSR|Test123|