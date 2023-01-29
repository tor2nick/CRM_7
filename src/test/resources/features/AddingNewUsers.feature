@wip4
Feature: Adding New users
  Scenario: Adding New Users Feature
    Given User logs in with valid credentials
    Given User clicks Message button on the top dashboard
    When  User clicks Add more
    And   User clicks an email from the pop-up window
    Then  Email is displayed in the To: box
