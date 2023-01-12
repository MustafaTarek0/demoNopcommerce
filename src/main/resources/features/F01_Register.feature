@smoke
Feature: F01_Register | users could register with new accounts

  Scenario Outline: guest user could register with valid data successfully
    Given   user go to register page
    When    user select gender type"<genderType>"
    And     user enter first name"<firstName>"
    And     user enter last name"<lastName>"
    And     user enter date of birth
    And     user enter his email "<email>"
    And     user enter his Password "<password>"
    And     user confirms his password "<password>"
    And     user clicks on register button
    Then    success message is displayed "<message>"
    And     color of success message should be green
    Examples:
      |genderType  |firstName|lastName|email|password|message|
      |male        |Mustafa  |tarek   |mustafa@gmail.com|123456789|Your registration completed|
      |female      |Esraa    |mohammed   |esraa@gmail.com|123456789|Your registration completed|




