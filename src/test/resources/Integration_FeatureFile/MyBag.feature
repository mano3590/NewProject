@Fullsuite
@MyBagPage
Feature: Validation of the My Bag Page

  @TC_MyBag_01
  Scenario: Validation of the My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that selected Product Stlye No, Color, Width are displayed on My Bag Page
    And  I verify Edit link is displayed on the Page
    When I click the selected product Edit link
    Then I verify the Product Quick View Popup Displayed on the Page
    When I click the close button on the Product Quick View Popup screen
    Then I verify Qty block displayed on the Page
    And  I verify that "Add to Wishlist" link text is displayed on the page
    And  I verify that "Remove" link text is displayed on the page
    And  I verify that Price and Total Price of the product on My Bag page
    And  I verify that Promocode text box is displayed on the page
    And  I verify that Promocode Apply button is displayed on the page
    And  I verify the below listed texts are displayed on My Bag page
      | Subtotal      |
      | Shipping cost |
      | Estimated Tax |
    And  I verify that "Estimated Total" text displayed on My Bag Page
    And  I verify the AfterPay logo and Info Icon are displayed in the Product Detail Page
    When I click and view the AfterPay info icon
    Then I verify Continue Shopping button is displayed on the page
    And  I verify Go to checkout button is displayed on the page
    And  I verify that Secure Checkout and Return Policies texts are displayed on the page
    When I click SecureCheckout link in the MyBag page
    Then I verify the SecureCheckout popup is Displayed
    When I click close button in SecureCheckout popup screen
    And  I click SecureCheckout link in the MyBag page
    And  I click the Full Privacy Policy Link in the SecureCheckout popup
    Then I verify the header Privacy Policy is displayed in the page
    When I click View Cart icon from header section
    And  I click the Return Policies link on My Bag Page
    Then I verify that title "Returns | Ariat" of the page
    And  I verify that "CHECKOUT ASSISTANCE?" text and verify contact number is displayed on the page
    When I click the Continue Shopping link on My Bag Page
    Then I verify that title "Ariat International | Home Page" of the page

  @TC_MyBag_02
  Scenario: Validation of the Add to Wishlist, Remove From Wishlist and Remove link in My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    When I click the Add to Wishlist link in the My Bag page
    And  I click Wish List link in the Footer
    Then I verify that product is added on Wishlist page
    When I click View Cart icon from header section
    And  I click the Remove From WishList Link on the selected WishList Product in My Bag page
    And  I click Wish List link in the Footer
    Then I verify that product is removed from Wishlist page
    When I click View Cart icon from header section
    And  I click the Remove link in the My Bag Page
    Then I verify that selected product has removed from My Bag Page

  @TC_MyBag_03
  Scenario: Validation of the Product QuickView Screen in My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    When I click the EDIT link on My Bag Page
    Then I verify Product Popup screen is displayed
    And  I verify the Product slick slide are displayed on the Product QuickView Screen
    And  I verify that selected Product Name is displayed on the Product QuickView Screen
    And  I verify the review stars and Write a review link is displayed on the Screen
    And  I verify Color text is displayed on the Screen
    And  I verify the Variation Color and Color count of the product
    And  I verify the Size Dropdown is displayed on the Product QuickView Screen
    And  I verify the Width Buttons are displayed on the Screen
    And  I verify the Product price is displayed on the Screen
    And  I verify the AfterPay logo and Info Icon are displayed on the Screen
    And  I verify the Update Button is displayed on the Screen
    And  I verify the selected Product Color, Width, Size and Price are displayed in the QuickView Screen

  @TC_MyBag_04
  Scenario: Validation of the QuickView Screen by Updating the Selected Product Width, Color and Size and verify the Updated Product is displayed in My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    When I click the EDIT link on My Bag Page
    Then I verify Product Popup screen is displayed
    And  I verify that selected Product Name is displayed on the Product QuickView Screen
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I click the Update button on Product QuickView Screen
    Then I verify that selected QuickView product Width, color, size, Price are displayed in the wishlist page


  @TC_MyBag_05
  Scenario: Validation of the PROMOCODE in My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify able to enter the following codes into the Promocode text box and verify the error msg
      | dgdhfjjf   |
      | @#$$%%     |
      | 123445     |
      | promocode  |
      | promo@code |

  @TC_MyBag_06
  Scenario: Validation of the Qty in My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that selected Qty is displayed on My Bag page
    When I click the Qty increase button on My Bag Page
    Then I verify that selected product total price has increased in My Bag page
    When I click Qty decrease button on My Bag Page
    Then I verify that selected product total price has decreased in My Bag page
    When I enter the Qty into the Qty text box on My Bag Page
    Then I verify selected product total price has changed as per the added Qty

  @TC_MyBag_07
  Scenario: Positive validation of the My Bag Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Women" "Women Footwear"
    Then I verify the header "Women's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    When I get the selected Product ID on Product details page
    And  I get the selected Product Color on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that selected Product Stlye No, Color, Width are displayed on My Bag Page
    And  I verify that selected Qty is displayed on My Bag page
    When I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page





