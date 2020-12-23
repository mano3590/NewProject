package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterPageFactory extends GenericWrappers {
    @FindBy(xpath="//a[@class='footer-submenu__link' and text()='Sustainability']")
    public WebElement lnk_FooterSustainability;

    @FindBy(css=".amp-dc-banner-info.ms_desktop-only.transparent-block")
    public WebElement lbl_FooterSustainability;

    @FindBy(css=".amp-dc-splitblockInfo-button a")
    public List<WebElement> btn_shopBannerSustainability;

    @FindBy(css=".amp-dc-splitblockInfo-header.proximanova-extrabold")
    public List<WebElement> lbl_selectedSustainabilityProduct;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='Contact Us']")
    public WebElement lnk_contactus;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='Shop By Style']")
    public WebElement lnk_ShopByStyle;

    @FindBy (xpath = "//label[@for='ariat-form-email-signup-email']")
    public WebElement txt_joinourFamily;

    @FindBy (id = "ariat-form-email-signup-email")
    public WebElement txt_emailInputbox;

    @FindBy (css = ".email-signup__button")
    public WebElement Btn_SubscribeButton;

    @FindBy (xpath = "//a[@title='Ariat on Facebook']")
    public WebElement lnk_Facebooklink;

    @FindBy (xpath = "//a[@title='Ariat on Twitter']")
    public WebElement lnk_twitterlink;

    @FindBy (xpath = "//a[@title='Ariat on Pinterest']")
    public WebElement lnk_Pinterestlink;

    @FindBy (xpath = "//a[@title='Ariat on Instagram']")
    public WebElement lnk_Instagramlink;

    @FindBy (xpath = "//span[@title='United States Equestrian Federation']")
    public WebElement logo_USFederation;

    @FindBy (xpath = "//span[@title='Professional Bull Riders']")
    public WebElement logo_PBR;

    @FindBy (xpath = "//span[@title='World Series of Team Roping']")
    public WebElement logo_WSTR;

    @FindBy (css = ".footer-copyright")
    public WebElement txt_Copyrightstext;

    @FindBy (xpath = "//span[contains(@class,'email-signup__error __email-error')]")
    public WebElement txt_EmailErrorMsg;

    @FindBy (xpath = "//a[@class='footer-submenu__link']")
    public List<WebElement> lst_FooterSubMenu;

    @FindBy (xpath = "//div[@id='countrySelectorModal']//div[@class='modal-content']")
    public WebElement popup_CountrySelector;

    @FindBy (xpath = "//div[@id='countrySelectorModal']//button[@aria-label='label.close']//span")
    public WebElement btn_CountrySelectorCloseBtn;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='Order Status']")
    public WebElement lnk_OrderStatus;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='My Accounts']")
    public WebElement lnk_MyAccount;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='Size Charts']")
    public WebElement lnk_SizeCharts;

    @FindBy (xpath = "//div[contains(@class,'subscription-success')]//div[@class='modal-content']//h2[text()='Thank you!']")
    public WebElement txt_ThankYou;

    @FindBy (xpath = "//div[contains(@class,'subscription-success')]//div[@class='modal-content']//button[contains(@class,'close')]")
    public WebElement Btn_ClosebtnInPopupScreen;

    @FindBy (xpath = "//a[text()='Email Sign up']")
    public WebElement lnk_EmailSignUp;

    @FindBy (xpath = "//button//span[text()='Sign Up']")
    public WebElement Btn_SignUpButton;

    @FindBy (css = ".js_email-landing-privacy")
    public WebElement lnk_PrivacyPolicy;

    @FindBy (xpath = "//div[@id='privacyPolicy']//button[contains(@class,'close')]")
    public WebElement btn_PrivacyPolicyCloseBtn;

    @FindBy (xpath = "//div[@id='privacyPolicy']//div[@class='modal-content']")
    public WebElement popup_PrivacyPolicyPopupScreen;

    @FindBy (xpath = "//a[text()='Gift Cards']")
    public WebElement lnk_GiftCards;
}
