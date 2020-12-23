package com.ariat.steps;

import com.ariat.pages.HeaderPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;

public class HeaderStepDefinition extends HeaderPage {

    @Given("^I am on Ariat Home page$")
    public void iAmOnAriatHomePage() {

        logger.info("Ariat Home Page is displayed ----" + isAriatInternationalLogoDisplayed());
        Assert.assertTrue(isAriatInternationalLogoDisplayed());
        acceptCookie();
    }

    @Given("^I am on Ariat Website Home page$")
    public void iAmOnAriatWebsiteHomePage() {

        logger.info("Ariat Home Page is displayed ----" + isAriatInternationalLogoDisplayed());
        Assert.assertTrue(isAriatInternationalLogoDisplayed());
        acceptCookie();
    }

    @Then("^I verify that title \"([^\"]*)\" of the page$")
    public void iVerifyThatTitleOfThePage(String title)  {

        Assert.assertTrue(isVerifyTitleOfPage(title));
    }

    @When("^I click sign in button in Header section$")
    public void iClickSignInButtonInHeaderSection() {

        clickSignInButton();
    }

    @When("^I click \"([^\"]*)\" link on Home page$")
    public void iClickLinkOnHomePage(String site) {

        selectSite(site);
    }

    @And("^I click View Cart icon from header section$")
    public void iClickViewCartIconFromHeaderSection() {

        clickViewCartIcon();
    }

    @And("^I click mini Cart icon from header section$")
    public void iClickminiCartIconFromHeaderSection() {

        clickViewCartIcon();
    }

    @When("^I select any values from \"([^\"]*)\" \"([^\"]*)\"$")
    public void iSelectAnyValuesFrom(String subMenu, String productItem)  {

        clickSubMenuItemBySection(subMenu, productItem);
    }

    @When("^I click Search Link in the Header section$")
    public void i_click_Search_Link_in_the_Header_section()  {
        clickSearchButton();
    }

    @When("^I enter product \"([^\"]*)\" in the Search field$")
    public void i_enter_product_in_the_Search_field(String Search)  {

        enterProductSearch(Search);
    }

    @When("^I select FR Workwear under \"([^\"]*)\" Header Menu$")
    public void i_select_FR_Workwear_under_Header_Menu(String Menu)  {

        clickSubMenuFRWorkWear(Menu);
    }

    @When("^I select the link from \"([^\"]*)\" \"([^\"]*)\" from the header Menu$")
    public void i_select_the_link_from_from_the_header_Menu(String subMenu, String productItem)  {

        clickSubMenuItemBySection(subMenu, productItem);
    }

    @Then("^I verify the header \"([^\"]*)\" is displayed$")
    public void i_verify_the_header_is_displayed(String title)  {

        Assert.assertTrue(isVerifyTitleOfPage(title));
    }

    @Then("^I verify the Product is added in the Wishlist$")
    public void i_verify_the_Product_is_added_in_the_Wishlist()  {

        clickWishlistLink();
    }
    @Then("^I click the My Bag from the Header$")
    public void i_click_the_My_Bag_from_the_Header()  {

        clickMyBagIcon();
    }

    @When("^I click Denim Fit Guide submenu under \"([^\"]*)\" Header Menu$")
    public void i_click_Denim_Fit_Guide_submenu_under_Header_Menu(String Menu)  {

        clickSubMenuDenimFitGuide(Menu);
    }

    @Then("^I verify whether the country selection drop-down is displayed in the website$")
    public void i_verify_whether_the_country_selection_drop_down_is_displayed_in_the_website()  {

        Assert.assertTrue(isCountrySelectorDisplayed());
    }

    @When("^I clicks the country selection drop-down$")
    public void i_clicks_the_country_selection_drop_down()  {

        clickCountrySelectorDropDown();
    }

    @And("^I clicks the close button on country selection pop-up screen$")
    public void I_clicks_the_close_button_on_country_selection_popup_screen()  {

        clickCountrySelectorCloseBtn();
    }

    @Then("^I verify country selection pop-up is displayed$")
    public void i_verify_country_selection_pop_up_is_displayed()  {
        Assert.assertTrue(isCountrySelectorPopupDisplayed());
    }

    @When("^I clicks and select \"([^\"]*)\" country from the list$")
    public void i_clicks_and_select_country_from_the_list(String Country)  {

        selectCountry(Country);
    }

    @Then("^I verify the \"([^\"]*)\" is displayed as per the selection$")
    public void i_verify_the_currency_is_displayed_as_per_the_selection(String Currrency)  {

        Assert.assertTrue(isCountryCurrencyDisplayed(Currrency));
    }

    @Then("^I verify the SAVE & CONTINUE Button is displayed$")
    public void i_verify_the_SAVE_CONTINUE_Button_is_displayed()  {

        Assert.assertTrue(isSaveAndContinueBtnDisplayed());
    }

    @When("^I clicks the SAVE & CONTINUE Button$")
    public void i_clicks_the_SAVE_CONTINUE_Button() {

        clickSaveAndContinueBtn();
    }

    @Then("^I verify the Country \"([^\"]*)\" as per the selection$")
    public void i_verify_the_Country_url_as_per_the_selection(String Url)  {

        Assert.assertTrue(isSelectedCountryUrlDisplayed(Url));
    }

    @When("^I clicks the Learn more about International Orders link on Country Selector Popup Screen$")
    public void IclickstheLearnmoreaboutInternationalOrderslinkonCountrySelectorPopupScreen()  {

        clickLearnMoreLink();
    }

    @Then("^I verify whether it is navigating to \"([^\"]*)\" page$")
    public void i_verify_whether_it_is_navigating_to_FAQs_page(String title)  {

        Assert.assertTrue(isVerifyTitleOfPage(title));
    }

    @Given("^I verify About us link is displayed in the Header$")
    public void i_verify_About_us_link_is_displayed_in_the_Header()  {

        Assert.assertTrue(isAboutUsDisplayed());
    }

    @When("^I clicks the About us link$")
    public void i_clicks_the_About_us_link()  {

        clickAboutUsBtn();
    }

    @Then("^I verify Header Menus are displayed in the Homepage and navigate to appropriate page$")
    public void i_verify_Header_Menus_are_displayed_in_the_Homepage_and_navigate_to_appropriate_page(List<String> HeaderMenu)  {

        Assert.assertTrue(isHeaderMenuDisplayed(HeaderMenu));
    }

    @When("^I place the cursor on the Header Menu \"([^\"]*)\" in the home page$")
    public void i_place_the_cursor_on_the_Header_Menu_in_the_home_page(String Menu) {

        mouseOverSubMenu(Menu);
    }

    @Then("^I verify user able to navigate appropriate pages on clicking the links in \"([^\"]*)\" sub menu section$")
    public void iVerifyUserAbleToNavigateAppropriatePagesOnClickingTheLinksInSubMenuSection(String subMenu, DataTable dataTable) {

        Assert.assertTrue(isVerifySubMenuItem(dataTable, subMenu));
    }

    @Then("^I verify the Header Section is displayed$")
    public void i_verify_the_Header_Section_is_displayed()  {

        Assert.assertTrue(isHeaderSectionDisplayed());
    }

    @Then("^I verify the Free Shipping label and Details link are present$")
    public void i_verify_the_Free_Shipping_label_and_Details_link_are_present()  {

        Assert.assertTrue(isReturnAndFreeShippingDisplayed());
    }

    @When("^I click the Details link in Free shipping and return from the header$")
    public void i_click_the_Details_link_in_Free_shipping_and_return_from_the_header()  {

        clickDetailsLinkInFreeShipping();
    }

    @When("^I click the Country Selector button from the header$")
    public void i_click_the_Country_Selector_button_from_the_header()  {

        clickDropDownInCountrySelector();
    }

    @Then("^I verify the country selector popup is displayed$")
    public void i_verify_the_country_selector_popup_is_displayed()  {

        Assert.assertTrue(isCountrySelectorPopupOpened());
    }

    @Then("^I click the close button in the CountrySelector popup$")
    public void i_click_the_close_button_in_the_CountrySelector_popup()  {

        clickCountrySelectorPopUpCloseButton();
    }

    @When("^I click the AboutUs button from the Header$")
    public void i_click_the_AboutUs_button_from_the_Header()  {

        clickAboutUsButton();
    }

    @When("^I click the Authorised Retailer button from the Header$")
    public void i_click_the_Authorised_Retailer_button_from_the_Header() {

        clickAuthorizedRetailerButton();
    }

    @Then("^I verify the search bar is open$")
    public void i_verify_the_search_bar_is_open() {

        Assert.assertTrue(isSearchBarDisplayed());
        clickCloseButtonInSearch();
    }

    @When("^I click the Account Info from the user Profile in the header$")
    public void i_click_the_Account_Info_from_the_user_Profile_in_the_header() {


        clickMyAccountInUserProfile();
    }


    @Then("^I verify the SEARCH link is displayed in the page$")
    public void i_verify_the_SEARCH_link_is_displayed_in_the_page()  {
        Assert.assertTrue(isSearchLinkDisplayed());
    }


    @Then("^I verify search field is displayed in the page$")
    public void i_verify_search_field_is_displayed_in_the_page()  {

        Assert.assertTrue(isSearchBarDisplayed());
    }

    @Then("^I verify close button is displayed in the page$")
    public void i_verify_close_button_is_displayed_in_the_page()  {

        Assert.assertTrue(isSearchCloseBtnDisplayed());
    }

    @When("^I enters any \"([^\"]*)\" in the search field$")
    public void i_enters_any_in_the_search_field(String productname)  {

        enterProductNameInSearch(productname);
    }

    @Then("^I verify the \"([^\"]*)\" text is displayed in the page$")
    public void i_verify_the_text_is_displayed_in_the_page(String productresulttext)  {

        Assert.assertTrue(verifyProductResultsTextDisplayed(productresulttext));
    }

    @Then("^I verify the SEE ALL PRODUCTS link is displayed in the page$")
    public void i_verify_the_SEE_ALL_PRODUCTS_link_is_displayed_in_the_page()  {

        Assert.assertTrue(isVerifySeeAllProductsDisplayed());
    }

    @Then("^I verify the Categories text is displayed in the page$")
    public void i_verify_the_Categories_text_is_displayed_in_the_page()  {

        Assert.assertTrue(isVerifyCategoriesTextDisplayed());
    }

    @Then("^I verify the search suggestions categories list are displayed$")
    public void i_verify_the_search_suggestions_categories_list_are_displayed()  {
        Assert.assertTrue(isVerifyCategoriesListDsiplayed());
    }

    @Then("^I verify the Search Suggested product List in the page$")
    public void i_verify_the_Search_Suggested_product_List_in_the_page()  {
        Assert.assertTrue(isVerifyProductListDisplayed());
    }

    @When("^I click the Search Close Button$")
    public void i_click_the_Search_Close_Button()  {

        clickCloseButtonInSearch();
    }


    @And("^I verify the Search Suggested product List contains Product Name and price$")
    public void iVerifyTheSearchSuggestedProductListContainsProductNameAndPrice() {
        Assert.assertTrue(isVerifySearchProductNameDisplayed());
        Assert.assertTrue(isVerifySearchProductPriceDisplayed());

    }

    @And("^I enters invalid \"([^\"]*)\" in the search filed$")
    public void iEntersInvalidInTheSearchFiled(String keywords) {

        enterProductSearch(keywords);
    }

    @Then("^I verify whether it is displayed error message \"([^\"]*)\"$")
    public void iVerifyWhetherItIsDisplayedErrorMessage(String errormsg) {

        Assert.assertTrue(isErrorMsgDisplayed(errormsg));
    }

    @And("^I click any one of the product from the Categories list$")
    public void iClickAnyOneOfTheProductFromTheCategoriesList() {
        clickRandomProductLinkFromCategoriesList();


    }

    @And("^I enters any \"([^\"]*)\" in the search field and press Enter Key$")
    public void iEntersAnyInTheSearchFieldAndPressEnterKey(String searchkeyword){

        enterProductNameInSearchAndPressEnter(searchkeyword);

    }

    @When("^I select \"([^\"]*)\" menu and click all submenu under the \"([^\"]*)\"$")
    public void iSelectMenuAndClickAllSubmenuUnderThe(String menu, String submenu) {

        Assert.assertTrue(clickVerifySubMenuItemsAndProdutCategories(menu,submenu));

    }

    @When("^I click the the SEE ALL PRODUCTS link is displayed in the page$")
    public void iClickTheTheSEEALLPRODUCTSLinkIsDisplayedInThePage() {

        clickSeeAllProductsDisplayed();
    }

    @When("^I select \"([^\"]*)\" from the header Menu$")
    public void iSelectFromTheHeaderMenu(String menu)  {
        selectMenuMen(menu);

    }
}
