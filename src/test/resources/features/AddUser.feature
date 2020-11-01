Feature: adding a user in users page
  As a as a librarian user i should be able to add information to add a user
  @add_user
  Scenario: Add a new user
    Given I am on the Users page
    When I click to add user
    Then I should be abel to fill out the table to add new user
