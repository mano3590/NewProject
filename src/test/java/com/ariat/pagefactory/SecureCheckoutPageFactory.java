package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SecureCheckoutPageFactory extends GenericWrappers {

    @FindBy(className = "checkout-secure")
    public WebElement lbl_Header;

    @FindBy(css = ".line-item-name a span")
    public List<WebElement> lst_ProductNameCheckOutPage;

    @FindBy(className = "grand-total-sum")
    public WebElement lbl_GrandTotal;

    @FindBy (className = "sub-total")
    public WebElement lbl_Subtotal;

    @FindBy (className = "order-discount-total")
    public WebElement lbl_OrderDiscount;

    @FindBy (className = "shipping-total-cost")
    public WebElement lbl_ShippingCost;

    @FindBy (className = "tax-total")
    public WebElement lbl_EstimatedTax;

    @FindBy(xpath = "//button[contains(text(), 'Next: Payment')]")
    public WebElement btn_NextPayment;

    @FindBy(className = "payment-method")
    public WebElement section_Payment;

    @FindBy(className = "checkout-login-link")
    public WebElement btn_SignCheckout;

    @FindBy (id = "dwfrm_shipping_shippingAddress_contactInformation_email")
    public WebElement txt_email;

    @FindBy (id="shippingFirstName")
    public WebElement txt_FirstName;

    @FindBy (id="shippingLastName")
    public WebElement txt_LastName;

    @FindBy (id="shippingAddressOne")
    public WebElement txt_Address1;

    @FindBy (id="shippingAddressTwo")
    public WebElement txt_Address2;

    @FindBy (id="shippingAddressCity")
    public WebElement txt_City;

    @FindBy (id = "shippingState-selectized")
    public WebElement ddl_StateDropDown;

    @FindBy (xpath = "//div[@class='selectize-dropdown-content']//div")
    public List<WebElement> ddl_StateDropDownlist;

    @FindBy (id="shippingZipCode")
    public WebElement txt_ZipCode;

    @FindBy (id="shippingPhoneNumber")
    public WebElement txt_Mobile;

    @FindBy (xpath = "//button[@type='button' and contains(text(),'Use address')]")
    public WebElement btn_UseAddressus;

    @FindBy (xpath = "//h2[@class='modal-title' and contains(text(),'Verify your address')]")
    public WebElement box_VerifyYourAddressPopup;

    @FindBy (id = "dwfrm_shipping_shippingAddress_contactInformation_email-error")
    public List<WebElement> txt_emailerrormsg;

    @FindBy(css = ".nav-link.adyen-card-tab.active")
    public WebElement lnk_CreditCard;

    @FindBy (xpath = "//a[contains(@class,'paypal-tab')]")
    public WebElement lnk_PayPal;

    @FindBy(id = "AFTERPAY_PBI")
    public WebElement lnk_AfterPayPbi;

    @FindBy(id = "encryptedCardNumber")
    public List<WebElement> txt_CreditCardNumber;

    @FindBy(id = "encryptedExpiryDate")
    public List<WebElement> txt_CreditCardExpiryDate;

    @FindBy(id = "encryptedSecurityCode")
    public List<WebElement> txt_CreditCardCVV;

    @FindBy(css = ".adyen-checkout__field.adyen-checkout__card__holderName span input")
    public WebElement txt_CreditCardName;

    @FindBy(css = ".adyen-checkout__checkbox")
    public WebElement ckb_SaveForNextPayment;

    @FindBy(id = "submitPayment")
    public WebElement btn_NextReviewOrder;

    @FindBy (id = "payButton")
    public WebElement btn_NextReviewPayButton;

    @FindBy(css = ".place-order")
    public WebElement btn_PlaceOrder;

    @FindBy(xpath = "//div[@class='summary-details']/div[1]/div/div[1]")
    public WebElement lbl_PaymentBlock1;

    @FindBy(css = ".checkout-title.page-title")
    public WebElement lbl_CheckoutComplete;

    @FindBy (xpath = "//div[@class='saved-credit-card-expiration-date']//span[contains(text(),'Ending')]")
    public WebElement txt_StoredPayments;

    @FindBy (xpath = "//button[text()='Use a different card']")
    public WebElement Btn_UseADifferentCardBtn;

    @FindBy (id = "email")
    public WebElement txt_paypalEmailtextbox;

    @FindBy (id = "password")
    public WebElement txt_paypalPasswordtextbox;

    @FindBy (id = "btnLogin")
    public WebElement btn_paypalLoginBtn;

    @FindBy (xpath = "//span[contains(@class,'MerchantLogo_text')]")
    public WebElement txt_AriatInternationaltextInPaypalPage;

    @FindBy (xpath = "//button[@id='payment-submit-btn' and text()='Continue']")
    public WebElement btn_ContinueBtnInPaypal;

    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    public WebElement btn_AcceptButton;

    @FindBy (xpath = "//div[@aria-owns='nice_shipmentSelector-default' and contains(@class,'nice-select')]//span[@class='current']")
    public WebElement txt_selectedAddressTitle;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='firstName']")
    public WebElement txt_ShippingAddressFirstName;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='lastName']")
    public WebElement txt_ShippingAddressLastName;

    @FindBy (xpath = "//div[@class='shipping-summary']//div[@class='address1']")
    public WebElement txt_Addressfiels1;

    @FindBy (xpath = "//div[@class='shipping-summary']//span[@class='city']")
    public WebElement txt_AddressCity;

    @FindBy (xpath = "//div[@class='shipping-summary']//div[@class='address2']")
    public WebElement txt_Addressfiels2;

    @FindBy (xpath = "//div[@class='shipping-summary']//span[@class='stateCode']")
    public WebElement txt_AddressStateCode;

    @FindBy (xpath = "//div[@class='shipping-summary']//span[@class='postalCode']")
    public WebElement txt_AddressPostalCode;

    @FindBy (css = ".shipping-email")
    public WebElement txt_ShippingEmail;

    @FindBy (css = ".shipping-phone")
    public WebElement txt_ShippingPhone;

    @FindBy (id = "editShipping")
    public WebElement lnk_Edit;

    @FindBy (xpath = "//div[@aria-owns='nice_billingAddressSelector']")
    public WebElement ddl_BillingAddressdropdown;

    @FindBy (xpath = "//div[@aria-owns='nice_billingAddressSelector']//li")
    public WebElement ddl_BillingAddressdropdownlist;

    @FindBy (css = ".nav-link.adyen-card-tab")
    public WebElement lnk_CreditCardPayment;

    @FindBy (css = ".adyen-checkout__label__text")
    public List<WebElement> lst_paymentLabelNames;

    @FindBy (xpath = "//iframe[@class='js-iframe']")
    public WebElement frame_CreditCardBlockFrames;

    @FindBy (xpath = "//span[contains(@class,'PaymentOptions_content')]")
    public List<WebElement> txt_PayLaterPopup;

    @FindBy (css = ".ppvx_coach-tip__close-btn___3pdHo")
    public WebElement btn_PaylaterClosebtn;

    @FindBy (xpath = "//div[@aria-owns='nice_shipmentSelector-default']//span")
    public WebElement ddl_SelectedAddressInDropdown;

    @FindBy (xpath = "//div[@aria-owns='nice_shipmentSelector-default']//li[contains(@class,'selected')]")
    public WebElement ddl_selecteddropdownvalue;

    @FindBy (xpath = "//div[@class='paymentType']")
    public WebElement txt_CreditVisaPaymenttype;













}
