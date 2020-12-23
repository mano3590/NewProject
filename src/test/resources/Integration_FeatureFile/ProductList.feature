@Fullsuite
Feature: Validation of the Product List Page

  @TC_ProductList_01
  Scenario: Validating the listed Products and Pagination in the Product List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    And  I verify that Breadcrum link displayed on the page
    And  I verify that Product search results count is displayed on the Page
    And  I verify the Sortby drop down is displayed on the Product List Page
    And  I verify the Categories text is displayed in the page
    And  I verify that Categories list displayed on the page
    And  I verify that Pagination is displayed on the page
    And  I verify that Filters is displayed on the page
    And  I verify that More Result Button is displayed on the page
    And  I verify product are listed in the Product list page
    And  I verify Product color count, rating stars, star count, Product Name and Product price are displayed on the Product image
    And  I verify that able to view the Product Quick view popup screen by clicking the QuickView on the product image
    And  I verify Product colour swatches images are displayed on the product image
    And  I verify able to click the pagination and verify the products are displayed on the page

  @TC_ProductList_02
  Scenario: Validating the SortBy drop down in Product List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    And  I verify the Sortby drop down is displayed on the Product List Page
    Then I verify able to click the "New Arrivals" dropdown and verify Products are displayed as per the selection
    And  I verify able to click the "Best Sellers" dropdown and verify Products are displayed as per the selection
#    When I click "Price (High to Low)" from the drop down list Items
#    Then I verify the listed Products are displayed as per the selected drop down selection
#    When I click "Price (Low to High)" from the drop down list Items
#    Then I verify the listed Products are displayed as per the selected drop down selection


  @TC_ProductList_03
  Scenario: Validating the Product Categories in Product List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
#    When I select "Men" menu and click all submenu under the "Footwear"
#    And  I select "Men" menu and click all submenu under the "Clothing"
#    And  I select "Men" menu and click all submenu under the "Accessories"
    And  I select "Men" menu and click all submenu under the "Featured"


  @TC_ProductList_04
  Scenario: Validating the listed Products and Pagination in the Product List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
#    And I verify product are listed in the Product list page
#    And I verify Product color count, rating stars, star count, Product Name and Product price are displayed on the Product image
#    And I verify that able to view the Product Quick view popup screen by clicking the QuickView on the product image
#    And I verify Product colour swatches images are displayed on the product image
    And  I verify able to click the pagination and verify the products are displayed on the page


  @TC_ProductList_05
  Scenario: Validating the More Result button in the Product List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    And I verify product are listed in the Product list page
    And I verify able to click the More Results Button and products are displayed as per the selection in the page

  @TC_ProductList_06
  Scenario: Validating the Filters in the Product List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Kids" "Clothings"
    Then I verify the header "Kids'" "Clothings" is displayed on Product list page
    And  I verify product are listed in the Product list page
    And  I verify "Filters" text is displayed on the Product list page
    When I click the filters listed on the Product list Page
















