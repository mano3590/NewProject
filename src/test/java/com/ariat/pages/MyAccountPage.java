package com.ariat.pages;

import com.ariat.pagefactory.MyAccountPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends MyAccountPageFactory {

    public static String displayedEmail,OrderNumber,OrderDate,usernamefirstName,firstName,lastName, changedFirstName,changedLastName,username, newConfirmPassword,enteredAddress1;
    public static String titleOftheAddress,firstNameInAddress,lastNameInAddress,enteredAddress2,enteredCity,enteredState,enteredZipcode,enteredMobileNo, changedFirstNameInAddresses;


    public MyAccountPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickEditLinkInEmail(){

        displayedEmail = getText(txt_Email);
        clickButtonWithOutScroll(lnk_EmailPreferanceEdit);
    }

    public void mouseoverUserProfile(){

        mouseOver(lnk_UserProfile);
    }

    public boolean verifyUserProfileScreenDisplayed(){

        return isElementDisplayed(popup_LoginPopOver);
    }

    public boolean verifyGreetingtextDisplayed(){

        return isElementDisplayed(txt_LoginPopOverGreetings);
    }

    public boolean verifyLinksDisplayed(List<String> links){
        boolean flag = true;
        for (int i=0; i<links.size(); i++){
            WebElement element = driver.findElement(By.xpath(" //a[@class='nav-link' and contains(text(),'"+links.get(i)+"')]"));
            if(!getText(element).equalsIgnoreCase(links.get(i))){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void clickUserProfileListedLink(String link){
        mouseoverUserProfile();
        WebElement element = driver.findElement(By.xpath("//a[@class='nav-link' and text()='"+link+"']"));
        clickButtonWithOutScroll(element);
    }

    public boolean verifySigninLinkDisplayed(String link){

        return getText(lnk_UserProfile).equalsIgnoreCase(link);
    }

    public boolean isSelectedProductNameDisplayedInMyOrders(){
        scrollByPixel();
        boolean flag = false;
        for (WebElement element : lst_ProductName) {

            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {

                flag = true;
                break;

            }
        }
        return flag;
    }

    public boolean isOrderNumberDisplayedInMyOrders()
    {
        String[] orderNo= getText(txt_OrderNumber).split(":");
        OrderNumber=orderNo[1];
        return isTextContain(OrderNumber,SecureCheckoutCompletePage.orderNumberInSecureComplete);
    }

    public boolean isOrderedDateDisplayedInMyOrders()
    {
        String[] orderNo= getText(txt_OrderDate).split(":");
        OrderDate=orderNo[1];
        return isTextContain(OrderDate,SecureCheckoutCompletePage.orderDateInSecureComplete);
    }

    public boolean isTotalItemDisplayedInMyOrders()
    {
        return isTextContain(SecureCheckoutCompletePage.totalItems,getText(txt_TotalItems));
    }

    public boolean isTotalPriceDisplayed()
    {
        return getText(txt_TotalPrice).equalsIgnoreCase(SecureCheckoutCompletePage.totalPriceInCheckoutComplete);
    }

    public void clickViewAllLinkInMyOrders()
    {
        clickButtonWithOutScroll(lnk_viewAll);
    }

    public boolean getMyOrdersTextInMyAccountPage()
    {
        return isElementDisplayed(txt_MyOrder);
    }

    public boolean isNoOrdersTextDisplayed()
    {
        waitFor(3000);
        return isElementDisplayed(txt_NoOrder);
    }

    public boolean isOrderStatusDisplayedInMyOrderBlock()
    {


        return isElementDisplayed(txt_OrderStatus);
    }

    public boolean isShippedToEmailIdDisplayedInMyOrderBlock()
    {


        return isElementDisplayed(txt_ShippedTo);
    }
    public boolean isMyAccountHeaderDisplayed()
    {
        return isElementDisplayed(lbl_MyAccount);
    }
    public boolean isWelcomeUserNameDisplayed()
    {
        return isElementDisplayed(txt_WelcomeUserName);
    }
    public boolean isLogoutLinkDisplayed()
    {
        return isElementDisplayed(lnk_logout);
    }
    public boolean isPersonalInformationTextDisplayed()
    {
        return isElementDisplayed(txt_PersonalInformation);
    }

    public boolean isUserNameTextDisplayed()
    {
        String userName= getText(txt_NamePersonalInformation);
        String[] userNameInPersonalInformation = userName.split(" ",userName.length());
         firstName= userNameInPersonalInformation[0];
         lastName= userNameInPersonalInformation[1];
        return isElementDisplayed(txt_NamePersonalInformation);
    }
    public boolean isChangePasswordLinkDisplayed()
    {
        return isElementDisplayed(lnk_ChangePassword);
    }
    public boolean isEditLinkDisplayedInPersonalInformationBlock()
    {
        return isElementDisplayed(lnk_EditPersonalInformation);
    }
    public void clickEditLinkInPersonalInformation()
    {
        clickButtonWithOutScroll(lnk_EditPersonalInformation);
    }
    public boolean isPersonalInformationHeaderDisplayed()
    {
        return isElementDisplayed(lbl_PersonalInformationHeader);
    }
    public boolean isBreadCrumbLinkHomeDisplayedInPersonalInformation()
    {
        return isElementDisplayed(lnk_BreadCrumbHomeInPersonalInformation);
    }

    public boolean isBreadCrumbLinkMyAccountDisplayedInPersonalInformation()
    {
        return isElementDisplayed(lnk_BreadCrumbMyAccountInPersonalInformation);
    }
    public boolean isFirstNameTextboxDisplayedInPersonalInformation()
    {
        return isElementDisplayed(txt_FirstNameInputBox);
    }
    public boolean isLastNameTextboxDisplayedInPersonalInformation()
    {
        return isElementDisplayed(txt_LastNameInputBox);
    }
    public boolean isEmailInputTextboxDisplayedInPersonalInformation()
    {
        return isElementDisplayed(txt_EmailInputBox);
    }
    public boolean isCurrentPasswordTextboxDisplayedInPersonalInformation()
    {
        return isElementDisplayed(txt_CurrentPasswordInputBox);
    }
    public boolean isCancelButtonDisplayedInPersonalInformation()
    {
        return  isElementDisplayed(btn_CancelButton);
    }
    public boolean isSaveButtonDisplayedInPersonalInformation()
    {
        return isElementDisplayed(btn_SaveButton);
    }
    public boolean isBackToMyAccountLinkDisplayedInPersonalInformation()
    {
        return isElementDisplayed(lnk_BackToMyAccount);
    }
    public boolean isContactUsLinkDisplayedInPersonalInformation()
    {
        return isElementDisplayed(lnk_ContactUs);
    }

    public boolean isFirstNameDispayedSameInPersonalInformation()
    {
        return firstName.equalsIgnoreCase(getAttributeValue(txt_FirstNameInputBox,"value"));
    }
    public boolean isLastNameDisplayedInPersonalInformation()
    {
        return lastName.equalsIgnoreCase(getAttributeValue(txt_LastNameInputBox,"value"));
    }

    public boolean isEmailDisplayedInPersonalInformation()
    {
        return displayedEmail.equalsIgnoreCase(getAttributeValue(txt_EmailInputBox,"value"));
    }

    public void getEmailIdInPreference()
    {
        displayedEmail = getText(txt_Email);
    }
    public boolean isPrivacyPolicyLinkDisplayedInPersonalInformation()
    {
        return isElementDisplayed(lnk_PrivacyPolicyInPersonalInformation);
    }

    public void deleteFirstNameInputFieldInPersonalInformationEdit()
    {
        click(txt_FirstNameInputBox);
        txt_FirstNameInputBox.clear();
        txt_FirstNameInputBox.sendKeys(Keys.TAB);
    }

    public void deleteLastNameInputFieldInPersonalInformationEdit()
    {
        click(txt_LastNameInputBox);
        txt_LastNameInputBox.clear();
        txt_LastNameInputBox.sendKeys(Keys.TAB);

    }
    public void deleteConfirmPasswordInputFieldInPersonalInformationEdit()
    {
        click(txt_CurrentPasswordInputBox);
        txt_CurrentPasswordInputBox.clear();
        txt_CurrentPasswordInputBox.sendKeys(Keys.TAB);

    }
    public boolean isErrorMessageDisplayedUnderFirstNameTextBox()
    {
        return isElementDisplayed(txt_ErrorMessageInFirstName);
    }

    public boolean isErrorMessageDisplayedUnderLastNameTextBox()
    {
        return isElementDisplayed(txt_ErrorMessageInLastName);
    }
    public boolean isErrorMessageDisplayedUnderCurrentPasswordTextBox()
    {
        return isElementDisplayed(txt_ErrorMessageInConfirmPassword);
    }
    public void enterLessthanEightCharactersPassword(List<String> password)
    {
        for(int i=0;i<password.size();i++)
        {
            enterTextWithoutScroll(txt_CurrentPasswordInputBox,password.get(i));
            waitFor(3000);
            isErrorMessageDisplayedUnderCurrentPasswordTextBox();
            txt_CurrentPasswordInputBox.clear();

        }
    }

    public void clickSaveButton()
    {
      click(btn_SaveButton);

    }
    public boolean isFirstNameErrorMessageDisplayed()
    {
        waitFor(2000);
        return isElementDisplayed(txt_ErrorMessageInvalidFirstName);
    }
    public boolean isLastNameErrorMessageDisplayed()
    {
        return isElementDisplayed(txt_ErrorMessageInvalidLastName);
    }

    public void enterFirstName(String firstName,String lastName)
    {
        click(txt_FirstNameInputBox);
        txt_FirstNameInputBox.clear();
        enterTextWithoutScroll(txt_FirstNameInputBox,firstName);
        changedFirstName= getAttributeValue(txt_FirstNameInputBox,"value");
        click(txt_LastNameInputBox);
        txt_LastNameInputBox.clear();
        enterTextWithoutScroll(txt_LastNameInputBox,lastName);
        changedLastName=getAttributeValue(txt_LastNameInputBox,"value");

    }

    public void enterInvalidPassword(String invalidPassword)
    {
        enterTextWithoutScroll(txt_CurrentPasswordInputBox,invalidPassword);
    }
    public boolean isPasswordNotMatchErrorMessageDisplayed(String errorMessage)
    {
        return getText(txt_PasswordNotMatchErrorMessage).equalsIgnoreCase(errorMessage);
    }
    public boolean isPrivacyPolicyPopUpDisplayedInPersonalInformation()
    {
        return isElementDisplayed(popUp_PrivacyPolicyInPersonalInformation);
    }
    public void clickPrivacyPolicyLink()
    {
        click(lnk_PrivacyPolicyInPersonalInformation);
    }
    public void clickCloseButtonInPrivacyPolicyInPersonalInformation()
    {
        click(btn_ClosePrivacyPolicyPopUpInPersonalInformation);

    }

    public void clickCancelButtonInPersonalInformation()
    {
        click(btn_CancelButton);
    }

    public boolean isErrorMessageInvalidPassword(String invalidPassword )
    {
        waitFor(4000);
     return isTextContain(getText(txt_ErrorMessage),invalidPassword);
    }
    public boolean isFistNameAndLastNameChanged()
    {
        return (firstName+" "+lastName).equalsIgnoreCase(changedFirstName+" "+changedLastName);
    }
    public void getNameInPersonalInformation() {
        String userName= getText(txt_NamePersonalInformation);
        String[] userNameInPersonalInformation = userName.split(" ",userName.length());
        firstName= userNameInPersonalInformation[0];
        lastName= userNameInPersonalInformation[1];
    }
    public void clickbackToMyAccountLinkInPersonalInformationEditPage()
    {
        click(lnk_BackToMyAccount);
    }
    public void clickChangePasswordLinkInPersonalInformation()
    {
      clickButtonWithOutScroll(lnk_ChangePassword);
    }
    public boolean isPasswordHeaderDisplayed() {return isElementDisplayed(lbl_PasswordHeader);}
    public boolean isCurrentPasswordTextboxDisplayedInPassword()
    {
        return isElementDisplayed(txt_currentPasswordTextBox);
    }
    public boolean isNewPasswordTextboxDisplayedInPassword()
    {
        return isElementDisplayed(txt_NewPassword);
    }
    public boolean isConfirmNewPasswordTextboxDisplayedInPassword()
    {
        return isElementDisplayed(txt_NewConfirmPassword);
    }
    public void clickCurrentPassword()
    {
        click(txt_CurrentPasswordInputBox);
        txt_CurrentPasswordInputBox.sendKeys(Keys.TAB);
    }
    public void clickNewPassword()
    {
        click(txt_NewPassword);
        txt_NewPassword.sendKeys(Keys.TAB);

    }
    public void clickConfirmNewPassword()
    {
        click(txt_NewConfirmPassword);
        txt_NewConfirmPassword.sendKeys(Keys.TAB);

    }
    public boolean isCurrentPasswordErrorMessageDisplayedInPassword()
    {
        return isElementDisplayed(txt_CurrentPasswordErrorMessage);
    }
    public boolean isNewPasswordErrorMessageDisplayedInPassword()
    {
        return isElementDisplayed(txt_NewPasswordErrorMessage);
    }
    public boolean isNewConfirmPasswordErrorMessageDisplayed()
    {
        return isElementDisplayed(txt_NewConfirmPasswordErrorMessage);
    }
    public void enterCurrentPassword(String currentPassword)
    {
        enterTextWithoutScroll(txt_CurrentPasswordInputBox,currentPassword);

    }
    public void enterNewPassword(String newPassword)
    {
        enterTextWithoutScroll(txt_NewPassword,newPassword);
    }
    public void enterConfirmNewPassword(String confirmNewPassword)
    {
        enterTextWithoutScroll(txt_NewConfirmPassword,confirmNewPassword);
    }
    public boolean isInvalidCurrentPasswordErrorMessageDisplayed(String errorMessage)
    {
        return getText(txt_CurrentPasswordErrorMessage).equalsIgnoreCase(errorMessage);
    }
    public boolean isInvalidNewPasswordErrorMessageDisplayed(String errorMessage)
    {
        return getText(txt_NewPasswordErrorMessage).equalsIgnoreCase(errorMessage);
    }
    public boolean isInvalidNewConfirmPasswordErrorMessageDisplayed()
    {
        return isElementDisplayed(txt_NewConfirmPasswordErrorMessage);
    }
    public boolean isVerifyTitleMyAccountPage(String title){
        waitVisibilityOfElement(txt_MyAccount);
        logger.info("Actual -- "+getPageTitle()+" ||   Expected -- "+title);
        return getPageTitle().equalsIgnoreCase(title);

    }

    public void getUserName(){
        String[] UserName= getText(txt_MyAccountProfileName).split(" ",getText(txt_MyAccountProfileName).length());
        username = UserName[0];
    }

    public boolean isAddedProductNameDisplayedInMyAccountPage(){

        boolean flag = false;
        for (WebElement element : lst_ProductNameInWishList) {

            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {

                flag = true;
                break;}
        }
        return flag;
    }

    public boolean isSelectedPriceDisplayedInMyAccountPage(){
        String xpath = "//div[@class='col-8 account-wl-attributes']//div[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public void clickAddToBagInMyAccountPage(){

        String xpath = "//div[@class='col-8 account-wl-attributes']//div[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[7]//button[contains(@class,'add-to-cart')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public void clickBackToMyAccountLink()
    {
        click(lnk_BackToMyAccount);
    }

    public boolean isPasswordNotMatchErrorMessageIsDisplayedInCurrentPasswordField(String errorMessage) {
        return getText(txt_CurrentPasswordErrorMessage).equalsIgnoreCase(errorMessage);
    }

    public void enterCurrentPassword() {
        enterTextWithoutScroll(txt_CurrentPasswordInputBox, SignInPage.confirmPassword);
    }

    public boolean isNoAddressTextDisplayed() {
        return isElementDisplayed(noAddressTextInAddressBlock);
    }

    public boolean isAddressesEditLinkDisplayed() {
        return isElementDisplayed(lnk_EditInAddresses);
    }

    public boolean isAddAddressLinkDisplayed() {
        return isElementDisplayed(lnk_AddAddress);
    }

    public void clickEditLinkInAddressBlock() {
        clickButtonWithOutScroll(lnk_EditInAddresses);
    }

    public boolean isHeaderDisplayed(String addrress) {
        return isElementDisplayed(lbl_pageHeader);
    }

    public boolean isAddNewButtonDisplayed() {
        return isElementDisplayed(btn_AddNew);
    }

    public void clickAddAddressInAddressBlock() {
        clickButtonWithOutScroll(lnk_AddAddress);
    }

    public boolean isAddressBreadCrumbDisplayedInAddressField() {
        return isElementDisplayed(lnk_BreadCrumbAddressLink);
    }

    public boolean isErrorMessageDisplayedInAddressTitle() {
        return isElementDisplayed(txt_ErrorMessageAddressTitle);
    }

    public boolean isFirstNameErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageFirstNameInAddress);
    }

    public boolean isLastNameErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageLastNameInAddress);
    }

    public boolean isAddress1ErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageAddress1);
    }

    public boolean isCityErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageCity);
    }

    public boolean isStateErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageState);
    }

    public boolean isZipcodeErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageZipcode);
    }

    public boolean isPhoneNoErrorMessageDisplayedInAddress() {
        return isElementDisplayed(txt_ErrorMessageMobile);
    }

    public boolean isAddressTitleTextboxIsDisplayed() {
        return isElementDisplayed(txt_AddressTitleInputBox);
    }

    public boolean isFirstNameTextboxDisplayedInAddress() {
        return isElementDisplayed(txt_FirstNameInputBoxInAddress);
    }

    public boolean isLastNameTextboxDisplayedInAddress() {
        return isElementDisplayed(txt_LastNameInputBoxInAddress);
    }

    public boolean isAddress1TextboxDisplayed() {
        return isElementDisplayed(txt_Address1InputBox);
    }

    public boolean isAddress2TextboxDisplayed() {
        return isElementDisplayed(txt_Address2InputBox);
    }

    public boolean isCityTextboxDisplayed() {
        return isElementDisplayed(txt_CityInputBox);
    }

    public boolean isStateCodeTextboxIsDisplayed() {
        return isElementDisplayed(ddl_stateCode);
    }

    public boolean isZipcodeTextboxDisplayed() {
        return isElementDisplayed(txt_ZipCodeInputBox);
    }

    public boolean isPhoneNoTextboxDisplayed() {
        return isElementDisplayed(txt_MobileInputBox);
    }

    public void clickMyAccountBreadCrumbLink() {
        scrollToTop();
        click(lnk_BreadCrumbMyAccountInPersonalInformation);
    }

    public void enterAddressTitleInAddress(String addressTitle) {
        int random = getRandomNumber(1000);
        enterTextWithoutScroll(txt_AddressTitleInputBox, addressTitle+random);
        titleOftheAddress =getAttributeValue(txt_AddressTitleInputBox,"value");
    }

    public void enterFirstNameInAddress(String firstName) {
        enterTextWithoutScroll(txt_FirstNameInputBoxInAddress, firstName);
        firstNameInAddress= getAttributeValue(txt_FirstNameInputBoxInAddress,"value");
    }

    public void enterLastNameInAddress(String lastName) {
        enterTextWithoutScroll(txt_LastNameInputBoxInAddress, lastName);
        lastNameInAddress= getAttributeValue(txt_LastNameInputBoxInAddress,"value");
    }

    public void enterAddress1InAddress(String address1) {
        enterTextWithoutScroll(txt_Address1InputBox, address1);
        enteredAddress1= getAttributeValue(txt_Address1InputBox,"value");
    }

    public void enterAddress2InAddress(String address2) {
        enterTextWithoutScroll(txt_Address2InputBox, address2);
        enteredAddress2=getAttributeValue(txt_Address2InputBox,"value");
    }

    public void enterCityInAddress(String city) {
        enterTextWithoutScroll(txt_CityInputBox, city);
        enteredCity=getAttributeValue(txt_CityInputBox,"value");
    }

    public void enterStateInAddress(String state) {
        click(ddl_stateCode);
        SelectByVisibleText(ddl_stateCode, state);
        enteredState=getAttributeValue(ddl_stateCode,"value");
    }

    public void enterZipCodeInAddress(String zipCode) {
        enterTextWithoutScroll(txt_ZipCodeInputBox, zipCode);
        enteredZipcode=getAttributeValue(txt_ZipCodeInputBox,"value");
    }

    public void enterMobileNumberInAddress(String mobileNo) {
        enterTextWithoutScroll(txt_MobileInputBox, mobileNo);
        enteredMobileNo= getAttributeValue(txt_MobileInputBox,"value");
    }

    public boolean isEditAddressPopUpDisplayed() {
        return isElementDisplayed(popup_EditAddress);
    }
    public boolean isUSeAddressAsIsButtonDisplayedInPopup()
    {
        return isElementDisplayed(btn_UseAddressAsIsPopup);
    }
    public boolean isEditAddressButtonIsDisplayedInPopup()
    {
        return isElementDisplayed(btn_EditAddressInPopup);
    }
    public boolean isCloseButtonDisplayedInPopup()
    {
        return isElementDisplayed(btn_CloseInPopup);
    }
    public boolean isEnteredAddressDisplayedInPopup()
    {
        return isTextContain(getText(txt_DisplayedAddressInPopup),enteredAddress1);
    }
    public void clickUseAddressAsIsButtonInpopup()
    {
        click(btn_UseAddressAsIsPopup);
    }
    public boolean isInvalidZipcodeErrorMessageDisplayed()
    {
        return isElementDisplayed(txt_InvalidZipcodeErrorMessage);
    }
    public boolean isAddressTitleMatchInAddresses()
    {
        String xpath="//h2[@class='address-heading float-left' and contains(text(),'"+titleOftheAddress+"')]";
        WebElement enteredAddress= driver.findElement(By.xpath(xpath));
        return isTextContain(getText(enteredAddress),titleOftheAddress.toUpperCase());
    }
    public boolean isFirstNameMatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//span[@class='firstName']";
        WebElement enteredFirstName= driver.findElement(By.xpath(xpath));
        return isTextContain(getText(enteredFirstName),firstNameInAddress);
    }
    public boolean isLastNameMatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//span[@class='lastName']";
        WebElement enteredLastName=driver.findElement(By.xpath(xpath));
        return isTextContain(getText(enteredLastName),lastNameInAddress);
    }

    public boolean isAddress1MatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//div[@class='address1']";
        WebElement Address1=driver.findElement(By.xpath(xpath));
        return isTextContain(getText(Address1),enteredAddress1);
    }



    public boolean isAddress2MatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//div[@class='address2']";
        WebElement Address2=driver.findElement(By.xpath(xpath));
        return isTextContain(getText(Address2),enteredAddress2);
    }

    public boolean isCityMatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//span[@class='city']";
        WebElement city=driver.findElement(By.xpath(xpath));
        return isTextContain(getText(city),enteredCity);
    }

    public boolean isStateMatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//span[@class='stateCode']";
        WebElement stateCode=driver.findElement(By.xpath(xpath));
        return isTextContain(getText(stateCode),enteredState);
    }

    public boolean isPostalCodeMatchInAddresses()
    {
        String xpath = "//div[@class='card-header']//h2[contains(text(),'"+titleOftheAddress+"')]//ancestor::div[2]//div[@class='address-summary']//span[@class='postalCode']";
        WebElement postalCode=driver.findElement(By.xpath(xpath));
        System.out.println(postalCode.getText());
        System.out.println(enteredZipcode);
        return isTextContain(getText(postalCode),enteredZipcode);
    }

    public boolean isPhoneNoDisplayedInAddresses()
    {
        String xpath="//h2[contains(text(),'"+titleOftheAddress+"')]//following::div[contains(text(),'"+enteredMobileNo+"')]";
        WebElement displayedMobileNoInAddresses = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(displayedMobileNoInAddresses),enteredMobileNo);
    }

    public void clickEditLinkInAddedAddresses()
    {
        String xpath="//h2[contains(text(),'"+titleOftheAddress+"')]//following-sibling::div//a[contains(text(),'Edit')]";
        WebElement editLink = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(editLink);
    }
    public void editFirstNameInAddress(String changeAddress)
    {
        txt_FirstNameInputBoxInAddress.clear();
        enterTextWithoutScroll(txt_FirstNameInputBoxInAddress,changeAddress);
       changedFirstNameInAddresses=getAttributeValue(txt_FirstNameInputBoxInAddress,"value");
    }

    public boolean isChangedFirstNameInAddress()
    {
        String xpath ="//h2[contains(text(),'"+titleOftheAddress+"')]//following::span[@class='firstName']";
       WebElement  changedFirstName = driver.findElement(By.xpath(xpath));
       return isTextContain(getText(changedFirstName),changedFirstNameInAddresses);
    }

    public void clickMakeDefaultLink()
    {
        String xpath="//h2[contains(text(),'"+titleOftheAddress+"')]//following::div[8][@class='card-make-default-link']//a['Make this your default address']";
        WebElement defaultLink=driver.findElement(By.xpath(xpath));
        click(defaultLink);
    }

    public boolean isDefaultAddressTitleChanged()
    {
        String changedDefaultTitle = "Default"+" "+"|"+" "+titleOftheAddress  ;
        String xpath="//h2[@class='address-heading float-left' and contains(text(),'"+titleOftheAddress+"')]";
        WebElement defaultAddressTitle=driver.findElement(By.xpath(xpath));
        return isTextContain(changedDefaultTitle.toUpperCase(),getText((defaultAddressTitle)));

    }
    public void clickDeleteLinkInAddresses()
    {
        String xpath="//h2[contains(text(),'"+titleOftheAddress+"')]//following-sibling::div//a[contains(text(),'Delete')]";
        WebElement deleteLink = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(deleteLink);
    }

    public boolean isVerifyTheAddressDeleted()
    {
        boolean flag=true;
           for(int i=0;i<lst_AddressTitle.size();i++)
           {
               if(isTextContain(getText(lst_AddressTitle.get(i)),titleOftheAddress))
               {
                   flag=false;
                   break;
               }
           }
           return flag;
    }


    public boolean isDeleteAddressPopUpDisplayed()
    {
        return isElementDisplayed(popup_DeleteAddress);
    }
    public boolean isDeleteAddressTextDisplayedInDeletePopUp()
    {
        return isElementDisplayed(txt_deleteAddress);
    }
    public boolean isCancelButtonDisplayedInPopup()
    {
        return isElementDisplayed(btn_CancelInPopUp);
    }
    public boolean isDeleteAddressButtonDisplayedInPopup()
    {
        return isElementDisplayed(btn_DeleteAddressInPopup);
    }
    public boolean isCloseButtonDisplayedInDeleteAddressPopUp()
    {
        return isElementDisplayed(btn_closeInDeleteAddressPopUp);
    }
    public void clickYesButtonInDeletePopup() {
        clickButtonWithOutScroll(btn_DeleteAddressInPopup);
        waitFor(5000);


    }

    public void clickCloseButton ()
    {
        click(btn_closeInDeleteAddressPopUp);
    }

    public boolean isChangedDefaultAddress1IsDisplayedInMyAccountPage()
    {
        String xpath = "//div[@class='card-body']//child::div[contains(text(),'"+enteredAddress1+"')]";
        WebElement changedDefaultAddress1InMyAccount = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(changedDefaultAddress1InMyAccount),enteredAddress1);
    }

    public boolean isChangedDefaultCityIsDisplayedInMyAccountPage()
    {
        String xpath = "//div[@class='card-body']//child::div[contains(text(),'"+enteredCity+"')]";
        WebElement changedDefaultCityInMyAccount = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(changedDefaultCityInMyAccount),enteredCity);
    }

    public boolean isChangedDefaultPhoneNoIsDisplayedInMyAccountPage()
    {
        String xpath = "//div[@class='card-body']//child::div[contains(text(),'"+enteredMobileNo+"')]";
        WebElement changedDefaultCityInMyAccount = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(changedDefaultCityInMyAccount),enteredMobileNo);
    }

    public boolean isAlreadyAddedAddressTitleErrorMessageIsDisplayed()
    {
        scrollToTop();
        return isElementDisplayed(txt_AddressTitleErrorMessage);
    }
    public void clickAddNewAddressButton()
    {
        click(btn_AddNewAddress);
    }
    public void enterAlreadyAddedTitleInAddressTitleInputField()
    {
        scrollToTop();
        enterTextWithoutScroll(txt_AddressTitleInputBox,titleOftheAddress);

    }













}
