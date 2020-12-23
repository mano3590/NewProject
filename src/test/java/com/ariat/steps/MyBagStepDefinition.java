package com.ariat.steps;

import com.ariat.pages.MyBagPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MyBagStepDefinition extends MyBagPage {


    @When("^I click Go To Checkout button on My Bag page$")
    public void iClickGoToCheckoutButtonOnMyBagPage() {

        clickSecureCheckOutBtn();
    }

    @Then("^I verify that product is added on My Bag page$")
    public void iVerifyThatProductIsAddedOnMyBagPage() {
//        removeOtherProductsInMyBag();
        Assert.assertTrue(isAddedProductNameDisplayed());

    }

    @Then("^I verify that Photo Block product is added on My Bag page$")
    public void iVerifyThatPhotoBlockProductIsAddedOnMyBagPage() {

        Assert.assertTrue(isAddedPhotoBlockProductNameDisplayed());
    }

    @And("^I verify that Price and Total Price of the product on My Bag page$")
    public void iVerifyThatPriceAndTotalPriceOfTheProductOnMyBagPage() {

        Assert.assertTrue(isSelectedPriceDisplayed());
        Assert.assertTrue(isSelectedPriceDisplayedInTotal());


    }

    @Then("^I verify the Price and Total Price of the product on My Bag page$")
    public void i_verify_the_Price_and_Total_Price_of_the_product_on_My_Bag_page()  {
        Assert.assertTrue(isSelectedQuickViewPriceDisplayedInMyBag());
        Assert.assertTrue(isSelectedQuickViewTotalPriceDisplayedInMyBag());
    }

    @And("^I verify that Price and Total Price of the wishlist product on My Bag page$")
    public void iVerifyThatPriceAndTotalPriceOfThewishlistProductOnMyBagPage() {

        Assert.assertTrue(isSelectedPriceDisplayed());
        Assert.assertTrue(isSelectedWishListProductPriceDisplayedInTotal());


    }

    @When("^I get the Estimated Total Price on My Bag page$")
    public void iGetTheEstimatedTotalPriceOnMyBagPage() {
        getProductTotalPrice();
        getEstimatedTotalPrice();
    }

    @And("^I click the EDIT link on My Bag Page$")
    public void i_click_the_EDIT_link_on_My_Bag_Page()  {

        clickEditLink();
    }

    @And("^I change the product color and click the Update button$")
    public void i_change_the_product_color_and_click_the_Update_button()  {
        selectColor();
        clickUpdateButton();
    }

    @And("^I change the product color on QuickView Screen$")
    public void i_change_the_product_color_on_QuickView_Screen()  {
        selectColor();
    }

    @Then("^I verify the updated product color is displayed on My Bag Page$")
    public void i_verify_the_updated_product_color_is_displayed_on_My_Bag_Page()  {
        isSelectedColorDisplayed();
    }

    @Then("^I verify that selected product is added on My Bag page$")
    public void i_verify_that_selected_product_is_added_on_My_Bag_page()  {
        Assert.assertTrue(isAddedWidgetProductNameDisplayed());
    }

    @Then("^I verify that Selected Product's Price and Total Price on My Bag page$")
    public void i_verify_that_Selected_Product_s_Price_and_Total_Price_on_My_Bag_page()  {
        Assert.assertTrue(isSelectedWidgetPriceDisplayed());
        Assert.assertTrue(isSelectedWidgetPriceDisplayedInTotal());
    }
    @When("^I click the Remove link in the My Bag Page$")
    public void i_click_the_Remove_link_in_the_My_Bag_Page()  {


        clickRemoveLinkMyBag();
    }

    @Then("^I verify the Item has removed in My Bag Page$")
    public void i_verify_the_Item_has_removed_in_My_Bag_Page()  {


        Assert.assertTrue(isSelectedItemRemoved());
    }

    @When("^I click the Add to Wishlist link in the My Bag page$")
    public void i_click_the_Add_to_Wishlist_link_in_the_My_Bag_page()  {

        clickAddtoWishListMyBag();
    }

    @When("^I enter the \"([^\"]*)\" in the Quantity Box in the My Bag Page$")
    public void i_enter_the_in_the_Quantity_Box_in_the_My_Bag_Page(String Quantity)  {


        enterQuantitySize(Quantity);
    }


    @When("^I verify the added price and total price of the Product on MyBag Page$")
    public void i_verify_the_added_price_and_total_price_of_the_Product_on_MyBag_Page()  {

        Assert.assertTrue(isIncreasedQuantityPriceAdded());

    }


    @And("^I verify that Price and Total Price of the selected FR product on My Bag page$")
    public void iVerifyThatPriceAndTotalPriceOfTheselectedFRProductOnMyBagPage() {

        Assert.assertTrue(isSelectedPriceDisplayed());
        Assert.assertTrue(isSelectedFRWorkWearProductPriceDisplayedInTotal());


    }

    @And("^I verify that Price and Total Price of the Photo Block product on My Bag page$")
    public void iVerifyThatPriceAndTotalPriceOfThePhotoBlockProductOnMyBagPage() {

        Assert.assertTrue(isSelectedPhotoBlockPriceDisplayed());
        Assert.assertTrue(isSelectedPhotoBlockPriceDisplayedInTotal());
        // Assert.assertTrue(isSelectedColorDisplayed());
        //Photo Block
    }


    @When("^I click the Continue Shopping link on My Bag Page$")
    public void i_click_the_Continue_Shopping_link_on_My_Bag_Page()  {

        clickContinueShoppingButton();
    }


    @And("^I verify that selected Slick Slide Popup Price and Total Price of the product on My Bag page$")
    public void iVerifyThatSelectedSlickSlidePopupPriceAndTotalPriceOfTheProductOnMyBagPage() {
        Assert.assertTrue(isSelectedSlickSlidePopUpPriceDisplayed());
        Assert.assertTrue(isSelectedSlickSlidePopUpPriceDisplayedInTotal());
    }

    @Then("^I verify the Product is not displayed in the MyBag Page$")
    public void iVerifyTheProductIsNotDisplayedInTheMyBagPage() {

        Assert.assertTrue(isProductNameNotDisplayed());
    }

    @When("^I click SecureCheckout link in the MyBag page$")
    public void iClickSecureCheckoutLinkInTheMyBagPage() {

        clickSecureCheckoutLink();

    }

    @Then("^I verify the SecureCheckout popup is Displayed$")
    public void iVerifyTheSecureCheckoutPopupIsDisplayed() {
        Assert.assertTrue(isSecureCheckoutPopUpDisplayed());
        
    }

    @When("^I click the Full Privacy Policy Link in the SecureCheckout popup$")
    public void iClickTheFullPrivacyPolicyLinkInTheSecureCheckoutPopup() {

        clickPrivacyPolicyLinkInSecureCheckoutPopUp();
        
    }

    @Then("^I verify the header Privacy Policy is displayed in the page$")
    public void iVerifyTheHeaderPrivacyPolicyIsDisplayedInThePage() {

        Assert.assertTrue(isPrivacyPolicyHeaderDisplayed());
    }

    @And("^I verify the selected color in slickslide is displayed in My Bag page$")
    public void iVerifyTheSelectedColorInSlickslideIsDisplayedInMyBagPage() {
    Assert.assertTrue(isSlickSlidePopupMatchedWithMyBagPage());
    }

    @And("^I click Wishlist button on QuickView Screen$")
    public void iClickWishlistButtonOnQuickViewScreen() {

        clickWishlistBtn();

    }

    @When("^I click the Product Quantity Decrease Button on My Bag Page$")
    public void iClickTheProductQuantityDecreaseButtonOnMyBagPage() {

        clickQtyDecreaseBtn();
    }

    @And("^I remove the other product on My Bag page$")
    public void iRemoveTheOtherProductOnMyBagPage() {
        removeOtherProductsInMyBag();
//        clickRemovelinkInOtherProduct();
    }

    @And("^I delete the first added product from My Bag Page$")
    public void iDeleteTheFirstAddedProductFromMyBagPage() {
       clickRemovelinkInOtherProduct();

    }

    @And("^I verify Remove From WishList Link is displayed on the selected WishList Product in My Bag Page$")
    public void iVerifyRemoveFromWishListLinkIsDisplayedOnTheSelectedWishListProductInMyBagPage() {
        Assert.assertTrue(isRemoveFromWishListLinkDisplayed());

    }

    @When("^I click the Remove From WishList Link on the selected WishList Product in My Bag page$")
    public void iClickTheRemoveFromWishListLinkOnTheSelectedWishListProductInMyBagPage() {

        clickRemoveFromWishListLinkOnSelectedWishlistProduct();
    }

    @And("^I verify the selected Product Color, Width, Size, Style and Price are displayed in the My Bag Page$")
    public void iVerifyTheSelectedProductColorWidthSizeAndPriceAreDisplayedInTheMyBagPage() {
        Assert.assertTrue(isSelectedProductStyleCodeDisplayed());
        Assert.assertTrue(isSelectedColorDisplayedInMyBagPage());
        Assert.assertTrue(isSelectedProductWidthDisplayedInMyBag());
        Assert.assertTrue(isSelectedSizeDisplayed());
        Assert.assertTrue(isSelectedPriceDisplayed());

    }

    @And("^I verify that Updated Price and Total Price of the product on My Bag page$")
    public void iVerifyThatUpdatedPriceAndTotalPriceOfTheProductOnMyBagPage() {

        Assert.assertTrue(isSelectedPriceDisplayed());
        Assert.assertTrue(isVerifyUpdatedTotalPriceDisplayed());
    }

    @And("^I verify that selected Product ID is displayed on My Bag page$")
    public void iVerifyThatSelectedProductIDIsDisplayedOnMyBagPage() {

        Assert.assertTrue(isVerifySelectedProductIdDisplayed());
    }

    @When("^I click the selected product Name link on the page$")
    public void iClickTheSelectedProductNameLinkOnThePage() {

        clickSelectedProductLink();
    }

    @And("^I verify that selected Product Style No, Color, Width are displayed on My Bag Page$")
    public void iVerifyThatSelectedProductStyleNoColorWidthAreDisplayedOnMyBagPage() {

        Assert.assertTrue(isVerifySelectedProductIdDisplayed());
        Assert.assertTrue(isSelectedColorDisplayedInMyBagPage());
        Assert.assertTrue(isSelectedSizeDisplayed());
        Assert.assertTrue(isSelectedProductWidthDisplayedInMyBag());
    }

    @And("^I verify Edit link is displayed on the Page$")
    public void iVerifyEditLinkIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyEditLinkDisplayed());
    }

    @When("^I click the selected product Edit link$")
    public void iClickTheSelectedProductEditLink() {

        clickEditLink();
    }

    @Then("^I verify the Product Quick View Popup Displayed on the Page$")
    public void iVerifyTheProductQuickViewPopupDisplayedOnThePage() {

    Assert.assertTrue(verifyQuickViewScreenDisplayed());
    }

    @When("^I click the close button on the Product Quick View Popup screen$")
    public void iClickTheCloseButtonOnTheProductQuickViewPopupScreen() {

        clickCloseButtonInQuick();
    }

    @Then("^I verify Qty block displayed on the Page$")
    public void iVerifyQtyBlockDisplayedOnThePage() {
        Assert.assertTrue(isVerifyQtyLessBtnDisplayed());
        Assert.assertTrue(isVerifyQtyMoreBtnDisplayed());
        Assert.assertTrue(isVerifyQtyDisplayed());
    }

    @And("^I verify that \"([^\"]*)\" link text is displayed on the page$")
    public void iVerifyThatLinkTextIsDisplayedOnThePage(String text) {

    }

    @And("^I verify that Promocode text box is displayed on the page$")
    public void iVerifyThatPromocodeTextBoxIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyPromoCodeTextBoxDisplayed());
    }

    @And("^I verify that Promocode Apply button is displayed on the page$")
    public void iVerifyThatPromocodeApplyButtonIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyPromoCodeApplyBtnDisplayed());
    }

    @And("^I verify the below listed texts are displayed on My Bag page$")
    public void iVerifyTheBelowListedTextsAreDisplayedOnMyBagPage(List<String> text) {

        Assert.assertTrue(isVerifyCartTextsDisplayed(text));
    }

    @Then("^I verify Continue Shopping button is displayed on the page$")
    public void iVerifyContinueShoppingButtonIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyContinueShoppingButtonDisplayed());
    }

    @And("^I verify Go to checkout button is displayed on the page$")
    public void iVerifyGoToCheckoutButtonIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifySecureCheckOutBtn());
    }

    @And("^I verify that Secure Checkout and Return Policies texts are displayed on the page$")
    public void iVerifyThatSecureCheckoutAndReturnPoliciesTextsAreDisplayedOnThePage() {

        Assert.assertTrue(isVerifySecureCheckoutLinkDisplayed());
        Assert.assertTrue(isVerifyReturnPoliciesLinkDisplayed());
    }

    @When("^I click close button in SecureCheckout popup screen$")
    public void iClickCloseButtonInSecureCheckoutPopupScreen() {

        clickSecureCheckoutPopupCloseBtn();
    }

    @And("^I click the Return Policies link on My Bag Page$")
    public void iClickTheReturnPoliciesLinkOnMyBagPage() {

        clickReturnPoliciesLink();
    }

    @And("^I verify that \"([^\"]*)\" text and verify contact number is displayed on the page$")
    public void iVerifyThatTextAndVerifyContactNumberIsDisplayedOnThePage(String text) {

            Assert.assertTrue(isVerifyCheckoutAssistancetextDisplayed(text));
            Assert.assertTrue(isVerifyCheckoutAssistanceContactNoDisplayed());

    }

    @And("^I verify that \"([^\"]*)\" text displayed on My Bag Page$")
    public void iVerifyThatTextDisplayedOnMyBagPage(String text) {

    Assert.assertTrue(isVerifyEstimatedTotalTextDisplayed(text));
    }

    @Then("^I verify that selected product has removed from My Bag Page$")
    public void iVerifyThatSelectedProductHasRemovedFromMyBagPage() {

        Assert.assertTrue(isProductNameNotDisplayed());
    }

    @And("^I verify able to enter the following codes into the Promocode text box and verify the error msg$")
    public void iVerifyAbleToEnterTheFollowingCodesIntoThePromocodeTextBoxAndVerifyTheErrorMsg(List<String> text) {

        Assert.assertTrue(enterAndVerifyPromocodeErrorMsg(text));
    }

    @And("^I verify that selected Qty is displayed on My Bag page$")
    public void iVerifyThatSelectedQtyIsDisplayedOnMyBagPage() {

        Assert.assertTrue(isVerifySelectedQtyDisplayed());
    }

    @And("^I verify the selected Product Color,Style and Price are displayed in the My Bag Page$")
    public void iVerifyTheSelectedProductColorStyleAndPriceAreDisplayedInTheMyBagPage() {
        Assert.assertTrue(isRandomlySelectedProductStyleDisplayed());
        Assert.assertTrue(isRandomSelectedProductSelectedColorDisplayedInMyBag());
        Assert.assertTrue(isSelectedRandomProductInDetailPagePriceDisplayed());
    }

    @And("^I verify that randomly selected product from product Detail page is added on My Bag page$")
    public void iVerifyThatRandomlySelectedProductFromProductDetailPageIsAddedOnMyBagPage() {
        Assert.assertTrue(isSelectedRandomProductDisplayedInMyBagPage());
    }

    @When("^I get the selected Product Subtotal, Order Discount, Shipping cost and Estimated Tax on My Bag Page$")
    public void iGetTheSelectedProductSubtotalOrderDiscountShippingCostAndEstimatedTaxOnMyBagPage() {

        getSubtotalOnMyBag();
        getOrderDiscountOnMyBag();
        getShippingCostMyBag();
        getEstimatedTaxOnMyBag();
    }
}
