@Fullsuite
@SearchLink
Feature: Validation of Header Search link

  Background:
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
    Then  I verify that title "Ariat International | Home Page" of the page

  @TC_Search_01
  Scenario: Validating the Search link
    Then  I verify the SEARCH link is displayed in the page
    When  I click Search Link in the Header section
    Then  I verify search field is displayed in the page
    And   I verify close button is displayed in the page
    When  I enters any "Men" in the search field
    Then  I verify the "Men" text is displayed in the page
    And   I verify the SEE ALL PRODUCTS link is displayed in the page
    And   I verify the Categories text is displayed in the page
    And   I verify the search suggestions categories list are displayed
    And   I verify the Search Suggested product List in the page
    When  I click the Search Close Button
    Then  I verify the SEARCH link is displayed in the page

  @TC_Search_02
  Scenario: Validating the Search link and verify the product list
    Then  I verify the SEARCH link is displayed in the page
    When  I click Search Link in the Header section
    Then  I verify search field is displayed in the page
    And   I verify close button is displayed in the page
    When  I enters any "Women" in the search field
    Then  I verify the "Women" text is displayed in the page
    And   I verify the SEE ALL PRODUCTS link is displayed in the page
    And   I verify the Categories text is displayed in the page
    And   I verify the search suggestions categories list are displayed
    And   I verify the Search Suggested product List in the page
    When  I click the Search Close Button
    Then  I verify the SEARCH link is displayed in the page

  @TC_Search_03
  Scenario Outline: Validating the Search link with multiple datas
    When  I click Search Link in the Header section
    And   I enters any "<Search Keyword>" in the search field
    Then  I verify the "<Search Keyword>" text is displayed in the page
    And   I verify the Search Suggested product List in the page
    And   I verify the Search Suggested product List contains Product Name and price
    And   I verify the SEE ALL PRODUCTS link is displayed in the page
    And   I verify the Categories text is displayed in the page
    And   I verify the search suggestions categories list are displayed
    When  I select any one product from Search Suggested Product list page
    Then  I verify that selected product is displayed on Product details page
    Examples:
      | Search Keyword |
      | Kids           |
      | Women          |
      | Boots          |
      | Scar           |
      | jackets        |
      | jean           |
      | denim          |
      | shirts         |
      | Western        |
      | Socks          |
      | Gloves         |
      | Bag            |
      | English        |
      |Accessories     |

  @TC_Search_04
  Scenario Outline: validating the invalid keyword close in the search link
    When  I click Search Link in the Header section
    And   I enters invalid "<search keywords>" in the search filed
    Then  I verify whether it is displayed error message "No Products were found"
    Examples:
      | search keywords |
      | #$@             |
      | 00000000        |
      | @00000#         |
      | 00000%&         |
      | #$$%^&&&        |
      | %$^^ &*7ghb     |

  @TC_Search_05
  Scenario Outline: Validating the Categories list in Search link
    When  I click Search Link in the Header section
    And   I enters any "<Search Keyword>" in the search field
    Then  I verify the "<Search Keyword>" text is displayed in the page
    And   I verify the Categories text is displayed in the page
    And   I verify the search suggestions categories list are displayed
    And   I click any one of the product from the Categories list
    Then  I verify that selected product is displayed on Product list page
    Examples:
      | Search Keyword |
      | Kids           |
      | Women          |
      | Boots          |
      | Scar           |
      | jackets        |
      | jean           |
      | denim          |
      | shirts         |
      | Western        |
      | Socks          |
      | Gloves         |
      | Bag            |
      | English        |
      |Accessories     |


  @TC_Search_06
  Scenario Outline: Validating the Categories list in Search link
    When  I click Search Link in the Header section
    And   I enters any "<Search Keyword>" in the search field and press Enter Key
    Then  I verify Product list page Url contains "<Search Keyword>"
    Examples:
      | Search Keyword |
      | kids           |
      | Women          |
      | Boots          |
      | Scar           |
      | jackets        |
      | jean           |
      | denim          |
      | shirts         |
      | Western        |
      | Socks          |
      | Gloves         |
      | Bag            |
      | English        |
      |Accessories     |