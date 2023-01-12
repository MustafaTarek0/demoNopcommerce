@smoke

  Feature: user should be able to hover on Categories and use sub categories

    Scenario Outline: user can hover on categories from homepage
      When  user hover on Computers category
      And   user click on sub-category
      Then  Sub-category page should be shown
      Examples:
