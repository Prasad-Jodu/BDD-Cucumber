Feature: Login To Vtiger

Scenario: Login to Vtiger with Valid Credentials
Given when the user open the browser and enter the url as "http://localhost:8888/"
When user enter the valid username as "admin" and password as "admin"
When user clicks on Login button
Then home page should display

