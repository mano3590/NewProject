@Fullsuite
Feature: Validation of the MyAriat in Ariat Homepage

  @NeedClarification
  @TC_MyAriat_01
  Scenario: Validation of the Add Your Photo
    Given I am on Ariat Home page
    Then  I verify MyAriat Text Displayed on the Ariat Home page
    And   I verify the Add Your Photo Text is displayed
    When  I click the Add Your Photo on the Page
    And   I verify the Upload Frame is displayed
    And   I verify the Breadcrum link is displayed on the upload Frame
    And   I verify the Source Header is displayed on the Upload Frame
    And   I verify the Source Desktop Icon is displayed on the Upload Frame
    And   I verify the Source Intagram Icon is displayed on the Upload Frame
    And   I verify the Source Facebook Icon is displayed on the Upload Frame
    And   I verify the Source Google Icon is displayed on the Upload Frame
    When  I click the Desktop icon on the Upload Frame
    And   I click the Drag and Drop Content on the Upload Frame
    Then  I verify the select Content BreadCrum is enabled
    When  I click the Drag and Drop Content on the Upload Frame

  @TC_MyAriat_02
  Scenario: Validation of the MyAriat View Gallery photo blocks and LoadMore Button
    Given I am on Ariat Home page
    Then  I verify View Gallery link is displayed on the Ariat Home Page
    When  I click the View Gallery link on the Ariat Home Page
    Then  I verify that title "My ariat | Ariat" of the page
    Then  I verify MyAriat Header Text Displayed on the Ariat Home page
    And   I verify the Add Your Photo Text is displayed
    When  I click the Add Your Photo on the Page
    Then  I verify the Upload Frame is displayed
    When  I click the close button on Upload Frame
    Then  I verify the PhotoBlocks are displayed in the Page
    And   I verify the Load More Content Button by user click the Button on the page

  @TC_MyAriat_03
  Scenario: Validation of the MyAriat View Gallery SortBy & your personalized content dropdown
    Given I am on Ariat Home page
    Then  I verify View Gallery link is displayed on the Ariat Home Page
    When  I click the View Gallery link on the Ariat Home Page
    Then  I verify that title "My ariat | Ariat" of the page
    Then  I verify MyAriat Header Text Displayed on the Ariat Home page
    And   I verify that SortBy dropdown displayed on the page
    When  I click the below listed dropdown list item
      | default      |
      | most recent  |
      | most popular |
    Then  I verify the your personalized content dropdown is displayed on the page
    When  I click the your personalized content dropdown on the page
    When  I click the "my photos" in your personalized content dropdown list item
    Then  I verify the SignIn with your social popup screen is displayed
    When  I click the close button on SignIn with your social popup screen
    And   I click the "my friends" in your personalized content dropdown list item
    Then  I verify the SignIn with your social popup screen is displayed
    When  I click the close button on SignIn with your social popup screen
    And   I click the "photos near me" in the your personalized content dropdown list item

  @NeedClarification
    @TC_MyAriat_04
  Scenario Outline: Validation of the MyAriat Search Field
    Given I am on Ariat Home page
    Then  I verify View Gallery link is displayed on the Ariat Home Page
    When  I click the View Gallery link on the Ariat Home Page
    Then  I verify that title "My ariat | Ariat" of the page
    Then  I verify MyAriat Header Text Displayed on the Ariat Home page
    When  I click the search icon on the My Ariat Home Page
    Then  I verify the Search field is displayed on the page
    When  I click the search close button on the page
    And   I click the search icon on the My Ariat Home Page
    And   I enters "<search keyword>" into the search field
    Then  I verify the "<search keyword>" is displayed below the search field
    Then  I verify the Photos are displayed in the Page
    When  I click the ClearAll link below the search field

    Examples:
      | search keyword |
      | boots          |
      | shoes          |
      | jacket         |


  @TC_MyAriat_05
  Scenario Outline: Negative Validation of the MyAriat Search Field
    Given I am on Ariat Home page
    Then  I verify View Gallery link is displayed on the Ariat Home Page
    When  I click the View Gallery link on the Ariat Home Page
    Then  I verify that title "My ariat | Ariat" of the page
    Then  I verify MyAriat Header Text Displayed on the Ariat Home page
    When  I click the search icon on the My Ariat Home Page
    Then  I verify the Search field is displayed on the page
    When  I click the search close button on the page
    And   I click the search icon on the My Ariat Home Page
    And   I enters "<Invalid search keyword>" into the search field
    Then  I verify the "<Invalid search keyword>" is displayed below the search field

    Examples:
      | Invalid search keyword |
      | @#$$%^%                |
      | 1234                   |
      | 00000                  |

  @TC_MyAriat_06
  Scenario: Validation of the MyAriat displayed photos
    Given I am on Ariat Home page
    Then  I verify View Gallery link is displayed on the Ariat Home Page
    When  I click the View Gallery link on the Ariat Home Page
    Then  I verify that title "My ariat | Ariat" of the page
    And   I verify MyAriat Header Text Displayed on the Ariat Home page
    And   I verify the Photos are displayed in the Page
    When  I select any one of the photo from the listed photos
    Then  I verify that selected photo block lightbox screen is displayed on the page
    And   I verify that selected photo block lightbox screen contains Close Button, Next and Previous carousel Button





























