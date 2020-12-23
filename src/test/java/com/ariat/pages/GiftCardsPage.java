package com.ariat.pages;

import com.ariat.pagefactory.GiftCardsPageFactory;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class GiftCardsPage extends GiftCardsPageFactory {

    public GiftCardsPage() {

        PageFactory.initElements(driver, this);
    }


    public boolean isVerifyGiftCardsHeader(String pagetitle) {

        return getText(txt_PageTitle).equalsIgnoreCase(pagetitle);
    }

    public boolean isVerifyGiftCardsTitle(String pagetitle) {

        return getText(txt_GiftCardTitle).equalsIgnoreCase(pagetitle);
    }

    public boolean isVerifyGiftCardsSenderTitle(String pagetitle) {

        return getText(txt_SenderTitle).equalsIgnoreCase(pagetitle);
    }

    public boolean isVerifyGiftCardsRecipientTitle(String pagetitle) {

        return getText(txt_RecipientTitle).equalsIgnoreCase(pagetitle);
    }

    public boolean isVerifyGiftCardTitle(String pagetitle) {

        return getText(txt_GiftCardPageTitle).equalsIgnoreCase(pagetitle);
    }

    public boolean isVerifyGiftCardsSenderlabelNamesDisplayed(List<String> labelnames) {

        boolean flag = false;
        for (int i = 0; i < labelnames.size(); i++) {

            if (labelnames.get(i).equalsIgnoreCase(getText(lst_SenderlabelNames.get(i)))) {

                flag = true;
            } else {

                flag = false;
            }
        }
        return flag;
    }


    public boolean isVerifyGiftCardslabelNamesDisplayed(List<String> labelnames) {

        boolean flag = false;
        for (int i = 0; i < labelnames.size(); i++) {

            if (labelnames.get(i).equalsIgnoreCase(getText(lst_GiftCardLabels.get(i)))) {

                flag = true;
            } else {

                flag = false;
            }
        }
        return flag;
    }

    public boolean isVerifySenderFirstNameInputboxDisplayed() {

        return isElementDisplayed(txt_SenderFirstNameInputBox);
    }

    public boolean isVerifySenderLastNameInputboxDisplayed() {

        return isElementDisplayed(txt_SenderLastNameInputBox);
    }


    public boolean isVerifyRecipientFirstLabelNameDisplayed() {

        return isElementDisplayed(txt_RecipientLabelFirstName);
    }

    public boolean isVerifyRecipientLastLabelNameDisplayed() {

        return isElementDisplayed(txt_RecipientLabelLastName);
    }

    public boolean isVerifyRecipientEmailLabelNameDisplayed() {

        return isElementDisplayed(txt_RecipientLabelEmailName);
    }

    public boolean isVerifyRecipientConfirmEmailLabelNameDisplayed() {

        return isElementDisplayed(txt_RecipientLabelConfirmEmailName);
    }

    public boolean isVerifyRecipientMessageLabelNameDisplayed() {

        return isElementDisplayed(txt_RecipientLabelMessageName);
    }

    public boolean isVerifyRecipientAmountLabelNameDisplayed() {

        return isElementDisplayed(txt_RecipientLabelAmountName);
    }

    public boolean isVerifyRecipientFirstNameInputBoxDisplayed() {

        return isElementDisplayed(txt_RecipientFirstNameInputBox);
    }

    public boolean isVerifyRecipientLastNameInputBoxDisplayed() {

        return isElementDisplayed(txt_RecipientLastNameInputBox);
    }

    public boolean isVerifyRecipientEmailInputBoxDisplayed() {

        return isElementDisplayed(txt_RecipientEmailInputBox);
    }

    public boolean isVerifyRecipientConfirmEmailInputBoxDisplayed() {

        return isElementDisplayed(txt_RecipientConfirmEmailInputBox);
    }

    public boolean isVerifyRecipientMessageInputBoxDisplayed() {

        return isElementDisplayed(txt_RecipientmessageInputBox);
    }

    public boolean isVerifyRecipientAmountInputBoxDisplayed() {

        return isElementDisplayed(txt_RecipientAmountInputBox);
    }

    public boolean isVerifyAddToCardBtnDisplayed() {

        return isElementDisplayed(Btn_AddToCart);
    }

    public boolean isVerifyGiftCardInputboxDisplayed() {

        return isElementDisplayed(txt_GiftCardInputbox);
    }

    public boolean isVerifyGiftCardPinInputboxDisplayed() {

        return isElementDisplayed(txt_GiftCardPinInputbox);
    }

    public boolean isVerifyCheckGiftCardBalanceBtnDisplayed() {

        return isElementDisplayed(Btn_CheckGiftCardBalanceButton);
    }

    public void clicAddToCardBtn() {

        clickButtonWithOutScroll(Btn_AddToCart);
    }

    public boolean isVerifySenderFirstNameErrorMsg(String errormsg){

        return getText(txt_SenderFirstNameErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifySenderLastNameErrorMsg(String errormsg){

        return getText(txt_SenderLastNameErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyrecipientFirstNameErrorMsg(String errormsg){

        return getText(txt_RecipientFirstNameErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyrecipientLastNameErrorMsg(String errormsg){

        return getText(txt_RecipientLastNameErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyrecipientEmailErrorMsg(String errormsg){

        return getText(txt_RecipientEmailErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyrecipientConfirmEmailErrorMsg(String errormsg){

        return getText(txt_ConfirmRecipientEmailErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyrecipientAmountErrorMsg(String errormsg){

        return getText(txt_AmountErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyGiftCardErrorMsg(String errormsg){

        return getText(txt_GiftCardErrorMsg).equalsIgnoreCase(errormsg);
    }

    public void clickCheckGiftCardBalanceBtn(){

        clickButtonWithOutScroll(Btn_CheckGiftCardBalanceButton);
    }

    public boolean isVerifyGiftCardNumberFieldErrorMsg(String errormsg){

        return getText(txt_GiftCardErrorMsg).equalsIgnoreCase(errormsg);
    }

    public void enterSenderFirstName(String name){

        enterTextWithoutScroll(txt_SenderFirstNameInputBox,name);
    }

    public void enterSenderLastName(String name){

        enterTextWithoutScroll(txt_SenderLastNameInputBox,name);
    }

    public void enterRecipientFirstName(String name){

        enterTextWithoutScroll(txt_RecipientFirstNameInputBox,name);
    }

    public void enterRecipientLastName(String name){

        enterTextWithoutScroll(txt_RecipientLastNameInputBox,name);
    }

    public void enterRecipientEmail(String emailId){

        enterTextWithoutScroll(txt_RecipientEmailInputBox,emailId);
    }

    public void enterRecipientConfirmEmail(String emailId){

        enterTextWithoutScroll(txt_RecipientConfirmEmailInputBox,emailId);
    }

    public void enterRecipientAmount(String amount){

        enterTextWithoutScroll(txt_RecipientAmountInputBox,amount);
    }

    public boolean isVerifyRecipientEmailFieldErrorIndication(){

        return isElementDisplayed(txt_RecipientEmailError);
    }

    public boolean isVerifyRecipientConfirmEmailFieldErrorIndication(){

        return isElementDisplayed(txt_RecipientConfirmEmailError);
    }

    public boolean isVerifyRecipientConfirmEmailFieldErrorDisplayed(String errormsg){

        return getText(txt_ConfirmRecipientErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifyErrorAlertDisplayed(){

        return isElementDisplayed(txt_FriendsEmailAlertMsg);
    }

    public void clickCloseBtnErrorAlert(){

        getText(Btn_FriendsEmailAlertMsgCloseBtn);
    }

    public boolean isVerifyAmountErrorMsg(String errormsg, List<String> amount){
        boolean flag = false;
        for (int i=0; i<amount.size();i++){
            enterTextWithoutScroll(txt_RecipientAmountInputBox,amount.get(i));
            waitFor(2000);
            clickButtonWithOutScroll(Btn_AddToCart);
            if (getText(txt_AmountErrorMsg).equalsIgnoreCase(errormsg)){

                flag = true;
            }else{
                flag = false;
                break;
            }
        }
    return flag;
    }

    public void enterGiftCardNumber(String giftcardnumber){

        enterTextWithoutScroll(txt_GiftCardInputbox,giftcardnumber);
    }

    public void enterGiftCardPinNumber(String giftcardPinnumber){

        enterTextWithoutScroll(txt_GiftCardPinInputbox,giftcardPinnumber);
    }

    public boolean isVerifyCheckGiftCardErrorMsg(String errormsg){
        waitFor(3000);
        return getText(txt_CheckGiftCardErrorMsg).equals(errormsg);
    }



}
