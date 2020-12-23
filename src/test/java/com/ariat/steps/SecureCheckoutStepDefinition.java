package com.ariat.steps;

import com.ariat.pages.SecureCheckoutPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class SecureCheckoutStepDefinition extends SecureCheckoutPage {

    @Then("^I verify header \"([^\"]*)\" is displayed on Secure Checkout page$")
    public void iVerifyHeaderIsDisplayedOnSecureCheckoutPage(String header)  {

        Assert.assertTrue(isSecureCheckoutHeaderDisplayed(header));
    }

    @And("^I verify the Checkout Product name on Secure Checkout page$")
    public void iVerifyTheCheckoutProductNameSecureCheckoutPage() {

        Assert.assertTrue(isSecureCheckoutProductDisplayed());
    }

    @And("^I verify the WishList Checkout Product price on Secure Checkout page$")
    public void iVerifyTheWishListCheckoutProductPriceOnSecureCheckoutPage() {

        Assert.assertTrue(isSecureCheckoutWishListProductPriceDisplayed());
    }

    @And("^I verify the Checkout Photo Block Product name on Secure Checkout page$")
    public void iVerifyTheCheckoutPhotoBlockProductNameSecureCheckoutPage() {

        Assert.assertTrue(isSecureCheckoutPhotoBlockProductDisplayed());
    }

    @And("^I verify the Checkout Product price on Secure Checkout page$")
    public void iVerifyTheCheckoutProductPriceOnSecureCheckoutPage() {

        Assert.assertTrue(isSecureCheckoutProductPriceDisplayed());
    }


    @And("^I verify the Checkout Photo Block Product price on Secure Checkout page$")
    public void iVerifyTheCheckoutPhotoBlockProductPriceOnSecureCheckoutPage() {

        Assert.assertTrue(isSecureCheckoutPhotoBlockProductPriceDisplayed());
    }

    @And("^I verify the estimated and grand total price should be same$")
    public void iVerifyTheEstimatedAndGrandTotalPriceShouldBeSame() {

        Assert.assertTrue(isVerifyEstimateAndGrandTotal());
    }

    @When("^I click Next:Payment button on Secure Checkout page$")
    public void iClickNextPaymentButtonOnSecureCheckoutPage() {

        clickNextPayment();
    }

    @Then("^I verify that payment section is displayed on Secure Checkout page$")
    public void iVerifyThatPaymentSectionIsDisplayedOnSecureCheckoutPage() {

        Assert.assertTrue(isPaymentSectionDisplayed());
    }

    @When("^I click sign in button on Checkout page$")
    public void iClickSignInButtonOnCheckoutPage() {

        clickSignInCheckout();
    }

    @When("^I click email text box and enter the \"([^\"]*)\" on Checkout page$")
    public void i_click_email_text_box_and_enter_the_on_Checkout_page(String email)  {
        clickEnterEmail(email);
    }

    @When("^I click FirstName text box and enter the \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" on Checkout page$")
    public void i_click_FirstName_text_box_and_enter_the_on_Checkout_page(String firstname, String lastname, String address1, String address2, String city, String state, String zipcode, String mobile)  {

        clickAndEnterShippingAddress(firstname, lastname, address1, address2, city, state, zipcode, mobile);

    }

    @When("^I click credit card link from payment section$")
    public void iClickCreditCardLinkFromPaymentSection() {

        clickCreditCardOption();

    }

    @And("^I enter credit card payment details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\" on payment section$")
    public void iEnterCreditCardPaymentDetailsAndOnPaymentSection(String number, String eDate, String cvv, String name) {

//            enterCreditCardNumber(number);
//            enterCreditCardExpireDate(eDate);
//            enterCreditCardCVV(cvv);
//            enterCreditCardHolderName(name);
        enterCardDetailsInPaymentSection(number,eDate,cvv,name);
    }
    @And("^I click place order button on Secure Checkout page$")
    public void iClickPlaceOrderButtonOnSecureCheckoutPage() {


        clickPlaceOrderButton();
    }

    @And("^I click Next:Review Order button from payment section$")
    public void iClickNextReviewOrderButtonFromPaymentSection() {

        clickNextReviewOrderButton();
    }
    @Then("^I verify that card ending with \"([^\"]*)\" is added in payment section$")
    public void iVerifyThatCardEndingWithIsAddedInPaymentSection(String endingCardNo)  {
        Assert.assertTrue(isVerifyCardEndingNumberDisplayed(endingCardNo));
    }



    @Then("^I verify the Checkout Widget Product name on Secure Checkout page$")
    public void i_verify_the_Checkout_Widget_Product_name_on_Secure_Checkout_page()  {
        Assert.assertTrue(isSecureCheckoutWidgetProductDisplayed());
    }

    @Then("^I verify the Checkout widget Product price on Secure Checkout page$")
    public void i_verify_the_Checkout_widget_Product_price_on_Secure_Checkout_page()  {
        Assert.assertTrue(isSecureCheckoutWidgetProductPriceDisplayed());
    }

    @Then("^I verify that \"([^\"]*)\" page is displayed$")
    public void iVerifyThatPageIsDisplayed(String value)  {
        Assert.assertTrue(isVerifyCheckoutCompletePageDisplayed(value));
    }


    @When("^I click Next Payment button on \"([^\"]*)\" Secure Checkout page$")
    public void iClicknextPaymentButtonemailOnSecureCheckoutPage(String email) {

        clickNextPaymentGuestUser(email);
    }

    @And("^I verify the Checkout FR Work Wear Product price on Secure Checkout page$")
    public void iVerifyTheCheckoutFRWorkWearProductPriceOnSecureCheckoutPage() {

        Assert.assertTrue(isSecureCheckoutFRWorkWearProductPriceDisplayed());
    }

    @Then("^I verify the Checkout Product price same on Secure Checkout page$")
    public void i_verify_the_Checkout_Product_price_same_on_Secure_Checkout_page()  {
        Assert.assertTrue(isProductPriceDisplayedInSecureCheckout());
    }

    @When("^I get the GrandTotal on SecureCheckout Page$")
    public void i_get_the_GrandTotal_on_SecureCheckout_Page()  {

        grandTotalInSecureCheckoutPage();

    }



    @When("^I click Next Payment button on Secure Checkout page$")
    public void iClicknextPaymentButtonOnSecureCheckoutPage() {

        clickNextPaymentWishListGuestUser();
    }

    @When("^I click Paypal link from payment section$")
    public void iClickPaypalLinkFromPaymentSection() {

        clickPaypalOption();
    }

    @And("^I click Next:Review Order button from Paypal payment section$")
    public void iClickNextReviewOrderButtonFromPaypalPaymentSection() {

        clickPaypalNextReviewOrderButton();
    }

    @Then("^I verify the Paypal \"([^\"]*)\" url$")
    public void iVerifyThePaypalUrl(String url) {

        Assert.assertTrue(isVerifyPayPalUrl(url));
    }

    @When("^I enter Paypal account \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterPaypalAccountAnd(String username, String password) {

        loginPaypalAccount(username, password);
    }

    @And("^I click login button on paypal accpunt page$")
    public void iClickLoginButtonOnPaypalAccpuntPage() {

        clickPaypalLoginBtn();
    }

    @Then("^I verify that \"([^\"]*)\" text displayed on the Paypal Page$")
    public void iVerifyThatTextDisplayedOnThePaypalPage(String header)  {
        acceptCookie();
        Assert.assertTrue(isVerifyAriatTextDisplayedOnPaypalPage(header));
    }

    @When("^I click the continue button on Paypal page$")
    public void iClickTheContinueButtonOnPaypalPage() {

        clickPaypalContinueBtn();
    }


    @When("^I click the credit card payment link on Secure Checkout page$")
    public void iClickTheCreditCardPaymentLinkOnSecureCheckoutPage() {

        clickCreditCardLink();
    }

    @And("^I verify the below listed label names are displayed in the Payment section$")
    public void iVerifyTheBelowListedLabelNamesAreDisplayedInThePaymentSection(List<String> lablenames) {

        Assert.assertTrue(isVerifyCreditCardSectionFormLabelNamesDisplayed(lablenames));
    }

    @And("^I verify that Credit Card Name, Number, Expiry date, Cvv and Card Holder Names text box are displayed on the page$")
    public void iVerifyThatCreditCardNameNumberExpiryDateCvvAndCardHolderNamesTextBoxAreDisplayedOnThePage() {

        Assert.assertTrue(isVerifyCreditCardNumbertextboxDisplayed());
        Assert.assertTrue(isVerifyCreditCardExpiryDatetextboxDisplayed());
        Assert.assertTrue(isVerifyCreditCardCvvtextboxDisplayed());
        Assert.assertTrue(isVerifyCreditCardHolderNametextboxDisplayed());
    }

    @And("^I verify the selected product subtotal, Order Discount, Shipping cost and Estimated Tax on Secure Checkout page$")
    public void iVerifyTheSelectedProductSubtotalOrderDiscountShippingCostAndEstimatedTaxOnSecureCheckoutPage() {

        Assert.assertTrue(isVerifySelectedProductSubtotal());
        Assert.assertTrue(isVerifySelectedProductOrderDiscount());
        Assert.assertTrue(isVerifySelectedProductShipping());
        Assert.assertTrue(isVerifySelectedProductEstimatedTax());

    }

    @And("^I get the Shipping to Address on Secure Checkout page$")
    public void iGetTheShippingToAddressOnSecureCheckoutPage() {

        getSelectedShippingAddress();
    }

    @Then("^I verify the Shipping Address on Secure Checkout page$")
    public void iVerifyTheShippingAddressOnSecureCheckoutPage() {

        Assert.assertTrue(isVerifyShippingAddressFirstName());
        Assert.assertTrue(isVerifyShippingAddressLastName());
        Assert.assertTrue(isVerifyShippingAddress1());
        Assert.assertTrue(isVerifyShippingAddress2());
        Assert.assertTrue(isVerifyShippingCity());
        Assert.assertTrue(isVerifyShippingAddressStateCode());
        Assert.assertTrue(isVerifyShippingAddressZipCode());
        Assert.assertTrue(isVerifyShippingMobile());

    }
}



