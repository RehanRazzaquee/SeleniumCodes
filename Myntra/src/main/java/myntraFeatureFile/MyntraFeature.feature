Feature: TC001_Order A SunGlass

Scenario: Order a Green Color Sunglass and compare Price of item and value in cart
Given Enter the search value in search option
When Click the Myntra Search Button
And Get the Count of sunglasses with 40% OFF
And Select Green Catogory
And Select the Second Resultant sunglass
And Store the Product Price
And Click on Add to Bags Button
And Click on Go to Bags Button
When Verify Product name with Stored Name
Then Print Product Name
And Print Product Price

