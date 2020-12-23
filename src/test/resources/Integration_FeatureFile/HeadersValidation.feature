@Fullsuite
Feature: Ariat website Headers Validation

  @HeaderValidation_01
  Scenario: Ariat and AriatWork Logo Validation

    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click "Ariat Work" link on Home page
    Then  I verify that title "Ariat Work" of the page

  @HeaderValidation_02
  Scenario: Ariat Headers Validation

    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
    Then  I verify the Header Section is displayed
    And   I verify the Free Shipping label and Details link are present
    When  I click the Details link in Free shipping and return from the header
    Then  I verify that title "Returns | Ariat" of the page
    When  I click the Country Selector button from the header
    Then  I verify the country selector popup is displayed
    And   I click the close button in the CountrySelector popup
    When  I click the AboutUs button from the Header
    Then  I verify that title "About Us | Ariat" of the page
    When  I click the Authorised Retailer button from the Header
    Then  I verify that title "Ariat Store Locations - Dealer Locator | Ariat" of the page
    When  I click sign in button in Header section
    Then  I verify that title "Sites-Ariat-Site | Ariat" of the page
    When  I click Search Link in the Header section
    Then  I verify the search bar is open
    When  I click the My Bag from the Header
    Then  I verify that title "My Bag | Ariat" of the page