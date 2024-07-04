Feature: Vtiger Login
Scenario: User successfully login with valid credentials
Given The User should be on login page
When The User enters the valid "admin" and "admin"
And The User clicks on login button
Then The should be redirected to home page
And Administrator should be displayed on homepage