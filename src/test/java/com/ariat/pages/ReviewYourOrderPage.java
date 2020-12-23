package com.ariat.pages;

import com.ariat.pagefactory.ReviewYourOrderPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewYourOrderPage extends ReviewYourOrderPageFactory {

    @FindBy (xpath = "//h2[@class='checkout-subtitle' and text()='Review your order']")
    public WebElement lbl_PageHeader;

    @FindBy (xpath = "//div[@class='shipping-summary']//h2[@class='checkout-subtitle' and text()='Shipping']")
    public WebElement lbl_PageSubtitleShipping;

    @FindBy (id = "span#editShipping")
    public WebElement lnk_ShippingEdit;

    @FindBy (xpath = "//h3[contains(@class,'summary-section-label') and text()='Shipping Address:']")
    public WebElement txt_ShippingAddresstitle;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='firstName']")
    public WebElement txt_ShippingFirstName;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='lastName']")
    public WebElement txt_ShippingLastName;

    @FindBy (xpath = "//div[@class='summary-details shipping']//div[@class='address1']")
    public WebElement txt_ShippingAddressone;

    @FindBy (xpath = "//div[@class='summary-details shipping']//div[@class='address2']")
    public WebElement txt_ShippingAddressTwo;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='city']")
    public WebElement txt_ShippingCity;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='stateCode']")
    public WebElement txt_ShippingStateCode;

    @FindBy (xpath = "//div[@class='summary-details shipping']//span[@class='postalCode']")
    public WebElement txt_ShippingPostalCode;

    @FindBy (css = ".shipping-email")
    public WebElement txt_ShippingEmail;

    @FindBy (css = ".shipping-phone")
    public WebElement txt_ShippingPhone;

    @FindBy (xpath = "//h3[contains(@class,'summary-section-label') and text()='Shipping Method:']")
    public WebElement txt_ShippingMethodtitle;

    @FindBy (css = ".payment-summary >h2")
    public WebElement lbl_PaymentsectionHeader;

    @FindBy (id = "editPayment")
    public WebElement lnk_PaymentEdit;

    @FindBy (xpath = "//h3[contains(@class,'billing-addr-label')]")
    public WebElement lbl_BillingAddressheader;

    @FindBy (xpath = "//div[@class='summary-details billing']//span[@class='firstName']")
    public WebElement txt_BilligAddressFirstName;

    @FindBy (xpath = "//div[@class='summary-details billing']//span[@class='lastName']")
    public WebElement txt_BillingAddressLastName;

    @FindBy (xpath = "//div[@class='summary-details billing']//div[@class='address1']")
    public WebElement txt_BillingAddressOne;

    @FindBy (xpath = "//div[@class='summary-details billing']//div[@class='address2']")
    public WebElement txt_BillingAddressTwo;

    @FindBy (xpath = "//div[@class='summary-details billing']//span[@class='city']")
    public WebElement txt_BillingCity;

    @FindBy (xpath = "//div[@class='summary-details billing']//span[@class='stateCode']")
    public WebElement txt_BillingStateCode;

    @FindBy (xpath = "//div[@class='summary-details billing']//span[@class='postalCode']")
    public WebElement txt_BillingPostalCode;

    @FindBy (css = ".order-summary-email")
    public WebElement txt_BillingEmail;

    @FindBy (css = ".order-summary-phone")
    public WebElement txt_BillingMobile;

    @FindBy (css = ".summary-section-label.payment-info-label")
    public WebElement txt_PaymentInfoHeader;

    @FindBy (css = ".paypal-method-name")
    public WebElement txt_PayPalPaymentMethod;

    @FindBy (xpath = "//button[contains(text(),'Place Order')]")
    public WebElement btn_placeOrderbtn;

    @FindBy (xpath = "//a[text()='Terms & Conditions.']")
    public WebElement lnk_TermsAndConditions;

    @FindBy (xpath = "//a[text()='Privacy Policy.']")
    public WebElement lnk_PrivacyPolicy;

    @FindBy (css = ".page-title")
    public WebElement lbl_TermsAndConditions;

    @FindBy (id = "secure-checkout")
    public WebElement lnk_SecureCheckout;

    @FindBy (xpath = "//a[text()='Return Policies']")
    public WebElement lnk_ReturnPolicies;

    @FindBy (xpath = "//h2[@class='checkout-subtitle' and text()='Order Summary']")
    public WebElement lbl_OrderSummary;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Subtotal']")
    public WebElement txt_OrderSummarySubtotalText;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Subtotal']//following::span[@class='sub-total']")
    public WebElement txt_OrderSummarySubtotalPrice;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Shipping']")
    public WebElement txt_OrderSummaryShippingText;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Shipping']//following::span[@class='shipping-total-cost']")
    public WebElement txt_OrderSummaryShippingCost;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Estimated Tax']//following::span[@class='tax-total']")
    public WebElement txt_EstimatedtaxCost;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Estimated Tax']")
    public WebElement txt_EstimatedTax;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Total']")
    public WebElement txt_Total;

    @FindBy (xpath = "//div[@class='order-total-summary']//span[text()='Total']//following::span[@class='grand-total-sum']")
    public WebElement txt_TotalCost;

    @FindBy (xpath = "//a[contains(@class,'afterpay-logo')]")
    public WebElement logo_AfterPayLogo;

    @FindBy (xpath = "//div[@class='order-product-summary']//span[contains(@class,'grand-total-label')]")
    public WebElement txt_ProductItemText;

    @FindBy (css = ".line-item-name")
    public WebElement lst_ProductName;

    @FindBy (css = ".item-image")
    public WebElement lst_ProductImage;

    @FindBy (xpath = "//div[@class='line-item-name']//following::div[contains(text(),'Style #:')]")
    public WebElement txt_ProductStyle;

    @FindBy (xpath = "//div[@class='line-item-name']//following::p[contains(text(),'Color:')]")
    public WebElement txt_ProductColor;

    @FindBy (xpath = "//div[@class='line-item-name']//following::p[contains(text(),'Size:')]")
    public WebElement txt_ProductSize;

    @FindBy (xpath = "//div[@class='line-item-name']//following::p[contains(text(),'Width:')]")
    public WebElement txt_ProductWidth;

    @FindBy (xpath = "//div[@data-instock-label='In Stock']//p")
    public WebElement txt_ProductInstock;

    @FindBy (xpath = "//div[@class='line-item-quantity']//p[@class='line-item-pricing-info']//span")
    public WebElement txt_ProductQty;

    @FindBy (xpath = "//div[@class='price']//span[@class='sales']//span")
    public WebElement txt_ProductQtyPrice;

    @FindBy (xpath = "//div[contains(@class,'line-item-total-price-amount')]")
    public WebElement txt_ProductPrice;

    @FindBy (xpath = "//a[contains(@class,'afterpay-info-link')]")
    public WebElement lnk_AfterInfoIcon;




}
