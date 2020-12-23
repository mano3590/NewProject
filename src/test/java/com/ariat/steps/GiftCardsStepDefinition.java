package com.ariat.steps;

import com.ariat.pages.GiftCardsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class GiftCardsStepDefinition extends GiftCardsPage {

    @And("^I verify the page header \"([^\"]*)\" displayed on the page$")
    public void iVerifyThePageHeaderDisplayedOnThePage(String title) {

        Assert.assertTrue(isVerifyGiftCardsHeader(title));
    }


    @And("^I verify that \"([^\"]*)\" info text displayed on the page$")
    public void iVerifyThatInfoTextDisplayedOnThePage(String title) {

        Assert.assertTrue(isVerifyGiftCardsTitle(title));
    }

    @And("^I verify that \"([^\"]*)\" text displayed in Sender Information on the page$")
    public void iVerifyThatTextDisplayedInSenderInformationOnThePage(String title) {

        Assert.assertTrue(isVerifyGiftCardsSenderTitle(title));
    }

    @And("^I verify the below listed sender information label names and text Box are displayed on the page$")
    public void iVerifyTheBelowListedSenderInformationLabelNamesAndTextBoxAreDisplayedOnThePage(List<String> labelnames) {

        Assert.assertTrue(isVerifyGiftCardsSenderlabelNamesDisplayed(labelnames));
        Assert.assertTrue(isVerifySenderFirstNameInputboxDisplayed());
        Assert.assertTrue(isVerifySenderLastNameInputboxDisplayed());
    }

    @And("^I verify that \"([^\"]*)\" text displayed in Recipient Information on the page$")
    public void iVerifyThatTextDisplayedInRecipientInformationOnThePage(String pagetitle) {

      Assert.assertTrue(isVerifyGiftCardsRecipientTitle(pagetitle));
    }

    @And("^I verify the Recipient information label names and text box are displayed on the page$")
    public void iVerifyTheRecipientInformationLabelNamesAndTextBoxAreDisplayedOnThePage() {

        Assert.assertTrue(isVerifyRecipientFirstLabelNameDisplayed());
        Assert.assertTrue(isVerifyRecipientLastLabelNameDisplayed());
        Assert.assertTrue(isVerifyRecipientEmailLabelNameDisplayed());
        Assert.assertTrue(isVerifyRecipientConfirmEmailLabelNameDisplayed());
        Assert.assertTrue(isVerifyRecipientMessageLabelNameDisplayed());
        Assert.assertTrue(isVerifyRecipientAmountLabelNameDisplayed());
        Assert.assertTrue(isVerifyRecipientFirstNameInputBoxDisplayed());
        Assert.assertTrue(isVerifyRecipientLastNameInputBoxDisplayed());
        Assert.assertTrue(isVerifyRecipientEmailInputBoxDisplayed());
        Assert.assertTrue(isVerifyRecipientConfirmEmailInputBoxDisplayed());
        Assert.assertTrue(isVerifyRecipientMessageInputBoxDisplayed());
        Assert.assertTrue(isVerifyRecipientAmountInputBoxDisplayed());
    }

    @And("^I verify Add to Cart Button displayed on the page$")
    public void iVerifyAddToCartButtonDisplayedOnThePage() {

        Assert.assertTrue(isVerifyAddToCardBtnDisplayed());
    }

    @And("^I verify that \"([^\"]*)\" header is displayed on the page$")
    public void iVerifyThatHeaderIsDisplayedOnThePage(String pagetitle) {

        Assert.assertTrue(isVerifyGiftCardTitle(pagetitle));
    }

    @And("^I verify the below listed Recipient information label names and text box are displayed on the page$")
    public void iVerifyTheBelowListedRecipientInformationLabelNamesAndTextBoxAreDisplayedOnThePage(List<String> labelnames) {

        Assert.assertTrue(isVerifyGiftCardslabelNamesDisplayed(labelnames));
    }

    @And("^I verify Check Gift Card Balance Button displayed on the page$")
    public void iVerifyCheckGiftCardBalanceButtonDisplayedOnThePage() {

        Assert.assertTrue(isVerifyCheckGiftCardBalanceBtnDisplayed());
    }

    @When("^I click the Add to Cart button on the page$")
    public void iClickTheAddToCartButtonOnThePage() {

        clicAddToCardBtn();
    }

    @Then("^I verify that error message \"([^\"]*)\" are displayed all the input Field$")
    public void iVerifyThatErrorMessageAreDisplayedAllTheInputField(String errormsg) {

        Assert.assertTrue(isVerifySenderFirstNameErrorMsg(errormsg));
        Assert.assertTrue(isVerifySenderLastNameErrorMsg(errormsg));
        Assert.assertTrue(isVerifyrecipientFirstNameErrorMsg(errormsg));
        Assert.assertTrue(isVerifyrecipientLastNameErrorMsg(errormsg));
        Assert.assertTrue(isVerifyrecipientEmailErrorMsg(errormsg));
        Assert.assertTrue(isVerifyrecipientConfirmEmailErrorMsg(errormsg));
        Assert.assertTrue(isVerifyrecipientAmountErrorMsg(errormsg));
    }

    @When("^I click the Check Gift Card Balance Button on the page$")
    public void iClickTheCheckGiftCardBalanceButtonOnThePage() {

        clickCheckGiftCardBalanceBtn();
    }

    @Then("^I verify that error message \"([^\"]*)\" are displayed in the Gift card input Field$")
    public void iVerifyThatErrorMessageAreDisplayedInTheGiftCardInputField(String errormsg) {

        Assert.assertTrue(isVerifyGiftCardNumberFieldErrorMsg(errormsg));
    }

    @When("^I enter the Sender information \"([^\"]*)\" into the First name Field$")
    public void iEnterTheSenderInformationIntoTheFirstNameField(String name) {

       enterSenderFirstName(name);
    }


    @And("^I enter the Sender information \"([^\"]*)\" into the Last name Field$")
    public void iEnterTheSenderInformationIntoTheLastNameField(String name) {

        enterSenderLastName(name);
    }


    @And("^I enter the Recipient information \"([^\"]*)\" into the First name Field$")
    public void iEnterTheRecipientInformationIntoTheFirstNameField(String name) {

        enterRecipientFirstName(name);
    }

    @And("^I enter the Recipient information \"([^\"]*)\" into the Last name Field$")
    public void iEnterTheRecipientInformationIntoTheLastNameField(String name) {

        enterRecipientLastName(name);
    }

    @And("^I enter the Recipient information \"([^\"]*)\" into the Recipient Email Id Field$")
    public void iEnterTheRecipientInformationIntoTheRecipientEmailIdField(String email)  {

        enterRecipientEmail(email);
    }

    @And("^I enter the Recipient information \"([^\"]*)\" into the Recipient Confirm Email Id Field$")
    public void iEnterTheRecipientInformationIntoTheRecipientConfirmEmailIdField(String confirmemailId) {

        enterRecipientConfirmEmail(confirmemailId);
    }

    @And("^I enter the Recipient information \"([^\"]*)\" into the Amount Field$")
    public void iEnterTheRecipientInformationIntoTheAmountField(String amount) {

        enterRecipientAmount(amount);
    }

    @Then("^I verify that error indication displayed on recipient Email and Confirm recipient Email Id field$")
    public void iVerifyThatErrorIndicationDisplayedOnRecipientEmailAndConfirmRecipientEmailIdField() {

        Assert.assertTrue(isVerifyRecipientEmailFieldErrorIndication());
        Assert.assertTrue(isVerifyRecipientConfirmEmailFieldErrorIndication());
    }

    @Then("^I verify that error indication displayed on Confirm recipient Email Id field$")
    public void iVerifyThatErrorIndicationDisplayedOnConfirmRecipientEmailIdField() {

        Assert.assertTrue(isVerifyRecipientConfirmEmailFieldErrorIndication());
    }

    @Then("^I verify that error indication displayed on recipient Email Id field$")
    public void iVerifyThatErrorIndicationDisplayedOnRecipientEmailIdField() {

        Assert.assertTrue(isVerifyRecipientEmailFieldErrorIndication());
    }

    @Then("^I verify the error Message \"([^\"]*)\" displayed on recipient Confirm Email Id field$")
    public void iVerifyTheErrorMessageDisplayedOnRecipientConfirmEmailIdField(String errormsg) {

        Assert.assertTrue(isVerifyRecipientConfirmEmailFieldErrorDisplayed(errormsg));
    }

    @When("^I click the close button in the alert message$")
    public void iClickTheCloseButtonInTheAlertMessage() {

        clickCloseBtnErrorAlert();
    }

    @And("^I verify the alert Indication Error Message displayed on the Gift Card Page$")
    public void iVerifyTheAlertIndicationErrorMessageDisplayedOnTheGiftCardPage() {

        Assert.assertTrue(isVerifyErrorAlertDisplayed());
    }

    @And("^I enter the below listed Amount into the Amount field and verify the error message \"([^\"]*)\" displayed below the Amount field$")
    public void iEnterTheBelowListedAmountIntoTheAmountFieldAndVerifyTheErrorMessageDisplayedBelowTheAmountField(String errormsg, List<String> amount)  {

        Assert.assertTrue(isVerifyAmountErrorMsg(errormsg, amount));
    }

    @And("^I enter the below listed Amounts into the Amount field and verify the error message \"([^\"]*)\" displayed below the Amount field$")
    public void iEnterTheBelowListedAmountsIntoTheAmountFieldAndVerifyTheErrorMessageDisplayedBelowTheAmountField(String errormsg, List<String> amount) {

        Assert.assertTrue(isVerifyAmountErrorMsg(errormsg, amount));
    }

    @When("^I enter \"([^\"]*)\" into the Gift Card Number field$")
    public void iEnterIntoTheGiftCardNumberField(String giftcardnumber) {

        enterGiftCardNumber(giftcardnumber);
    }

    @And("^I enter the \"([^\"]*)\" into the Gift Card Pin field$")
    public void iEnterTheIntoTheGiftCardPinField(String giftcardpinnumber) {

        enterGiftCardPinNumber(giftcardpinnumber);
    }

    @Then("^I verify the error message \"([^\"]*)\" is displayed on the page$")
    public void iVerifyTheErrorMessageIsDisplayedOnThePage(String errormsg) {

        Assert.assertTrue(isVerifyCheckGiftCardErrorMsg(errormsg));
    }
}
