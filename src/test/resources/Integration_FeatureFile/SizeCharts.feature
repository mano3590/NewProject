Feature: Validation of the Size Charts Page

  @TC_SizeCharts_01
  Scenario: Validation of the Size Charts Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    And  I verify Size charts link is displayed on the Ariat Footer
    When I click the Size chart link on the Ariat Footer
    Then I verify that title "Size Charts | Ariat" of the page
    And  I verify the Header "Size Charts" of the page
    And  I verify that Size charts box-accordions are displayed on the page
      | Boots           |
      | Tall Boots      |
      | Half Chaps      |
      | Denim           |
      | Western Apparel |
      | English Apparel |
      | Belts           |
    And  I verify able to click "Boots" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men   |
      | Women |
      | Kids  |
    And  I verify able to click "Tall Boots" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men   |
      | Women |
      | Kids  |
    And  I verify able to click "Half Chaps" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men & Women |
      | Kids        |
    And  I verify able to click "Denim" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men   |
      | Women |
    And  I verify able to click "Western Apparel" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men   |
      | Women |
    And  I verify able to click "English Apparel" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men   |
      | Women |
      | Kids  |
    And  I verify able to click "Belts" Size charts and able to click below listed subsections and verify the selected Size charts header
      | Men   |
      | Women |



