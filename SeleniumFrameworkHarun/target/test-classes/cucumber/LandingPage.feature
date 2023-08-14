@tag
Feature: Fill in the form in the Landing Page

		Background:
		 Given I landed on the Landing Page 

  @landingPage
  Scenario Outline: Positive Test of Submitting the form
    Given Filled in the credentials with name <name> and password <password> and email <email>
    When I check the checkbox <checkboxStatus> and select the gender <gender> and check my Employment status <employ_status> enter my date of birth <dateofBirth>
    And I click on Submit  
    Then I will get "Success! The Form has been submitted successfully!." as confirmation message on the page

    Examples: 
      | name  | password | email             |checkboxStatus     | gender    |employ_status|     dateofBirth     |
      | Harun | Test1234 | harunaltun@gmx.de |     check         |   Male    |    Student  |    23.03.1991       |
    
