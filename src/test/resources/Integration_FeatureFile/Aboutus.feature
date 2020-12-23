@Fullsuite
@AboutUs
Feature: Validation of the About us Page

  Background:
    Given I am on Ariat Website Home page
    And   I verify About us link is displayed in the Header
    When  I clicks the About us link
    Then  I verify the "About Us | Ariat" title

  @TC_Aboutus_01
  Scenario: About us Page Validation
    Then  I verify the links are displayed on About us page
      | OUR STORY      |
      | CAREERS        |
      | SUSTAINABILITY |
      | PRESS          |
      | GIVING         |
    Then I verify widgets images are displayed on About us Page

  @TC_Aboutus_02
  Scenario: Validation of the CAREERS Page
    When  I clicks the CAREERS link on About us page
    Then  I verify the title "Careers | Ariat" of the page
    And   I verify below listed widgets images are displayed on Carrers Page
      | Our Values     |
      | Life at Ariat  |
      | Ariat Benefits |
    And   I verify below listed VIEW OPEN POSITIONS action buttons are displayed on Carrers Page
      | Our Values     |
      | Life at Ariat  |
      | Ariat Benefits |

  @TC_Aboutus_03
  Scenario Outline: Validation of the CARRERS Page VIEW OPEN POSITIONS action buttons
    When  I clicks the CAREERS link on About us page
    And   I clicks the "<VIEW OPEN POSITIONS>" action buttons
    Then  I verify that title "Career Opportunities" of the Career Oppertunities page
    Examples:
      | VIEW OPEN POSITIONS |
      | Our Values          |
      | Life at Ariat       |
      | Ariat Benefits      |


  @TC_Aboutus_04
  Scenario Outline: Validation of the SUSTAINABILITY Page
    When  I clicks the SUSTAINABILITY link on About us page
    Then  I verify the title "Sustainability | Ariat" of the page
    And   I click the below listed "<Shop Buttons>"
    And   I verify the title "<Page Title>" of the selected Shop Button page
    Examples:
      | Shop Buttons           | Page Title                          |
      | ECO RYDERS & CRUISERS  | Eco Bloom Collection                |
      | H2LO                   | Sustainability - H2Lo Denim         |
      | DENIM RECYCLING        | Go Green Denim Recycling            |
      | BLUESIGN               | Sustainability - BlueSign Certified |
      | ECODRY                 | Sustainability - EcoDry Technology  |
      | ETHICALLY SOURCED DOWN | Ethically Sourced Down Collection   |
      | ETHICALLY SOURCED WOOL | Ethically Sourced Wool Collection   |

  @TC_Aboutus_05
  Scenario: Validation of the PRESS link
    When  I clicks the PRESS link
    Then  I verify the title "Press Room | Ariat" of the page
    And   I verify For Inquire and Block images are displayed in the page
    And   I verify ReadMore Links are displayed in the page

  @TC_Aboutus_06
  Scenario: Validation of the GIVING link
    When I clicks the GIVING link
    Then I verify the title of the "Giving - Our Causes & Organizations Support | Ariat International" page
    Then I verify widgets images are displayed on Ariat Giving Page
