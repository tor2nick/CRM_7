@wip2
Feature: Sending Message
  Scenario: Sending Message functionality
    Given User logs in with valid credentials
    Given User clicks Message button on the top dashboard
    When  User writes sample text in the message box
    And   Clicks Send Button
    Then  Message is sent
