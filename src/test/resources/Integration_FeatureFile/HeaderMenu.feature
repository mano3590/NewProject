@Fullsuite
@TC_HeaderMenu
Feature: Ariat Header Menu Validation

  @TC_HeaderMenu_01
  Scenario:Validating the Header Menu In Ariat HomePage

    Given I am on Ariat Home page
    Then I verify Header Menus are displayed in the Homepage and navigate to appropriate page
      | Men          |
      | Women        |
      | Kids         |
      | Clearance    |
      | New Arrivals |
      | Best Sellers |

  @TC_HeaderMenu_02
  Scenario: verify user able to navigate appropriate pages on clicking the links in Men sub menu section

    Given I am on Ariat Home page
    Then I verify user able to navigate appropriate pages on clicking the links in "Men" sub menu section
      | Western                  | ARIAT/MEN/WESTERN                                         |
      | Work                     | ARIAT/MEN/WORK/WORK                                       |
      | English                  | ARIAT/MEN/ENGLISH                                         |
      | Outdoor                  | ARIAT/MEN/OUTDOOR                                         |
      | Lifestyle                | ARIAT/MEN/LIFESTYLE                                       |

      | Footwear                 | ARIAT/MEN/FOOTWEAR                                        |
      | Western                  | ARIAT/MEN/FOOTWEAR/WESTERN                                |
      | Work                     | ARIAT/MEN/WORK/FOOTWEAR                                   |
      | English                  | ARIAT/MEN/FOOTWEAR/ENGLISH                                |
      | Outdoor                  | ARIAT/MEN/FOOTWEAR/OUTDOOR                                |
      | Lifestyle                | ARIAT/MEN/FOOTWEAR/LIFESTYLE                              |
      | Casual Shoes             | ARIAT/MEN/FOOTWEAR/CASUAL SHOES                           |

      | Clothing                 | ARIAT/MEN/CLOTHING                                        |
      | Denim                    | ARIAT/MEN/CLOTHING/DENIM                                  |
      | Pants & Shorts           | ARIAT/MEN/CLOTHING/PANTS & SHORTS                         |
      | Polos & T-Shirts         | ARIAT/MEN/CLOTHING/POLOS & T-SHIRTS                       |
      | Woven Shirts             | ARIAT/MEN/CLOTHING/WOVEN SHIRTS                           |
      | Sweatshirts & Hoodies    | ARIAT/MEN/CLOTHING/SWEATSHIRTS & HOODIES                  |
      | Jackets & Vests          | ARIAT/MEN/CLOTHING/JACKETS & VESTS                        |
      | English Riding           | ARIAT/MEN/CLOTHING/ENGLISH RIDING                         |
      | FR Clothing              | ARIAT/MEN/CLOTHING/FR CLOTHING                            |
      | Work Midlayers           | ARIAT/MEN/CLOTHING/WORK MIDLAYERS                         |

      | Accessories              | ARIAT/MEN/ACCESSORIES                                     |
      | Hats & Caps              | ARIAT/MEN/ACCESSORIES/HATS & CAPS                         |
      | Belts                    | ARIAT/MEN/ACCESSORIES/BELTS                               |
      | Bags                     | ARIAT/MEN/ACCESSORIES/BAGS                                |
      | Socks                    | ARIAT/MEN/ACCESSORIES/SOCKS                               |
      | Gloves                   | ARIAT/MEN/ACCESSORIES/GLOVES                              |
      | Footwear Accessories     | ARIAT/MEN/ACCESSORIES/FOOTWEAR ACCESSORIES                |
      | Dog Accessories          | ARIAT/MEN/ACCESSORIES/DOG ACCESSORIES                     |
      | Masks                    | ARIAT/MEN/ACCESSORIES/MASKS                               |

      | Featured                 | ARIAT/MEN/FEATURED                                        |
      | Relentless Collection    | ARIAT/MEN/FEATURED/RELENTLESS COLLECTION                  |
      | Rebar Workwear           | ARIAT/MEN/FEATURED/REBAR WORKWEAR                         |
      | FR Workwear              | ARIAT/MEN/WORK/MEN'S WORK APPAREL: REBAR & FR/FR WORKWEAR |
      | Extended Sizes: Footwear | ARIAT/MEN/FEATURED/EXTENDED SIZES: FOOTWEAR               |
      | Men's Legacy Denim       | ARIAT/MEN/FEATURED/MEN'S LEGACY DENIM                     |

  @TC_HeaderMenu_03
  Scenario:verify user able to navigate appropriate pages on clicking the links in Women sub menu section

    Given I am on Ariat Home page
    Then I verify user able to navigate appropriate pages on clicking the links in "Women" sub menu section
      | Western                          | ARIAT/WOMEN/WESTERN                                   |
      | Work                             | ARIAT/WOMEN/WORK                                      |
      | English                          | ARIAT/WOMEN/ENGLISH/ENGLISH NEW ARRIVALS              |
      | Outdoor                          | ARIAT/WOMEN/OUTDOOR                                   |
      | Lifestyle                        | ARIAT/WOMEN/LIFESTYLE                                 |

      | Footwear                         | ARIAT/WOMEN/FOOTWEAR                                  |
      | Western                          | ARIAT/WOMEN/FOOTWEAR/WESTERN                          |
      | English                          | ARIAT/WOMEN/FOOTWEAR/ENGLISH                          |
      | Lifestyle                        | ARIAT/WOMEN/FOOTWEAR/LIFESTYLE                        |
      | Work                             | ARIAT/WOMEN/FOOTWEAR/WORK                             |
      | Outdoor                          | ARIAT/WOMEN/FOOTWEAR/OUTDOOR                          |
      | Casual Shoes                     | ARIAT/WOMEN/FOOTWEAR/CASUAL SHOES                     |

      | Clothing                         | ARIAT/WOMEN/CLOTHING                                  |
      | English Riding                   | ARIAT/WOMEN/CLOTHING/ENGLISH RIDING                   |
      | Denim                            | ARIAT/WOMEN/CLOTHING/DENIM                            |
      | Pants & Shorts                   | ARIAT/WOMEN/CLOTHING/PANTS & SHORTS                   |
      | Tops & Tees                      | ARIAT/WOMEN/CLOTHING/TOPS & TEES                      |
      | Dresses & Skirts                 | ARIAT/WOMEN/CLOTHING/DRESSES & SKIRTS                 |
      | Sweatshirts & Sweaters           | ARIAT/WOMEN/CLOTHING/SWEATSHIRTS & SWEATERS           |
      | Jackets & Vests                  | ARIAT/WOMEN/CLOTHING/JACKETS & VESTS                  |
      | FR Clothing                      | ARIAT/WOMEN/CLOTHING/FR CLOTHING                      |

      | Accessories                      | ARIAT/WOMEN/ACCESSORIES                               |
      | Hats & Caps                      | ARIAT/WOMEN/ACCESSORIES/HATS & CAPS                   |
      | Belts                            | ARIAT/WOMEN/ACCESSORIES/BELTS                         |
      | Bags                             | ARIAT/WOMEN/ACCESSORIES/BAGS                          |
      | Socks                            | ARIAT/WOMEN/ACCESSORIES/SOCKS                         |
      | Scarves & Wraps                  | ARIAT/WOMEN/ACCESSORIES/SCARVES & WRAPS               |
      | Footwear Accessories             | ARIAT/WOMEN/ACCESSORIES/FOOTWEAR ACCESSORIES          |
      | Dog Accessories                  | ARIAT/WOMEN/ACCESSORIES/DOG ACCESSORIES               |
      | Masks                            | ARIAT/WOMEN/ACCESSORIES/MASKS                         |

      | Featured                         | ARIAT/WOMEN/FEATURED                                  |
      | Plus Sizes: REAL Denim & Apparel | ARIAT/WOMEN/FEATURED/PLUS SIZES: REAL DENIM & APPAREL |
      | Wedding Boots                    | ARIAT/WOMEN/WESTERN/BOOTS/WEDDING BOOTS               |
      | Extended Sizes: Footwear         | ARIAT/WOMEN/FEATURED/EXTENDED SIZES: FOOTWEAR         |
      | Rebar Workwear                   | ARIAT/WOMEN/FEATURED/REBAR WORKWEAR                   |


  @TC_HeaderMenu_04
  Scenario:verify user able to navigate appropriate pages on clicking the links in Kids sub menu section

    Given I am on Ariat Home page
    Then I verify user able to navigate appropriate pages on clicking the links in "Kids" sub menu section
      | Western                | ARIAT/KIDS/WESTERN                         |
      | English                | ARIAT/KIDS/ENGLISH                         |

      | Footwear               | ARIAT/KIDS/FOOTWEAR                        |
      | Western                | ARIAT/KIDS/FOOTWEAR/WESTERN                |
      | English                | ARIAT/KIDS/FOOTWEAR/ENGLISH                |
      | Casual Shoes           | ARIAT/KIDS/FOOTWEAR/CASUAL SHOES           |

      | Clothing               | ARIAT/KIDS/CLOTHING                        |
      | English Riding         | ARIAT/KIDS/CLOTHING/ENGLISH RIDING         |
      | Jackets & Vests        | ARIAT/KIDS/CLOTHING/JACKETS & VESTS        |
      | Denim                  | ARIAT/KIDS/CLOTHING/DENIM                  |
      | Polos & T-Shirts       | ARIAT/KIDS/CLOTHING/POLOS & T-SHIRTS       |
      | Sweatshirts & Hoodies  | ARIAT/KIDS/CLOTHING/SWEATSHIRTS & HOODIES  |
      | Woven Shirts           | ARIAT/KIDS/CLOTHING/WOVEN SHIRTS           |

      | Accessories            | ARIAT/KIDS/ACCESSORIES                     |
      | Belts                  | ARIAT/KIDS/ACCESSORIES/BELTS               |

      | Featured               | ARIAT/KIDS/FEATURED                        |
      | Infant                 | ARIAT/KIDS/FEATURED/INFANT                 |
      | Toddler                | ARIAT/KIDS/FEATURED/TODDLER                |
      | Wiggle Room Technology | ARIAT/KIDS/FEATURED/WIGGLE ROOM TECHNOLOGY |

  @TC_HeaderMenu_05
  Scenario:verify user able to navigate appropriate pages on clicking the links in Clearance sub menu section

    Given I am on Ariat Home page
    Then I verify user able to navigate appropriate pages on clicking the links in "Clearance" sub menu section
      | Men         | ARIAT/CLEARANCE/MEN            |
      | Clothing    | ARIAT/CLEARANCE/MEN/CLOTHING   |
      | Footwear    | ARIAT/CLEARANCE/MEN/FOOTWEAR   |
      | Women       | ARIAT/CLEARANCE/WOMEN          |
      | Clothing    | ARIAT/CLEARANCE/WOMEN/CLOTHING |
      | Footwear    | ARIAT/CLEARANCE/WOMEN/FOOTWEAR |
      | Kids        | ARIAT/CLEARANCE/KIDS           |
      | Clothing    | ARIAT/CLEARANCE/KIDS/CLOTHING  |
      | Footwear    | ARIAT/CLEARANCE/KIDS/FOOTWEAR  |
      | Accessories | ARIAT/CLEARANCE/ACCESSORIES    |

  @TC_HeaderMenu_06
  Scenario:verify user able to navigate appropriate pages on clicking the links in New Arrivals sub menu section

    Given I am on Ariat Home page
    Then I verify user able to navigate appropriate pages on clicking the links in "New Arrivals" sub menu section
      | Men      | ARIAT/NEW ARRIVALS/MEN            |
      | Clothing | ARIAT/NEW ARRIVALS/MEN/CLOTHING   |
      | Footwear | ARIAT/NEW ARRIVALS/MEN/FOOTWEAR   |
      | Women    | ARIAT/NEW ARRIVALS/WOMEN          |
      | Clothing | ARIAT/NEW ARRIVALS/WOMEN/CLOTHING |
      | Footwear | ARIAT/NEW ARRIVALS/WOMEN/FOOTWEAR |

  @TC_HeaderMenu_07
  Scenario:verify user able to navigate appropriate pages on clicking the links in Best Sellers sub menu section

    Given I am on Ariat Home page
    Then I verify user able to navigate appropriate pages on clicking the links in "Best Sellers" sub menu section

      | Men      | ARIAT/BEST SELLERS/MEN            |
      | Clothing | ARIAT/BEST SELLERS/MEN/CLOTHING   |
      | Footwear | ARIAT/BEST SELLERS/MEN/FOOTWEAR   |
      | Women    | ARIAT/BEST SELLERS/WOMEN          |
      | Clothing | ARIAT/BEST SELLERS/WOMEN/CLOTHING |
      | Footwear | ARIAT/BEST SELLERS/WOMEN/FOOTWEAR |
