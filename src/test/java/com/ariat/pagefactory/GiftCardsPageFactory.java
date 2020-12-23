package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GiftCardsPageFactory extends GenericWrappers {

    @FindBy (css = ".page-title")
    public WebElement txt_PageTitle;

    @FindBy (css = ".gift-card__info-title")
    public WebElement txt_GiftCardTitle;

    @FindBy (xpath = "//div[contains(@class,'gift-page__title')]//h2")
    public WebElement txt_GiftCardPageTitle;

    @FindBy (xpath = "//h3[@class='recipient-info' and text()='Sender Information']")
    public WebElement txt_SenderTitle;

    @FindBy (xpath = "//h3[@class='recipient-info' and text()='Recipient Information']")
    public WebElement txt_RecipientTitle;

    @FindBy (xpath = "//h3[@class='recipient-info' and text()='Sender Information']//following::div[@class='form-group required']//label[contains(@for,'from')]")
    public List<WebElement> lst_SenderlabelNames;

    @FindBy (xpath = "//label[@class='form-control-label' and contains(@for,'giftCert')]")
    public List<WebElement> lst_GiftCardLabels;

    @FindBy (id = "giftCertID")
    public WebElement txt_GiftCardInputbox;

    @FindBy (id = "giftCertPin")
    public WebElement txt_GiftCardPinInputbox;

    @FindBy (xpath = "//label[@for='recipientFirstName']")
    public WebElement txt_RecipientLabelFirstName;

    @FindBy (xpath = "//label[@for='recipientFirstName']")
    public WebElement txt_RecipientLabelLastName;

    @FindBy (xpath = "//label[@for='recipientFirstName']")
    public WebElement txt_RecipientLabelEmailName;

    @FindBy (xpath = "//label[@for='recipientFirstName']")
    public WebElement txt_RecipientLabelConfirmEmailName;

    @FindBy (xpath = "//label[@for='recipientFirstName']")
    public WebElement txt_RecipientLabelMessageName;

    @FindBy (xpath = "//label[@for='recipientFirstName']")
    public WebElement txt_RecipientLabelAmountName;

    @FindBy (id = "fromFirstName")
    public WebElement txt_SenderFirstNameInputBox;

    @FindBy (id = "fromLastName")
    public WebElement txt_SenderLastNameInputBox;

    @FindBy (id = "recipientFirstName")
    public WebElement txt_RecipientFirstNameInputBox;

    @FindBy (id = "recipientLastName")
    public WebElement txt_RecipientLastNameInputBox;

    @FindBy (id = "recipientEmail")
    public WebElement txt_RecipientEmailInputBox;

    @FindBy (id = "confirmRecipientEmail")
    public WebElement txt_RecipientConfirmEmailInputBox;

    @FindBy (id = "message")
    public WebElement txt_RecipientmessageInputBox;

    @FindBy (id = "amount")
    public WebElement txt_RecipientAmountInputBox;

    @FindBy (xpath = "//button[contains(text(),'Add to Cart')]")
    public WebElement Btn_AddToCart;

    @FindBy (xpath = "//button[contains(text(),'Check Gift Card Balance')]")
    public WebElement Btn_CheckGiftCardBalanceButton;

    @FindBy (id = "fromFirstName-error")
    public WebElement txt_SenderFirstNameErrorMsg;

    @FindBy (id = "fromLastName-error")
    public WebElement txt_SenderLastNameErrorMsg;

    @FindBy (id = "recipientFirstName-error")
    public WebElement txt_RecipientFirstNameErrorMsg;

    @FindBy (id = "recipientLastName-error")
    public WebElement txt_RecipientLastNameErrorMsg;

    @FindBy (id = "recipientEmail-error")
    public WebElement txt_RecipientEmailErrorMsg;

    @FindBy (id = "confirmRecipientEmail-error")
    public WebElement txt_ConfirmRecipientEmailErrorMsg;

    @FindBy (id = "amount-error")
    public WebElement txt_AmountErrorMsg;

    @FindBy (id = "giftCertID-error")
    public WebElement txt_GiftCardErrorMsg;

    @FindBy (xpath = "//input[@id='recipientEmail' and contains(@class,'invalid')]")
    public WebElement txt_RecipientEmailError;

    @FindBy (xpath = "//input[@id='confirmRecipientEmail' and contains(@class,'invalid')]")
    public WebElement txt_RecipientConfirmEmailError;

    @FindBy (id = "error_confirmRecipientEmail")
    public WebElement txt_ConfirmRecipientErrorMsg;

    @FindBy (xpath = "//div[contains(@class,'valid-cart-error')]")
    public WebElement txt_FriendsEmailAlertMsg;

    @FindBy (xpath = "//div[contains(@class,'valid-cart-error')]//button[@class='close']")
    public WebElement Btn_FriendsEmailAlertMsgCloseBtn;

    @FindBy (css = ".gift-page__balance-error")
    public WebElement txt_CheckGiftCardErrorMsg;

}
