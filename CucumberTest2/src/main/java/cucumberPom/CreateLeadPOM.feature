Feature: Create a New Lead with all Mandatory fields

Scenario Outline: Create a New Lead
Given Click on crmsfa
And Click on Leads link
And Click on Create Lead link
And Enter Company name as <CompanyName>
And Enter First Name as <FirstName>
And Enter Last Name as <LastName>
And Enter PhoneNumber as <PhoneNumber>
And Enter Email as <Email>
When click on create Lead Button

Examples:
|CompanyName|FirstName|LastName|PhoneNumber|Email|
|Hexa-9|UserA|LastB|8903423595|santhosh@gmail.com|
