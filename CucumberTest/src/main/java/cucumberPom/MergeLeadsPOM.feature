Feature: Edit an Existing Lead's Company Name 

Scenario Outline: Update the Company Name value of eisting lead
Given Enter the username as DemoSalesManager
And Enter the Password as crmsfa
When Click on Login Button
And Click on crmsfa
And Click on Leads link
And Click on Merge Leads link
And Click From Lead Search Button
And Enter the LeadID as <firstLeadID>
And Click on Find Leads Button
And Click First Resultant Lead result
And Click TO Lead Search Button
And Enter the LeadID as <secondLeadID>
And Click on Find Leads Button
And Click First Resultant Lead result
And Click Merge Button
And Click Find Leads Link
And Enter the Lead ID as <firstLeadID>
And Click Find Leads Button
And Verify Error Information
Then Show Error Information
Examples:
|firstLeadID|secondLeadID|
|10079|10081|