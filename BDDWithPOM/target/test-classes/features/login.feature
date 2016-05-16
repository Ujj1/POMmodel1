Feature: Login on orangeHRM
  		As an Admin
  		I want to see login page
  		So that i can login in to my account

  @login1
  Scenario: User can login with valid credentials
    Given I am on login page
    When I login with username "admin" and password "aediMNjU"
    
    
    #When I enter username as "Admin"
    #And I enter password as "aediMNjU"
    #And I select login
    Then I should login successfully
    And I should see welcome message as "welcome Admin"