@smoke

  Feature: user should be able to hover on Categories and use sub categories

    Scenario Outline: user can hover on categories from homepage
      When  user can hover on Computers tab
      And   user click on sub-tab "<category>"
      Then  Sub-category title "<title>" page should be visible
      Examples:
      |category|title|
      |Desktops|Desktops|
      |Software|Software|