@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario Outline: user could login with valid email and password
    Given user go to login page
    When user Enter a valid email"<Email>"
    And user Enter a valid Password"<password>"
    And  user press on login button
    Then user login to the system successfully

    Examples:
      | Email            | password |
      |mustafa@gmail.com |123456789 |


  Scenario Outline: user could login with invalid email and password
    Given user go to login page
    When user entered an invalid Email"<Email>"
    And user entered an  invalid  password"<password>"
    And  user press on login button
    Then user could not login to the system
    And  Message should be red

    Examples:
      |Email|password|
      |111111@gmail.com|111111|

