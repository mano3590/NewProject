package com.ariat.pages;

import com.ariat.pagefactory.WishListPageFactory;
import cucumber.api.DataTable;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.List;

public class WishListPage extends WishListPageFactory {
    public static String selectedQuantity,selectedWishListProductPriceInTotal,productColor,productColorwishlistproduct,selectedProductSize,productNameInWishlist,selectedProductColorCount;

    public WishListPage(){

        PageFactory.initElements(driver, this);
    }


    public boolean isAddedWishlistProductDisplayed()
    {
        boolean flag = false;
        for (WebElement element : lst_WishlistProductName) {
            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {
                flag = true;
                break;}
        }
        return flag;
    }


    public boolean isAddedWishlistProductRemoved()
    {
        boolean flag = false;
        for (WebElement element : lst_WishlistProductName) {
            if(!getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean isSelectedWishlistPriceDisplayed(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::div//span[@class='sales']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isAddedProductNameDisplayedInWishListPage(){

        boolean flag = false;
        for (WebElement element : lst_ProductNameInWishList) {

            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {
                productNameInWishlist = getText(element);
                flag = true;
                break;}
        }
        return flag;
    }

    public boolean isSelectedPriceDisplayedInWishListPage(){

        return getText(txt_WishListProductPrice).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public void selectQuantity(String quantity) {
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//select[@id='quantity']";
        WebElement element = driver.findElementByXPath(xpath);
        clickButtonWithOutScroll(element);
        String xpath1 = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//select[@id='quantity']//option";
        List<WebElement> quantitylist = driver.findElements(By.xpath(xpath1));
        if(quantitylist.size()>1){
            for (int i=0; i<quantitylist.size();i++){
                System.out.println(quantitylist.get(i).getText().trim());
                if(quantitylist.get(i).getText().trim().equalsIgnoreCase(quantity)){
                    clickButtonWithOutScroll(quantitylist.get(i));
                }
            }
        }

    }

    public void clickAddToBag(){
        waitFor(2000);
        clickButtonWithOutScroll(btn_AddToBag);
        waitFor(2000);
    }

    public void clickCreateAccountlink(){

        clickButtonWithOutScroll(lnk_CreateAccountlink);
    }

    public void enterDatasInCreateAccountForms(List<String> userformdata){

        enterTextWithoutScroll(txt_FirstName,userformdata.get(0));
        enterTextWithoutScroll(txt_LastName,userformdata.get(1));
        selectBirthdayMonth(userformdata.get(2));
        selectBirthdayDay(userformdata.get(3));
        selectGender(userformdata.get(4));
        int random = getRandomNumber(1000);
        String ranstr = RandomStringUtils.randomAlphabetic(4);
        enterTextWithoutScroll(txt_Email,userformdata.get(5) +random +ranstr+ "@gmail.com");
        enterTextWithoutScroll(txt_ConfirmEmail,userformdata.get(6)+ random +ranstr+ "@gmail.com");
        enterTextWithoutScroll(txt_Password,userformdata.get(7));
        enterTextWithoutScroll(txt_ConfirmPassword,userformdata.get(8));
    }

    public void selectGender(String gender){

        String xpath="//label[contains(@class,'form-control-label')]//span[contains(text(),'"+gender+"')]";
        WebElement genderbtn = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(genderbtn);
    }

    public void selectBirthdayDay(String day){

        clickButtonWithOutScroll(ddl_BirthdayDay);
        selectBirthdayDay(lst_BirthdayDay,day);
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

    public void selectBirthdayMonth(String month){

        clickButtonWithOutScroll(ddl_BirthdayMonth);
        selectBirthdayMonth(lst_BirthdayMonth,month);
    }

    public void selectBirthdayMonth(List<WebElement> lst_BirthdayMonth,String day){
        for (int i=0; i<lst_BirthdayMonth.size();i++){
            if (lst_BirthdayMonth.get(i).getText().contains(day)) {
                waitFor(2000);
                clickButtonWithOutScroll(lst_BirthdayMonth.get(i));
                break;
            }
        }
    }

    public boolean isVerifyUsernameDisplayed(){

        return isTextContain(getText(txt_UserName), MyAccountPage.username.toUpperCase());

    }

    public boolean isVerifyWishlistEmptyTextDisplayed(String text){

        waitVisibilityOfElement(txt_WishListEmptytext);
        return isTextContain(getText(txt_WishListEmptytext),text);
    }

    public boolean isVerifyStartShoppingandAddingItemsBtnDisplayed(){

        return isElementDisplayed(Btn_StartShoppingandAddingItems);
    }

    public boolean isVerifyBackToMyAccountLinkDisplayed(){

        return isElementDisplayed(lnk_BackToMyAccount);
    }

    public void clickBackToMyAccountlnk(){

        clickButtonWithOutScroll(lnk_BackToMyAccount);
    }

    public void clickStartShoppingandAddingItemsBtn(){

        clickButtonWithOutScroll(Btn_StartShoppingandAddingItems);
    }

    public boolean isSelectedProductWidthDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::p[contains(text(),'Width')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),ProductDetailPage.widthCode);

    }
    public boolean isSelectedProductColorDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::p[contains(text(),'Color')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),ProductDetailPage.productColorwishlistproduct);
    }

    public boolean isSelectedProductSizeDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::p[contains(text(),'Size')]";
        selectedProductSize = ProductDetailPage.productSize.substring(0,1);
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),selectedProductSize);
    }

    public boolean isSelectedQuickProductSizeDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::p[contains(text(),'Size')]";
        selectedProductSize = ProductDetailPage.quickviewproductSize.substring(0,1);
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),selectedProductSize);
    }

    public boolean isSelectedProductQtyDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//p[@class='line-item-price-info']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),ProductDetailPage.selectedProductQty);
    }

    public boolean isSelectedProductStockDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::div[contains(@class,'line-item-availability')]//p";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);

    }

    public boolean isDateDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[contains(@class,'wishlist_date-added-wrapper')]//span[@class='value']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isEditLinkDisplayed(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//preceding::button[contains(@class,'remove-from-wishlist')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isRemoveLinkDisplayed(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//preceding::div[@class='edit-add-to-wishlist__block']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public void clicEditLinkInWishlist(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//preceding::a[contains(text(),'Edit')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        waitVisibilityOfElement(element);
        clickButtonWithOutScroll(element);
    }

    public void clickRemoveLinkInWishlist(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//preceding::button[contains(@class,'remove-from-wishlist')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public boolean verifyQuickViewScreenDisplayed(){

        return isElementDisplayed(popup_QuickView);

    }


    public boolean isShareIconDisplayed(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//preceding::a[contains(@class,'wishlist-share')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean verifyQuantityLabelNameDisplayed(){
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//label";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean verifyQuantityDropdownDisplayed(){
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//select[@id='quantity']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean verifyPriorityLabelNameDisplayed(){
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[9]//label";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean verifyPriorityDropdownDisplayed(){
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[9]//select[@name='priority']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public void clickCloseButtonInQuick(){

        clickButtonWithOutScroll(Btn_QuickViewCloseButton);
    }

    public void clickRemoveLinkWishList()
    {

        for (int i=lst_Removelink.size()-1;i>=0;i--) {
            waitVisibilityOfElement(lst_Removelink.get(i));
            clickButtonWithOutScroll(lst_Removelink.get(i));
        }
    }

    public boolean isVerifyAddToBagBtnDisplayed(){

        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[12]//button[contains(text(),'Add to Bag')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public void clickAddToBagBtnInWishlist() {

        String xpath = "//div[@class='line-item-name' and contains(text(),'" + ProductListPage.selectedProductName + "')]//following::div[12]//button[contains(text(),'Add to Bag')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public void clickUpdateBtn(){
        productColor = getText(lbl_SelectedColor);
        waitFor(3000);
        clickButtonWithOutScroll(Btn_QuickViewProductUpdateButton);

    }

    public boolean verifyProductSlickSlideDisplayedInQuickView(){

        return isElementDisplayed(lst_ProductScrollLink);
    }

    public boolean verifyProductNameDisplayedInQuickView(){

        return productNameInWishlist.equalsIgnoreCase(getText(txt_QuickViewProdutname));
    }

    public boolean isverifyProductNameDisplayedInQuickView(){

        return ProductListPage.selectedProductName.equalsIgnoreCase(getText(txt_QuickViewProdutname));
    }

    public boolean verifyReviewStarsDisplayedInQuickView(){

        return isElementDisplayed(txt_QuickViewProductReviewStars);
    }

    public boolean verifyWARlinkDisplayedInQuickView(){

        return isElementDisplayed(txt_QuickviewProductWriteaReview);
    }

    public boolean verifyColorTextDisplayedInQuickView(){

        return isElementDisplayed(txt_QuickViewProductColor);
    }

    public boolean verifyProductColorDisplayedInQuickView(){
        boolean flag=true;
        for (int i=0; i<lst_QuickViewProductColorCount.size();i++){
            int ColorCount = lst_QuickViewProductColorCount.size();
            selectedProductColorCount = Integer.toString(ColorCount);
            if(!isTextContain(ProductListPage.selectedProductColorCount,selectedProductColorCount)){
                flag = false;
                break;
            }

        }

        return flag;
    }

    public boolean verifyProductVariationColorDisplayedInQuickView(){
        boolean flag=true;
        for (int i=0; i<lst_QuickViewProductColorCount.size();i++){
            if (!isElementDisplayed(lst_QuickViewProductColorCount.get(i))){
                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean verifySizeDropDownDisplayedInQuickView(){

        return isElementDisplayed(ddl_QuickViewDropdown);
    }

    public boolean verifyWidthButtonDisplayedInQuickView(){
        boolean flag = true;
        for (int i=0; i<lst_WidthButton.size();i++){
            if (!isElementDisplayed(lst_WidthButton.get(i))){
                flag = false;
                break;
            }
        }
       return flag;
    }


   public boolean verifyProductPriceDisplayedInQuickView(){

        return isElementDisplayed(txt_QuickViewProductPrice);
   }

   public boolean verifyAfterPayLogoDisplayedInQuickView(){

        return isElementDisplayed(txt_QuickViewAfterPayLogo);
   }

    public boolean verifyAfterPayInfoIconDisplayedInQuickView(){

        return isElementDisplayed(lnk_AfterPayInfoIcon);
    }

    public boolean verifyUpdateBtnInQuickView(){

        return isElementDisplayed(Btn_QuickViewProductUpdateButton);
    }

    public boolean verifySelectedProductColorDisplayedInQuickView(){
        waitFor(2000);
        return isTextContain(getText(txt_QuickViewProductColor),ProductDetailPage.productColorwishlistproduct);
    }


    public boolean verifySelectedProductWidthDisplayedInQuickView(){

        return isTextContain(getText(txt_WidthCodeInQuickView),ProductDetailPage.widthCode);
    }


    public boolean verifySelectedProductSizeDisplayedInQuickView(){

        return isTextContain(getText(txt_SizeCodeInQuickView),selectedProductSize);
    }

    public boolean verifySelectedProductPriceDisplayedInQuickView(){

        return isTextContain(getText(txt_QuickViewProductPrice),ProductDetailPage.selectedProductPrice);
    }

    public boolean isSelectedQuickViewProductColorDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following-sibling::p[contains(text(),'Color')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),MyBagPage.productColor);
    }

    public boolean verifyShareMyWishlistScreenInputFieldLabelNamesDisplayed(List<String> labelname) {

        boolean flag = true;
        for (int i = 0; i < lst_ShareMyWishListLabelnames.size(); i++) {
            waitFor(2000);
            if (!getText(lst_ShareMyWishListLabelnames.get(i)).equalsIgnoreCase(labelname.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void clickShareMyWishlistIcon() {

        clickButtonWithOutScroll(lnk_ShareMyWishlist);
    }

    public boolean verifyShareMyWishlistScreenDisplayed() {

        return isElementDisplayed(dialogue_sendToFriendDialogBox);
    }

    public void clickCloseBtnShareMyWishlistScreen() {

        clickButtonWithOutScroll(Btn_CloseBtnInModelContent);
    }

    public void enterValuesInShareMyWishlistScreen(List<String> inputvalues) {

        for (int i = 0; i < lst_ShareMyWishlistInputbox.size(); i++) {

            enterTextWithoutScroll(lst_ShareMyWishlistInputbox.get(i), inputvalues.get(i));
        }
    }

    public void clickShareMyWishlistBtn() {

        clickButtonWithOutScroll(Btn_ShareMyWishlistButton);
    }

    public boolean verifyShareMyWishlistSuccessMsg(String successmsg) {
        waitVisibilityOfElement(txt_ShareMyWishlistSuccessMsg);
        return getText(txt_ShareMyWishlistSuccessMsg).equalsIgnoreCase(successmsg);
    }

    public void clickCloseBtnInShareMyWishlistSuccessMsg() {

        clickButtonWithOutScroll(Btn_ShareMyWishlistSuccessMsg);
    }

    public boolean clickVerifyQuantityDropdown() {
        boolean flag = false;
        String qtyxpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//select[@id='quantity']";
        WebElement qtyelement = driver.findElementByXPath(qtyxpath);
        clickButtonWithOutScroll(qtyelement);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//select[@id='quantity']//option";
        List<WebElement> element = driver.findElements(By.xpath(xpath));
        for (int i = 0; i < element.size(); i++) {
            selectedQuantity = getText(element.get(i));
            clickButtonWithOutScroll(element.get(i));
            driver.navigate().refresh();
            waitFor(2000);
            flag = verifySelectedQtyDisplayed();
            waitFor(3000);
            clickButtonWithOutScroll(qtyelement);
        }
        return flag;
    }

    public boolean verifySelectedQtyDisplayed(){
        waitFor(3000);
        String xpath = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[8]//select[@id='quantity']//option";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element), selectedQuantity.trim());
    }


    public void clickPrioritydropdown(List<String> dropdownitems){
        String xpath =  "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[9]//select[@name='priority']";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
        String xpath1 = "//div[@class='line-item-name' and contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[9]//select[@name='priority']//option";
        List<WebElement> elements = driver.findElements(By.xpath(xpath1));
        for (int i=0; i<elements.size();i++){
            if (getText(elements.get(i)).trim().equalsIgnoreCase(dropdownitems.get(i))){
                waitFor(2000);
                clickButtonWithOutScroll(elements.get(i));
            }
//            waitFor(2000);
//            clickButtonWithOutScroll(element);
        }
    }

    public boolean verifyWishlistHeaderNameDisplayed(String headername){

        return getText(txt_FindAWishListText).equalsIgnoreCase(headername);
    }

    public boolean verifyOneFieldRequiredtextDisplayed(String headername){

        return getText(txt_OneFieldRequiredtext).equalsIgnoreCase(headername);
    }

    public boolean verifyFindWishlistLabelNamesDisplayed(List<String> findawishlistlabelnames) {
        boolean flag = false;
        for (int i = 0; i < findawishlistlabelnames.size(); i++) {
                String xpath = "//form[@id='wishlist-search']//label[contains(text(),'" + findawishlistlabelnames.get(i) + "')]";
                WebElement element = driver.findElement(By.xpath(xpath));
                if(getText(element).equalsIgnoreCase(findawishlistlabelnames.get(i))){
                    flag = true;
                } else{
                    flag = false;
                    break;
                }
            }
        return flag;
    }

    public boolean verifyFindAWishlistButtonDisplayed(){

      return   isElementDisplayed(Btn_FindAWishlistBtn);
    }

    public void clickFindAWishlistButton(){

        clickButtonWithOutScroll(Btn_FindAWishlistBtn);
    }

    public boolean verifyFindAWishlistErrorMsgDisplayed(String errormsg){

        return getText(txt_FindAWishlistAlertMsg).equalsIgnoreCase(errormsg);
    }

    public void enterFirstNameandLastName(String firstname, String lastname) {
        waitFor(5000);
        enterTextWithoutScroll(txt_FindAWishlistFirstInputField, firstname);
        enterTextWithoutScroll(txt_FindAWishlistLastInputField, lastname);

    }

    public void enterEmail(String Email){

        enterTextWithoutScroll(txt_FindAWishlistEmailInputField, Email);
    }

    public boolean verifyEmailFieldErrorMsg(String errormsg){

        return getText(txt_EmailFieldErrorMsg).equalsIgnoreCase(errormsg);
    }

    public void clickFacebookIconOnWishlistPage(){

        clickButtonWithOutScroll(lnk_WishlistFacebooklogo);
    }

    public void clickTwitterIconOnWishlistPage(){

        clickButtonWithOutScroll(lnk_WishlistTwitterlogo);
    }

    public void clickPinterestIconOnWishlistPage(){

        clickButtonWithOutScroll(lnk_WishlistPinterestlogo);
    }

    public void clickShareEmailWishlistPage(){

        clickButtonWithOutScroll(lnk_Sharelogo);
    }

    public void clickCloseBtnOnShareEmailScreen(){

        clickButtonWithOutScroll(Btn_ShareMyWishlistCloseBtn);
    }

    public boolean verifyShareUrlDisplayed(){
        waitVisibilityOfElement(lnk_Sharelink);
        return isElementDisplayed(lnk_Sharelink);
    }

    public void clickShareUrl(){

        clickButtonWithOutScroll(lnk_Sharelink);
    }

    public boolean verifyShareUrlSuccessMsgDisplayed(String successmsg){

        return isElementDisplayed(txt_ShareUrlSuccessMsg);
    }

    public void clickMakeThisPublicCbk(){

        waitFor(2000);
        clickButtonWithOutScroll(cbk_MakethisListPublicCheckBox);
    }

    public boolean verifyMakeThisPublicCbkSelected(){

        waitVisibilityOfElement(cbk_MakethisListPublicCheckBoxSelected);
        return isElementDisplayed(cbk_MakethisListPublicCheckBoxSelected);
    }
    public boolean isAddedWishListProductRemoved()
    {
        boolean flag = false;
        waitFor(3000);
        if (isElementDisplayed(Btn_StartShoppingandAddingItems)){
            flag = true;
        } else {
            for (int i = 0; i < lst_WishlistProductName.size(); i++) {
                waitFor(5000);
                if (!lst_WishlistProductName.get(i).getText().equalsIgnoreCase(ProductListPage.selectedProductName)) {
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
        }
        return flag;

    }
}
