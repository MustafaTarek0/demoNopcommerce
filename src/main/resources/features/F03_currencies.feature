@smoke
  Feature: user can change currency from USD to Euro
    Scenario: user can change currencies
      When user Click on currencies dropdown list
      And Click on Euro currency
      Then Currencies should be changed to Euro

