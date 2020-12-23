Feature: Validation of the Shop By Style Page

  @TC_ShopByStyle_01
  Scenario: Validation of the product link displayed in the Shop By Style Page
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
    And   I click Shop By Style in the Footer
    Then  I verify that title "Shop By Style | Ariat" of the page
    And   I verify that Page header "Shop By Style" is displayed on the page
    And   I verify able to click the product links displayed on the page and verify the Url

