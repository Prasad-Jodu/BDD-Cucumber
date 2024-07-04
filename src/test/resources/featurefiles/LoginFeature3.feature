Feature: Testing the Login feature of Actitime Applications

Background:
Given the browser is launched
And application is loaded

Scenario: Testing the Login feature with valid Admin Credentials
When the user enters valid username and password
|prasadjodu12@gmail.com|Prasad@123|
|prasadjodu12@gmail.com|Prasad@123|
And the user clicks on the login button
Then dashboard should be displayed
