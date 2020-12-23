@Fullsuite
Feature: Validation of the My Orders Pages

  @TC_MyOdersPage_01
  Scenario: validating the Order Page without any orders
    Given I am on Ariat Home page
    When  I click sign in button in Header section
    And   I login the application with "photon2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When  I clicks the "Orders" link on the User Profile screen
    Then  I verify that title "My Orders | Ariat" of the page
    And   I verify the Header "My Orders" of the page
    When  I click the My Orders dropdown on the page
    And   I click the "Last Twelve Months" from the dropdown list item
    And   I click the My Orders dropdown on the page
    And   I click the "Last Six Months" from the dropdown list item
    Then  I verify the "Need Help" text is displayed on the page
    And   I verify the "Customer Service" text is displayed on the page
    And   I verify the "Contact us" link is displayed on the page
    When  I click the Contact us link on the page
    Then  I verify that title "Registration Request - Ariat Consumer Portal" of the page
    And   I verify the Customer Service contact Number and Mail id displayed on the page
    And   I click the Back To My account Link on the Page
    Then  I verify that title "My Account | Ariat" of the page

  @TC_MyOdersPage_02
  Scenario: validating the Order Page with orders on the page
    Given I am on Ariat Home page
    When  I click sign in button in Header section
    And   I login the application with "photontesting20@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When  I click the view all link in My Order in My Account page
    Then  I verify that title "My Orders | Ariat" of the page
    And   I verify the Order No is displayed all the listed order Items on the Page
    And   I verify the Order Detail link is displayed all the listed order Items on the Page
    And   I verify the below listed texts are displayed all the listed order Items on the Page
      | Date Ordered |
      | Order Status |
      | Shipped to   |
      | Items        |
    And   I verify the Total No of Items text is displayed all the listed order Items on the Page
    And   I verify the Total Price of the Product is displayed all the listed order Items on the Page
    And   I get random Order Details in My Orders Page and verify the Selected Order details are displayed in Order Detail Page

  @TC_MyOdersPage_03
  Scenario: validating the Order Page drop down with orders list
    Given I am on Ariat Home page
    When  I click sign in button in Header section
    And   I login the application with "photontesting20@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When  I clicks the "Orders" link on the User Profile screen
    Then  I verify that title "My Orders | Ariat" of the page
    When  I click the My Orders dropdown on the page
    And   I click the "Last Twelve Months" from the dropdown list item
    Then  I verify the selected order details are displayed in Order detail Page
    And   I click the "Last Six Months" from the dropdown list item
    Then  I verify the selected order details are displayed in Order detail Page
    And   I click the "2020" from the dropdown list item
    Then  I verify the selected order details are displayed in Order detail Page





