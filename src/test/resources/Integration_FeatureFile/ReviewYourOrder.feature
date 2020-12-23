
Feature: Validation of SecureCheckout Review Your Order Page

  @TC_ReviewYourOrder_01
  Scenario: Validation of the SHIPPING field in Review Your Order Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "ariatPhotontest@gmail.com", "password"
    And  I verify that title "My Account | Ariat" of the page
    When I click "Ariat" link on Home page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    When I remove the other product on My Bag page
    And  I click the Product Quantity Decrease Button on My Bag Page
    And  I verify that product is added on My Bag page
    And  I verify that selected Product Style No, Color, Width are displayed on My Bag Page
    Then I verify that Price and Total Price of the product on My Bag page
    When I get the selected Product Subtotal, Order Discount, Shipping cost and Estimated Tax on My Bag Page
    When I get the Estimated Total Price on My Bag page
    And  I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    And  I verify the Checkout Product name on Secure Checkout page
    And  I verify the Checkout Product price on Secure Checkout page
    And  I verify the selected product subtotal, Order Discount, Shipping cost and Estimated Tax on Secure Checkout page
    And  I verify the estimated and grand total price should be same
    And  I get the Shipping to Address on Secure Checkout page
    When I click Next:Payment button on Secure Checkout page
    Then I verify the Shipping Address on Secure Checkout page
#    Then I verify that payment section is displayed on Secure Checkout page
#    When I click Paypal link from payment section
#    And  I click Next:Review Order button from Paypal payment section
#    When I enter Paypal account "<paypal username>" and "<paypal password>"
#    And  I click login button on paypal accpunt page
#    Then I verify that "Ariat International" text displayed on the Paypal Page
#    When I click the continue button on Paypal page
