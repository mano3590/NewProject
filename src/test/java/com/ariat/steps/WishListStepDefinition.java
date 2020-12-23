package com.ariat.steps;

import com.ariat.pages.WishListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class WishListStepDefinition extends WishListPage {

    @Then("^I verify that product is added on Wishlist page$")
    public void i_verify_that_product_is_added_on_Wishlist_page()  {

        Assert.assertTrue(isAddedWishlistProductDisplayed());

    }

    @Then("^I verify that Price and Total Price of the product on Wishlist page$")
    public void i_verify_that_Price_and_Total_Price_of_the_product_on_Wishlist_page()  {
        Assert.assertTrue(isSelectedWishlistPriceDisplayed()) ;
    }

    @Then("^I verify that selected product Name and Price are displayed in the wishlist page$")
    public void i_verify_that_selected_product_Name_and_Price_are_displayed_in_the_wishlist_page()  {
        Assert.assertTrue(isAddedProductNameDisplayedInWishListPage());
        Assert.assertTrue(isSelectedPriceDisplayedInWishListPage());
    }

    @When("^I increase the \"([^\"]*)\" of the product on Wishlist page$")
    public void i_increase_the_Quantity_of_the_product_on_Wishlist_page(String Quantity)  {
        selectQuantity(Quantity);
    }

    @And("^I click Add To Bag on WishList Page$")
    public void iClickAddToBagOnWishListPage() {
        clickAddToBag();

    }

    @When("^I click the create account link in the wishlist page$")
    public void i_click_the_create_account_link_in_the_wishlist_page(){

        clickCreateAccountlink();
    }

    @When("^I enters values in create account user forms$")
    public void i_enters_values_in_create_account_user_forms(List<String> userformdata){

        enterDatasInCreateAccountForms(userformdata);
    }


    @Then("^I verify the User Name displayed in the Wishlist page$")
    public void i_verify_the_User_Name_displayed_in_the_Wishlist_page()  {

        Assert.assertTrue(isVerifyUsernameDisplayed());

    }

    @Then("^I verify the \"([^\"]*)\" Wishlist empty text is displayed on the Wishlist Page$")
    public void i_verify_the_Wishlist_empty_text_is_displayed_on_the_Wishlist_Page(String text)  {

        Assert.assertTrue(isVerifyWishlistEmptyTextDisplayed(text));
    }

    @Then("^I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page$")
    public void i_verify_the_Start_Shopping_and_Adding_Items_Button_is_displayed_in_the_Wishlist_page()  {

        Assert.assertTrue(isVerifyStartShoppingandAddingItemsBtnDisplayed());
    }

    @Then("^I verify the Back to My Account link is displayed in the Wishlist page$")
    public void i_verify_the_Back_to_My_Account_link_is_displayed_in_the_Wishlist_page()  {

        Assert.assertTrue(isVerifyBackToMyAccountLinkDisplayed());
    }

    @When("^I click the Back to My Account link in the Wishlist page$")
    public void i_click_the_Back_to_My_Account_link_in_the_Wishlist_page()  {

        clickBackToMyAccountlnk();
    }

    @Then("^I click the Start Shopping and Adding Items Button in the Wishlist page$")
    public void i_click_the_Start_Shopping_and_Adding_Items_Button_in_the_Wishlist_page()  {

        clickStartShoppingandAddingItemsBtn();
    }

    @And("^I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page$")
    public void iVerifyThatSelectedProductNameWidthColorSizePriceanddateAreDisplayedInTheWishlistPage() {
        Assert.assertTrue(isAddedProductNameDisplayedInWishListPage());
        Assert.assertTrue(isSelectedProductWidthDisplayed());
        Assert.assertTrue(isSelectedProductSizeDisplayed());
        Assert.assertTrue(isSelectedProductColorDisplayed());
        Assert.assertTrue(isSelectedProductQtyDisplayed());
        Assert.assertTrue(isSelectedProductStockDisplayed());
        Assert.assertTrue(isSelectedPriceDisplayedInWishListPage());
        Assert.assertTrue(isDateDisplayed());

    }

    @And("^I verify that selected QuickView product Width, color, size, Price are displayed in the wishlist page$")
    public void iVerifyThatSelectedQuickViewProductWidthColorSizePriceAreDisplayedInTheWishlistPage() {
        Assert.assertTrue(isSelectedProductWidthDisplayed());
        Assert.assertTrue(isSelectedProductSizeDisplayed());
        Assert.assertTrue(isSelectedProductColorDisplayed());
        Assert.assertTrue(isSelectedProductStockDisplayed());
        Assert.assertTrue(isSelectedPriceDisplayedInWishListPage());
    }

    @And("^I verify that selected QuickView product color displayed in the wishlist page$")
    public void iVerifyThatSelectedQuickViewproductColorDisplayedInTheWishlistPage() {

        Assert.assertTrue(isSelectedProductColorDisplayed());
    }

    @And("^I verify that selected QuickView product Size displayed in the wishlist page$")
    public void iVerifyThatSelectedQuickViewproductSizeDisplayedInTheWishlistPage() {

        Assert.assertTrue(isSelectedProductSizeDisplayed());
    }

    @And("^I verify EDIT and REMOVE Link is displayed$")
    public void iVerifyEDITAndREMOVELinkIsDisplayed() {

        Assert.assertTrue(isEditLinkDisplayed());
        Assert.assertTrue(isRemoveLinkDisplayed());

    }

    @When("^I click the Edit link in the wishlist page$")
    public void iClickTheEditLinkInTheWishlistPage() {
        
        
        clicEditLinkInWishlist();
    }

    @Then("^I verify Product Popup screen is displayed$")
    public void iVerifyProductPopupScreenIsDisplayed() {

        Assert.assertTrue(verifyQuickViewScreenDisplayed());
    }

    @And("^I verify share through Email logo is displayed on the page$")
    public void iVerifyShareThroughEmailLogoIsDisplayedOnThePage() {

        Assert.assertTrue(isShareIconDisplayed());

    }

    @And("^I verify Quantity and Priority Label Names and dropdown displayed on the wishlist page$")
    public void iVerifyQuantityAndPriorityLabelNamesAndDropdownDisplayedOnTheWishlistPage() {
        Assert.assertTrue(verifyQuantityLabelNameDisplayed());
        Assert.assertTrue(verifyQuantityDropdownDisplayed());
        Assert.assertTrue(verifyPriorityLabelNameDisplayed());
        Assert.assertTrue(verifyPriorityDropdownDisplayed());
    }

    @And("^I close the Product Popup screen$")
    public void iCloseTheProductPopupScreen() {
        clickCloseButtonInQuick();

    }

    @When("^I click the Remove link in the wishlist page$")
    public void iClickTheRemoveLinkInTheWishlistPage() {

        clickRemoveLinkWishList();
    }

    @Then("^I verify Add To Bag button is displayed in the wishlist page$")
    public void iVerifyAddToBagButtonIsDisplayedInTheWishlistPage() {

        Assert.assertTrue(isVerifyAddToBagBtnDisplayed());
    }

    @When("^I click the Add to Bag button$")
    public void iClickTheAddToBagButton() {
        
        
        clickAddToBagBtnInWishlist();
    }

    @And("^I click the Update button on Product QuickView Screen$")
    public void iClickTheUpdateButtonOnProductQuickViewScreen() {

        clickUpdateBtn();
    }

    @And("^I verify the Product slick slide are displayed on the Product QuickView Screen$")
    public void iVerifyTheProductSlickSlideAreDisplayedOnTheProductQuickViewScreen() {

        Assert.assertTrue(verifyProductSlickSlideDisplayedInQuickView());
    }

    @And("^I verify the Produt Name is displayed on the Product QuickView Screen$")
    public void iVerifyTheProdutNameIsDisplayedOnTheProductQuickViewScreen() {

        Assert.assertTrue(verifyProductNameDisplayedInQuickView());

    }

    @And("^I verify the review stars and Write a review link is displayed on the Screen$")
    public void iVerifyTheReviewStarsAndWriteAReviewLinkIsDisplayedOnTheScreen() {
        Assert.assertTrue(verifyReviewStarsDisplayedInQuickView());
        Assert.assertTrue(verifyWARlinkDisplayedInQuickView());
    }

    @Then("^I verify Color text is displayed on the Screen$")
    public void i_verify_Color_text_is_displayed_on_the_Screen()  {
        
        Assert.assertTrue(verifyColorTextDisplayedInQuickView());
    }

    @Then("^I verify the Variation Color and Color count of the product$")
    public void i_verify_the_Variation_Color_and_Color_count_of_the_product()  {
        Assert.assertTrue(verifyProductColorDisplayedInQuickView());
        Assert.assertTrue(verifyProductVariationColorDisplayedInQuickView());
        waitFor(5000);
        
    }

    @Then("^I verify the Size Dropdown is displayed on the Product QuickView Screen$")
    public void i_verify_the_Size_Dropdown_is_displayed_on_the_Product_QuickView_Screen()  {

        Assert.assertTrue(verifySizeDropDownDisplayedInQuickView());
        
    }

    @Then("^I verify the Width Buttons are displayed on the Screen$")
    public void i_verify_the_Width_Buttons_are_displayed_on_the_Screen()  {
        
        Assert.assertTrue(verifyWidthButtonDisplayedInQuickView());
    }

    @Then("^I verify the Product price is displayed on the Screen$")
    public void i_verify_the_Product_price_is_displayed_on_the_Screen()  {

        Assert.assertTrue(verifyProductPriceDisplayedInQuickView());
        
    }

    @Then("^I verify the AfterPay logo and Info Icon are displayed on the Screen$")
    public void i_verify_the_AfterPay_logo_and_Info_Icon_are_displayed_on_the_Screen()  {

        Assert.assertTrue(verifyAfterPayLogoDisplayedInQuickView());
        Assert.assertTrue(verifyAfterPayInfoIconDisplayedInQuickView());
        
    }

    @Then("^I verify the Update Button is displayed on the Screen$")
    public void i_verify_the_Update_Button_is_displayed_on_the_Screen()  {

        Assert.assertTrue(verifyUpdateBtnInQuickView());
        
    }


    @And("^I verify the selected Product Color, Width, Size and Price are displayed in the QuickView Screen$")
    public void iVerifyTheSelectedProductColorWidthSizeAndPriceAreDisplayedInTheQuickViewScreen() {

                Assert.assertTrue(verifySelectedProductColorDisplayedInQuickView());
//                Assert.assertTrue(verifySelectedProductWidthDisplayedInQuickView());
                Assert.assertTrue(verifySelectedProductSizeDisplayedInQuickView());
                Assert.assertTrue(verifySelectedProductPriceDisplayedInQuickView());
    }


    @Then("^I verify the updated product color is displayed on wishlist page$")
    public void iVerifyTheUpdatedProductColorIsDisplayedOnWishlistPage() {

        Assert.assertTrue(isSelectedQuickViewProductColorDisplayed());
    }

    @Then("^I verify the Below listed label names are displayed above the text box in the Share My Wishlist Screen$")
    public void i_verify_the_Below_listed_label_names_are_displayed_above_the_text_box_in_the_Share_My_Wishlist_Screen(List<String> labelname)  {

        Assert.assertTrue(verifyShareMyWishlistScreenInputFieldLabelNamesDisplayed(labelname));

    }

    @When("^I click the Share My Wishlist link on the page$")
    public void iClickTheShareMyWishlistLinkOnThePage() {

        clickShareMyWishlistIcon();
    }

    @Then("^I verify that Share My Wishlist dialogue box displayed$")
    public void iVerifyThatShareMyWishlistDialogueBoxDisplayed() {

        Assert.assertTrue(verifyShareMyWishlistScreenDisplayed());
    }

    @When("^I click the close button on Share My Wishlist dialogue box$")
    public void iClickTheCloseButtonOnShareMyWishlistDialogueBox() {

        clickCloseBtnShareMyWishlistScreen();

    }

    @When("^I enter values in Share My Wishlist Screen$")
    public void iEnterValuesInShareMyWishlistScreen(List<String> inputvalues) {

        enterValuesInShareMyWishlistScreen(inputvalues);
    }

    @And("^I click the Share My Wishlist button on the Screen$")
    public void iClickTheShareMyWishlistButtonOnTheScreen() {

        clickShareMyWishlistBtn();
    }

    @Then("^I verify the \"([^\"]*)\" Message is displayed on the screen$")
    public void iVerifyTheMessageIsDisplayedOnTheScreen(String successmsg) {

        Assert.assertTrue(verifyShareMyWishlistSuccessMsg(successmsg));
    }

    @When("^I click the Close Button on the displayed Screen$")
    public void iClickTheCloseButtonOnTheDisplayedScreen() {

        clickCloseBtnInShareMyWishlistSuccessMsg();
    }

    @Then("^I verify user able to click the Quantity dropdown and verify Selected Quantity is displayed on the wishlist page$")
    public void iVerifyUserAbleToClickTheQuantityDropdownAndVerifySelectedQuantityIsDisplayedOnTheWishlistPage() {

//        Assert.assertTrue(clickVerifyQuantityDropdown());
    }

    @When("^I click the below listed Priority dropdown Items$")
    public void iClickTheBelowListedPriorityDropdownItems(List<String> dropdownlistitems) {

        clickPrioritydropdown(dropdownlistitems);
    }

    @Then("^I verify \"([^\"]*)\" header is displayed on the Find a Wishlist Block$")
    public void iVerifyHeaderIsDisplayedOnTheFindAWishlistBlock(String headername) {

        Assert.assertTrue(verifyWishlistHeaderNameDisplayed(headername));
    }


    @And("^I verify \"([^\"]*)\" text is displayed on the Find a Wishlist Block$")
    public void iVerifyTextIsDisplayedOnTheFindAWishlistBlock(String text)  {

        Assert.assertTrue(verifyOneFieldRequiredtextDisplayed(text));
    }

    @And("^I verify below listed names are displayed above the Textbox in the Find a Wishlist$")
    public void iVerifyBelowListedNamesAreDisplayedAboveTheTextboxInTheFindAWishlist(List<String> labelnames) {

        Assert.assertTrue(verifyFindWishlistLabelNamesDisplayed(labelnames));
    }

    @Then("^I verify Find a wishlist Button is displayed$")
    public void iVerifyFindAWishlistButtonIsDisplayed() {

        Assert.assertTrue(verifyFindAWishlistButtonDisplayed());
    }

    @When("^I click the Find a wishlist Button$")
    public void iClickTheFindAWishlistButton() {

        clickFindAWishlistButton();
    }

    @Then("^I verify the error \"([^\"]*)\" is displayed$")
    public void iVerifyTheErrorIsDisplayed(String errormsg) {

        Assert.assertTrue(verifyFindAWishlistErrorMsgDisplayed(errormsg));
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" into the Find a Wishlist block$")
    public void iEnterAndIntoTheFindAWishlistBlock(String firstname, String lastname) {

        enterFirstNameandLastName(firstname, lastname);
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void iEnterIntoTheEmailField(String email)  {

        enterEmail(email);
    }

    @Then("^I verify the error \"([^\"]*)\" message below the email field$")
    public void iVerifyTheErrorMessageBelowTheEmailField(String errormsg){

        Assert.assertTrue(verifyEmailFieldErrorMsg(errormsg));
    }

    @And("^I verify able to click Facebook, Twitter, Pinterest share Icon and its navigated to appropriate page$")
    public void iVerifyAbleToClickFacebookTwitterPinterestShareIconAndItsNavigatedToAppropriatePage() {
        clickFacebookIconOnWishlistPage();
        clickTwitterIconOnWishlistPage();
        clickPinterestIconOnWishlistPage();
    }

    @When("^I click the Share through Email icon$")
    public void iClickTheShareThroughEmailIcon() {

        clickShareEmailWishlistPage();
    }

    @Then("^I verify the Share through Email popup screen displayed$")
    public void iVerifyTheShareThroughEmailPopupScreenDisplayed() {

        Assert.assertTrue(verifyShareMyWishlistScreenDisplayed());
        clickCloseBtnOnShareEmailScreen();
    }

    @And("^I verify the share Url is displayed on the Page$")
    public void iVerifyTheShareUrlIsDisplayedOnThePage() {

        Assert.assertTrue(verifyShareUrlDisplayed());
    }

    @When("^I click the share Url on the page$")
    public void iClickTheShareUrlOnThePage() {

        clickShareUrl();

    }

    @Then("^I verify the \"([^\"]*)\" success message displayed$")
    public void iVerifyTheSuccessMessageDisplayed(String successmsg) {

        Assert.assertTrue(verifyShareUrlSuccessMsgDisplayed(successmsg));
    }

    @And("^I verify able to click the Make this list public check box and verify it is selected$")
    public void iVerifyAbleToClickTheMakeThisListPublicCheckBoxAndVerifyItIsSelected() {

        clickMakeThisPublicCbk();
//        Assert.assertTrue(verifyMakeThisPublicCbkSelected());

    }

    @Then("^I verify the the product has removed in the Wishlist Page$")
    public void iVerifyTheTheProductHasRemovedInTheWishlistPage() {
        Assert.assertTrue(isAddedWishListProductRemoved());
    }

    @Then("^I verify the selected product Name, Width, color, size, Price and date are displayed in the wishlist page$")
    public void iVerifyTheSelectedProductNameWidthColorSizePriceAndDateAreDisplayedInTheWishlistPage() {
        Assert.assertTrue(isAddedProductNameDisplayedInWishListPage());
        Assert.assertTrue(isSelectedProductWidthDisplayed());
        Assert.assertTrue(isSelectedProductSizeDisplayed());
        Assert.assertTrue(isSelectedProductColorDisplayed());
        Assert.assertTrue(isSelectedProductStockDisplayed());
        Assert.assertTrue(isSelectedPriceDisplayedInWishListPage());
        Assert.assertTrue(isDateDisplayed());

    }

    @Then("^I verify that product is removed from Wishlist page$")
    public void iVerifyThatProductIsRemovedFromWishlistPage() {

        Assert.assertTrue(isAddedWishListProductRemoved());
    }

    @And("^I verify that selected Product Name is displayed on the Product QuickView Screen$")
    public void iVerifyThatSelectedProductNameIsDisplayedOnTheProductQuickViewScreen() {

        Assert.assertTrue(isverifyProductNameDisplayedInQuickView());
    }
}
