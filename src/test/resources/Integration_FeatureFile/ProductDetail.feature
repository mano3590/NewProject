@Fullsuite
Feature: Validation of the Product Detail Page

  Background:
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
  @TC_ProductDetail_01
  Scenario: validating all the fields are displayed in the Product Detail Page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    And  I verify the selected product name is displayed in the Bread crumb link
    And  I verify the Selected Product Image is Displayed in the Product Detail Page
    Then I verify that selected product is displayed on Product details page
    And  I verify the product code is displayed in the Product Detail Page
    And  I verify the Starts for the Product is displayed in the Product Detail Page
    And  I verify the Rating Value is displayed in the Product Detail Page
    And  I verify the Review Stars Count is displayed in the Product Detail Page
    And  I verify the Write a review link is displayed in Product Detail Page
    And  I verify the View Description link is displayed in Product Detail Page
    And  I verify the Color name is Displayed in the Product Detail Page
    And  I verify the Product color Images are displayed in the Product Detail Page
    And  I verify the Size DropDown and Width box are available in the Product Detail Page
    And  I verify the Product Prize is displayed in the Product Detail Page
    And  I verify the AfterPay logo and Info Icon are displayed in the Product Detail Page
    And  I verify the Quantity Box, Increment and Decrement is displayed in the Product Detail Page
    And  I verify Add to Bag is Disabled in the Product Detail Page
    And  I verify the Free Shipping and Free Returns Text is displayed in the Product Detail page
    And  I verify the Descriptions and Specifications are Displayed in the Product Detail Page
    And  I verify the Complete the Look Images, ProductNames, Product Prices, Review Starts and Review Counts are displayed in the Product Detail Page
    And  I verify the You May Also Look Like Images, ProductNames, Product Prices, Review Starts and Review Counts are displayed in the Product Detail Page
    And  I verify the Reviews text and Write a Review button is displayed in the Product Detail Page
    And  I verify the Recently viewed Images, ProductNames, Product Prices, Review Starts and Review Counts are displayed in the Product Detail Page

  @TC_ProductDetail_02
  Scenario: validating the Color,Selected Menu,ProductName,Price and Review Count in the Product Detail Page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    And  I verify the Selected Menu is Displayed in the Product Detail Page
    Then I verify that selected product is displayed on Product details page
    And  I verify the Review Stars Count is displayed in the Product Detail Page as same in the Product List Page
    And  I verify the Number of colors in the Product List Page and Product Detail Page are same
    And  I verify the Product Price in the Product List Page and Product Detail Page are same
    And  I verify the Color name is Displayed in the Product Detail Page
    When I select anyone of the color images in the Product Detail Page
    Then I verify the color Name has changed in the Product Detail Page

  @TC_ProductDetail_03
  Scenario: Verify user able to select the Product Color, Size and Add to bag button is display and user able to click Add to Bag button and verify the product details in My Bag Page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And  I verify the product code is displayed in the Product Detail Page
    And  I verify the Color name is Displayed in the Product Detail Page
    And I verify the Add to Bag button is enable in the Product detail page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page
    And I verify the selected Product Color, Width, Size, Style and Price are displayed in the My Bag Page

  @TC_ProductDetail_04
  Scenario: validating user able to select any one of the Random product in the Product Detail Page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I select any one of the Random product in the Product Details Page
    Then I verify the Selected Product Name is Displayed in the Product Detail Page
    When I select "Width" of the product on Product details page
    And I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And  I verify the product code is displayed in the Product Detail Page
    And  I verify the Color name is Displayed in the Product Detail Page
    And I verify the Add to Bag button is enable in the Product detail page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that randomly selected product from product Detail page is added on My Bag page
    And I verify the selected Product Color,Style and Price are displayed in the My Bag Page

  @TC_ProductDetail_05
  Scenario: validating user able to wishlist the Product in the Product Detail Page and check the Product has added in the Wishlist Page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    Then I verify the "The product has been added to your wishlist." success message is displayed
    When I click Wish List link in the Footer
    And  I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page

  @TC_ProductDetail_06
  Scenario: validating user able to select the Size  and Width of the Product in the Product Detail Page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    When I select "Width" of the product on Product details page
#    Then  I verify the Width is selected in the Product Detail Page
    And  I click and view the AfterPay info icon
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page

  @TC_ProductDetail_07
  Scenario: validating user able to select the  the Product in the Product Detail Page and verify that product is added in the SlickSlidebar
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    When I select "Width" of the product on Product details page
    And  I verify the product code is displayed in the Product Detail Page
    And  I verify the Color name is Displayed in the Product Detail Page
    And  I get the Product Quantity on Product details page
    And I click Add To Bag on Product details page
    Then I verify the Selected Product Name, Color, Size, Width, Quantity,Price, Style Code and Stock Availability is displayed in the Slick Slide bar in Product Detail Page

  @TC_ProductDetail_08
  Scenario: validating user able to select the  the Product and edit the Product in SlickSlide bar and change the Color in the Slick Slide Popup
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    When I select "Width" of the product on Product details page
    And I click Add To Bag on Product details page
    When I click Edit link in the Product side bar
    Then I verify the slick slide pop up is displayed in the product list page
    And  I select the color of the product on Product slick slide pop up
    And  I get the selected color in the slickslide popup
    And  I get the product price in slickslideQuickView
    When  I click the AfterPay info icon in the slick slide popup
    Then  I verify the AfterPay info icon is displayed
    And  I click the update button in the slickslide popup
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page
    And I verify the selected color in slickslide is displayed in My Bag page
    And I verify that selected Slick Slide Popup Price and Total Price of the product on My Bag page

  @TC_ProductDetail_09
  Scenario: validating user able to select the  the Product and remove the Product in SlickSlide bar and verify that product is not added in the My Bag page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    When I select "Width" of the product on Product details page
    And I click Add To Bag on Product details page
    When I click Remove link in the Product slick slide
    And I click the My Bag from the Header
    Then I verify the Product is not displayed in the MyBag Page

  @TC_ProductDetail_10
  Scenario: validating the No Review Counts in the Product Detail Page
    When I select "Men" from  the header Menu
    Then I verify the Header is displayed in the Page
    And I select the less than one review Count product in the Product List Page
    Then I verify that selected product is displayed on Product details page
    And  I verify the Review Stars Count is displayed in the Product Detail Page as same in the Product List Page
    And  I verify the Reviews text is displayed in the Product Detail Page
    And  I verify Be the first to review this product text is displayed under the review text

    @TC_ProductDetail_11
    Scenario: validating user able to select the  the Product and remove the Product in SlickSlide bar and verify that product is not added in the My Bag page
      When I select any values from "Men" "Footwear"
      Then I verify the header "Men's" "Footwear" is displayed on Product list page
      And  I click More results in the Product List Page








