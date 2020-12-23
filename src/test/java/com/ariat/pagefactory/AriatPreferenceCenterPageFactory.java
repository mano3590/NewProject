package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AriatPreferenceCenterPageFactory extends GenericWrappers {

    @FindBy (xpath = "//img[@class='logo-ariat-white-small' and @alt='Ariat']//..//..//a")
    public WebElement logo_Ariat;

    @FindBy (xpath = "//img[@class='logo-ariat-white-small' and @alt='Two24']//..//..//a")
    public WebElement logo_Two24;

    @FindBy (xpath = "//a[@class='logo']")
    public WebElement logo_AriatMain;

    @FindBy (css = ".page-heading")
    public WebElement txt_GettheEmailUpdatesYouWant;

    @FindBy (xpath="//a[@class='primary-nav__link' and text()='Women']")
    public WebElement lnk_Women;

    @FindBy (xpath="//a[@class='primary-nav__link' and text()='Men']")
    public WebElement lnk_Men;

    @FindBy (xpath="//a[@class='primary-nav__link' and text()='Kids']")
    public WebElement lnk_Kids;

    @FindBy (id="EmailAddress")
    public WebElement txt_Email;

    @FindBy (id="FirstName")
    public WebElement txt_FirstName;

    @FindBy (id="LastName")
    public WebElement txt_LastName;

    @FindBy (xpath = "//legend[text()='Send Updates To:']//following-sibling::div//label")
    public List<WebElement> lst_SendUpdatesLabelNames;

    @FindBy (xpath = "//legend[@class='form__legend' and contains(text(),'Send Updates')]")
    public WebElement txt_SendUpdates;

    @FindBy (css=".input#BrandSubscriptionAriat[type=checkbox]")
    public WebElement cb_AriatCheckbox;

    @FindBy (css=".input#BrandSubscriptionTwo24[type=checkbox]")
    public WebElement cb_Two24Checkbox;

    @FindBy (css = ".input#BrandSubscriptionTwo24[type=checkbox]:checked")
    public WebElement cb_Two24CheckBoxSelected;

    @FindBy (css = ".input#BrandSubscriptionAriat[type=checkbox]:checked")
    public WebElement cb_AriatCheckBoxSelected;

    @FindBy (css="div#ariat-toggle-section ul input")
    public List<WebElement> lst_AriatToggleSectionsCheckBoxs;

    @FindBy (css=".input#BrandSubscriptionWork[type=checkbox]:checked")
    public WebElement cb_AriatWorkCheckboxSelected;

    @FindBy (css=".input#BrandSubscriptionWork[type=checkbox]")
    public WebElement cb_AriatWorkCheckBox;

    @FindBy (xpath = "//div[@id='ariatwork-toggle-section']//li//input")
    public List<WebElement> lst_AriatWorkCheckbox;

    @FindBy (xpath = "//legend[@class='field-group__label' and contains(text(),'Who do you')]//following::input[@type='checkbox']")
    public List<WebElement> lst_TellUsAboutYourSelfCheckbox;

    @FindBy (xpath = "//label[@for='Zipcode']")
    public WebElement txt_ZipCodeLabelName;

    @FindBy (id = "Zipcode")
    public WebElement txt_Zipcode;

    @FindBy (xpath = "//legend[text()='Birthday']")
    public WebElement txt_Birthday;

    @FindBy (xpath = "//label[@for='BirthdayMM']")
    public WebElement txt_BirthdayMonth;

    @FindBy (xpath = "//label[@for='BirthdayDD']")
    public WebElement txt_BirthdayDay;

    @FindBy (id = "BirthdayMM")
    public WebElement ddl_BirthdayMonth;

    @FindBy (id = "BirthdayDD")
    public WebElement ddl_BirthdayDay;

    @FindBy (xpath = "//button[@type='submit' and text()='Save Preferences']")
    public WebElement Btn_SavePreferenceButton;

    @FindBy (xpath = "//button[@type='submit' and text()='Unsubscribe']")
    public WebElement Btn_Unsubscribebutton;

    @FindBy (xpath = "//button[@type='submit' and text()='Save Preferences']//following-sibling::a[text()='Unsubscribe']")
    public WebElement Btn_UnSubscribeLink;

    @FindBy (xpath = "//a[contains(@class,'button')]")
    public WebElement Btn_EmailPreferenceBtn;

    @FindBy (css = ".preference-center-modal")
    public WebElement popup_PreferencePopupScreen;

    @FindBy (xpath = "//button[@type='button' and text()='Keep Shopping']")
    public WebElement Btn_KeepShopping;

    @FindBy (xpath = "//button[contains(@class,'modal__close-trigger')]")
    public WebElement Btn_KeepShoppingPopupScreenCloseBtn;

    @FindBy(css = "#product-search-results div:nth-child(2)  div:nth-child(2) .search-results-title")
    public WebElement lbl_ProductListHeader;

    @FindBy (xpath = "//input[@id='EmailAddress']//following::div[1]//div[@class='validation-field__error']")
    public WebElement txt_EmailErrorMsg;

    @FindBy (xpath = "//input[@id='Zipcode']//following::div[1]//div[@class='validation-field__error']")
    public WebElement txt_ZipcodeErrorMsg;







}
