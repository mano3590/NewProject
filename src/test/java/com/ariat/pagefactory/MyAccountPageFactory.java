package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccountPageFactory extends GenericWrappers {

    @FindBy (xpath = "//h2[contains(@class,'float-left') and text()='Email Preferences']//following-sibling::a")
    public WebElement lnk_EmailPreferanceEdit;

    @FindBy (xpath = "//dt[@class='dashboard-info']//following-sibling::dd")
    public WebElement txt_Email;

    @FindBy (css = ".login-popover.popover")
    public WebElement popup_LoginPopOver;

    @FindBy (css = ".user-message")
    public WebElement lnk_UserProfile;

    @FindBy (css = ".nav-greetings")
    public WebElement txt_LoginPopOverGreetings;

    @FindBy (xpath = "//h1[contains(@class,'page-title')]")
    public WebElement txt_PageHeader;

    @FindBy(css = ".line-item-name a ")
    public WebElement lbl_ProductNameInMyBag;

    @FindBy(xpath="//p[contains(text(),'Order Number')]")
    public WebElement txt_OrderNumber;

    @FindBy(xpath="//p[contains(text(),'Date')]")
    public WebElement txt_OrderDate;

    @FindBy(xpath="//p[contains(text(),'Total items')]//following-sibling::p")
    public WebElement txt_TotalItems;

    @FindBy(xpath="//p[text()='Total ']//following-sibling::p")
    public WebElement txt_TotalPrice;

    @FindBy(xpath="//h2[contains(text(),'My Orders')]//following::a[@class='float-right dashboard-edit']")
    public WebElement lnk_viewAll;

    @FindBy(xpath="//p[text()='Items:']//following-sibling::p")
    public List<WebElement> lst_ProductName;

    @FindBy(xpath="//h2[text()='My Orders']")
    public WebElement txt_MyOrder;

    @FindBy(xpath="//div[contains(text(),'You have no order records for this account to display.')]")
    public WebElement txt_NoOrder;

    @FindBy(xpath="//p[contains(text(),'Order Status')]")
    public WebElement txt_OrderStatus;

    @FindBy(xpath="//p[contains(text(),'Shipped to')]")
    public WebElement txt_ShippedTo;

    @FindBy (xpath = "//div[contains(@class,'content-header-container')]//h1[text()='My Account']")
    public WebElement txt_MyAccount;
    @FindBy(xpath="//h1[text()='My Account']")
    public WebElement lbl_MyAccount;

    @FindBy(xpath="//h1[text()='My Account']//following::h6")
    public WebElement txt_WelcomeUserName;

    @FindBy(css=".account-logout")
    public WebElement lnk_logout;

    @FindBy(css=".float-left.profile-header")
    public WebElement txt_PersonalInformation;

    @FindBy(xpath="//h2[contains(text(),'Personal Information ')]//following-sibling::a[contains(text(),'Edit')]")
    public WebElement lnk_EditPersonalInformation;

    @FindBy(xpath="//dt[contains(text(),'Name')]//following-sibling::dd")
    public WebElement txt_NamePersonalInformation;

    @FindBy(xpath="//a[contains(text(),'Change Password')]")
    public WebElement lnk_ChangePassword;

    @FindBy(css=".col.page-title")
    public WebElement lbl_PersonalInformationHeader;

    @FindBy(xpath="//a[@class='breadcrumb-link']//following::a[@class='breadcrumb-link']")
    public WebElement lnk_BreadCrumbMyAccountInPersonalInformation;

    @FindBy(xpath="//a[contains(text(),'Home')]")
    public WebElement lnk_BreadCrumbHomeInPersonalInformation;

    @FindBy(id="firstName")
    public WebElement txt_FirstNameInputBox;

    @FindBy(id="lastName")
    public WebElement txt_LastNameInputBox;

    @FindBy(id="email")
    public WebElement txt_EmailInputBox;

    @FindBy(id="currentPassword")
    public WebElement txt_CurrentPasswordInputBox;

    @FindBy(css=".btn.btn-block.btn-outline-primary")
    public WebElement btn_CancelButton;

    @FindBy(css=".btn.btn-save.btn-block.btn-primary")
    public WebElement btn_SaveButton;

    @FindBy(css=".profile-back-to-account-link")
    public WebElement lnk_BackToMyAccount;

    @FindBy(xpath="//a[contains(text(),'Contact us')]")
    public WebElement lnk_ContactUs;

    @FindBy(xpath="//a[text()='privacy policy']")
    public WebElement lnk_PrivacyPolicyInPersonalInformation;

    @FindBy(id="firstName-error")
    public WebElement txt_ErrorMessageInFirstName;

    @FindBy(id="lastName-error")
    public WebElement txt_ErrorMessageInLastName;

    @FindBy(id="currentPassword-error")
    public WebElement txt_ErrorMessageInConfirmPassword;

    @FindBy(xpath="//input[@id='firstName']//following::div[1]")
    public WebElement txt_ErrorMessageInvalidFirstName;

    @FindBy(xpath="//input[@id='lastName']//following::div[1]")
    public WebElement txt_ErrorMessageInvalidLastName;

    @FindBy(xpath="//div[contains(text(),'Does not match the current password')]")
    public WebElement txt_PasswordNotMatchErrorMessage;

    @FindBy(xpath="//div[@class='modal-dialog js_modal-dialog privacy-policy-modal']//child::div[@class='modal-content']")
    public WebElement popUp_PrivacyPolicyInPersonalInformation;

    @FindBy(xpath="//div[@class='modal-dialog js_modal-dialog privacy-policy-modal']//child::div[@class='modal-content']//following::button//span")
    public WebElement btn_ClosePrivacyPolicyPopUpInPersonalInformation;

    @FindBy(xpath="//input[@id='currentPassword']//following-sibling::div[@class='invalid-feedback']")
    public WebElement txt_ErrorMessage;

    @FindBy(css=".col.page-title")
    public WebElement lbl_PasswordHeader;

    @FindBy(id="currentPassword")
    public WebElement txt_currentPasswordTextBox;

    @FindBy(id="newPassword")
    public WebElement txt_NewPassword;

    @FindBy(id="newPasswordConfirm")
    public WebElement txt_NewConfirmPassword;

    @FindBy(xpath="//div[@class='invalid-feedback' and contains(text(),'Does not match the current password')]")
    public WebElement txt_CurrentPasswordErrorMessage;

    @FindBy(id="newPassword-error")
    public WebElement txt_NewPasswordErrorMessage;

    @FindBy(id="newPasswordConfirm-error")
    public WebElement txt_NewConfirmPasswordErrorMessage;
    
    @FindBy (xpath = "//h2[contains(@class,'profile-header')]//following::div[1]//dt[contains(text(),'Name')]//following-sibling::dd")
    public WebElement txt_MyAccountProfileName;

    @FindBy(css = ".line-item-name")
    public List<WebElement> lst_ProductNameInWishList;

    @FindBy(xpath="//div[contains(text(),'You have no address saved as default to display.')]")
    public WebElement noAddressTextInAddressBlock;

    @FindBy(xpath="//h2[contains(text(),'Addresses')]//following-sibling::a[@class='float-right dashboard-edit']")
    public WebElement lnk_EditInAddresses;

    @FindBy(xpath="//a[contains(text(),'+ Add Address')]")
    public WebElement lnk_AddAddress;

    @FindBy(css=".col.page-title")
    public WebElement lbl_pageHeader;

    @FindBy(xpath="//a[@class='btn btn-save btn-block btn-primary' and contains(text(),'Add New')]")
    public WebElement btn_AddNew;

    @FindBy(xpath="//a[@class='breadcrumb-link' and contains(text(),'Addresses')]")
    public WebElement lnk_BreadCrumbAddressLink;

    @FindBy(id="addressId")
    public WebElement txt_AddressTitleInputBox;

    @FindBy(id="firstName")
    public WebElement txt_FirstNameInputBoxInAddress;

    @FindBy(id="lastName")
    public WebElement txt_LastNameInputBoxInAddress;

    @FindBy(id="address1")
    public WebElement txt_Address1InputBox;

    @FindBy(id="address2")
    public WebElement txt_Address2InputBox;

    @FindBy(id="city")
    public WebElement txt_CityInputBox;

    @FindBy(id="stateCode")
    public WebElement ddl_stateCode;

    @FindBy(id="zipCode")
    public WebElement txt_ZipCodeInputBox;

    @FindBy(id="phone")
    public WebElement txt_MobileInputBox;

    @FindBy(id="addressId-error")
    public WebElement txt_ErrorMessageAddressTitle;

    @FindBy(id="firstName-error")
    public WebElement txt_ErrorMessageFirstNameInAddress;

    @FindBy(id="lastName-error")
    public WebElement txt_ErrorMessageLastNameInAddress;

    @FindBy(id="address1-error")
    public WebElement txt_ErrorMessageAddress1;

    @FindBy(id="city-error")
    public WebElement txt_ErrorMessageCity;

    @FindBy(id="stateCode-error")
    public WebElement txt_ErrorMessageState;

    @FindBy(id="zipCode-error")
    public WebElement txt_ErrorMessageZipcode;

    @FindBy(id="phone-error")
    public WebElement txt_ErrorMessageMobile;

    @FindBy(xpath="//h2[contains(text(),'Verify your address')]//parent::div[@class='modal-content']")
    public WebElement popup_EditAddress;

    @FindBy(xpath="//div[@class='modal-content']//h2")
    public WebElement txt_VerifyYourAddress;

    @FindBy(css=".btn.btn-primary.btn-block.js-qas-useasis_address")
    public WebElement btn_UseAddressAsIsPopup;

    @FindBy(css=".btn.btn-outline-primary.btn-block.js-qas-edit_address")
    public WebElement btn_EditAddressInPopup;

    @FindBy(css=".close")
    public WebElement btn_CloseInPopup;

    @FindBy(css=".custom-control-label.js-qas-customer_address")
    public WebElement txt_DisplayedAddressInPopup;

    @FindBy(xpath="//div[contains(text(),'Please enter a valid zip code')]")
    public WebElement txt_InvalidZipcodeErrorMessage;

    @FindBy(xpath="//div[@id='deleteAddressModal']//following-sibling::div[@class='modal-content']")
    public WebElement popup_DeleteAddress;

    @FindBy(css=".modal-body.delete-confirmation-body")
    public WebElement txt_deleteAddress;

    @FindBy(css=".btn.btn-outline-primary")
    public WebElement btn_CancelInPopUp;

    @FindBy(xpath="//button[contains(text(),'Yes')]")
    public WebElement btn_DeleteAddressInPopup;

    @FindBy(xpath="//button[@class='close']//span")
    public WebElement btn_closeInDeleteAddressPopUp;

    @FindBy(css=".address-heading.float-left")
    public List<WebElement> lst_AddressTitle;

    @FindBy(xpath="//div[@class='invalid-feedback' and contains(text(),'An address already exists with this ID')]")
    public WebElement txt_AddressTitleErrorMessage;

    @FindBy(xpath="//a[@aria-label='Add New Address']")
    public WebElement btn_AddNewAddress;

    @FindBy(xpath="//h2[contains(text(),'Payment Information')]")
    public WebElement lbl_PaymentInformation;

    @FindBy(xpath="//h2[contains(text(),'Payment Information')]//following::div[@class='card-body card-info-group' and contains(text(),' You have no cards saved. Please add a credit card.')]")
    public WebElement txt_NoCardDetails;

    @FindBy(xpath="//h2[contains(text(),'Payment Information')]//following-sibling::a[contains(text(),'Add/Delete')] ")
    public WebElement lnk_AddOrDeleteInPayment;

    @FindBy(xpath="//a[@aria-label='Add New Payment']")
    public WebElement lnk_AddNewInPayment;


}
