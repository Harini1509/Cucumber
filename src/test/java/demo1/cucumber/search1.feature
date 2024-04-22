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

Feature: Google search functionality

  @Smoke
  Scenario: Search Functionality
    
    Given User is on google search page
    When user enters the search text
    And hits enter
    Then search results should display
    
  @Regression 
  Scenario: Search Functionality with Multiple Inputs
    
    When User is on google search page
    When user enters search <Input>
    And hits enter
    Then search results should display
    
    
     Examples: 
      | Input  | 
      | Harini |    
      | Gandhi |
      | 1234   | 
  
          
    
   
    
    
    
   

