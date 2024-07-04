Feature: Testing the Login feature of Actitime Application

Background:
Given the browser is launched
And application is loaded

Scenario: Testing the Login feature with valid data
When the user enters the Credentails as "prasadjodu12@gmail.com" and "Prasad@123"
And the user clicks on the login button
Then dashboard should be displayed
