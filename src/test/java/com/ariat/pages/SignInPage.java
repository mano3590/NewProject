package com.ariat.pages;

import com.ariat.pagefactory.SignInPageFactory;
import cucumber.api.DataTable;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignInPage extends SignInPageFactory {
    public static String userName,password, confirmEmail, confirmPassword;

    public SignInPage(){

        PageFactory.initElements(driver, this);
    }

    public void signInToAriatApp(String username, String password){

        waitFor(5000);
        enterTextWithoutScroll(txt_Username, username);
        enterTextWithoutScroll(txt_Password, password);
        clickButtonWithOutScroll(btn_SignIn);
    }

    public boolean isVerifyCreateAccount() {

        return isElementDisplayed(lnk_CreateAccount);

    }

    public void clickCreateAccountLink() {


        clickButtonWithOutScroll(lnk_CreateAccount);
    }

    public boolean isCreateAccountUserFormDisplayed() {

        return isElementDisplayed(lbl_CreateAccountUserForm);
    }


    public boolean validateCreateAccountUserFormLabelNames(DataTable userformlabelnames) {
       boolean flag = true;
        List<String> labelNames = userformlabelnames.asList(String.class);
        for (int i = 0; i < labelNames.size(); i++) {
            if (!labelNames.get(i).equalsIgnoreCase(getText(lst_CreateAccountUserFormLabelNames.get(i)))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyPleaseAddMeCheckBoxDisplayed() {

        return isElementDisplayed(btn_PleaseAddToMe);
    }

    public void clickPleaseAddMeCheckBox() {

        clickButtonWithOutScroll(btn_PleaseAddToMe);
    }


    public boolean isVerifyAddToMeButtonDisplayed() {

        return isElementDisplayed(btn_PleaseAddMeSelected);
    }


    public boolean isVerifyRequiredtextDisplayed() {

        return isElementDisplayed(txt_Required);
    }

    public boolean isVerifyPrivacyPolicyLink() {

        return isElementDisplayed(lnk_PrivacyPolicy);
    }

    public void clickPrivacyPolicy() {

        clickButtonWithOutScroll(lnk_PrivacyPolicy);
    }

    public boolean isVerifyPrivacyPolicyModelScreenDisplayed() {

        return isElementDisplayed(popup_PrivacyPolicyModelScreen);
    }

    public void clickPrivacyPolicyCloseBtn() {

        clickButtonWithOutScroll(btn_PrivacyPolicyCloseBtn);
    }

    public boolean isVerifyCreateAccountSubmitBtn() {

        return isElementDisplayed(btn_CreateAccount);
    }


    public void clickCreateAccount() {


        clickButtonWithOutScroll(btn_CreateAccount);
    }


    public boolean verifyErrorMsg(String errormsg, List<String> labelname) {
        boolean flag = true;
        for (int i = 0; i < labelname.size(); i++) {
            String xpath = "//label[contains(@for,'registration-form') and contains(text(),'"+labelname.get(i)+"')]//following-sibling::div//label[@class='is-invalid' and contains(text(),'This field is required')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!getText(element).equalsIgnoreCase(errormsg)){
                flag = false;
                break;
            }
        }
        return flag;
    }


    public void enterFirstNameandLastName(String firstname, String lastname) {
        waitFor(5000);
        enterTextWithoutScroll(txt_CreateAccountFirstName, firstname);
        enterTextWithoutScroll(txt_CreateAccountLastName, lastname);

    }

    public void selectBirthdayMonth(String month){

        clickButtonWithOutScroll(ddl_BirthdayMonthclick);
        selectBirthdayDropDown(lst_BirthdayMonth,month);
    }

    public boolean verifyEnteredBirthdayMonthDisplayed(String month){

        return getText(txt_BirthdayMonthSelected).equalsIgnoreCase(month);
    }

    public void selectBirthdayDropDown(List<WebElement> monthlist,String month){
        for (int i=0; i<monthlist.size();i++){
            if (monthlist.get(i).getText().contains(month)) {
                waitFor(2000);
                clickButtonWithOutScroll(monthlist.get(i));
                break;
            }
        }
    }

    public void selectBirthdayDay(String day){

        clickButtonWithOutScroll(ddl_BirthdayDayclick);
        selectBirthdayDay(lst_BirthdayDay,day);
    }

    public boolean verifyEnteredBirthdayDayDisplayed(String day){

        return getText(txt_BirthdayDaySelected).equalsIgnoreCase(day);
    }


    public void selectBirthdayDay(List<WebElement> lst_BirthdayDay,String day){
        for (int i=0; i<lst_BirthdayDay.size();i++){
            if (lst_BirthdayDay.get(i).getText().contains(day)) {
                waitFor(2000);
                clickButtonWithOutScroll(lst_BirthdayDay.get(i));
                break;
            }
        }
    }

    public void selectGender(String gender){

        String xpath="//label[contains(@class,'form-control-label')]//span[contains(text(),'"+gender+"')]";
        WebElement genderbtn = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(genderbtn);
    }

    public boolean isSelectedGenderbtnDisplayed(String gender){
        selectGender(gender);
        String xpath = "//label[contains(@class,'form-control-label')]//span[contains(text(),'"+gender+"')]//..//..//input[contains(@class,'valid')]";
        WebElement selectedgender = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(selectedgender);
    }

    public void enterEmailId(String invalidemailid) {

        enterTextWithoutScroll(txt_CreateAccountEmail, invalidemailid);
    }

    public void enterConfirmEmailId(String invalidconfirmemailid) {

        enterTextWithoutScroll(txt_CreateAccountConfirmEmail,invalidconfirmemailid);

    }

    public boolean verifyEmailErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_emailErrorMessage),(errormessage));
    }

    public boolean verifyFirstNameErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_FirstNameErrorMsg),(errormessage));
    }

    public boolean verifyLastNameErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_LastNameErrorMsg),(errormessage));
    }

    public boolean verifyBirthdaydropdownErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_BirthdaydropdownErrorMsg),(errormessage));
    }


    public boolean verifyConfirmEmailErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_confirmemailErrorMessage),(errormessage));
    }

    public void enterPasswordandConfirmPassword(String password, String confirmpassword){

        enterTextWithoutScroll(txt_CreateAccountPassword,password);
        enterTextWithoutScroll(txt_CreateAccountConfirmPassword,confirmpassword);
        txt_CreateAccountConfirmPassword.sendKeys(Keys.TAB);
    }

    public boolean verifyPasswordErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_PasswordErrorMessage),(errormessage));
    }

    public boolean verifyConfirmPasswordErrorMessage(String errormessage){
        waitFor(2000);
        return isTextContain(getText(txt_ConfirmPasswordErrorMessage),(errormessage));
    }

    public void enterPasswordandConfirmPasswordMorethanConditons(){
        String randalphanum = RandomStringUtils.randomAlphanumeric(260);
        enterTextWithoutScroll(txt_CreateAccountPassword,randalphanum);
        enterTextWithoutScroll(txt_CreateAccountConfirmPassword,randalphanum);
        txt_CreateAccountConfirmPassword.sendKeys(Keys.TAB);
    }
    public boolean isEmailTextBoxDisplayed()
    {

        return isElementDisplayed(txt_Username);
    }

    public boolean isPasswordTextBoxDisplayed()
    {

        return isElementDisplayed(txt_Password);
    }

    public boolean isSignInButtonDisplayed()
    {

        return isElementDisplayed(btn_SignIn);
    }

    public boolean isRememberMeCheckboxDisplayed()
    {

        return isElementDisplayed(ckb_RememberMe);
    }

    public boolean isForgotPasswordLinkDisplayed()
    {
        return isElementDisplayed(lnk_ForgotPassword);

    }
    public boolean isPasswordEmailBoxInRememberMeDisplayed()
    {
        return isElementDisplayed(txt_ResetPasswordEmail);

    }
    public void clickForgotPasswordLink()
    {

        clickButtonWithOutScroll(lnk_ForgotPassword);
    }

    public boolean isForgotPasswordPopUpDisplayed()
    {

        return isElementDisplayedWithoutScroll(popup_ForgotPassword);
    }


    public boolean isForgotPasswordPopUPEmailTextBoxDisplayed()
    {
        return  isElementDisplayedWithoutScroll(txt_ResetPasswordEmail);
    }

    public boolean isForgotPasswordPopUpSendButtonDisplayed()
    {
        return isElementDisplayedWithoutScroll(btn_SubmitEmail);
    }

    public boolean isForgotPasswordPopUpCloseButtonDisplayed()
    {
        return isElementDisplayedWithoutScroll(btn_PopUpClose);
    }
    public void clickEmailTextBox()
    {

        clickButtonWithOutScroll(txt_Username);
    }

    public void clickPasswordTextBox()
    {

        clickButtonWithOutScroll(txt_Password);
    }

    public boolean isUserNameErrorMessageDisplayed()
    {
        return isElementDisplayedWithoutScroll(txt_UserNameErrorMessage);
    }

    public boolean isPasswordErrorMessageDisplayed()
    {
        return isElementDisplayedWithoutScroll(txt_PasswordTextBoxErrorMessage);
    }

    public void switchOffTheEmailTextBox()
    {
        txt_Username.sendKeys(Keys.TAB);

        highLighterMethod(driver,txt_UserNameErrorMessage);

    }

    public void switchOffThePasswordTextBox()
    {

        txt_Password.sendKeys(Keys.TAB);
    }

    public void enterEmail(String email)
    {
        enterTextWithoutScroll(txt_Username, email);


    }

    public void enterPassword(String InvalidPassword)
    {

        enterTextWithoutScroll(txt_Password,InvalidPassword);
    }

    public void clickSignInButton()
    {

        clickButtonWithOutScroll(btn_SignIn);
    }

    public boolean isSignInErrorMessageDisplayed(String ErrorMessage)
    {
        highLighterMethod(driver,txt_SignInErrorMessage);
        return isTextContain(txt_SignInErrorMessage.getText().toLowerCase(),ErrorMessage.toLowerCase());
    }

    public void clickCloseButtonInForgotPasswordPopUp()
    {

        clickButtonWithOutScroll(btn_PopUpClose);
    }

    public void clickSendButtonInForgotYourPasswordPopup()
    {
        clickButtonWithOutScroll(btn_EmailSubmitInForgotPasswordPopUp);
    }

    public boolean isErrorMessageDisplayedInForgotPasswordPopUp()
    {
        return isElementDisplayedWithoutScroll(txt_ErrorMessageInForgotPassword);
    }

    public void enterEmailInForgotPassword(String email)
    {
        enterTextWithoutScroll(txt_ResetPasswordEmail, email);


    }

    public boolean isInvalidErrorMessageDisplayedInForgotPassword(String ErrorMessage) {

        highLighterMethod(driver,txt_InvalidEmailErrorMessageInForgotPassword);
        return isTextContain(txt_InvalidEmailErrorMessageInForgotPassword.getText(),ErrorMessage);
    }

    public boolean isRequestToResetYourPasswordPopUpDisplayed()
    {

        return isElementDisplayed(popup_ForgotPassword);
    }


    public boolean isVerifyTitleMyAccountPage(String title){
        waitVisibilityOfElement(txt_MyAccount);
        logger.info("Actual -- "+getPageTitle()+" ||   Expected -- "+title);
        return getPageTitle().equalsIgnoreCase(title);

    }

    public boolean isVerifyOrderBlockDisplayed(){

        return isElementDisplayed(trackOrderBlock);
    }

    public boolean verifyTrackOrderBlockHeaderDisplayed(String header){

        return getText(txt_TrackOrderHeader).equalsIgnoreCase(header);
    }

    public boolean verifyTrackOrderHeaderText(String headertext){

        return getText(txt_TrackOrderInfoText).equalsIgnoreCase(headertext);
    }

    public boolean verifyTrackOrderInputFieldLabelNamesDisplayed(List<String> labelname) {

        boolean flag = true;
        for (int i = 0; i < labelname.size(); i++) {
            String xpath = "//label[@class='form-control-label' and contains(text(),'"+labelname.get(i)+"')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!isElementDisplayed(element)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean verifyTrackOrderInputFieldDisplayed(List<String> inputfield) {

        boolean flag = true;
        for (int i = 0; i < inputfield.size(); i++) {
            String xpath = "//label[@class='form-control-label' and contains(text(),'"+inputfield.get(i)+"')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!isElementDisplayed(element)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyCheckStatusBtnDisplayed(){

        return isElementDisplayed(Btn_CheckStatus);
    }

    public void clickCheckStatusBtn(){

        clickButtonWithOutScroll(Btn_CheckStatus);
    }

    public boolean verifyErrorMessageInOrderNumberField(String errormessage){

        return getText(txt_OrderNumberErrorMsg).equalsIgnoreCase(errormessage);
    }

    public boolean verifyErrorMessageInOrderEmailField(String errormessage){

        return getText(txt_OrderEmailErrorMsg).equalsIgnoreCase(errormessage);
    }


    public boolean verifyErrorMsgInOrderNumberAndOrderEmailField(String errormsg, List<String> inputfield) {

        boolean flag = true;
        for (int i = 0; i < inputfield.size(); i++) {
            String xpath = "//label[@class='form-control-label' and contains(text(),'"+inputfield.get(i)+"')]//following-sibling::div//label[@class='is-invalid']";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!getText(element).equalsIgnoreCase(errormsg)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void enterOrderNumber(String ordernumber){

        enterTextWithoutScroll(txt_OrderNumber,ordernumber);
    }

    public void enterOrderEmail(String orderemail){

        enterTextWithoutScroll(txt_OrderEmail,orderemail);
    }

    public boolean verifyErrorMessageInTrackOrderBlock(String errormessage){

        return getText(txt_TrackOrderErrorMsg).equalsIgnoreCase(errormessage);
    }

    public boolean verifyOrderDetailPageHeader(String header){

        return getText(txt_OrderDetail).equalsIgnoreCase(header);
    }

    public boolean verifyOrderNumberDisplayed(String ordernumber){

        return getText(txt_OrderNumberInOrderSummary).equalsIgnoreCase(ordernumber);
    }

    public boolean isRequestReturnTitleDisplayed()
    {
        return isElementDisplayed(lbl_CheckAnOrder);
    }

    public void enterOrderNumber()
    {
        enterTextWithoutScroll(txt_OrderNumber,SecureCheckoutCompletePage.orderNumberInSecureComplete);
    }

    public boolean verifyMyAccountPageHeader(String header){
       waitFor(3000);
        return isTextContain(getText(txt_MyAccountHeader),(header));
    }

    public void enterEmailAndConfirmEmail(String email, String confirmemail){

        int random = getRandomNumber(1000);
        String ranstr = RandomStringUtils.randomAlphabetic(4);
        enterTextWithoutScroll(txt_CreateAccountEmail, email+random +ranstr+ "@gmail.com");
        enterTextWithoutScroll(txt_CreateAccountConfirmEmail,confirmemail+ random +ranstr+ "@gmail.com");

    }

    public void getConfirmEmailIdInCreateAccount()
    {
        confirmEmail=getAttributeValue(txt_CreateAccountConfirmEmail,"value");
    }

    public void enterCreatedUserNameInSignIn()
    {
        enterTextWithoutScroll(txt_Username,confirmEmail);
        System.out.println(txt_Username.getAttribute("value"));
    }

    public void enterNewConfirmPassword(String newConfirmPassword)
    {
        enterTextWithoutScroll(txt_Password,newConfirmPassword);
        clickButtonWithOutScroll(btn_SignIn);
    }






}
