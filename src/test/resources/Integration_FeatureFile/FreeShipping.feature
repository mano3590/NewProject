@Fullsuite
Feature:Free Shipping and Free Returns upto 90 days

  Background:
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page

  @FreeShipping_01
  Scenario: Validating the Free Shipping and Free Returns Details Links
    When  I click "Ariat" link on Home page
    And   I click the Details link in Free shipping and return from the header
    Then   I verify that title "Returns | Ariat" of the page
    And   I verify the buttons are displayed in the Returns page
    And   I verify the "First Button Header" is displayed in the page
    When  I click the "First Button" in the Return page
    And   I click the "First Button" minimize in the Return Page
    Then  I verify the "Second Button Header" is displayed in the page
    When  I click the "Second Button" in the Return page
    And  I click the "Second Button" minimize in the Return Page
    Then   I verify the "Third Button Header" is displayed in the page
    When  I click the "Third Button" in the Return page
    And  I click the "Third Button" minimize in the Return Page
    Then   I verify the "Fourth Button Header" is displayed in the page
    When  I click the "Fourth Button" in the Return page
    And  I click the "Fourth Button" minimize in the Return Page
    Then   I verify the "Fifth Button Header" is displayed in the page
    When  I click the "Fifth Button" in the Return page
    Then  I click the "Fifth Button" minimize in the Return Page

  @FreeShipping_02
  Scenario: Validating all the Returns Links and Contact Information without Login
    When  I click the Details link in Free shipping and return from the header
    And   I click the "First Button" in the Return page
    Then   I verify the "First Content Description" is displayed in the page
    And   I verify the "First Button ContactNumber" is displayed in the page
    Then   I verify the "First Button Email" is displayed in the page
    When   I click the "First Button Link" in the Content box
    Then  I verify that title "Sites-Ariat-Site | Ariat" of the page
    When  I click the Details link in Free shipping and return from the header
    Then   I click the "Second Button" in the Return page
    And   I verify the "Second Content Description" is displayed in the page
    And   I verify the "Second Button ContactNumber" is displayed in the page
    And   I verify the "Second Button Email" is displayed in the page
    When  I click the "Second Button Link" in the Content box
    Then  I verify that title "Sites-Ariat-Site | Ariat" of the page
    When  I click the Details link in Free shipping and return from the header
    And   I click the "Third Button" in the Return page
    Then   I verify the "Third Content Description" is displayed in the page
    Then   I verify the "Third Button Email" is displayed in the page
    When  I click the "Third Button" minimize in the Return Page
    And   I click the "Fourth Button" in the Return page
    And   I verify the "Fourth Content Description" is displayed in the page
    And   I click the "Fourth Button Link" in the Content box
    Then  I verify that title "Sites-Ariat-Site | Ariat" of the page
    When  I click the Details link in Free shipping and return from the header
    When  I click the "Fifth Button" in the Return page
    Then   I verify the "Fifth Content Description" is displayed in the page

  @FreeShipping_03
  Scenario Outline: Validating all the Returns Links and Contact Information with Login
    When I click sign in button in Header section
    And  I login the application with "<username>", "<password>"
    When I click "Ariat" link on Home page
    And  I click the Details link in Free shipping and return from the header
    And  I click the "First Button" in the Return page
    Then I verify the "First Content Description" is displayed in the page
    And  I verify the "First Button ContactNumber" is displayed in the page
    Then I verify the "First Button Email" is displayed in the page
    When I click the "First Button Link" in the Content box
    Then I verify that title "My Orders | Ariat" of the page
    When I click the Details link in Free shipping and return from the header
    And  I click the "Second Button" in the Return page
    Then I verify the "Second Content Description" is displayed in the page
    And  I verify the "Second Button ContactNumber" is displayed in the page
    Then I verify the "Second Button Email" is displayed in the page
    When I click the "Second Button Link" in the Content box
    Then I verify that title "My Orders | Ariat" of the page
    When I click the Details link in Free shipping and return from the header
    And  I click the "Third Button" in the Return page
    Then I verify the "Third Content Description" is displayed in the page
    And  I verify the "Third Button Email" is displayed in the page
    When I click the "Third Button" minimize in the Return Page
    And  I click the "Fourth Button" in the Return page
    Then I verify the "Fourth Content Description" is displayed in the page
    When I click the "Fourth Button Link" in the Content box
    Then I verify that title "My Orders | Ariat" of the page
    When I click the Details link in Free shipping and return from the header
    And  I click the "Fifth Button" in the Return page
    Then I verify the "Fifth Content Description" is displayed in the page

    Examples:
      |username                 |password|
      |Photontest2020@gmail.com |Photon@2020 |





