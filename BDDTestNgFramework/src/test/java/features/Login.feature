Feature: User Navigates to PHP Travelers
Scenario: Login
User login to PHP Travelers
Given I launch the browser with correct URL
When I Click on login button
And I Enter Username
And I Enter password
And I click on submit button
Then User successfully logs into the application

Scenario: navigate
Given I am in the home Page
When i click on next button