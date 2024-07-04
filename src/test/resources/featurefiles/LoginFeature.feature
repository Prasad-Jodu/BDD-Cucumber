Feature: Testing the Login feature of Actitime Application

Background:
Given the browser is launched
And application is loaded

Scenario: Testing the Login feature with valid data
When the user enters the valid username
And the user enters the valid password
And the user clicks on the login button
Then dashboard should be displayed

Scenario: Testing the forgotten password link
When user clicks on Forgot your password link
Then forgot your password component should be displayed