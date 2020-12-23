package com.ariat.pages;

import com.ariat.pagefactory.AriatPreferenceCenterPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AriatPreferenceCenterPage extends AriatPreferenceCenterPageFactory {

    public AriatPreferenceCenterPage() {

        PageFactory.initElements(driver, this);
    }


    public boolean verifyAriatlogo() {
        return isElementDisplayed(logo_Ariat);

    }

    public boolean verifyAriatMainlogo() {
        return isElementDisplayed(logo_AriatMain);

    }

    public boolean verifyTwo24logo() {
        return isElementDisplayed(logo_Two24);

    }

    public boolean verifyWomenLinkDisplayed() {

        return isElementDisplayed(lnk_Women);

    }

    public boolean verifyMenLinkDisplayed() {

        return isElementDisplayed(lnk_Men);
    }

    public boolean verifyKidsLinkDisplayed() {

        return isElementDisplayed(lnk_Kids);
    }

    public boolean verifySectionHeaderTextDisplayed(String sectionheader) {

        String xpath = "//legend[@class='form__legend' and contains(text(),'"+sectionheader+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));

        return isElementDisplayed(element);
    }

    public boolean verifySubSectionHeaderTextDisplayed(String subsectionheader) {

        String xpath = "//legend[@class='field-group__label' and contains(text(),'"+subsectionheader+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));

        return isElementDisplayed(element);
    }

    public boolean verifyPromotionRadioBtnHeaderDisplayed(String sectionheader) {

        String xpath = "//legend[@class='field-group__label' and contains(text(),'"+sectionheader+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),sectionheader.toUpperCase());
    }

    public boolean verifyZipcodeHeaderDisplayed(String zipcodeheader) {

        String xpath = "//label[@for='Zipcode' and contains(text(),'"+zipcodeheader+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));

        return isElementDisplayed(element);
    }

    public boolean isVerifBrandSubscriptionLogoDisplayed(String logo) {

        String xpath = "//label[contains(@for,'BrandSubscription')]//img[@alt='"+logo+"']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean verifyGettheEmailHeader() {

        return isElementDisplayed(txt_GettheEmailUpdatesYouWant);
    }

    public boolean verifySelectedEmailDisplayed() {
        String Email = driver.findElement(By.id("EmailAddress")).getAttribute("value");
        return isTextMatch(MyAccountPage.displayedEmail, Email);

    }

    public boolean isVerifyTitleOfAriatEmailPage(String title) {
        waitVisibilityOfElement(txt_GettheEmailUpdatesYouWant);
        logger.info("Actual -- " + getPageTitle() + " ||   Expected -- " + title);
        return getPageTitle().equalsIgnoreCase(title);
    }

    public boolean isverifyEmailFirstLastlabelNamesDisplayed(List<String> labelnames){
        boolean flag = true;
        for (int i=0; i<labelnames.size();i++){
           if (!getText(lst_SendUpdatesLabelNames.get(i)).equalsIgnoreCase(labelnames.get(i))){
               flag = false;
               break;
           }
        }
        return flag;
    }

    public boolean isverifyEmailFirstLastinputtextDisplayed(List<String> inputfield){
        boolean flag = true;
        for (int i=0; i<inputfield.size();i++){
            String xpath = "//legend[text()='Send Updates To:']//following-sibling::div//label[contains(text(),'"+inputfield.get(i)+"')]//following-sibling::input";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!isElementDisplayed(element)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void clickAriatBrandSubscriptionCheckBox(){

        clickButtonWithOutScroll(cb_AriatCheckbox);
    }

    public void clickTwo24BrandSubscriptionCheckBox(){

        clickButtonWithOutScroll(cb_Two24Checkbox);
    }

    public void clickAriatWorkBrandSubscriptionCheckBox(){

        clickButtonWithOutScroll(cb_AriatWorkCheckBox);
    }

    public boolean isVerifyAriatBrandSubscriptionCheckBoxIsSelected(){

        return isElementDisplayed(cb_AriatCheckBoxSelected);
    }

    public boolean isVerifyTwo24BrandSubscriptionCheckBoxIsSelected(){

        return isElementDisplayed(cb_Two24CheckBoxSelected);
    }

    public boolean isVerifyAriatWorkBrandSubscriptionCheckBoxIsSelected(){

        return isElementDisplayed(cb_AriatWorkCheckboxSelected);
    }

    public boolean isverifyAriatBrandToggleHeadingNameDisplayed(List<String> ariattoggleheadingnames){
        boolean flag = true;
        for (int i=0; i<ariattoggleheadingnames.size();i++){
            String xpath = "//div[@id='ariat-toggle-section']//legend[@class='field-group__label' and contains(text(),'"+ariattoggleheadingnames.get(i)+"')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!isElementDisplayed(element)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean clickAndVerifyAriatToggleSectionsCheckBoxs(){
    boolean flag = false;

        for (int i=0; i<lst_AriatToggleSectionsCheckBoxs.size();i++){
            clickButtonWithOutScroll(lst_AriatToggleSectionsCheckBoxs.get(i));
            waitFor(2000);
            flag = lst_AriatToggleSectionsCheckBoxs.get(i).isSelected();
        }

      return flag;
    }

    public boolean clickAndVerifyAriatWorkToggleSectionsCheckBoxs(){
        boolean flag = false;
        for (int i=0; i<lst_AriatWorkCheckbox.size();i++){
            clickButtonWithOutScroll(lst_AriatWorkCheckbox.get(i));
            waitFor(2000);
            flag = lst_AriatWorkCheckbox.get(i).isSelected();
        }
        return flag;
    }

    public boolean clickAndVerifyTellMeAboutYourselfCheckBoxs(){
        boolean flag = false;
        for (int i=0; i<lst_TellUsAboutYourSelfCheckbox.size();i++){
            clickButtonWithOutScroll(lst_TellUsAboutYourSelfCheckbox.get(i));
            waitFor(2000);
            flag = lst_TellUsAboutYourSelfCheckbox.get(i).isSelected();
        }
        return flag;
    }

    public void enterZipcode(String zipcode){


        enterTextWithoutScroll(txt_Zipcode,zipcode);
    }

    public boolean zipcodeTextboxDisplayed(){


        return isElementDisplayed(txt_Zipcode);
    }

    public boolean birthdayTextDisplayed(){


        return isElementDisplayed(txt_Birthday);
    }

    public boolean birthdayDayLabelNameDisplayed(){


        return isElementDisplayed(txt_BirthdayDay);
    }

    public boolean birthdayMonthLabelNameDisplayed(){


        return isElementDisplayed(txt_BirthdayMonth);
    }

    public void selectBirthdayMonth(String month){


        SelectByVisibleText(ddl_BirthdayMonth,month);
    }

    public void selectBirthdayDay(String day){


        SelectByVisibleText(ddl_BirthdayDay,day);
    }

    public void selectRadioButton(String radiobtn){
        WebElement element = driver.findElement(By.xpath("//label[contains(text(),'"+radiobtn+"')]//..//input"));
        clickButtonWithOutScroll(element);
    }

    public void clickSavePreferenceButton(){

        clickButtonWithOutScroll(Btn_SavePreferenceButton);
    }

    public boolean isVerifyPopupScreenDisplayed(){

        return isElementDisplayed(popup_PreferencePopupScreen);
    }

    public void clickKeepShoppingBtn(){

        clickButtonWithOutScroll(Btn_KeepShopping);
    }

    public boolean isProductListHeaderMatchWithSelectedLink(String productname){

        return isTextContain(getText(lbl_ProductListHeader), productname.toUpperCase());
    }

    public void clickAriatInternationalLogo(){

        clickButtonWithOutScroll(logo_AriatMain);
    }

    public void clickAriatLogo(){

        clickButtonWithOutScroll(logo_Ariat);
    }

    public void clickTwo24Logo(){

        clickButtonWithOutScroll(logo_Two24);
    }

    public void clickProductLink(String productname){
        String xpath= "//a[@class='primary-nav__link' and text()='"+productname+"']";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public boolean clickVerifyUnsubscribeCheckbox(String brandname){

        WebElement element = driver.findElement(By.xpath("//label[text()='"+brandname+"']//..//input"));
        clickButtonWithOutScroll(element);
        return element.isSelected();

    }

    public void clickUnsubscribeBtn(){

        clickButtonWithOutScroll(Btn_Unsubscribebutton);
    }

    public void clickUnsubscribeLink() {


        clickButtonWithOutScroll(Btn_UnSubscribeLink);
    }


    public void clickEmailPreferenceBtn(){

        clickButtonWithOutScroll(Btn_EmailPreferenceBtn);
    }

    public boolean verifyEmailFieldErrorMsg(String errormsg){

        return isTextContain(getText(txt_EmailErrorMsg),errormsg);
    }

    public boolean verifyZipcodeFieldErrorMsg(String errormsg){

        return isTextContain(getText(txt_ZipcodeErrorMsg),errormsg);

    }

    public void enterEmailID(String emailID){

        enterTextWithoutScroll(txt_Email,emailID);

    }

    public void enterFirstName(String firstname){

        enterTextWithoutScroll(txt_FirstName,firstname);

    }

    public void enterLastName(String lastname){

        enterTextWithoutScroll(txt_LastName,lastname);

    }


    public void clickCloseBtnInKeepShopping(){

        clickButtonWithOutScroll(Btn_KeepShoppingPopupScreenCloseBtn);
    }


    }

