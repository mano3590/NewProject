package com.ariat.pagefactory;


import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class WishListPageFactory extends GenericWrappers {
    @FindBy(css=".line-item-name")
    public List<WebElement> lst_WishlistProductName;

    @FindBy(xpath="//p[contains(text(),'width')]")
    public WebElement lbl_WishlistProductWidth;

    @FindBy(xpath="//p[contains(text(),'Size')]")
    public WebElement lbl_WishlistProductSize;

    @FindBy(xpath="//p[contains(text(),'color')]")
    public WebElement lbl_WishlistProductColor;

    @FindBy(css=".sales")
    public WebElement lbl_WishlistProductPrice;

    @FindBy(xpath="//p[contains(text(),'waist')]")
    public WebElement lbl_WishlistProductWaist;

    @FindBy(xpath="//p[contains(text(),'length')]")
    public WebElement lbl_WishlistProductLength;

    @FindBy (xpath = "//span[@class='sales']")
    public WebElement txt_WishListProductPrice;

    @FindBy(css = ".line-item-name")
    public List<WebElement> lst_ProductNameInWishList;

    @FindBy (xpath = "//button[contains(@class,'add-to-cart')]")
    public WebElement btn_AddToBag;

    @FindBy (id = "quantity")
    public WebElement ddl_Quantity;

    @FindBy (id = "quantity")
    public List<WebElement> ddl_QuantitySize;

    @FindBy (id = "register-tab")
    public WebElement lnk_CreateAccountlink;

    @FindBy (id = "registration-form-fname")
    public WebElement txt_FirstName;

    @FindBy (id = "registration-form-lname")
    public WebElement txt_LastName;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayMonth']")
    public WebElement ddl_BirthdayMonth;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayDay']")
    public WebElement ddl_BirthdayDay;

    @FindBy (id = "registration-form-email")
    public WebElement txt_Email;

    @FindBy (id = "registration-form-email-confirm")
    public WebElement txt_ConfirmEmail;

    @FindBy (id = "registration-form-password")
    public WebElement txt_Password;

    @FindBy (id = "registration-form-password-confirm")
    public WebElement txt_ConfirmPassword;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayDay']//ul//li")
    public List<WebElement> lst_BirthdayDay;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayMonth']//ul//li")
    public List<WebElement> lst_BirthdayMonth;

    @FindBy (xpath = "//div[contains(@class,'quickview-dialog')]//div[@class='modal-content']")
    public WebElement popup_QuickView;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//h1[@class='product-name']")
    public WebElement txt_QuickViewProdutname;

    @FindBy (xpath = "//button[contains(@class,'quickview-close')]")
    public WebElement Btn_QuickViewCloseButton;

    @FindBy (css = ".wishlist-items .remove-from-wishlist")
    public List<WebElement> lst_Removelink;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//a[contains(@class,'product-description_link')]")
    public WebElement lnk_ViewFullDetailslink;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//span[@id='product-color-selected-attribute']")
    public WebElement txt_QuickViewProductColor;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//div[contains(@class,'product-color_label')]//following::img")
    public List<WebElement> lst_QuickViewProductColorCount;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//a[@id='sizeDropdown']")
    public WebElement ddl_QuickViewDropdown;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//div[contains(@class,'variation-wrapper')]//a")
    public List <WebElement> lst_WidthButton;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//span[@class='sales']")
    public WebElement txt_QuickViewProductPrice;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//span[@class='afterpay-logo']")
    public WebElement txt_QuickViewAfterPayLogo;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//a[contains(@class,'afterpay-info-link')]")
    public WebElement lnk_AfterPayInfoIcon;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//button[contains(@class,'update-cart-product-global')]")
    public WebElement Btn_QuickViewProductUpdateButton;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//div[@class='bv_stars_component_container']")
    public WebElement txt_QuickViewProductReviewStars;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//button[@id='WAR']")
    public WebElement txt_QuickviewProductWriteaReview;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//img[@class='js_anchor-scroll-link']")
    public List<WebElement> lst_ProductScrollLink;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//div[contains(@class,'slick-active')]")
    public WebElement img_QuickViewProductImg;

    @FindBy(id = "product-color-selected-attribute")
    public WebElement lbl_SelectedColor;

    @FindBy (css = ".wishlist-owner")
    public WebElement txt_UserName;

    @FindBy (css = ".wishlist-empty")
    public WebElement txt_WishListEmptytext;

    @FindBy (xpath = "//a[contains(text(),'Start Shopping and Adding Items')]")
    public WebElement Btn_StartShoppingandAddingItems;

    @FindBy (xpath = "//a[contains(text(),'Back to My Account')]")
    public WebElement lnk_BackToMyAccount;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//div[@class='variation-code']")
    public WebElement txt_WidthCodeInQuickView;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//span[@id='product-Size-selected-attribute']")
    public WebElement txt_SizeCodeInQuickView;

    @FindBy (xpath = "//a[@title='Share on Facebook']")
    public WebElement lnk_WishlistFacebooklogo;

    @FindBy (xpath = "//a[@title='Share on Twitter']")
    public WebElement lnk_WishlistTwitterlogo;

    @FindBy (xpath = "//a[@title='Share on Pinterest']")
    public WebElement lnk_WishlistPinterestlogo;

    @FindBy (xpath = "//a[@data-share='email']")
    public WebElement lnk_Sharelogo;

    @FindBy (id = "shareUrl")
    public WebElement lnk_Sharelink;

    @FindBy (xpath = "//div[contains(text(),'Wishlist link has been copied')]")
    public WebElement txt_ShareUrlSuccessMsg;

    @FindBy (xpath = ".custom-control-label")
    public WebElement cbk_MakethisListPublicCheckBox;

    @FindBy (xpath = "//input[@id='wishlistpublic-checkbox' and @value='true']")
    public WebElement cbk_MakethisListPublicCheckBoxSelected;

    @FindBy (xpath = "//div[contains(@class,'sendToFriend-dialog')]//div[contains(@class,'modal-content')]")
    public WebElement dialogue_sendToFriendDialogBox;

    @FindBy (xpath = "//div[contains(@class,'sendToFriend-dialog')]//div[contains(@class,'modal-content')]//label")
    public List<WebElement> lst_SendToFriendDialogueLabelNames;

    @FindBy (xpath = "//button[@value='Share my wishlist']")
    public WebElement Btn_ShareMyWishlistButton;

    @FindBy (xpath = "//button[@aria-label='Close']")
    public WebElement Btn_ShareMyWishlistCloseBtn;

    @FindBy (xpath = "//div[contains(@class,'sendToFriend-dialog')]//div[contains(@class,'modal-content')]//p[text()='Your message has been sent.']")
    public WebElement txt_YourMessage;

    @FindBy (xpath = "//div[contains(@class,'sendToFriend-dialog')]//div[contains(@class,'modal-content')]//button[contains(text(),'Close')]")
    public WebElement Btn_CloseBtnInModel;

    @FindBy (xpath = "//div[contains(@class,'sendToFriend-dialog')]//div[contains(@class,'modal-content')]//button[@class='close']")
    public WebElement Btn_CloseBtnInModelContent;

    @FindBy (css = ".alert-success")
    public WebElement txt_AlertSucessMsg;

    @FindBy (xpath = "//form[@id='wishlist-search']//..//..//div[@class='card-body']")
    public WebElement form_FindAWishlistBlock;

    @FindBy (xpath = "//h4[text()='Find a Wishlist']")
    public WebElement txt_FindAWishListText;

    @FindBy (xpath = "//button[contains(text(),'Find a Wishlist')]")
    public WebElement Btn_FindAWishlistButton;

    @FindBy (xpath = "//form[@id='wishlist-search']//following-sibling::div[@class='alert alert-danger']")
    public WebElement txt_WishlistErrorMsg;

    @FindBy (xpath = "//input[@id='wishlist-search-email']//following::label[@id='wishlist-search-email-error']")
    public WebElement txt_EmailErrorMsg;

    @FindBy (xpath = "//p[contains(@class,'wishlist-description')]")
    public WebElement txt_WishlistDescription;

    @FindBy (xpath = "//a[contains(@class,'share-icons')]")
    public WebElement lnk_ShareMyWishlist;

    @FindBy (xpath = "//div[@id='send-to-friend-main']//following-sibling::label")
    public List<WebElement> lst_ShareMyWishListLabelnames;

    @FindBy (xpath = "//div[@id='send-to-friend-main']//following-sibling::label//following-sibling::input")
    public List<WebElement> lst_ShareMyWishlistInputbox;

    @FindBy (xpath = "//div[contains(@class,'js_send-success')]//p")
    public WebElement txt_ShareMyWishlistSuccessMsg;

    @FindBy (xpath = "//div[contains(@class,'js_send-success')]//button[contains(@class,'send-button') and contains(text(),'Close')]")
    public WebElement Btn_ShareMyWishlistSuccessMsg;

    @FindBy (xpath = "//div[@class='card-body']//h4[text()='Find a Wishlist']")
    public WebElement txt_FindAWishlisttext;

    @FindBy (xpath = "//div[@class='card-body']//h4[text()='Find a Wishlist']//following-sibling::p")
    public WebElement txt_OneFieldRequiredtext;

    @FindBy (xpath = "//button[contains(text(),'Find a Wishlist')]")
    public WebElement Btn_FindAWishlistBtn;

    @FindBy (xpath = "//form[@id='wishlist-search']//div[contains(@class,'alert-danger')]")
    public WebElement txt_FindAWishlistAlertMsg;

    @FindBy (id = "wishlist-search-first-name")
    public WebElement txt_FindAWishlistFirstInputField;

    @FindBy (id = "wishlist-search-last-name")
    public WebElement txt_FindAWishlistLastInputField;

    @FindBy (id = "wishlist-search-email")
    public WebElement txt_FindAWishlistEmailInputField;

    @FindBy (id = "wishlist-search-email-error")
    public WebElement txt_EmailFieldErrorMsg;

    @FindBy (xpath = "//span[text()='Select your gift with purchase']")
    public WebElement txt_SelectYourGiftCard;

    @FindBy (xpath = "//button[contains(@class,'bonus-product-btn') and contains(text(),'No, Thanks')]")
    public WebElement btn_NoThanksBtn;

    @FindBy (xpath = "//div[@id='chooseBonusProductModal']//div[@class='modal-content']")
    public WebElement popup_GiftPopupScreen;
}
