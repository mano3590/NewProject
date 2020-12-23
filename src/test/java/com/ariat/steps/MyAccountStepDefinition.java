package com.ariat.steps;

import com.ariat.pages.MyAccountPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MyAccountStepDefinition extends MyAccountPage {

    @When("^I click the Edit link on My Account Page$")
    public void i_click_the_Edit_link_on_My_Account_Page() {
        
        
        clickEditLinkInEmail();
    }

    @When("^I Pointover the userprofile link$")
    public void i_Pointover_the_userprofile_link()  {

        mouseoverUserProfile();
    }

    @Then("^I verify the Greetings text is displayed on the Login Popover Screen$")
    public void i_verify_the_Greetings_text_is_displayed_on_the_Login_Popover_Screen()  {
        
        Assert.assertTrue(verifyGreetingtextDisplayed());
    }

    @Then("^I verify UserProfile Popover Screen is displayed$")
    public void I_verify_UserProfile_Popover_Screen_is_displayed()  {

        Assert.assertTrue(verifyUserProfileScreenDisplayed());
    }

    @Then("^I verify below listed Link texts are displayed in the login Popover Screen$")
    public void i_verify_below_listed_Link_texts_are_displayed_in_the_login_Popover_Screen(List<String> links)  {

        Assert.assertTrue(verifyLinksDisplayed(links));
    }

    @When("^I clicks the \"([^\"]*)\" link on the User Profile screen$")
    public void I_clicks_the_link_on_the_User_Profile_screen(String link)  {

        clickUserProfileListedLink(link);
        
    }

    @Then("^I verify the \"([^\"]*)\" text is displayed in the Header$")
    public void i_verify_the_text_is_displayed_in_the_Header(String text)  {

        Assert.assertTrue(verifySigninLinkDisplayed(text));
        
    }

    @Then("^I verify the Order Number, Date Ordered,total price, total Items and Product Name in My Orders in My Account page$")
    public void i_verify_the_Order_Number_Date_Ordered_total_price_total_Items_and_Product_Name_in_My_Orders_in_My_Account_page()  {
        Assert.assertTrue(isSelectedProductNameDisplayedInMyOrders());
        Assert.assertTrue(isOrderNumberDisplayedInMyOrders());
        Assert.assertTrue(isOrderedDateDisplayedInMyOrders());
        Assert.assertTrue(isTotalItemDisplayedInMyOrders());
        Assert.assertTrue(isTotalPriceDisplayed());

    }

    @When("^I click the view all link in My Order in My Account page$")
    public void i_click_the_view_all_link_in_My_Order_in_My_Account_page()  {
        clickViewAllLinkInMyOrders();
    }


    @And("^I verify My Orders text is displayed in the My Orders block in My Account page$")
    public void iVerifyMyOrdersTextIsDisplayedInTheMyOrdersBlockInMyAccountPage() {
        Assert.assertTrue(getMyOrdersTextInMyAccountPage());

    }

    @And("^I verify no order text is displayed in the My Account block$")
    public void iVerifyNoOrderTextIsDisplayedInTheMyAccountBlock() {
        Assert.assertTrue(isNoOrdersTextDisplayed());
    }

    @Then("^I verify the Order Status and Shipped to email id is displayed in the My Account page$")
    public void iVerifyTheOrderStatusAndShippedToEmailIdIsDisplayedInTheMyAccountPage() {
        Assert.assertTrue(isOrderStatusDisplayedInMyOrderBlock());
        Assert.assertTrue(isShippedToEmailIdDisplayedInMyOrderBlock());
    }
    @And("^I verify My Account title, Welcome UserName text and Logout is present in the page$")
    public void iVerifyMyAccountTitleWelcomeUserNameTextLogoutIsPresentInThePage() {
        Assert.assertTrue(isMyAccountHeaderDisplayed());
        Assert.assertTrue(isWelcomeUserNameDisplayed());
        Assert.assertTrue(isLogoutLinkDisplayed());

    }

    @And("^I verify Personal Information block contains Personal Information text, Name, Change Password Link and Edit Link$")
    public void iVerifyPersonalInformationBlockContainsPersonalInformationTextNameChangePasswordLinkAndEditLink() {
        Assert.assertTrue(isPersonalInformationTextDisplayed());
        Assert.assertTrue(isUserNameTextDisplayed());
        Assert.assertTrue(isChangePasswordLinkDisplayed());
        Assert.assertTrue(isEditLinkDisplayedInPersonalInformationBlock());
    }

    @When("^I click the edit Link in the personal Information block in the My Account Page$")
    public void iClickTheEditLinkInThePersonalInformationBlockInTheMyAccountPage() {
        clickEditLinkInPersonalInformation();

    }

    @Then("^I verify the page navigates to the Personal Information Page$")
    public void iVerifyThePageNavigatesToThePersonalInformationPage() {
        Assert.assertTrue(isPersonalInformationHeaderDisplayed());
    }

    @And("^I verify Home/ My Account tab is present in the edit Page$")
    public void iVerifyHomeMyAccountTabIsPresentInTheEditPage() {
        Assert.assertTrue(isBreadCrumbLinkHomeDisplayedInPersonalInformation());
        Assert.assertTrue(isBreadCrumbLinkMyAccountDisplayedInPersonalInformation());
    }

    @Then("^I verify FirstName,LastName,Email,CurrentPassword textbox,Save button, Cancel button, Back to My Account link, Privacy Policy Link and Contact us link are displayed$")
    public void iVerifyFirstNameLastNameEmailCurrentPasswordTextboxSaveButtonCancelButtonBackToMyAccountLinkAndContactUsLinkAreDisplayed() {
        Assert.assertTrue(isFirstNameTextboxDisplayedInPersonalInformation());
        Assert.assertTrue(isLastNameTextboxDisplayedInPersonalInformation());
        Assert.assertTrue(isEmailInputTextboxDisplayedInPersonalInformation());
        Assert.assertTrue(isCurrentPasswordTextboxDisplayedInPersonalInformation());
        Assert.assertTrue(isSaveButtonDisplayedInPersonalInformation());
        Assert.assertTrue(isCancelButtonDisplayedInPersonalInformation());
        Assert.assertTrue(isBackToMyAccountLinkDisplayedInPersonalInformation());
        Assert.assertTrue(isContactUsLinkDisplayedInPersonalInformation());
        Assert.assertTrue(isPrivacyPolicyLinkDisplayedInPersonalInformation());
    }

    @And("^I verify the FirstName, LastName and Email Id values are entered by default is same as displayed in the My Account page$")
    public void iVerifyTheFirstNameLastNameEmailIdValuesAreEnteredByDefaultIsSameAsDisplayedInTheMyAccountPage() {
        Assert.assertTrue(isFirstNameDispayedSameInPersonalInformation());
        Assert.assertTrue(isLastNameDisplayedInPersonalInformation());
        Assert.assertTrue(isEmailDisplayedInPersonalInformation());

    }

    @And("^I get the Email Id in the Email Preferences$")
    public void iGetTheEmailIdInTheEmailPreferences() {
        getEmailIdInPreference();
    }

    @When("^I delete the FirstName and  switch off the field in the personal information edit block$")
    public void iDeleteTheFirstNameAndSwitchOffTheFieldInThePersonalInformationEditBlock() {
        deleteFirstNameInputFieldInPersonalInformationEdit();

    }

    @Then("^I verify the error Message Please Enter a valid Value is displayed under the First Name Input box$")
    public void i_verify_the_error_Message_Please_Enter_a_valid_Value_is_displayed_under_the_First_Name_Input_box()  {
        Assert.assertTrue(isErrorMessageDisplayedUnderFirstNameTextBox());
    }

    @When("^I delete the LastName and  switch off the field in the personal information edit block$")
    public void iDeleteTheLastNameAndSwitchOffTheFieldInThePersonalInformationEditBlock() {
        deleteLastNameInputFieldInPersonalInformationEdit();
    }

    @Then("^I verify the error Message Please Enter a valid Value is displayed under the Last Name Input box$")
    public void i_verify_the_error_Message_Please_Enter_a_valid_Value_is_displayed_under_the_Last_Name_Input_box()  {
        Assert.assertTrue(isErrorMessageDisplayedUnderLastNameTextBox());
    }

    @When("^I delete the Confirm Password and  switch off the field in the personal information edit block$")
    public void iDeleteTheConfirmPasswordAndSwitchOffTheFieldInThePersonalInformationEditBlock() {
        deleteConfirmPasswordInputFieldInPersonalInformationEdit();
    }

    @Then("^I verify the error Message Please Enter a valid Value is displayed under the Confirm Password Input box$")
    public void i_verify_the_error_Message_Please_Enter_a_valid_Value_is_displayed_under_the_Confirm_Password_Input_box()  {
       Assert.assertTrue(isErrorMessageDisplayedUnderCurrentPasswordTextBox());
    }

    @When("^I enter the Current Password less than eight characters in the input field and verify the error Message$")
    public void iEnterTheCurrentPasswordLessThanEightCharactersInTheInputFieldAndVerifyTheErrorMessage(List<String> password) {
        enterLessthanEightCharactersPassword(password);
    }

    @When("^I delete the FirstName and LastName in the Personal Information Edit Page$")
    public void iDeleteTheFirstNameAndLastNameInThePersonalInformationEditPage() {
        scrollToTop();
        deleteFirstNameInputFieldInPersonalInformationEdit();
        deleteLastNameInputFieldInPersonalInformationEdit();


    }

    @And("^I click the save button in the Edit page$")
    public void iClickTheSaveButtonInThePersonalInformationEditPage() {
        clickSaveButton();
    }
    @Then("^I verify the error Message This Field is Required is displayed$")
    public void iVerifyTheErrorMessageThisFieldIsRequiredIsDisplayed() {
        Assert.assertTrue(isFirstNameErrorMessageDisplayed());
        Assert.assertTrue(isLastNameErrorMessageDisplayed());
    }


    @When("^I enter the \"([^\"]*)\" and \"([^\"]*)\" in the Personal Information$")
    public void iEnterTheAndInThePersonalInformation(String firstName, String lastName)  {
        enterFirstName(firstName,lastName);
    }

    @And("^I enter the \"([^\"]*)\" in the Personal Information$")
    public void iEnterTheInThePersonalInformation(String invalidPassword)  {
        enterInvalidPassword(invalidPassword);

    }

    @Then("^I verify the \"([^\"]*)\" is displayed under the Current Password field$")
    public void iVerifyTheIsDisplayedUnderTheCurrentPasswordField(String errorMessage)  {
        Assert.assertTrue(isPasswordNotMatchErrorMessageDisplayed(errorMessage));

    }

    @When("^I click the Privacy Policy Link in the Personal Information Page$")
    public void iClickThePrivacyPolicyLinkInThePersonalInformationPage() {
        clickPrivacyPolicyLink();

    }

    @Then("^I verify the Privacy Policy Popup is Displayed$")
    public void iVerifyThePrivacyPolicyPopupIsDisplayed() {
        Assert.assertTrue(isPrivacyPolicyLinkDisplayedInPersonalInformation());
        clickCloseButtonInPrivacyPolicyInPersonalInformation();

    }

    @When("^I click the Cancel button in the Personal Information$")
    public void iClickTheCancelButtonInThePersonalInformation() {
        waitFor(3000);
        clickCancelButtonInPersonalInformation();
    }

    @Then("^I verify the \"([^\"]*)\" is displayed under the Current Password field in Personal Information$")
    public void iVerifyTheIsDisplayedUnderTheCurrentPasswordFieldInPersonalInformation(String invalidPassword)  {
        Assert.assertTrue(isErrorMessageInvalidPassword(invalidPassword ));

    }

    @Then("^I verify FirstName and LastName has changed in the Personal Information block in My Account$")
    public void iVerifyFirstNameAndLastNameHasChangedInThePersonalInformationBlockInMyAccount() {
        Assert.assertTrue(isFistNameAndLastNameChanged());

    }


    @And("^I get the Name from Personal Information in My Account block$")
    public void iGetTheNameFromPersonalInformationInMyAccountBlock() {
        getNameInPersonalInformation();
    }

    @And("^I click the Back To My account Link in the Edit Page$")
    public void iClickTheBackToMyAccountLinkInTheEditPage() {
        clickbackToMyAccountLinkInPersonalInformationEditPage();
    }


    @When("^I click the Change Password link in the personal information$")
    public void iClickTheChangePasswordLinkInThePersonalInformation() {
        clickChangePasswordLinkInPersonalInformation();
    }

    @Then("^I verify it navigates to the Password screen Page$")
    public void iVerifyItNavigatesToThePasswordScreenPage() {
        Assert.assertTrue(isPasswordHeaderDisplayed());

    }

    @And("^I verify Current password, New Password and confirm Password textboxes are present$")
    public void iVerifyCurrentPasswordNewPasswordAndConfirmPasswordTextboxesArePresent() {
        Assert.assertTrue(isCurrentPasswordTextboxDisplayedInPassword());
        Assert.assertTrue(isNewPasswordTextboxDisplayedInPassword());
        Assert.assertTrue(isConfirmNewPasswordTextboxDisplayedInPassword());
    }

    @Then("^I verify the Cancel button, Save Button and Back to My Account link are displayed in the Password Page$")
    public void iVerifyTheCancelButtonSaveButtonAndBackToMyAccountLinkAreDisplayedInThePasswordPage() {
        Assert.assertTrue(isSaveButtonDisplayedInPersonalInformation());
        Assert.assertTrue(isCancelButtonDisplayedInPersonalInformation());
        Assert.assertTrue(isBackToMyAccountLinkDisplayedInPersonalInformation());
    }

    @When("^I click the Current password, New Password and confirm Password textboxes and switch off the field$")
    public void iClickTheCurrentPasswordNewPasswordAndConfirmPasswordTextboxesAndSwitchOffTheField() {
        clickCurrentPassword();
        clickNewPassword();
        clickConfirmNewPassword();

    }

    @Then("^I verify the error message Please enter a valid value is display in the Password page$")
    public void iVerifyTheErrorMessagePleaseEnterAValidValueIsDisplayInThePasswordPage() {
        Assert.assertTrue(isCurrentPasswordErrorMessageDisplayedInPassword());
        Assert.assertTrue(isNewPasswordErrorMessageDisplayedInPassword());
        Assert.assertTrue(isNewConfirmPasswordErrorMessageDisplayed());
    }

    @Then("^I verify the \"([^\"]*)\" is diplayed under the Current password and New Password input field in Password Page$")
    public void iVerifyTheIsDiplayedUnderTheCurrentPasswordAndNewPasswordInputFieldInPasswordPage(String errorMessage)  {
        Assert.assertTrue(isInvalidCurrentPasswordErrorMessageDisplayed(errorMessage));
        Assert.assertTrue(isInvalidNewPasswordErrorMessageDisplayed(errorMessage));

    }

    @And("^I verify the Error Message Password does not match is displayed in the Confirm Password in Password Page$")
    public void iVerifyTheErrorMessagePasswordDoesNotMatchIsDisplayedInThePasswordPage() {
        Assert.assertTrue(isInvalidNewConfirmPasswordErrorMessageDisplayed());
    }


    @When("^I enter the \"([^\"]*)\" in the Current Password in Password Page$")
    public void iEnterTheInTheCurrentPasswordInPasswordPage(String currentPassword)  {
        enterCurrentPassword(currentPassword);

    }

    @And("^I enter the \"([^\"]*)\" in the New Password in Password Page$")
    public void iEnterTheInTheNewPasswordInPasswordPage(String newPassword)  {
        enterNewPassword(newPassword);

    }

    @And("^I enter the \"([^\"]*)\" in the Confirm New Password in Password Page$")
    public void iEnterTheInTheConfirmNewPasswordInPasswordPage(String confirmNewPassword)  {
        enterConfirmNewPassword(confirmNewPassword);

    }

    @Then("^I verify that title \"([^\"]*)\" of the My Account page$")
    public void iVerifyThatTitleOfTheMyAccountPage(String title)  {

        Assert.assertTrue(isVerifyTitleMyAccountPage(title));
    }

    @When("^I get the User Name on the My Account Page$")
    public void i_get_the_User_Name_on_the_My_Account_Page(){

        getUserName();
    }

    @Then("^I verify that selected product Name and Price are displayed in the MyAccount page$")
    public void i_verify_that_selected_product_Name_and_Price_are_displayed_in_the_MyAccount_page() {
        Assert.assertTrue(isAddedProductNameDisplayedInMyAccountPage());
        Assert.assertTrue(isSelectedPriceDisplayedInMyAccountPage());
    }

    @When("^I click Add To Bag on My Account Page$")
    public void I_click_Add_To_Bag_on_My_Account_Page() {


        clickAddToBagInMyAccountPage();
    }

    @And("^I click the Back To My account Link on the Page$")
    public void iClickTheBackToMyAccountLinkOnThePage() {

        clickBackToMyAccountLink();
    }
    @And("^I verify the \"([^\"]*)\"  is displayed in the Current Password in Password Page$")
    public void iVerifyTheIsDisplayedInTheCurrentPasswordInPasswordPage(String errorMessage)  {
        Assert.assertTrue(isPasswordNotMatchErrorMessageIsDisplayedInCurrentPasswordField(errorMessage));
        waitFor(3000);
    }


    @And("^I enter the Current password in the Password Password page$")
    public void iEnterTheCurrentPasswordInThePasswordPasswordPage() {
        enterCurrentPassword();

    }
    @And("^I verify you have no address text is displayed in the Addresses block$")
    public void iVerifyYouHaveNoAddressTextIsDisplayedInTheAddressesBlock() {
        Assert.assertTrue(isNoAddressTextDisplayed());

    }

    @And("^I verify Edit Link and Add Address link is displayed in the Addresses Field$")
    public void iVerifyEditLinkAndAddAddressLinkIsDisplayedInTheAddressesField() {
        Assert.assertTrue(isAddressesEditLinkDisplayed());
        Assert.assertTrue(isAddAddressLinkDisplayed());
    }

    @When("^I click the Edit Link in the Addresses block in My account$")
    public void iClickTheEditLinkInTheAddressesBlockInMyAccount() {
        clickEditLinkInAddressBlock();

    }

    @Then("^I verify the Header \"([^\"]*)\" of the page is Displayed$")
    public void iVerifyTheHeaderOfThePageIsDisplayed(String address)  {
        Assert.assertTrue(isHeaderDisplayed(address));

    }
    @And("^I verify the Back to My account Link and Add New Button is displayed in the Address page$")
    public void iVerifyTheBackToMyAccountLinkAndAddNewButtonIsDisplayedInTheAddressPage() {
        Assert.assertTrue(isAddNewButtonDisplayed());
        Assert.assertTrue(isBackToMyAccountLinkDisplayedInPersonalInformation());
    }

    @And("^I click the Add Address Link in the Addresses block in My account$")
    public void iClickTheAddAddressLinkInTheAddressesBlockInMyAccount() {
        clickAddAddressInAddressBlock();
    }

    @And("^I verify Home/ My Account/ Addresses tab is present in the edit Page$")
    public void iVerifyHomeMyAccountAddressesTabIsPresentInTheEditPage() {
        Assert.assertTrue(isBreadCrumbLinkHomeDisplayedInPersonalInformation());
        Assert.assertTrue(isBreadCrumbLinkMyAccountDisplayedInPersonalInformation());
        Assert.assertTrue(isAddressBreadCrumbDisplayedInAddressField());
    }


    @Then("^I verify AddressTitle, FirstName, LastName, Address, Zipcode, State,City, Mobile No textboxes and cancel, saveButton are displayed in the Address page$")
    public void iVerifyAddressTitleFirstNameLastNameAddressZipcodeStateCityMobileNoTextboxesAndCancelSaveButtonAreDisplayedInTheAddressPage() {
        Assert.assertTrue(isAddressTitleTextboxIsDisplayed());
        Assert.assertTrue(isFirstNameTextboxDisplayedInAddress());
        Assert.assertTrue(isLastNameTextboxDisplayedInAddress());
        Assert.assertTrue(isAddress1TextboxDisplayed());
        Assert.assertTrue(isAddress2TextboxDisplayed());
        Assert.assertTrue(isCityTextboxDisplayed());
        Assert.assertTrue(isStateCodeTextboxIsDisplayed());
        Assert.assertTrue(isZipcodeTextboxDisplayed());
        Assert.assertTrue(isPhoneNoTextboxDisplayed());

    }

    @Then("^I verify the error Messages are Displayed under all the text boxes$")
    public void iVerifyTheErrorMessagesAreDisplayedUnderAllTheTextBoxes() {
        Assert.assertTrue(isErrorMessageDisplayedInAddressTitle());
        Assert.assertTrue(isFirstNameErrorMessageDisplayedInAddress());
        Assert.assertTrue(isLastNameErrorMessageDisplayedInAddress());
        Assert.assertTrue(isAddress1ErrorMessageDisplayedInAddress());
        Assert.assertTrue(isCityErrorMessageDisplayedInAddress());
        Assert.assertTrue(isStateErrorMessageDisplayedInAddress());
        Assert.assertTrue(isZipcodeErrorMessageDisplayedInAddress());
        Assert.assertTrue(isPhoneNoErrorMessageDisplayedInAddress());
        Assert.assertTrue(isCancelButtonDisplayedInPersonalInformation());
        Assert.assertTrue(isSaveButtonDisplayedInPersonalInformation());

    }

    @When("^I click the MyAccount Breadcrumb link in the edit page$")
    public void iClickTheMyAccountBreadcrumbLinkInTheEditPage() {
        clickMyAccountBreadCrumbLink();
    }

    @And("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" in the address field$")
    public void iEnterAndInTheAddressField(String addressTitle, String firstName, String lastName, String address1, String address2, String city, String state, String zipcode, String mobileNumber) throws Throwable {
        enterAddressTitleInAddress(addressTitle);
        enterFirstNameInAddress(firstName);
        enterLastNameInAddress(lastName);
        enterAddress1InAddress(address1);
        enterAddress2InAddress(address2);
        enterCityInAddress(city);
        enterStateInAddress(state);
        enterZipCodeInAddress(zipcode);
        enterMobileNumberInAddress(mobileNumber);

    }

    @Then("^I verify the Verify Your Address pop up is Displayed$")
    public void iVerifyTheVerifyYourAddressPopUpIsDisplayed() {
        Assert.assertTrue(isEditAddressPopUpDisplayed());


    }

    @And("^I verify Use Address as is, Edit Address button and close button are displayed in the pop up$")
    public void iVerifyUseAddressAsIsEditAddressButtonAndCloseButtonAreDisplayedInThePopUp() {
        Assert.assertTrue(isUSeAddressAsIsButtonDisplayedInPopup());
        Assert.assertTrue(isEditAddressButtonIsDisplayedInPopup());
        Assert.assertTrue(isCloseButtonDisplayedInPopup());

    }
    @And("^I verify the Address is displayed in the Pop up$")
    public void iVerifyTheAddressIsDisplayedInThePopUp() {
        Assert.assertTrue(isEnteredAddressDisplayedInPopup());


    }

    @When("^I click the Use Address as is button in the Pop up$")
    public void iClickTheUseAddressAsIsButtonInThePopUp() {
        clickUseAddressAsIsButtonInpopup();
        waitFor(5000);
    }


    @Then("^I verify the error message is displayed in the zipcode textbox$")
    public void iVerifyTheErrorMessageIsDisplayedInTheZipcodeTextbox() {
        Assert.assertTrue(isZipcodeErrorMessageDisplayedInAddress());
        waitFor(5000);

    }

    @Then("^I verify the Invalid zipcode error message is displayed in the zipcode textbox$")
    public void iVerifyTheInvalidZipcodeErrorMessageIsDisplayedInTheZipcodeTextbox() {
        Assert.assertTrue(isInvalidZipcodeErrorMessageDisplayed());
    }


    @And("^I verify the Added Address is displayed in the page$")
    public void iVerifyTheAddedAddressIsDisplayedInThePage() {
        Assert.assertTrue(isAddressTitleMatchInAddresses());
        Assert.assertTrue(isFirstNameMatchInAddresses());
        Assert.assertTrue(isLastNameMatchInAddresses());
        Assert.assertTrue(isAddress1MatchInAddresses());
        Assert.assertTrue(isAddress2MatchInAddresses());
        Assert.assertTrue(isCityMatchInAddresses());
        Assert.assertTrue(isStateMatchInAddresses());
        Assert.assertTrue(isPostalCodeMatchInAddresses());
        Assert.assertTrue(isPhoneNoDisplayedInAddresses());

   }

    @When("^I click the Edit Address Link in the Added Address$")
    public void iClickTheEditAddressLinkInTheAddedAddress() {
        clickEditLinkInAddedAddresses();

    }

    @And("^I edit the \"([^\"]*)\" in the addresses page$")
    public void iEditTheInTheAddressesPage(String changeAddress) throws Throwable {
        editFirstNameInAddress(changeAddress);

    }

    @Then("^I verify the Edited First Name is displayed in the page$")
    public void iVerifyTheEditedFirstNameIsDisplayedInThePage() {
        Assert.assertTrue(isChangedFirstNameInAddress());
    }

    @And("^I click the Make Default Link in the Addresses Page$")
    public void iClickTheMakeDefaultLinkInTheAddressesPage() {
        clickMakeDefaultLink();

    }

    @Then("^I verify the the Address title has changed to Default$")
    public void iVerifyTheTheAddressTitleHasChangedToDefault() {
        Assert.assertTrue(isDefaultAddressTitleChanged());


    }

    @When("^I click the Delete Link in the Addresses page$")
    public void iClickTheDeleteLinkInTheAddressesPage() {
        clickDeleteLinkInAddresses();

    }

    @Then("^I verify the added Address is deleted$")
    public void iVerifyTheAddedAddressIsDeleted() {
        Assert.assertTrue(isVerifyTheAddressDeleted());

    }

    @Then("^I verify the Delete Address Popup is Displayed$")
    public void iVerifyTheDeleteAddressPopupIsDisplayed() {
        Assert.assertTrue(isDeleteAddressPopUpDisplayed());
        Assert.assertTrue(isDeleteAddressTextDisplayedInDeletePopUp());
        Assert.assertTrue(isCancelButtonDisplayedInPopup());
        Assert.assertTrue(isDeleteAddressButtonDisplayedInPopup());
        Assert.assertTrue(isCloseButtonDisplayedInDeleteAddressPopUp());

    }

    @When("^I click the Yes button in the Popup$")
    public void iClickTheYesButtonInThePopup() {
        clickYesButtonInDeletePopup();


    }

    @And("^I verify the Default address is displayed in the Address block in My Account$")
    public void iVerifyTheDefaultAddressIsDisplayedInTheAddressBlockInMyAccount() {
        Assert.assertTrue(isChangedDefaultAddress1IsDisplayedInMyAccountPage());
        Assert.assertTrue(isChangedDefaultCityIsDisplayedInMyAccountPage());
        Assert.assertTrue(isChangedDefaultPhoneNoIsDisplayedInMyAccountPage());

    }

    @When("^I click the Add Address button in the Addresses page$")
    public void iClickTheAddAddressButtonInTheAddressesPage() {
        clickAddNewAddressButton();

    }

    @And("^I enter the already Added Address title in the Address Title input field$")
    public void iDeleteTheNewAddedAddressTitleAndEnterTheAlreadyAddedAddressTitleInTheAddressTitleInputField() {
        enterAlreadyAddedTitleInAddressTitleInputField();

    }

    @Then("^I verify the error Message An Address already exists with this Email Id is displayed under the Address title input field$")
    public void iVerifyTheErrorMessageAnAddressAlreadyExistsWithThisEmailIdIsDisplayedUnderTheAddressTitleInputField() {
        Assert.assertTrue(isAlreadyAddedAddressTitleErrorMessageIsDisplayed());

    }


    @And("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" in the address field$")
    public void iEnterAndInTheAddressField(String firstName, String lastName, String address1, String address2, String city, String state, String zipcode, String mobileNumber) throws Throwable {
        enterFirstNameInAddress(firstName);
        enterLastNameInAddress(lastName);
        enterAddress1InAddress(address1);
        enterAddress2InAddress(address2);
        enterCityInAddress(city);
        enterStateInAddress(state);
        enterZipCodeInAddress(zipcode);
        enterMobileNumberInAddress(mobileNumber);
    }


    @And("^I enter the \"([^\"]*)\" in the Current Password in the Password page$")
    public void iEnterTheInTheCurrentPasswordInThePasswordPage(String currentPassword) throws Throwable {
        enterCurrentPassword(currentPassword);

    }



}
