@Fullsuite
Feature: Validation of the Product Search List Page

  @TC_ProductSearchList_01
  Scenario: Validating the Header menu Men submenu work Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Work"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    And  I verify that Product search results count is displayed on the Page
    And  I verify that Banner image is displayed on the top of the page
    And  I verify that Breadcrum link displayed on the page
    And  I verify the Categories text is displayed in the page
    And  I verify that Categories list displayed on the page
    And  I verify the Sortby drop down is displayed on the Product List Page
    And  I verify that Pagination is displayed on the page
    And  I verify that products are displayed on the Product list Page
    And  I verify that Filters is displayed on the page
    And  I verify that More Result Button is displayed on the page
    And  I verify that Back To Top Displayed on the page
    And  I verify that Banner contains carousel button
    And  I click the Banner Image on the Product list page
    Then I verify that products are displayed on the Product list Page
    When I select any values from "Men" "Work"
    Then I verify the header "Men's" "Jeans" is displayed on Product list page
    When I click the Next carousel button on the Banner image displayed in the product list page
    And  I click the Banner Image on the Product list page
    Then I verify that products are displayed on the Product list Page
    And  I verify able to click the Back To Top Button and verify that page scroll up


  @TC_ProductSearchList_02
  Scenario: Validating the Denim Product Filter images and links in Header Menu Men submenu Work
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Denim"
    Then I verify that header "Men's" "Denim" is displayed on Product list page
    And  I verify that Product search results count is displayed on the Page
    And  I verify that Breadcrum link displayed on the page
    And  I verify product are listed in the Product list page
    And  I verify Product color count, rating stars, star count, Product Name and Product price are displayed on the Product image
    And  I verify that able to view the Product Quick view popup screen by clicking the QuickView on the product image
    And  I verify the Categories text is displayed in the page
    And  I verify that Categories list displayed on the page
    And  I verify the Sortby drop down is displayed on the Product List Page
    And  I verify that Pagination is displayed on the page
    And  I verify that products are displayed on the Product list Page
    And  I verify that Filters is displayed on the page
    And  I verify that More Result Button is displayed on the page
    And  I verify that Back To Top Displayed on the page
    And  I verify that Denim Product Filter images are displayed on the top of the page
    And  I verify that Denim Product Filter Names are displayed on the top of the page
    And  I verify that Denim Product Filter links are displayed on the top of the page
    And  I verify user able to click the Filter images & selected Filter name is displayed and verify Products are displayed on the page

  @TC_ProductSearchList_03
  Scenario: Validating the Product Filters in the Header Menu Men submenu Work Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Denim"
    Then I verify that header "Men's" "Denim" is displayed on Product list page
    And  I verify that Product search results count is displayed on the Page
    And  I verify that Breadcrum link displayed on the page
#    And  I verify able to click the Filters displayed in the page and verify the products are displayed as filter selection

  @TC_ProductSearchList_04
  Scenario: Validating the Pagination in the Header Menu Men submenu Work Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Denim"
    Then I verify that header "Men's" "Denim" is displayed on Product list page
    And  I verify that Product search results count is displayed on the Page
    And  I verify that Breadcrum link displayed on the page
    And  I verify able to click the pagination and verify the products are displayed on the page

  @TC_ProductSearchList_05
  Scenario: Validating the More Results in the Header Menu Men submenu Work Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Denim"
    Then I verify that header "Men's" "Denim" is displayed on Product list page
    And  I verify that Product search results count is displayed on the Page
    And  I verify that Breadcrum link displayed on the page
    And  I verify able to click the More Results Button and products are displayed as per the selection in the page

  @TC_ProductSearchList_06
  Scenario: Validating the FR Work wear Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "FR Workwear"
    Then I verify that title "FR Workwear | Ariat" of the page
    And  I verify that HomePage Banner Button displayed on the page
    And  I verify that Widgets, Widget links are displayed on the page
    And  I verify that Breadcrum link displayed on the page
    And  I verify that "FR New Arrivals" Page header is displayed on the page
    And  I verify that Product search results count is displayed on the Page
    And  I verify the Sortby drop down is displayed on the Product List Page
    And  I verify that Filters is displayed on the page
    And  I verify product are listed in the Product list page
    And  I verify Product color count, rating stars, star count, Product Name and Product price are displayed on the Product image
    And  I verify that able to view the Product Quick view popup screen by clicking the QuickView on the product image
    And  I verify able to click the Back To Top Button and verify that page scroll up
    And  I verify able to click the Widgets and verify the selected widgets Names with Breadcrum displayed on the page


  @TC_ProductSearchList_07
  Scenario: Validating the FR Work wear Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "FR Workwear"
    Then I verify that title "FR Workwear | Ariat" of the page
    And  I verify that HomePage Banner Button displayed on the page
    When I click the Banner button on the page
    Then I verify the Url of the Page


  @TC_ProductSearchList_08
  Scenario: Validating the Shop By Work Product Search List Page
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "ShopByWork"
    Then I verify that title "Ariat Work Headquarters | Ariat" of the page
    And  I verify that able to click the Banner button and verify its navigate to appropriate page
    And  I verify that able to click the Banner Image & Widgets and verify its navigate to appropriate page
    And  I verify that Breadcrum link displayed on the page
    And  I verify that "New Arrivals" Page header is displayed on the page
    And  I verify that Product search results count is displayed on the Page
    And  I verify the Sortby drop down is displayed on the Product List Page
    And  I verify that Filters is displayed on the page
    And  I verify product are listed in the Product list page
    And  I verify Product color count, rating stars, star count, Product Name and Product price are displayed on the Product image
    And  I verify that able to view the Product Quick view popup screen by clicking the QuickView on the product image
    And  I verify able to click the Back To Top Button and verify that page scroll up









