@Fullsuite
Feature:Validation of the Ariat Home Page New Arrivals

  @NewArrivals_01
  Scenario: Validating the New Arrivals In Home Page
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
    Then  I verify New arrivals is display in the Ariat homepage
    And   I verify the Product Name,Product price and Product Image is displayed under the New Arrivals Tag
    And   I verify able to click the New Arrivals Product and verify selected product is displayed on the Product list Page

