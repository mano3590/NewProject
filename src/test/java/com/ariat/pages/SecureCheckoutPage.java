package com.ariat.pages;

import com.ariat.pagefactory.SecureCheckoutPageFactory;
import gherkin.lexer.Sr_cyrl;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SecureCheckoutPage extends SecureCheckoutPageFactory {
    public static String grandTotalPriceInSecureCheckout;
    public static String shippingfirstname;
    public static String shippinglastname;
    public static String shippingAddressone;
    public static String shippingAddresstwo;
    public static String shippingCity;
    public static String shippingStateCode;
    public static String shippingZipCode;
    public static String shippingMobile;



    public SecureCheckoutPage() {

        PageFactory.initElements(driver, this);
    }

    public boolean isSecureCheckoutHeaderDisplayed(String header) {

        return getText(lbl_Header).equalsIgnoreCase(header);
    }

    public boolean isSecureCheckoutProductDisplayed() {

        boolean flag = false;
        for (WebElement element : lst_ProductNameCheckOutPage) {

            if (getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {

                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean isSecureCheckoutPhotoBlockProductDisplayed() {

        boolean flag = false;
        for (WebElement element : lst_ProductNameCheckOutPage) {

            if (getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductName)) {

                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean isSecureCheckoutProductPriceDisplayed() {

        String xpath = "//span[contains(text(), '" + ProductListPage.selectedProductName + "')]/ancestor::div[3]/div[3]/div[2]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(MyBagPage.selectedProductTotalPrice);
    }

    public boolean isSecureCheckoutWishListProductPriceDisplayed() {

        String xpath = "//span[contains(text(), '" + ProductListPage.selectedProductName + "')]/ancestor::div[3]/div[3]/div[2]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedWishListProductPriceInTotal);
    }

    public boolean isSecureCheckoutPhotoBlockProductPriceDisplayed() {

        String xpath = "//span[contains(text(), '" + ProductDetailPage.selectedProductName + "')]/ancestor::div[3]/div[3]/div[2]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }


    public boolean isVerifyEstimateAndGrandTotal() {
        setImplicit(5);
        waitFor(3000);
        return getText(lbl_GrandTotal).equalsIgnoreCase(MyBagPage.estimatedTotalPrice);
    }

    public void clickNextPayment() {

        clickButtonWithOutScroll(btn_NextPayment);
    }


    public boolean isPaymentSectionDisplayed() {

        return isElementDisplayed(section_Payment);
    }

    public void clickSignInCheckout() {

        clickButtonWithOutScroll(btn_SignCheckout);
    }


    public void clickEnterEmail(String email) {
        int random = getRandomNumber(100);
        String ranstr = RandomStringUtils.randomAlphabetic(3);
        enterTextWithoutScroll(txt_email, email + random +ranstr+ "@gmail.com");
    }

    public void clickAndEnterShippingAddress(String firstname, String lastname, String address1, String address2, String city, String state, String zipcode, String mobile) {

        enterTextWithoutScroll(txt_FirstName, firstname);
        waitFor(2000);
        enterTextWithoutScroll(txt_LastName, lastname);
        enterTextWithoutScroll(txt_Address1, address1);
        enterTextWithoutScroll(txt_Address2, address2);
        enterTextWithoutScroll(txt_City, city);
        clickButtonWithOutScroll(ddl_StateDropDown);
        selectState(ddl_StateDropDownlist, state);
        enterTextWithoutScroll(txt_ZipCode, zipcode);
        enterTextWithoutScroll(txt_Mobile, mobile);
    }

    public void selectState(List<WebElement> ddl_stateDropDownlist, String element) {
        waitFor(2000);
        for (int j = 0; j < ddl_StateDropDownlist.size(); j++) {
            if (ddl_StateDropDownlist.get(j).getText().contains(element)) {
                clickButtonWithOutScroll(ddl_StateDropDownlist.get(j));
                break;
            }
        }

    }
    public void clickCreditCardOption(){

        clickButtonWithOutScroll(lnk_CreditCard);
    }

    public void clickPaypalOption(){
        JavascriptExecutor executor = driver;
        executor.executeScript("arguments[0].click();", lnk_PayPal);
    }

    public void findElementFromFrameAndEnterText(List<WebElement> elements, String text)
    {
        List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
        setImplicit(0);
        for (int i=0;i<frames.size();i++){
            driver.switchTo().frame(frames.get(i));
            if(isElementDisplayed(elements)){
                enterText(elements.get(0), text);
                switchToDefaultContent();
                break;
            }
            switchToDefaultContent();
        }
        setImplicit(setDefaultImplicit());
    }
    public void enterCreditCardNumber(String creditCardNumber){

        findElementFromFrameAndEnterText(txt_CreditCardNumber, creditCardNumber);
    }

    public void enterCreditCardExpireDate(String date){

        findElementFromFrameAndEnterText(txt_CreditCardExpiryDate, date);
    }

    public void enterCreditCardCVV(String cvv){

        findElementFromFrameAndEnterText(txt_CreditCardCVV, cvv);
    }

    public void enterCreditCardHolderName(String holderName){

        enterText(txt_CreditCardName, holderName);
    }

    public void clickNextReviewOrderButton(){

        clickButtonWithOutScroll(btn_NextReviewOrder);
    }

    public void clickPaypalNextReviewOrderButton(){

        clickButtonWithOutScroll(btn_NextReviewPayButton);
    }

    public void clickPlaceOrderButton(){

        clickButtonWithOutScroll(btn_PlaceOrder);
    }

    public boolean isVerifyCardEndingNumberDisplayed(String expected){

        waitFor(3000);
        return getText(lbl_PaymentBlock1).contains(expected);
    }

    public boolean isVerifyCheckoutCompletePageDisplayed(String value){
        waitFor(3000);
        waitVisibilityOfElement(lbl_CheckoutComplete);
        return value.equalsIgnoreCase(getText(lbl_CheckoutComplete));
    }
    public boolean isSecureCheckoutWidgetProductDisplayed() {

        boolean flag = false;
        for (WebElement element : lst_ProductNameCheckOutPage) {

            if (getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductName)) {

                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean isSecureCheckoutWidgetProductPriceDisplayed() {

        String xpath = "//span[contains(text(), '" + ProductDetailPage.selectedProductName + "')]/ancestor::div[3]/div[3]/div[2]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public void clickNextPaymentGuestUser(String email) {

        clickButtonWithOutScroll(btn_NextPayment);
        waitFor(3000);
        if ((box_VerifyYourAddressPopup).isDisplayed()){
            clickButtonWithOutScroll(btn_UseAddressus);
            if (isElementDisplayed(txt_emailerrormsg)) {
                enterTextWithoutScroll(txt_email, email);
                waitFor(3000);
                clickButtonWithOutScroll(btn_NextPayment);

            }
        }
    }

    public boolean isSecureCheckoutFRWorkWearProductPriceDisplayed() {

        String xpath = "//span[contains(text(), '" + ProductListPage.selectedProductName + "')]/ancestor::div[3]/div[3]/div[2]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedFRWorkwearProductPrice);
    }
    public boolean isProductPriceDisplayedInSecureCheckout() {

        String xpath = "//span[contains(text(), '" + ProductListPage.selectedProductName + "')]/ancestor::div[3]/div[3]/div[2]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPriceInQuickView);
    }

    public void grandTotalInSecureCheckoutPage()
    {
        waitFor(4000);
        grandTotalPriceInSecureCheckout = getText(lbl_GrandTotal);
    }

    public void clickNextPaymentWishListGuestUser() {

        clickButtonWithOutScroll(btn_NextPayment);
        waitFor(3000);
        if ((box_VerifyYourAddressPopup).isDisplayed()){
            clickButtonWithOutScroll(btn_UseAddressus);
        }
    }

    public void enterCardDetailsInPaymentSection(String number, String eDate, String cvv, String name){

        scrollByPixel();
        if (isElementDisplayed(txt_StoredPayments)) {
            waitFor(2000);
            enterCreditCardCVV(cvv);
        } else {
            enterCreditCardNumber(number);
            enterCreditCardExpireDate(eDate);
            enterCreditCardCVV(cvv);
            enterCreditCardHolderName(name);
        }
    }

    public boolean isVerifyPayPalUrl(String url){

        String currenturl = driver.getCurrentUrl();
        return (currenturl).equalsIgnoreCase(url);
    }

    public void loginPaypalAccount(String username, String password){

        enterTextWithoutScroll(txt_paypalEmailtextbox,username);
        enterTextWithoutScroll(txt_paypalPasswordtextbox,password);
    }

    public void clickPaypalLoginBtn(){

        clickButtonWithOutScroll(btn_paypalLoginBtn);
    }

    public boolean isVerifyAriatTextDisplayedOnPaypalPage(String header){
        waitFor(2000);
        waitVisibilityOfElement(txt_AriatInternationaltextInPaypalPage);
        setImplicit(5);
        waitFor(3000);
        if (isElementDisplayed(txt_PayLaterPopup)){
            clickButtonWithOutScroll(btn_PaylaterClosebtn);
        }
        return getText(txt_AriatInternationaltextInPaypalPage).equalsIgnoreCase(header);
    }

    public void clickPaypalContinueBtn() {
        waitFor(5000);
        JavascriptExecutor executor = driver;
        executor.executeScript("arguments[0].click();", btn_ContinueBtnInPaypal);
    }

    public void acceptCookie() {

        setImplicit(2);
        clickButtonWithOutScroll(btn_AcceptButton);
        setDefaultExplicit();
    }

    public void clickCreditCardLink(){

        clickButtonWithOutScroll(lnk_CreditCardPayment);
    }

    public boolean isVerifyCreditCardSectionFormLabelNamesDisplayed(List<String> labelname){

        boolean flag = false;
        for (int i=0; i<labelname.size();i++){

            if (labelname.get(i).equalsIgnoreCase(getText(lst_paymentLabelNames.get(i)))){

                    flag = true;

            }else{

                flag = false;
                break;
            }
        }
    return flag;
    }

    public boolean isVerifyCreditCardNumbertextboxDisplayed(){
        driver.switchTo().frame(frame_CreditCardBlockFrames);
        return isElementDisplayed(txt_CreditCardNumber);
    }

    public boolean isVerifyCreditCardExpiryDatetextboxDisplayed(){

        return isElementDisplayed(txt_CreditCardExpiryDate);
    }

    public boolean isVerifyCreditCardCvvtextboxDisplayed(){

        return isElementDisplayed(txt_CreditCardCVV);
    }

    public boolean isVerifyCreditCardHolderNametextboxDisplayed(){

        return isElementDisplayed(txt_CreditCardName);
    }

    public boolean isVerifySelectedProductSubtotal() {
        setImplicit(5);
        waitVisibilityOfElement(lbl_Subtotal);
        System.out.println(lbl_Subtotal);
        return getText(lbl_Subtotal).equalsIgnoreCase(MyBagPage.subtotal);
    }

    public boolean isVerifySelectedProductOrderDiscount() {
        waitVisibilityOfElement(lbl_OrderDiscount);
        System.out.println(lbl_OrderDiscount);
        return getText(lbl_OrderDiscount).equalsIgnoreCase(MyBagPage.orderdiscount);
    }

    public boolean isVerifySelectedProductShipping() {
        waitVisibilityOfElement(lbl_ShippingCost);
        System.out.println(lbl_ShippingCost);
        return getText(lbl_ShippingCost).equalsIgnoreCase(MyBagPage.shippingcost);
    }

    public boolean isVerifySelectedProductEstimatedTax() {
        waitVisibilityOfElement(lbl_EstimatedTax);
        System.out.println(lbl_EstimatedTax);
        return getText(lbl_EstimatedTax).equalsIgnoreCase(MyBagPage.estimatedTax);
    }

    public void getSelectedShippingAddress(){
        String selectedAddressValue = ddl_selecteddropdownvalue.getAttribute("data-value");
        String xpath = "//select[@id='shipmentSelector-default']//option[@value='"+selectedAddressValue+"']";
        WebElement element = driver.findElement(By.xpath(xpath));
        shippingfirstname = element.getAttribute("data-first-name");
        shippinglastname = element.getAttribute("data-last-name");
        shippingAddressone = element.getAttribute("data-address1");
        shippingAddresstwo = element.getAttribute("data-address2");
        shippingCity = element.getAttribute("data-city");
        shippingStateCode = element.getAttribute("data-state-code");
        shippingZipCode = element.getAttribute("data-postal-code");
        shippingMobile = element.getAttribute("data-phone");
        System.out.println(shippingfirstname);
        System.out.println(shippinglastname);
        System.out.println(shippingAddressone);
        System.out.println(shippingAddresstwo);
        System.out.println(shippingCity);
        System.out.println(shippingStateCode);
        System.out.println(shippingZipCode);
        System.out.println(shippingMobile);
    }


    public boolean isVerifyShippingAddressFirstName(){
        setImplicit(5);
        waitVisibilityOfElement(txt_ShippingAddressFirstName);
        return getText(txt_ShippingAddressFirstName).equalsIgnoreCase(shippingfirstname);
    }

    public boolean isVerifyShippingAddressLastName(){
        setImplicit(5);
        waitVisibilityOfElement(txt_ShippingAddressLastName);
        return getText(txt_ShippingAddressLastName).equalsIgnoreCase(shippinglastname);
    }

    public boolean isVerifyShippingAddress1(){

        return getText(txt_Addressfiels1).equalsIgnoreCase(shippingAddressone);
    }

    public boolean isVerifyShippingAddress2(){

        return getText(txt_Addressfiels2).equalsIgnoreCase(shippingAddresstwo);
    }

    public boolean isVerifyShippingCity(){

        return getText(txt_AddressCity).equalsIgnoreCase(shippingCity);
    }

    public boolean isVerifyShippingAddressStateCode(){

        return getText(txt_AddressStateCode).equalsIgnoreCase(shippingStateCode);
    }

    public boolean isVerifyShippingAddressZipCode(){

        return getText(txt_AddressPostalCode).equalsIgnoreCase(shippingZipCode);
    }

    public boolean isVerifyShippingMobile(){

        return getText(txt_ShippingPhone).equalsIgnoreCase(shippingMobile);
    }





}









