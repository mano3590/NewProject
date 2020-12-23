package com.ariat.pages;

import com.ariat.pagefactory.FooterPageFactory;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class FooterPage extends FooterPageFactory {
    public static String selectedSustainabilityBannerButton, selectedBannerButton;

    public FooterPage() {
        PageFactory.initElements(driver, this);

    }

    public void clickSustainability() {
        click(lnk_FooterSustainability);

    }

    public boolean isBannerDisplayedInSustainability() {

        return isElementDisplayed(lbl_FooterSustainability);
    }

    public void clickRandomBannerButtonSustainability() {
        for (int i = 0; i < btn_shopBannerSustainability.size(); i++) {
            int randomBannerButton = getRandomNumber(btn_shopBannerSustainability);
            selectedSustainabilityBannerButton = getText(btn_shopBannerSustainability.get(randomBannerButton));
            if (!(selectedSustainabilityBannerButton.equalsIgnoreCase("LEARN MORE"))) {
                {
                    String[] array = selectedSustainabilityBannerButton.split(" ", selectedSustainabilityBannerButton.length());
                    selectedBannerButton = array[1];
                    if (selectedBannerButton.equalsIgnoreCase("THE")) {
                        selectedBannerButton = "COLLECTION";
                    }
                    System.out.println(selectedBannerButton);
                    clickButtonWithOutScroll(btn_shopBannerSustainability.get(randomBannerButton));
                    break;
                }

            }
        }

    }

    public void clickContactUsLink() {

        clickButtonWithOutScroll(lnk_contactus);
    }

    public void clickShopByStyleLink() {

        clickButtonWithOutScroll(lnk_ShopByStyle);
    }

    public boolean isVerifyJoinOurFamilyDisplayed(String text) {

        return getText(txt_joinourFamily).equalsIgnoreCase(text);
    }

    public boolean isVerifyEmailTextBoxDisplayed() {

        return isElementDisplayed(txt_emailInputbox);
    }

    public boolean isVerifySubscribeBtnDisplayed() {

        return isElementDisplayed(Btn_SubscribeButton);
    }

    public boolean isVerifyFacebookLogoDisplayed() {

        return isElementDisplayed(lnk_Facebooklink);
    }

    public boolean isVerifyTwitterLogoDisplayed() {

        return isElementDisplayed(lnk_twitterlink);
    }

    public boolean isVerifyPinterestLogoDisplayed() {

        return isElementDisplayed(lnk_Pinterestlink);
    }

    public boolean isVerifyInstagramLogoDisplayed() {

        return isElementDisplayed(lnk_Instagramlink);
    }

    public void clickFacebookLink() {

        clickButtonWithOutScroll(lnk_Facebooklink);
        switchToLastWindow();
    }

    public void clickTwitterLink() {
        switchToParentWindow();
        clickButtonWithOutScroll(lnk_twitterlink);
        switchToLastWindow();
    }

    public void clickPinterestLink() {
        switchToParentWindow();
        clickButtonWithOutScroll(lnk_Pinterestlink);
        switchToLastWindow();
    }

    public void clickInstagramLink() {
        switchToParentWindow();
        clickButtonWithOutScroll(lnk_Instagramlink);
        switchToLastWindow();
    }

    public boolean isVerifyUSFederationLogoDisplayed() {
        switchToParentWindow();
        return isElementDisplayed(logo_USFederation);
    }

    public boolean isVerifyPBRLogoDisplayed() {

        return isElementDisplayed(logo_PBR);
    }

    public boolean isVerifyWSTRLogoDisplayed() {

        return isElementDisplayed(logo_WSTR);
    }

    public boolean isVerifyEmailFieldErrorMessage(String errormsg, List<String> invalidemailId) {
        boolean flag = false;
        for (int i = 0; i < invalidemailId.size(); i++) {
            enterTextWithoutScroll(txt_emailInputbox, invalidemailId.get(i));
            clickButtonWithOutScroll(Btn_SubscribeButton);
            if (getText(txt_EmailErrorMsg).equalsIgnoreCase(errormsg)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyEmailSignUpFieldErrorMessage(String errormsg, List<String> invalidemailId) {
        boolean flag = false;
        for (int i = 0; i < invalidemailId.size(); i++) {
            enterTextWithoutScroll(txt_emailInputbox, invalidemailId.get(i));
            clickButtonWithOutScroll(Btn_SignUpButton);
            if (getText(txt_EmailErrorMsg).equalsIgnoreCase(errormsg)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean isVerifyFooterSubMenuItemIsDisplayedAndClickTheLink(DataTable dataTable) {

        List<List<String>> listData = dataTable.raw();
        boolean flag = false;
        for (int i = 0; i < listData.size(); i++) {
            flag = isVerifyFooterSubMenuDisplayed(listData.get(i).get(0), lst_FooterSubMenu.get(i), listData.get(i).get(1));
            if (!flag){
                break;
            }
        }
        return flag;
    }


    public boolean isVerifyFooterSubMenuDisplayed(String submenus, WebElement element, String url) {

        boolean flag = false;
        if (getText(element).equalsIgnoreCase(submenus) && !(getText(element).equalsIgnoreCase("Shop By Country") || getText(element).equalsIgnoreCase("Contact Us") || getText(element).equalsIgnoreCase("Do not sell my information"))) {
            clickButtonWithOutScroll(element);
            String currentUrl = driver.getCurrentUrl();
            if (url.equalsIgnoreCase(currentUrl)) {
                flag = true;
            }
        }else if (getText(element).equalsIgnoreCase("Shop By Country")) {
                clickButtonWithOutScroll(element);
                waitFor(2000);
                flag = isVerifyCountrySelectorPopupDisplayed();
                clickButtonWithOutScroll(btn_CountrySelectorCloseBtn);
                waitFor(3000);
            } else if (getText(element).equalsIgnoreCase("Contact Us")) {
                clickButtonWithOutScroll(element);
                switchToLastWindow();
                String currentUrl = driver.getCurrentUrl();
                if (url.equalsIgnoreCase(currentUrl)) {
                    flag = true;
                }
                driver.navigate().back();
            } else if (getText(element).equalsIgnoreCase("Do not sell my information")){
                clickButtonWithOutScroll(element);
                switchToLastWindow();
                String currentUrl = driver.getCurrentUrl();
                if (currentUrl.contains(url)) {
                    flag = true;
                }
                driver.navigate().back();
                switchToParentWindow();
                waitVisibilityOfElement(element);
            }
        return flag;
    }

    public boolean isVerifyCountrySelectorPopupDisplayed(){

        return isElementDisplayed(popup_CountrySelector);
    }

    public void clickOrderStatusSubmenu(){

        clickButtonWithOutScroll(lnk_OrderStatus);
    }

    public void clickMyAccountSubmenu(){

        clickButtonWithOutScroll(lnk_MyAccount);
    }

    public boolean isVerifyCopyRightsTextDisplayed(){

      return   isElementDisplayed(txt_Copyrightstext);
    }


    public void clickSizeChartsSubmenu(){

        clickButtonWithOutScroll(lnk_SizeCharts);
    }

    public boolean isVerifySizeChartsLinkDisplayed(){

        return isElementDisplayed(lnk_SizeCharts);
    }


    public boolean isVerifyEmailSignUpLinkDisplayed(){

        return isElementDisplayed(lnk_EmailSignUp);
    }


    public void clickEmailSignUpLink(){

        clickButtonWithOutScroll(lnk_EmailSignUp);
    }

    public boolean isVerifyPageUrl(String url){

        String currenturl = driver.getCurrentUrl();
        return currenturl.equalsIgnoreCase(url);
    }

    public boolean isEmailTextBoxDisplayed(){

        return isElementDisplayed(txt_emailInputbox);
    }

    public boolean isSignUpButtonDisplayed(){

        return isElementDisplayed(Btn_SignUpButton);
    }

    public boolean isVerifyPrivacyPolicyLinkDisplayed(){

        return isElementDisplayed(lnk_PrivacyPolicy);
    }

    public void clickPrivacyPolicyLink(){

        clickButtonWithOutScroll(lnk_PrivacyPolicy);
    }

    public boolean isVerifyPrivacyPolicyPopupDisplayed(){

        return isElementDisplayed(popup_PrivacyPolicyPopupScreen);
    }

    public void clickPrivacyPolicyCloseBtn(){

        clickButtonWithOutScroll(btn_PrivacyPolicyCloseBtn);
    }

    public void enterEmailInEmailSignUpField(String emailId){

        enterTextWithoutScroll(txt_emailInputbox,emailId);
    }

    public void clickSignUpButton(){

        clickButtonWithOutScroll(Btn_SignUpButton);
    }

    public boolean isVerifyThankYouTextDisplayedInPopupScreen(){

        return isElementDisplayed(txt_ThankYou);
    }

    public void clickClosebtnOnThankyouPopupScreen(){

        clickButtonWithOutScroll(Btn_ClosebtnInPopupScreen);
    }

    public void clickGiftCardsLink(){

        clickButtonWithOutScroll(lnk_GiftCards);
    }

}