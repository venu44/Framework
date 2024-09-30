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
@tag
Feature: Testing on website

  @tag1
  Scenario Outline: Login to Test page 
    Given open browser and navigate to url
    And Enter <username> and <password>
    Then click on submit
   And user should be able login successfully 


    Examples: 
      | username  | password |
      | name1 |     5 | 
      | name2 |     7 |
      
      
        #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
      #
      #
      #
      #Feature: free login feature
  #
    #@tag3 
    #Scenario: 
