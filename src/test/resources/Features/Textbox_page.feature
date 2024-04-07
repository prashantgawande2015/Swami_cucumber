#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: verify submit form functionality

 Scenario Outline: verify submit form functionality
    Given Launch the TextBox Page
    When I enter the name as  "<fullname>"
    And I enter the email as "<email>"
    And I enter the current address as "<currentaddress>"
    And I enter the permaddress as  "<permanentaddress>"
    And I click on submit button
    Then I verify the submitted details

    Examples: 
      | fullname       | email              | currentaddress | permanentaddress |
      | Sandip Akolkar | saakolkar@gmil.com | Pune           | Ahmednagar       |