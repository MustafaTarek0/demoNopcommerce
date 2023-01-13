@smoke
Feature: F07_followUs | users could open followUs links
 Scenario Outline: user opens facebook link
  When user opens facebook link
  Then New Tab "<url>" should be opened

    Examples:
   |url|
   |https://www.facebook.com/nopCommerce|

 Scenario Outline: user opens twitter link
  When  user opens twitter link
  Then New Tab "<url>" should be opened
  Examples:
   |url|
   |https://twitter.com/nopCommerce|

Scenario Outline: user opens rss link
  When user opens rss link
  Then New Tab "<url>" should be opened
 Examples:
  |url|
  |https://demo.nopcommerce.com/new-online-store-is-open|

Scenario Outline: user opens youtube link
  When user opens youtube link
  Then New Tab "<url>" should be opened
 Examples:
  |url|
  |https://www.youtube.com/user/nopCommerce|