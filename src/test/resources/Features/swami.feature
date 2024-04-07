

Feature:  Verify the login featue
 


  Scenario: check user able to login with valid credintials
    Given   user is on login page
    When user enter the valid username
    And   user enter the valid password
    And   click on LOGIN button
    Then user should nevigate to landing page
    
    
    
