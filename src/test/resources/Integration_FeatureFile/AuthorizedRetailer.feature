@Fullsuite
Feature:Validation of the Authorized Retailer

  Background:
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page

  @AuthorizedRetailer_01
  Scenario: Validation of the Authorized Retailer link
    When  I click the Authorised Retailer button from the Header
    Then  I verify that title "Ariat Store Locations - Dealer Locator | Ariat" of the page
    And  I verify the Store Locator list are displayed on the Authorized Retailer Page
      | Brand Shops    |
      | Stores         |
      | Outside the Us |
    When  I click the Outside the Us link from the store list
    Then  I verify that title "Store Locator - Outside The US | Ariat" of the page
    And  I click the Authorised Retailer button from the Header
    When  I click the stores link from the store list
    Then  I verify that title "Ariat Store Locations - Dealer Locator | Ariat" of the page
    When  I click the Our Shops Link from the Store list
    Then  I verify the title "Our Shops | Ariat" of the page

  @AuthorizedRetailer_02
  Scenario: Validation of the Authorized Retailer Shops
    When  I click the Authorised Retailer button from the Header
    Then  I verify that title "Ariat Store Locations - Dealer Locator | Ariat" of the page
    When  I click the Our Shops Link from the Store list
    Then  I verify the Shopnames and Images are displayed in the Ariat Shops page
      | Fresno         |
      | Lexington      |
      | Gilroy Outlet  |
      | Florida Outlet |
      | Lehi Outlet    |
      | Phoenix Outlet |

  @AuthorizedRetailer_03
  Scenario Outline: Validation of the Authorized Retailer shops url
    When  I click the Authorised Retailer button from the Header
    When  I click the Our Shops Link from the Store list
    When  I click the "<GoToShoPage>" in the brand shops
    Then   I verify that url "<url>" of the page
    Examples:
      | GoToShoPage                    | url                                        |
      | GO TO FRESNO SHOP PAGE         | https://www.ariat.com/ariat-fresno.html    |
      | GO TO LEXINGTON SHOP PAGE      | https://www.ariat.com/ariat-lexington.html |
      | GO TO GILROY SHOP PAGE         | https://www.ariat.com/ariat-gilroy.html    |
      | GO TO SAWGRASS MILLS SHOP PAGE | https://www.ariat.com/ariat-sawgrass.html  |
      | GO TO LEHI OUTLET PAGE         | https://www.ariat.com/ariat-lehi.html      |
      | GO TO PHOENIX OUTLET PAGE      | https://www.ariat.com/ariat-phoenix.html   |

  @AuthorizedRetailer_04
  Scenario Outline: Validation of the Outside the US
    When  I click the Authorised Retailer button from the Header
    Then  I verify that title "Ariat Store Locations - Dealer Locator | Ariat" of the page
    When  I click the Outside the Us link from the store list
    Then  I verify that title "Store Locator - Outside The US | Ariat" of the page
    And   I verify the Stores details are displayed in the page
    And   I verify the ariat email Id is displayed in the page
    And   I verify the  "<Country>" names are displayed in Outside The US Page
    And   I verify the  "<Phone No>" are displayed in the page
    And   I verify the  "<Email Id>" are displayed in Outside The US Page
    Examples:
      | Country                   | Phone No            | Email Id                 |
      | Australia and New Zealand | +617 3711 8000      | sales@justcountry.com.au |
      | Canada                    | 510-477-7000        | info@ariat.com           |
      | Europe                    | +44 (0) 1367 242818 | info@ariat-europe.com    |
      | South America, Asia       | 510-477-7000        | info@ariat.com           |


  @AuthorizedRetailer_05
  Scenario: Validation of the Authorized Retailer with the valid Zipcode
    When  I click the Authorised Retailer button from the Header
    And   I click the stores link from the store list
    Then  I verify that title "Ariat Store Locations - Dealer Locator | Ariat" of the page
    And   I verify the zipcode input box, Radius drop-down, Search button are displayed in the page
    Then  I verify the Filter Results By Checkbox are displayed in the page
      | All     |
      | English |
      | Work    |
      | Western |
      | Fashion |
      | Outdoor |

  @AuthorizedRetailer_06
  Scenario Outline: Validation of the Authorized Retailer with the valid Zipcode
    When  I click the Authorised Retailer button from the Header
    And   I click the stores link from the store list
    When  I enter the zipcode "<zipcode>" in the zipcode input box
    And   I select any "<radius>" from the Radius dropdown
    And   I click the Search button in the Store Page
    Then   I verify the Checkbox All is selected by default
    Then  I verify the stores list are displayed in the page
    When   I select "<filter>" in the check box from the Filter Results
    And   I select "<moreThanOne>" in the check box from the Filter Results
    Then  I verify the stores list are displayed in the page
    Examples:
      | zipcode | radius    | filter  | moreThanOne |
      | 99524   | 5 miles   | Western | Fashion     |
      | 41701   | 15 miles  | English | Work        |
      | 72217   | 30 miles  | Fashion | Outdoor     |
      | 85001   | 100 miles | Outdoor | Work        |

  @AuthorizedRetailer_07
  Scenario Outline: Validation of the invalid Format Zipcode Error Message
    When  I click the Authorised Retailer button from the Header
    And  I click the stores link from the store list
    When  I enter the zipcode "<zipcode>" in the zipcode input box
    And   I click the Search button in the Store Page
    Then  I verify the "<errorMessage>" under the zipcode textbox is displayed in the page
    Examples:
      | zipcode | errorMessage                     |
      |         | The format of the zip is invalid |
      | 1000    | The format of the zip is invalid |
      | 000     | The format of the zip is invalid |
      | tfghd   | The format of the zip is invalid |
      | 21      | The format of the zip is invalid |
      | 1       | The format of the zip is invalid |
      | #$%g    | The format of the zip is invalid |
      | 2314    | The format of the zip is invalid |
      | 2345678 | The format of the zip is invalid |

  @AuthorizedRetailer_08
  Scenario Outline: Validation of the Invalid Zipcode Error Message
    When  I click the Authorised Retailer button from the Header
    And  I click the stores link from the store list
    When  I enter the zipcode "<zipcode>" in the zipcode input box
    And   I click the Search button in the Store Page
    Then  I verify the invalidZipcode "<invalidZipcodeErrorMessage>" errorMessage
    Examples:
      | zipcode | invalidZipcodeErrorMessage                            |
      | 76545   | We're sorry, we couldn't find results for your search |
      | 34567   | We're sorry, we couldn't find results for your search |
      | 65432   | We're sorry, we couldn't find results for your search |
      | 00000   | We're sorry, we couldn't find results for your search |
      | 99999   | We're sorry, we couldn't find results for your search |
