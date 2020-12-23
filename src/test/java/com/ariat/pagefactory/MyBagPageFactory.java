package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyBagPageFactory extends GenericWrappers {

    @FindBy(xpath = "(//span[contains(text(), 'Go to Checkout')])[1]")
    public WebElement btn_SecureCheckOut;

    @FindBy (css = ".checkout-title")
    public WebElement txt_MyBagTitle;

    @FindBy (xpath = "//div[contains(@class,'cart-header')]//div[text()='Product']")
    public WebElement txt_cartheaderProduct;

    @FindBy (xpath = "//div[contains(@class,'cart-header')]//div[text()='Qty']")
    public WebElement txt_cartheaderQty;

    @FindBy (xpath = "//div[contains(@class,'cart-header')]//div[text()='Price']")
    public WebElement txt_cartheaderPrice;

    @FindBy (xpath = "//div[contains(@class,'cart-header')]//div[text()='Total']")
    public WebElement txt_cartheaderTotal;

    @FindBy(css = ".line-item-name a ")
    public List<WebElement> lst_ProductNameInMyBag;

    @FindBy(css = ".text-right.grand-total")
    public WebElement lbl_EstimatedTotal;

    @FindBy (css=".edit")
    public WebElement lnk_Edit;

    @FindBy (xpath = "//div[@class='button-link__holder']//span[text()='Add to Wishlist']")
    public WebElement lnk_AddToWishText;

    @FindBy (xpath = "//div[@class='button-link__holder']//span[text()='Remove']")
    public List<WebElement> lst_Remove;

    @FindBy(css = ".attribute.variation-color a")
    public List<WebElement> lst_ProductColors;

    @FindBy(id = "product-color-selected-attribute")
    public WebElement lbl_SelectedColor;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//button[contains(@class,'product-quantity_more btn')]")
    public WebElement btn_Quantityincrease;

    @FindBy (xpath = "//button[contains(@class,'update-cart-product-global')]")
    public WebElement btn_Update;

    @FindBy (className = "minicart__continue-button")
    public WebElement btn_ContinueShopping;

    @FindBy (css=".cart-empty_message")
    public WebElement lbl_NoItemInBag;

    @FindBy(css = ".line-item-name a ")
    public WebElement lbl_ProductNameInMyBag;

    @FindBy(xpath="//div[@class='col-4 d-none d-lg-block line-item-total-price']")
    public WebElement lbl_Total;

    @FindBy(xpath="//div[text()='Qty']")
    public WebElement lbl_Qty;

    @FindBy(xpath="//div[contains(@class,'pricing line-item-total')]")
    public WebElement lbl_TotalPrice;

    @FindBy(xpath="//div[@class='container cart-empty js-cart_empty']//div[text()='There are currently no items in your bag.']")
    public WebElement txt_NoItemsInBag;

    @FindBy(id="secure-checkout")
    public WebElement lnk_SecureCheckout;

    @FindBy(xpath="//div[@id='secureCheckoutModal']//following::div[@class='modal-dialog']//div[@class='modal-content']")
    public WebElement popup_SecureCheckout;

    @FindBy(xpath="//div[@id='secureCheckoutModal']//following::div[@class='modal-dialog']//div[@class='modal-content']//a")
    public WebElement lnk_PrivacyPolicyInSecureCheckoutPopUp;

    @FindBy (xpath = "//div[@id='secureCheckoutModal']//following::div[@class='modal-dialog']//div[@class='modal-content']//button[@class='close']")
    public WebElement Btn_SecureCheckoutPopUpCloseBtn;

    @FindBy(xpath="//h1[contains(text(),'Privacy Policy')]")
    public WebElement lbl_PrivacyPolicy;

    @FindBy(xpath = "//div[contains(@class,'product-quickview')]//button[contains(@class,'add-to-wish-list')]")
    public WebElement Btn_QuickViewWishlist;

    @FindBy (xpath = "//a[text()='Return Policies']")
    public WebElement lnk_ReturnPolicies;

    @FindBy (xpath = "//label[@for='couponCode']")
    public WebElement txt_PromocodeLabelName;

    @FindBy (id = "couponCode")
    public WebElement txt_Promocodetextbox;

    @FindBy (xpath = "//button[contains(text(),'Apply')]")
    public WebElement Btn_PromocodeApplyBtn;

    @FindBy (xpath = "//p[text()='Subtotal']")
    public WebElement txt_Subtotaltext;

    @FindBy (xpath = "//p[text()='Shipping cost']")
    public WebElement txt_Shippingcosttext;

    @FindBy (xpath = "//p[text()='Estimated Tax']")
    public WebElement txt_EstimatedTaxtext;

    @FindBy (xpath = "//strong[text()='Estimated Total']")
    public WebElement txt_EstimatedTotaltext;

    @FindBy (css = ".afterpay-logo")
    public WebElement logo_AfterPay;

    @FindBy (xpath = "//a[contains(@class,'afterpay-info-link')]")
    public WebElement lnk_AfterPayInfoIcon;

    @FindBy (xpath = "//h2[text()='Recently viewed']")
    public WebElement txt_RecentlyReviewedtext;

    @FindBy (xpath = "//h2[text()='Recently viewed']//following::a[@class='image-link']")
    public List<WebElement> lst_RecentlyReviewedProductList;

    @FindBy (xpath = "//div[@class='cart-empty_message']//following::div[@class='content-asset'][2]//div[contains(@class,'d-none') and text()='Checkout assistance?']")
    public WebElement txt_Checkoutassistance;

    @FindBy (xpath = "//div[@class='cart-empty_message']//following::div[@class='content-asset'][2]//div[@class='cart-assistance_phone']//a")
    public WebElement txt_CartAssistancePhone;

    @FindBy(id = "Quantity")
    public WebElement txt_ProductQuantity;

    @FindBy (xpath = "//div[contains(@class,'quickview-dialog')]//div[@class='modal-content']")
    public WebElement popup_QuickView;

    @FindBy (xpath = "//button[contains(@class,'quickview-close')]")
    public WebElement Btn_QuickViewCloseButton;

    @FindBy (id = "invalidCouponCode")
    public WebElement txt_PromoCodeErrorMsg;

    @FindBy (xpath = "//p[text()='Subtotal']//following::p[contains(@class,'sub-total')]")
    public WebElement txt_SubTotalMyBag;

    @FindBy (xpath = "//p[text()='Order Discount']//following::p[contains(@class,'order-discount-total')]")
    public WebElement txt_Orderdiscount;

    @FindBy (xpath = "//p[text()='Shipping cost']//following::p[contains(@class,'shipping-cost')]")
    public WebElement txt_ShippingCost;

    @FindBy (xpath = "//p[text()='Estimated Tax']//following::p[contains(@class,'tax-total')]")
    public WebElement txt_EstimatedTax;


}
