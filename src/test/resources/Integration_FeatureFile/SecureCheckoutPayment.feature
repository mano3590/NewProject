@SecureCheckoutPayment
Feature: Validation of the Secure Checkout Payment Page

  @TC_SecureCheckoutPayment_01
  Scenario: Validation of the Payment Block in Secure Checkout Payment Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "ariatPhotontest@gmail.com", "password"
    And  I click "Ariat" link on Home page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    When I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    When I click Next:Payment button on Secure Checkout page
    Then I verify the Checkout Product name on Secure Checkout page
    And  I verify that payment section is displayed on Secure Checkout page
    When I click the credit card payment link on Secure Checkout page
    And  I verify the below listed label names are displayed in the Payment section
      | Card number              |
      | Expiry date              |
      | CVC / CVV                |
      | Cardholder name          |
    And  I verify that Credit Card Name, Number, Expiry date, Cvv and Card Holder Names text box are displayed on the page


