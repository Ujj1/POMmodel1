@login
Feature: login feature

  Scenario: Admin can login with valid details
    Given Admin is on the homepage
    When Admin enter userID
    And Admin enter password
    And Admin click login button
    Then Admin can enter employment management system