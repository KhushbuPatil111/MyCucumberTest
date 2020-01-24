@ignore
Feature: Login OrangeHRM

Scenario: Verify login functionality of Orange HRM application

Given user loads orangeHRM url
When user enters "Admin" and "admin123" login credentials 
Then login is successfull
And close browser

