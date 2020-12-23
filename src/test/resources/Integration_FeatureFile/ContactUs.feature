Feature: Validation of the Contact us Page

  @TC_ContactUs_01
  Scenario: Validation of the Contact us Page
    Given I am on Ariat Website Home page
    When  I click the Contact us link on the Footer
    Then  I verify that title "Registration Request - Ariat Consumer Portal" of the page
    When  I click click here link on the contact Us page
    Then  I verify the below listed contact info Headers are displayed on the page
      | Consumer inquiries      |
      | International inquiries |
      | Orders                  |
      | Returns                 |
      | Warranty                |
      | Retail inquiries        |
      | Expert Voice            |
      | Press inquiries         |
      | Corporate Headquarters  |


