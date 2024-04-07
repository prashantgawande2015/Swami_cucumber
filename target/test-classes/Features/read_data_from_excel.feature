











@tag
Feature: checking login fuctonility
Scenario Outline:  Verify the login functionality 
Given  User is on login page
When user enter the <username> and <password> 
And click on submit button
Then user able to see the landing page

Examples : |username| password |
                 |abc |




