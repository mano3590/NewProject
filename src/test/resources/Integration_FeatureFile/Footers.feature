Feature: Validation of the Ariat Footer

  @TC_Footer_01
  Scenario: Validation of the Join Our Family and logo's presented in Ariat Footer
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    And  I verify that "Join our family!" text displayed in the Ariat Footer
    And  I verify that email text box displayed on the page
    And  I verify that Subscribe button displayed on the page
    And  I verify able to click the Facebook, twitter, pinterest and Instagram links on the page
    When I click the Facebook link on the page
    Then I verify that title "Ariat - Home | Facebook" of the page
    When I click the twitter link on the page
    Then I verify that title "Ariat International (@Ariat) / Twitter" of the page
    When I click the pinterest link on the page
    Then I verify that title "Ariat (ariatintl) on Pinterest" of the page
    When I click the Instagram link on the page
    Then I verify that title "Ariat International, Inc. (@ariatinternational) • Instagram photos and videos" of the page
    And  I verify the Partnerships logos are displayed on the page

  @TC_Footer_02
  Scenario: Negative validation of the Join Our Family Email text box in Ariat Footer
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    And  I verify the error message "The Email is invalid" is displayed below in the email field by entering the below listed invalid email into the email field
      | test123        |
      | photontest123  |
      | test@123       |
      | photon@testcom |
      | @#$%6&7.com    |

  @TC_Footer_03
  Scenario: Validation of the Footer submenus displayed on the page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    And  I verify able to click the below listed Footer submenus and verify the appropriate page Url
      | FAQs                                 | https://www.ariat.com/faq.html                                                      |
      | Afterpay FAQs                        | https://www.ariat.com/afterpay-faq.html                                             |
      | Shipping                             | https://www.ariat.com/shipping.html                                                 |
      | Order Status                         | https://www.ariat.com/on/demandware.store/Sites-Ariat-Site/en_US/Login-Show?rurl=1  |
      | Returns                              | https://www.ariat.com/returns.html                                                  |
      | Product Registration                 | https://www.ariat.com/register-product                                              |
      | Gift Cards                           | https://www.ariat.com/on/demandware.store/Sites-Ariat-Site/en_US/Giftcards-Purchase |
      | Size Charts                          | https://www.ariat.com/size-charts.html                                              |
      | Shop By Country                      |                                                                                     |
      | Shop By Style                        | https://www.ariat.com/shop-by-style.html                                            |
      | Find a Retailer                      | https://www.ariat.com/retailers                                                     |
      | Brand Shop                           | https://www.ariat.com/ariat-shops.html                                              |
      | International                        | https://www.ariat.com/international.html                                            |
      | Contact Us                           | https://ariat.service-now.com/acp?id=csp_registration                               |
      | Accessibility                        | https://www.ariat.com/accessibility.html                                            |
      | About Us                             | https://www.ariat.com/about-us                                                      |
      | Careers                              | https://www.ariat.com/careers                                                       |
      | Sustainability                       | https://www.ariat.com/sustainability                                                |
      | Press Room                           | https://www.ariat.com/press-room                                                    |
      | Giving                               | https://www.ariat.com/giving                                                        |
      | Privacy Policy                       | https://www.ariat.com/privacy-policy.html                                           |
      | CA Transparency in Supply Chains Act | https://www.ariat.com/california-notice.html                                        |
      | CTPAT Notice                         | https://www.ariat.com/ctpat.html                                                    |
      | Do not sell my information           | https://privacyportal.onetrust.com/                                                 |
      | My Accounts                          | https://www.ariat.com/on/demandware.store/Sites-Ariat-Site/en_US/Login-Show?rurl=1  |
      | Email Sign up                        | https://www.ariat.com/email-signup                                                  |
      | Wish List                            | https://www.ariat.com/wishlist                                                      |
      | Work                                 | https://www.ariat.com/work                                                          |


  @TC_Footer_04
  Scenario: Validating the Order Status and My Accounts Footer submenus after login the Ariat website
    Given I am on Ariat Website Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "ariatphotontest@gmail.com", "password"
    Then I verify the Header "My Account" of the page
    When I click order Status submenu in Footer
    Then I verify the Header "My Orders" of the page
    When I click My Account submenu in Footer
    Then I verify the Header "My Account" of the page
    And  I verify that Copyrights text displayed on the page


  @TC_Footer_05
  Scenario: Validating the Email Sign up in Footer submenu
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    And  I verify that Email Sign up submenu link displayed in the Footer
    When I click the Email Sign up submenu link
    Then I verify the url "https://www.ariat.com/email-signup" of the page
    And  I verify email text box, Sign up button and privacy policy link are displayed on the page
    When I click the Privacy Policy Link on the page
    Then I verify that privacy policy page screen displayed
    When I click the close on the privacy policy page screen
    And  I verify the Email Signup field error message "The Email is invalid" is displayed below in the Join our family email field by entering the below listed invalid email Id into the email field
      | test123        |
      | photontest123  |
      | test@123       |
      | photon@testcom |
      | @#$%6&7.com    |
    When I enter the valid Email Id "Photontest@gmail.com" into the Email field
    And  I click the Sign Up button
    Then I verify that Thank You Success Popup screen displayed on the page
    When I click the close button on the Screen








