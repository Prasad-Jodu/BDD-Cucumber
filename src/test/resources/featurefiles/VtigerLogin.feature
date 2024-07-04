Feature: Vtiger Login
Scenario: User successfully login with valid credentials
Given The User should be on login page
When The User enters the valid "admin" and "admin" //Parameterization
And The User clicks on login button
Then The should be redirected to home page
And Administrator should be displayed on homepage

Scenario Outline: User login with invalid credentials
Given The User should be on login page
When The User enter the invalid "<username>" and "<password>"
And The User clicks on login button
Then It should display You must specify a valid username and password.
Examples:
|username|password|
|admin|admin|

Scenario: User login with credentials using dataTable
Given The User should be on login page
When The User enter the valid username and password
|admin|admin|
And The User clicks on login button
Then It should display homepage

Scenario: User login with credentials using dataTableMap
Given The User should be on login page
When The User enter the valid userName and password
|username|password|
|admin|admin|
And The User clicks on login button
Then It should display homepage
