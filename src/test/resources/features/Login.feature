Feature: Login functionality

  @smoke
  Scenario: login to the app
    Given user is able to launch app in android devices
    When user enters username and password
    And user clicks on login button
    Then user is able to see products page
