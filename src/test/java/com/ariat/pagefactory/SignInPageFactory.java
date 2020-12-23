package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignInPageFactory extends GenericWrappers {

    @FindBy(id = "login-form-email")
    public WebElement txt_Username;

    @FindBy(id = "login-form-password")
    public WebElement txt_Password;

    @FindBy(xpath = "//button[@type= 'submit'][contains(text(), 'Sign In')]")
    public WebElement btn_SignIn;

    @FindBy (id = "register-tab")
    public WebElement lnk_CreateAccount;

    @FindBy (id = "registration-form-fname")
    public WebElement txt_CreateAccountFirstName;

    @FindBy (id = "registration-form-lname")
    public WebElement txt_CreateAccountLastName;

    @FindBy (id = "nice_birthdayMonth")
    public WebElement ddl_BirthdayMonth;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayMonth']")
    public WebElement ddl_BirthdayMonthclick;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayDay']")
    public WebElement ddl_BirthdayDayclick;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayMonth']//span[@class='current']")
    public WebElement txt_BirthdayMonthSelected;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayDay']//span[@class='current']")
    public WebElement txt_BirthdayDaySelected;

    @FindBy (id = "registration-form-email")
    public WebElement txt_CreateAccountEmail;

    @FindBy (id = "registration-form-email-confirm")
    public WebElement txt_CreateAccountConfirmEmail;

    @FindBy (id = "registration-form-password")
    public WebElement txt_CreateAccountPassword;

    @FindBy (id = "registration-form-password-confirm")
    public WebElement txt_CreateAccountConfirmPassword;

    @FindBy (xpath="//label[contains(@class,'custom-checkbox-label') and @for='add-to-email-list']")
    public WebElement btn_PleaseAddToMe;

    @FindBy (xpath = "//input[contains(@class,'valid') and @id='add-to-email-list']")
    public WebElement btn_PleaseAddMeSelected;

    @FindBy (xpath = "//p[contains(@class,'personalinfo_require-label')]")
    public WebElement txt_Required;

    @FindBy (xpath = "//a[contains(text(),'privacy policy')]")
    public WebElement lnk_PrivacyPolicy;

    @FindBy (xpath = "//button[@type='submit' and contains(text(),'Create Account')]")
    public WebElement btn_CreateAccount;

    @FindBy (xpath = "//div[contains(@class,'tab-content')]")
    public WebElement lbl_CreateAccountUserForm;

    @FindBy (xpath = "//div[@id='register']//label[contains(@class,'form-control-label')]")
    public List<WebElement> lst_CreateAccountUserFormLabelNames;

    @FindBy (xpath = "//div[contains(@class,'privacy-policy-modal')]//button")
    public WebElement btn_PrivacyPolicyCloseBtn;

    @FindBy (xpath = "//div[contains(@class,'privacy-policy-modal')]//div[@class='modal-content']")
    public WebElement popup_PrivacyPolicyModelScreen;

    @FindBy (xpath = "//input[@id='registration-form-email']//following-sibling::div[@class='invalid-feedback' and @id='form-email-error']")
    public WebElement txt_emailErrorMessage;

    @FindBy (xpath="//input[@id='registration-form-email-confirm']//following-sibling::div[@class='invalid-feedback' and @id='form-email-confirm-error']")
    public WebElement txt_confirmemailErrorMessage;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayDay']//ul//li")
    public List<WebElement> lst_BirthdayDay;

    @FindBy (xpath = "//div[@aria-owns='nice_birthdayMonth']//ul//li")
    public List<WebElement> lst_BirthdayMonth;

    @FindBy (xpath = "//input[@id='registration-form-password']//following-sibling::div[@class='invalid-feedback' and @id='form-password-error']")
    public WebElement txt_PasswordErrorMessage;

    @FindBy (xpath = "//input[@id='registration-form-password-confirm']//following-sibling::div[@class='invalid-feedback' and @id='form-password-confirm-error']")
    public WebElement txt_ConfirmPasswordErrorMessage;

    @FindBy (id="registration-form-fname-error")
    public WebElement txt_FirstNameErrorMsg;

    @FindBy (id="registration-form-lname-error")
    public WebElement txt_LastNameErrorMsg;

    @FindBy (xpath = "//div[contains(@class,'nice-select')]//following-sibling::div[@class='invalid-feedback']")
    public WebElement txt_BirthdaydropdownErrorMsg;

    @FindBy(id = "rememberMe")
    public WebElement ckb_RememberMe;

    @FindBy(id="password-reset")
    public WebElement lnk_ForgotPassword;

    @FindBy(id="reset-password-email")
    public WebElement txt_ResetPasswordEmail;

    @FindBy(id="submitEmailButton")
    public WebElement btn_SubmitEmail;

    @FindBy(xpath="//button[@class='close']//span")
    public WebElement btn_PopUpClose;

    @FindBy(xpath="//div[@id='requestPasswordResetModal']//div[contains(@class,'modal-content')]")
    public WebElement popup_ForgotPassword;

    @FindBy(id="login-form-email-error")
    public WebElement txt_UserNameErrorMessage;

    @FindBy(id="login-form-password-error")
    public WebElement txt_PasswordTextBoxErrorMessage;

    @FindBy(css=".alert.alert-danger")
    public WebElement txt_SignInErrorMessage;

    @FindBy(id="submitEmailButton")
    public WebElement btn_EmailSubmitInForgotPasswordPopUp;

    @FindBy(xpath="//input[@id='reset-password-email']//following-sibling::div")
    public WebElement txt_ErrorMessageInForgotPassword;

    @FindBy(xpath="//input[@id='reset-password-email']//following-sibling::div[text()='Please enter a valid email address.']")
    public WebElement txt_InvalidEmailErrorMessageInForgotPassword;

    @FindBy (xpath = "//div[contains(@class,'content-header-container')]//h1[text()='My Account']")
    public WebElement txt_MyAccount;

    @FindBy (xpath = "//h2[contains(@class,'register-title')]")
    public WebElement txt_TrackOrderHeader;

    @FindBy (xpath = "//div[@class='card-body']//p")
    public WebElement txt_TrackOrderInfoText;

    @FindBy (css = ".trackorder")
    public WebElement trackOrderBlock;

    @FindBy (xpath = "//button[contains(text(),'Check status')]")
    public WebElement Btn_CheckStatus;

    @FindBy (xpath = "//div[contains(@class,'alert-danger')]//strong")
    public WebElement txt_TrackOrderErrorMsg;

    @FindBy (id = "trackorder-form-email")
    public WebElement txt_OrderEmail;

    @FindBy (name = "trackOrderNumber")
    public WebElement txt_OrderNumber;

    @FindBy (xpath = "//label[@class='form-control-label' and contains(text(),'Order number')]//following-sibling::div//label[@class='is-invalid']")
    public WebElement txt_OrderNumberErrorMsg;

    @FindBy (xpath = "//label[@class='form-control-label' and contains(text(),'Order Email')]//following-sibling::div//label[@class='is-invalid']")
    public WebElement txt_OrderEmailErrorMsg;

    @FindBy (xpath = "//h1[contains(@class,'page-title')]")
    public WebElement txt_OrderDetail;

    @FindBy (xpath = "//p[@class='summary-details']//span[2]")
    public WebElement txt_OrderNumberInOrderSummary;

    @FindBy(xpath="//form[@name='trackorder-form']//following::h2")
    public WebElement lbl_CheckAnOrder;

    @FindBy (xpath = "//div[contains(@class,'content-header-container')]//h1")
    public WebElement txt_MyAccountHeader;





}

