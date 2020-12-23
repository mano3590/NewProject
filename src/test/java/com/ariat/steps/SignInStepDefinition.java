package com.ariat.steps;

import com.ariat.pages.SignInPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class SignInStepDefinition extends SignInPage {

    @And("^I login the application with \"([^\"]*)\", \"([^\"]*)\"$")
    public void iLoginTheApplicationWith(String username, String password) {

        signInToAriatApp(username, password);
    }


    @Then("^I Verify the Create Account tab is displayed$")
    public void i_Verify_the_Create_Account_tab_is_displayed()  {

        Assert.assertTrue(isVerifyCreateAccount());
    }

    @When("^I click the Create Account tab$")
    public void i_click_the_Create_Account_tab()  {

        clickCreateAccountLink();
    }

    @Then("^I verify Create Account Screen User Form is displayed$")
    public void i_verify_Create_Account_Screen_User_Form_is_displayed()  {

        Assert.assertTrue(isCreateAccountUserFormDisplayed());
    }


    @Then("^I verify below listed names are displayed above the Textbox in the Create Account User Form$")
    public void i_verify_below_listed_names_are_displayed_above_the_Textbox_in_the_Create_Account_User_Form(DataTable userformlabelnames)  {

        Assert.assertTrue(validateCreateAccountUserFormLabelNames(userformlabelnames));
    }

    @Then("^I verify Please add me to the Ariat email list text is displayed in the Create Account User Form$")
    public void i_verify_Please_add_me_to_the_Ariat_email_list_text_is_displayed_in_the_Create_Account_User_Form()  {

        Assert.assertTrue(isVerifyPleaseAddMeCheckBoxDisplayed());
    }

    @When("^I click the Please add me to the Ariat email check box$")
    public void i_click_the_Please_add_me_to_the_Ariat_email_check_box()  {
        clickPleaseAddMeCheckBox();
    }


    @Then("^I verify the Add me to button is selected$")
    public void IverifytheAddmetobuttonisselected()  {

        Assert.assertTrue(isVerifyAddToMeButtonDisplayed());
    }

    @Then("^I verify the Required text is displayed above the Create Account Submit button$")
    public void I_verify_the_Required_text_is_displayed_above_the_Create_Account_Submit_button()  {

        Assert.assertTrue(isVerifyRequiredtextDisplayed());
    }

    @When("^I verify PRIVACY POLICY link text is displayed$")
    public void i_verify_PRIVACY_POLICY_link_text_is_displayed()  {

        Assert.assertTrue(isVerifyPrivacyPolicyLink());
    }

    @When("^I click the PRIVACY POLICY link$")
    public void i_click_the_PRIVACY_POLICY_link()  {

        clickPrivacyPolicy();
    }

    @When("^I verify the PRIVACY POLICY Model screen is displayed$")
    public void i_verify_the_PRIVACY_POLICY_Model_screen_is_displayed()  {

        Assert.assertTrue(isVerifyPrivacyPolicyModelScreenDisplayed());
    }

    @When("^I click the close button in the PRIVACY POLICY Model screen$")
    public void i_click_the_close_button_in_the_PRIVACY_POLICY_Model_screen()  {

        clickPrivacyPolicyCloseBtn();
    }

    @When("^I verify the Create Account Submit button is displayed in the Create Account User Form$")
    public void i_verify_the_Create_Account_Submit_button_is_displayed_in_the_Create_Account_User_Form()  {

        Assert.assertTrue(isVerifyCreateAccountSubmitBtn());
    }

    @When("^I click the Create Account submit button without filling any fields$")
    public void IclicktheCreateAccountsubmitbuttonwithoutfillinganyfields()  {

        clickCreateAccount();
    }


    @Then("^verify the \"([^\"]*)\" should display below in all textboxes in the Create Account User Form$")
    public void verify_the_should_display_below_in_all_textboxes_in_the_Create_Account_User_Form(String errormsg, List<String> labelname)  {
        Assert.assertTrue(verifyErrorMsg(errormsg, labelname));
    }

    @When("^I enter the \"([^\"]*)\" and \"([^\"]*)\" in the Create Account user form$")
    public void i_enter_the_and_in_the_Create_Account_user_form(String firstname, String lastname)  {
        enterFirstNameandLastName(firstname,lastname);
    }

    @When("^I select the \"([^\"]*)\" month in the dropdown$")
    public void i_select_the_month_in_the_dropdown(String birthdaymonth)  {
        selectBirthdayMonth(birthdaymonth);
        Assert.assertTrue(verifyEnteredBirthdayMonthDisplayed(birthdaymonth));
    }

    @When("^I select the \"([^\"]*)\" Day in the dropdown$")
    public void i_select_the_Day_in_the_dropdown(String birthdayday)  {
        selectBirthdayDay(birthdayday);
        Assert.assertTrue(verifyEnteredBirthdayDayDisplayed(birthdayday));

    }

    @When("^I select the \"([^\"]*)\" birthday Month in the dropdown$")
    public void i_select_the_birthday_Month_in_the_dropdown(String birthdaymonth)  {
        selectBirthdayMonth(birthdaymonth);
        Assert.assertTrue(verifyEnteredBirthdayMonthDisplayed(birthdaymonth));
    }

    @When("^I select the \"([^\"]*)\" birthday Day in the dropdown$")
    public void i_select_the_birthday_Day_in_the_dropdown(String birthdayday)  {

        selectBirthdayDay(birthdayday);
        Assert.assertTrue(verifyEnteredBirthdayDayDisplayed(birthdayday));
    }


    @When("^I click \"([^\"]*)\" radio button$")
    public void i_click_radio_button(String gender)  {

        Assert.assertTrue(isSelectedGenderbtnDisplayed(gender));
    }

    @When("^I enter \"([^\"]*)\" in Email Id field$")
    public void i_enter_in_Email_Id_field(String invalidemailid)  {

        enterEmailId(invalidemailid);
    }

    @When("^I enter \"([^\"]*)\" in Confirm Email id field$")
    public void i_enter_in_Confirm_Email_id_field(String invalidconfirmemailid)  {

        enterConfirmEmailId(invalidconfirmemailid);
    }

    @When("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_the_and(String password, String confirmpassword)  {

        enterPasswordandConfirmPassword(password,confirmpassword);
    }

    @When("^I click the Create Account submit button$")
    public void i_click_the_Create_Account_submit_button()  {

        clickCreateAccount();
    }

    @When("^I click the Please add me to the Ariat email list check box$")
    public void IclickthePleaseaddmetotheAriatemaillistcheckbox()  {

        clickPleaseAddMeCheckBox();
        isVerifyAddToMeButtonDisplayed();
    }

    @And("^I enter the password and confirm password more than 255 characters$")
    public void I_enter_the_password_and_confirm_password_more_than_255_characters()  {

        enterPasswordandConfirmPasswordMorethanConditons();
    }


    @Then("^I verify the \"([^\"]*)\" is display below the Email and Confirm Email textbox$")
    public void i_verify_the_is_display_below_the_Email_and_Confirm_Email_textbox(String errormessage)  {

        Assert.assertTrue(verifyEmailErrorMessage(errormessage));
        Assert.assertTrue(verifyConfirmEmailErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the Email textbox$")
    public void i_verify_the_is_display_below_the_Email_textbox(String errormessage)  {

        Assert.assertTrue(verifyEmailErrorMessage(errormessage));
    }


    @Then("^I verify the \"([^\"]*)\" is display below the Confirm Email textbox$")
    public void i_verify_the_is_display_below_the_Confirm_Email_textbox(String errormessage)  {

        Assert.assertTrue(verifyConfirmEmailErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the Password and Confirm Password fields$")
    public void i_verify_the_is_display_below_the_Password_and_Confirm_Password_fields(String errormessage)  {

        Assert.assertTrue(verifyPasswordErrorMessage(errormessage));
        Assert.assertTrue(verifyConfirmPasswordErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the Confirm Password fields$")
    public void i_verify_the_is_display_below_the_Confirm_Password_fields(String errormessage)  {

        Assert.assertTrue(verifyConfirmPasswordErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the Password fields$")
    public void i_verify_the_is_display_below_the_Password_fields(String errormessage)  {

        Assert.assertTrue(verifyPasswordErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the First Name textbox field$")
    public void i_verify_the_is_display_below_the_First_Name_textbox_field(String errormessage)  {

        Assert.assertTrue(verifyFirstNameErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the Last Name textbox field$")
    public void i_verify_the_is_display_below_the_Last_Name_textbox_field(String errormessage)  {

        Assert.assertTrue(verifyLastNameErrorMessage(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" is display below the Birthday dropdown field$")
    public void i_verify_the_is_display_below_the_Birthday_dropdown_field(String errormessage)  {

        Assert.assertTrue(verifyBirthdaydropdownErrorMessage(errormessage));
    }
    @Then("^I verify the EmailTextbox, PasswordTextbox, SignInButton,RememberMeCheckBox, ForgotPasswordLink and SignInButton is display in the page$")
    public void i_verify_the_EmailTextbox_PasswordTextbox_SignInButton_RememberMeCheckBox_ForgotPasswordLink_and_SignInButton_is_display_in_the_page()  {
        Assert.assertTrue(isEmailTextBoxDisplayed());
        Assert.assertTrue(isPasswordTextBoxDisplayed());
        Assert.assertTrue(isSignInButtonDisplayed());
        Assert.assertTrue(isRememberMeCheckboxDisplayed());
        Assert.assertTrue(isForgotPasswordLinkDisplayed());
    }

    @When("^I click the ForgotPassword link in the sign In page$")
    public void i_click_the_ForgotPassword_link_in_the_sign_In_page()  {
        clickForgotPasswordLink();
    }

    @Then("^I verify the Forgot Your Password Popup is displayed$")
    public void i_verify_the_Forgot_Your_Password_Popup_is_displayed()  {
        Assert.assertTrue(isForgotPasswordPopUpDisplayed());

    }

    @Then("^I verify the EmailTextbox and send button is displayed in the popup$")
    public void i_verify_the_EmailTextbox_and_send_button_is_displayed_in_the_popup()  {
        Assert.assertTrue(isForgotPasswordPopUPEmailTextBoxDisplayed());
        Assert.assertTrue(isForgotPasswordPopUpSendButtonDisplayed());
        Assert.assertTrue(isForgotPasswordPopUpCloseButtonDisplayed());


    }

    @When("^I click the close button in the Forgot your Password popup$")
    public void i_click_the_close_button_in_the_Forgot_your_Password_popup()  {
        clickCloseButtonInForgotPasswordPopUp();
        waitFor(2000);
    }

    @When("^I click the Email Textbox in the sign in page$")
    public void i_click_the_Email_Textbox_in_the_sign_in_page()  {
        clickEmailTextBox();

    }

    @When("^I click the Password Textbox in the sign in page$")
    public void i_click_the_Password_Textbox_in_the_sign_in_page()  {
        clickPasswordTextBox();

    }

    @When("^I switch off the field from the Email Textbox$")
    public void i_switch_off_the_field_from_the_Email_Textbox()  {
        switchOffTheEmailTextBox();

    }

    @When("^I switch off the field from the Password Textbox$")
    public void i_switch_off_the_field_from_the_Password_Textbox()  {
        switchOffThePasswordTextBox();
    }

    @Then("^I verify the error Message 'This Field is Required' is displayed under the email Textbox$")
    public void i_verify_the_error_Message_This_Field_is_Required_is_displayed_under_the_email_Textbox()  {
        Assert.assertTrue(isUserNameErrorMessageDisplayed());
    }

    @Then("^I verify the error Message 'This Field is Required' is displayed under the password Textbox$")
    public void i_verify_the_error_Message_This_Field_is_Required_is_displayed_under_the_password_Textbox()  {
        Assert.assertTrue(isPasswordErrorMessageDisplayed());
    }

    @When("^I click the SignInButton in the Sign In page$")
    public void i_click_the_SignInButton_in_the_Sign_In_page()  {
        clickSignInButton();
    }

    @When("^I enter the \"([^\"]*)\" in the Email text box$")
    public void i_enter_the_in_the_Email_text_box(String email)  {
        enterEmail(email);

    }

    @And("^I enter the \"([^\"]*)\" in the Password text box$")
    public void i_enter_the_in_the_Password_text_box(String password)  {
        enterPassword(password);
    }

    @Then("^I verify the \"([^\"]*)\" is displayed in the Sign In Page$")
    public void i_verify_the_is_displayed_in_the_Sign_In_Page(String ErrorMessage)  {
        Assert.assertTrue(isSignInErrorMessageDisplayed(ErrorMessage));

    }

    @When("^I click the send Button in the Forgot your Password Popup$")
    public void i_click_the_send_Button_in_the_Forgot_your_Password_Popup()  {
        clickSendButtonInForgotYourPasswordPopup();
        waitFor(2000);

    }

    @Then("^I verify the error Message 'This Field is Required' is displayed in the Forgot your Passsword Popup$")
    public void i_verify_the_error_Message_This_Field_is_Required_is_displayed_in_the_Forgot_your_Passsword_Popup()  {
        Assert.assertTrue(isErrorMessageDisplayedInForgotPasswordPopUp());
    }

    @When("^I enter the \"([^\"]*)\" in the Forgot your Password Popup$")
    public void i_enter_the_in_the_Forgot_your_Password_Popup(String email)  {

        enterEmailInForgotPassword(email);
    }

    @Then("^I verify the \"([^\"]*)\" is displayed in the Forgot your Password Popup$")
    public void i_verify_the_is_displayed_in_the_Forgot_your_Password_Popup(String ErrorMessage)  {
        Assert.assertTrue( isInvalidErrorMessageDisplayedInForgotPassword(ErrorMessage));
    }

    @Then("^I verify the Request to Reset Your Password Received Popup is displayed$")
    public void i_verify_the_Request_to_Reset_Your_Password_Received_Popup_is_displayed()  {
        Assert.assertTrue(isRequestToResetYourPasswordPopUpDisplayed());
    }

    @Then("^I verify title \"([^\"]*)\" of the page$")
    public void iVerifyTitleOfThePage(String title)  {

        Assert.assertTrue(isVerifyTitleMyAccountPage(title));
    }

    @Then("^I verify Check an order and Request Return block is displayed in the page$")
    public void i_verify_Check_an_order_and_Request_Return_block_is_displayed_in_the_page() {

        Assert.assertTrue(isVerifyOrderBlockDisplayed());
    }

    @Then("^I verify \"([^\"]*)\" Header is displayed$")
    public void i_verify_Header_is_displayed(String header) {
        Assert.assertTrue(verifyTrackOrderBlockHeaderDisplayed(header));
    }

    @Then("^I verify \"([^\"]*)\" is displayed$")
    public void i_verify_is_displayed(String headertext)  {
            Assert.assertTrue(verifyTrackOrderHeaderText(headertext));
    }

    @Then("^I verify the Below listed label names are displayed above the text box$")
    public void i_verify_the_Below_listed_label_names_are_displayed_above_the_text_box(List<String> labelname)  {
            Assert.assertTrue(verifyTrackOrderInputFieldLabelNamesDisplayed(labelname));
    }

    @Then("^I verify the Below listed text box are displayed in the page$")
    public void i_verify_the_Below_listed_text_box_are_displayed_in_the_page(List<String> inputfield) {

        Assert.assertTrue(verifyTrackOrderInputFieldDisplayed(inputfield));
    }

    @Then("^I verify check status button is displayed$")
    public void i_verify_check_status_button_is_displayed()  {

        Assert.assertTrue(isVerifyCheckStatusBtnDisplayed());
    }

    @When("^I click the check status button$")
    public void i_click_the_check_status_button(){

        clickCheckStatusBtn();
    }

    @Then("^I verify the \"([^\"]*)\" error display below textboxes in the Check and Return Order block$")
    public void i_verify_the_error_display_below_textboxes_in_the_Check_and_Return_Order_block(String errormsg, List<String> inputfield) {

        Assert.assertTrue(verifyErrorMsgInOrderNumberAndOrderEmailField(errormsg,inputfield));
    }

    @When("^I enter \"([^\"]*)\" into the Order Number input field$")
    public void i_enter_into_the_Order_Number_input_field(String ordernumber) {

        enterOrderNumber(ordernumber);
    }

    @When("^I enter \"([^\"]*)\" into the Order Email input field$")
    public void i_enter_into_the_Order_Email_input_field(String orderemail) {

          enterOrderEmail(orderemail);
    }

    @Then("^I verify the \"([^\"]*)\" error message$")
    public void i_verify_the_error_message(String errormessage) {

        Assert.assertTrue(verifyErrorMessageInTrackOrderBlock(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" error message below the Order Number input field$")
    public void i_verify_the_error_message_below_the_Order_Number_input_field(String errormessage) {

        Assert.assertTrue(verifyErrorMessageInOrderNumberField(errormessage));
    }

    @Then("^I verify the \"([^\"]*)\" error message below the Order Email input field$")
    public void i_verify_the_error_message_below_the_Order_Email_input_field(String errormessage) {

        Assert.assertTrue(verifyErrorMessageInOrderEmailField(errormessage));
    }

    @Then("^I verify that Header \"([^\"]*)\" of the page$")
    public void i_verify_that_Header_of_the_page(String pageheader) {

        Assert.assertTrue(verifyOrderDetailPageHeader(pageheader));
    }

    @Then("^I verify the \"([^\"]*)\" is displayed in the Order summary$")
    public void i_verify_the_is_displayed_in_the_Order_summary(String ordernumber) {

        Assert.assertTrue(verifyOrderNumberDisplayed(ordernumber));
    }

    @And("^I verify the Check An Order title is displayed in the Sign In page$")
    public void iVerifyTheCheckAnOrderTitleIsDisplayedInTheSignInPage() {
        Assert.assertTrue(isRequestReturnTitleDisplayed());
    }

    @And("^I enter the Order Number in the Order Number in the input field$")
    public void iEnterTheOrderNumberInTheOrderNumberInTheInputField() {
        enterOrderNumber();
    }

    @Then("^I verify the Header \"([^\"]*)\" of the page$")
    public void iVerifyTheHeaderOfThePage(String header) {

        Assert.assertTrue(verifyMyAccountPageHeader(header));
    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String email, String confirmemail) {
        enterEmailAndConfirmEmail(email,confirmemail);
    }

    @And("^I get the Email Id from the Email Id field in Create Account$")
    public void iGetTheEmailIdFromTheEmailIdFieldInCreateAccount() {
        getConfirmEmailIdInCreateAccount();

    }
    @And("^I enter the New Created Email Id in the email Text in the sign In page$")
    public void ientertheNewCreatedEmailIdintheemailTextinthesignInpage() {
        enterCreatedUserNameInSignIn();
    }


    @And("^I enter the \"([^\"]*)\" in the password field in SignIn page$")
    public void iEnterTheInThePasswordFieldInSignInPage(String newConfirmPassword)  {
        enterNewConfirmPassword(newConfirmPassword);

    }

}
