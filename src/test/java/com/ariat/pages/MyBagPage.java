package com.ariat.pages;

import com.ariat.pagefactory.MyBagPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;
import java.util.List;

public class MyBagPage extends MyBagPageFactory {

    public static String estimatedTotalPrice,productColor,totalQuantityPrice,total,selectedTotalPrice,enteredQuantityValue,selectedWishListProductPriceInTotal,selectedProductTotalPrice,selectedProductSize,displayedproductQty, subtotal, orderdiscount;
    public static float perQuantityPrice, totalPrice;
    public static int quantity;
    public static String shippingcost;
    public static String estimatedTax;




    public MyBagPage(){

        PageFactory.initElements(driver, this);
    }

    public void clickSecureCheckOutBtn(){
        waitFor(2000);
        clickButtonWithOutScroll(btn_SecureCheckOut);
    }

    public boolean isVerifySecureCheckOutBtn(){

        return isElementDisplayed(btn_SecureCheckOut);
    }

    public boolean isAddedProductNameDisplayed(){

        boolean flag = false;
        for (WebElement element : lst_ProductNameInMyBag) {

            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {

                flag = true;
                break;
            }
        }
        return flag;
    }

    public void removeOtherProductsInMyBag(){
        for (WebElement element : lst_ProductNameInMyBag) {
            if(!getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {
                waitFor(3000);
                String productname = getText(element);
                WebElement element1 = driver.findElement(By.xpath("//a[contains(text(), '"+productname+"')]/ancestor::div[9]/div[2]//button[contains(@class,'remove-product')]"));
                clickButtonWithOutScroll(element1);
            }
        }

    }


    public boolean isAddedPhotoBlockProductNameDisplayed(){

        boolean flag = false;
        for (WebElement element : lst_ProductNameInMyBag) {

            if(getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductName)) {

                flag = true;
                break;}
        }
        return flag;
    }

    public boolean isSelectedPriceDisplayed(){
        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isSelectedProductImageDisplayed(){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[1]//a[contains(@class,'item-image')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isSelectedPriceDisplayedInTotal(){
        String xpath = "//a[contains(text(),'"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isSelectedFRWorkWearProductPriceDisplayedInTotal(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).contains(ProductDetailPage.selectedFRWorkwearProductPrice);
    }

    public boolean isSelectedPhotoBlockPriceDisplayed(){

        String xpath = "//a[contains(text(), '"+ PhotoBlockPage.selectedProductName +"')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isSelectedPhotoBlockPriceDisplayedInTotal(){

        String xpath = "//a[contains(text(), '"+ PhotoBlockPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public void getEstimatedTotalPrice(){

        waitFor(3000);
        estimatedTotalPrice = getText(lbl_EstimatedTotal);
    }

    public void clickEditLink(){
        
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[1]//div[@class='product-edit']//a";
        WebElement element = driver.findElement(By.xpath(xpath));
        waitVisibilityOfElement(element);
        waitFor(3000);
        clickButtonWithOutScroll(element);
    }

    public boolean isVerifyEditLinkDisplayed(){

        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[1]//div[@class='product-edit']//a";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public void clickWishlistBtn(){

        clickButtonWithOutScroll(Btn_QuickViewWishlist);
    }

    public void selectColor(){

        String attributeValue = "selected";
        waitFor(5000);
        if(lst_ProductColors.size() > 1){
            for(int i = 0; i<lst_ProductColors.size();i++) {
                if (!getAttributeValue(lst_ProductColors.get(i), "class").contains(attributeValue)) {
                    clickButtonWithOutScroll(lst_ProductColors.get(i));
                    waitFor(5000);
                    if (isEnabled(btn_Update)) {
                        productColor = getText(lbl_SelectedColor);
                        break;

                    }
                }
            }
        }else{
            productColor = getText(lbl_SelectedColor);
        }

    }

    public boolean isSelectedColorDisplayed(){
        waitFor(3000);
        String xpath ="//div[@class='line-item-header']//following::p[contains(text(),'"+productColor+"')][1]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(productColor);
    }

    public void increaseQuantity(){

        clickButtonWithOutScroll(btn_Quantityincrease);
    }

    public void clickUpdateButton(){
        waitFor(3000);
        clickButtonWithOutScroll(btn_Update);
    }

    public void clickContinueShoppingButton(){
        scrollByPixel();
        waitFor(3000);
        click(btn_ContinueShopping);
    }

    public boolean isVerifyContinueShoppingButtonDisplayed(){

        return isElementDisplayed(btn_ContinueShopping);
    }

    public boolean isSelectedFRWorkwearPriceDisplayed(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isAddedWidgetProductNameDisplayed(){

        boolean flag = false;
        for (WebElement element : lst_ProductNameInMyBag) {

            if(getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductName)) {

                flag = true;
                break;}
        }

        return flag;

    }
    public boolean isSelectedWidgetPriceDisplayed(){

        String xpath = "//a[contains(text(), '"+ ProductDetailPage.selectedProductName +"')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isSelectedWidgetPriceDisplayedInTotal(){

        String xpath = "//a[contains(text(), '"+ ProductDetailPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public void clickRemoveLinkMyBag()
    {
      for (int i=lst_Remove.size()-1;i>=0;i--) {
            waitFor(2000);
            clickButtonWithOutScroll(lst_Remove.get(i));
      }
    }

    public boolean isSelectedItemRemoved()
    {
        waitFor(2000);
        return isElementDisplayedWithoutScroll(lbl_NoItemInBag);
    }

    public void clickAddtoWishListMyBag()
    {
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//span[text()='Add to Wishlist']";
        WebElement AddToWishList = driver.findElement(By.xpath(xpath));
        WebElement RemoveFromWishList = driver.findElement(By.xpath("//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//span[text()='Remove from Wishlist']"));
        if(getText(RemoveFromWishList).equalsIgnoreCase("Remove from Wishlist"))
        {
            clickButtonWithOutScroll(RemoveFromWishList);
        }
        clickButtonWithOutScroll(AddToWishList);


    }

    public void enterQuantitySize(String Quantity) {
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//input[@id='Quantity']";
        WebElement selectedProductQuantity = driver.findElement(By.xpath(xpath));
        selectedProductQuantity.click();
        selectedProductQuantity.sendKeys(Keys.DELETE);
        enterTextWithoutScroll(selectedProductQuantity,Quantity);
        selectedProductQuantity.sendKeys(Keys.TAB);
        enteredQuantityValue = (Quantity);
    }

    public boolean isVerifyUpdatedTotalPriceDisplayed(){
        perQuantityPrice = Float.parseFloat(ProductDetailPage.selectedProductPrice.replace("$",""));
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//input[@id='Quantity']";
        WebElement element = driver.findElement(By.xpath(xpath));
        String displayedquantity = element.getAttribute("value");
        quantity = Integer.parseInt(displayedquantity);
        totalPrice  =  perQuantityPrice * quantity;
        String Decimal = new DecimalFormat("#0.00").format(totalPrice);
        totalQuantityPrice = "$"+Decimal;
        String totalpricexpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement totalpriceelement = driver.findElement(By.xpath(totalpricexpath));
        selectedTotalPrice = getText(totalpriceelement);
        return selectedTotalPrice.equalsIgnoreCase(totalQuantityPrice);
    }

    public boolean isIncreasedQuantityPriceAdded()
    {
        waitFor(5000);
        perQuantityPrice = Float.parseFloat(ProductDetailPage.selectedProductPrice.replace("$",""));
        quantity = Integer.parseInt(enteredQuantityValue);
        totalPrice  =  perQuantityPrice * quantity;
        String Decimal = new DecimalFormat("#0.00").format(totalPrice);
        totalQuantityPrice = "$"+Decimal;
        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        selectedTotalPrice = getText(element);
        return selectedTotalPrice.equalsIgnoreCase(totalQuantityPrice);
    }


    public boolean isSelectedWishListProductPriceDisplayedInTotal(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).contains(ProductDetailPage.selectedWishListProductPriceInTotal);
    }


    public boolean isSelectedQuickViewPriceDisplayedInMyBag(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPriceInQuickView);
    }

    public boolean isSelectedQuickViewTotalPriceDisplayedInMyBag(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPriceInQuickView);
    }

    public boolean isSelectedSlickSlidePopUpPriceDisplayed(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPriceInSlickSlide);
    }

    public boolean isSelectedSlickSlidePopUpPriceDisplayedInTotal(){

        String xpath = "//a[contains(text(), '"+ ProductListPage.selectedProductName +"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPriceInSlickSlide);
    }

    public boolean isProductNameNotDisplayed() {
       boolean flag = false;
       waitForAriatLoadIconDisappear();
       waitFor(2000);
        if (lst_ProductNameInMyBag.isEmpty()) {
            if(isElementDisplayed(lbl_NoItemInBag)){
                flag = true;
            }
        } else {
            for (int i = 0; i < lst_ProductNameInMyBag.size(); i++) {
                if (!lst_ProductNameInMyBag.get(i).getText().equalsIgnoreCase(ProductListPage.selectedProductName)) {
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public void clickSecureCheckoutLink()
    {
        click(lnk_SecureCheckout);
    }

    public boolean isVerifySecureCheckoutLinkDisplayed()
    {
        return isElementDisplayed(lnk_SecureCheckout);
    }

    public boolean isVerifyReturnPoliciesLinkDisplayed()
    {
        return isElementDisplayed(lnk_ReturnPolicies);
    }

    public void clickReturnPoliciesLink()
    {
        clickButtonWithOutScroll(lnk_ReturnPolicies);
        switchToLastWindow();
    }

    public boolean isSecureCheckoutPopUpDisplayed()
    {
        return isElementDisplayed(popup_SecureCheckout);
    }

    public void clickSecureCheckoutPopupCloseBtn(){

        clickButtonWithOutScroll(Btn_SecureCheckoutPopUpCloseBtn);
    }

    public void clickPrivacyPolicyLinkInSecureCheckoutPopUp()
    {
        clickButtonWithOutScroll(lnk_PrivacyPolicyInSecureCheckoutPopUp);
    }

    public boolean isPrivacyPolicyHeaderDisplayed()
    {

        return isElementDisplayed(lbl_PrivacyPolicy);
    }

    public boolean isSlickSlidePopupMatchedWithMyBagPage()
    {
        String xpath="//a[contains(text(), '"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[1]//p[contains(@class,'Color')]";
        WebElement colorInMyBagPage = driver.findElement(By.xpath(xpath));
        System.out.println("Bag:"+ getText(colorInMyBagPage));
        System.out.println("selectedColorInSlickSlidePopUp"+ProductDetailPage.selectedColorInSlickSlidePopUp);
        return isTextContain(getText(colorInMyBagPage),ProductDetailPage.selectedColorInSlickSlidePopUp);
    }

    public void clickQtyDecreaseBtn() {
        setImplicit(5);
        String Qtyxpath = "//a[contains(text(), '" + ProductListPage.selectedProductName + "')]//ancestor::div[9]/div[2]//div[contains(@class,'product-quantity_container')]//input[@id='Quantity']";
        WebElement Qtyelement = driver.findElement(By.xpath(Qtyxpath));
        while (!ProductDetailPage.selectedProductQty.equalsIgnoreCase(Qtyelement.getAttribute("value"))) {
            String xpath = "//a[contains(text(),'" + ProductListPage.selectedProductName + "')]//ancestor::div[9]/div[2]//button[contains(@class,'product-quantity_less')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            clickButtonWithOutScroll(element);
            waitForAriatLoadIconDisappear();
            setImplicit(5);
            if (ProductDetailPage.selectedProductQty.equalsIgnoreCase(Qtyelement.getAttribute("value"))){
                break;
            }
        }
    }
    public boolean isVerifySelectedProductIdDisplayed(){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[1]//p[contains(text(),'Style')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element),ProductDetailPage.selectedProductID);
    }


    public void clickSelectedProductLink(){
        for (WebElement element : lst_ProductNameInMyBag) {
            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {
                clickButtonWithOutScroll(element);
            }
        }

    }

    public void getProductTotalPrice(){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]/div/div[3]/div/div[2]";
        WebElement element = driver.findElement(By.xpath(xpath));
        selectedProductTotalPrice = getText(element);
    }

    public void clickRemovelinkInOtherProduct(){
        for (int i = lst_ProductNameInMyBag.size()-1; i>=0;i--) {
            waitVisibilityOfElement(driver.findElement(By.xpath("//button[contains(@class,'remove-btn-lg')]")));
            if (!lst_ProductNameInMyBag.get(i).getText().equalsIgnoreCase(ProductListPage.selectedProductName)) {
                String xpath = "//a[contains(text(),'"+lst_ProductNameInMyBag.get(i).getText()+"')]//ancestor::div[9]/div[2]//div//button[contains(@class,'remove-btn-lg')]";
                WebElement element = driver.findElement(By.xpath(xpath));
                clickButtonWithOutScroll(element);
            }
        }
        waitFor(3000);
    }


    public boolean isRemoveFromWishListLinkDisplayed()
    {
        String xpath = "//a[contains(text(),'"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[2]//div//button[contains(@class,'remove-from-wishlist')]";
        WebElement element =driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public void clickRemoveFromWishListLinkOnSelectedWishlistProduct()
    {
        String xpath = "//a[contains(text(),'"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[2]//div//button[contains(@class,'remove-from-wishlist')]";
        WebElement element =driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);

    }
    public boolean isSelectedProductWidthDisplayedInMyBag()
    {
        String xpath="//a[contains(text(), '"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[1]//p[contains(@class,'Width')]";
        WebElement widthInMyBagPage = driver.findElement(By.xpath(xpath));
        String selectedWidth = ProductDetailPage.widthCode+" "+"/"+" "+ProductDetailPage.widthText;
        return isTextContain(getText(widthInMyBagPage),selectedWidth);
    }

    public boolean isSelectedProductStyleCodeDisplayed()
    {
        String xpath="//a[contains(text(), '"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[1]//p[contains(text(),'Style')]";
        WebElement styleCodeInMyBagPage = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(styleCodeInMyBagPage),ProductDetailPage.selectedProductNameCode);

    }

    public boolean isSelectedSizeDisplayed()
    {
        String xpath="//a[contains(text(), '"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[1]//p[contains(@class,'Size')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        selectedProductSize = ProductDetailPage.productSize.substring(0,1);
        return isTextContain(getText(element),selectedProductSize);

    }

    public boolean isSelectedColorDisplayedInMyBagPage()
    {
        String xpath="//a[contains(text(), '"+ProductListPage.selectedProductName+"')]//ancestor::div[9]/div[1]//p[contains(@class,'Color')]";
        WebElement colorInMyBagPage = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(colorInMyBagPage),ProductDetailPage.selectedproductColorName);
    }

    public boolean verifyQuickViewScreenDisplayed(){

        return isElementDisplayed(popup_QuickView);

    }

    public void clickCloseButtonInQuick(){

        clickButtonWithOutScroll(Btn_QuickViewCloseButton);
    }

    public boolean isVerifyQtyLessBtnDisplayed(){
       String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//button[contains(@class,'product-quantity_less')]";
       WebElement element = driver.findElement(By.xpath(xpath));
       return isElementDisplayed(element);
    }

    public boolean isVerifyQtyMoreBtnDisplayed(){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//button[contains(@class,'product-quantity_more')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isVerifyQtyDisplayed(){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//input[@id='Quantity']";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isVerifyAddToWishlistDisplayed(String text){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//button//span[contains(text(),'Add to Wishlist')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(text);
    }

    public boolean isVerifyRemoveDisplayed(String text){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//button//span[contains(text(),'Remove')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(text);
        //a[contains(text(), 'Cruiser')]/ancestor::div[9]/div[2]//button[contains(@class,'remove-product')]
    }

    public boolean isVerifyRemoveFromWishlistDisplayed(String text){
        String xpath = "//a[contains(text(), '"+ProductListPage.selectedProductName+"')]/ancestor::div[9]/div[2]//button//span[contains(text(),'Remove from Wishlist')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(text);
    }

    public boolean isVerifyPromoCodeTextBoxDisplayed(){

        return isElementDisplayed(txt_Promocodetextbox);
    }

    public boolean isVerifyPromoCodeApplyBtnDisplayed(){

        return isElementDisplayed(Btn_PromocodeApplyBtn);
    }

    public boolean isVerifyCartTextsDisplayed(List<String> text){

        boolean flag = false;
        for (int i=0; i<text.size();i++){
            WebElement element = driver.findElement(By.xpath("//p[text()='"+text.get(i)+"']"));
            if (getText(element).equalsIgnoreCase(text.get(i))){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
   return flag;
    }


    public boolean isVerifyEstimatedTotalTextDisplayed(String text){

        return isElementDisplayed(txt_EstimatedTotaltext);
    }

    public boolean isVerifyCheckoutAssistancetextDisplayed(String text){
        switchToParentWindow();
        return isTextContain(getText(txt_Checkoutassistance),text);
    }

    public boolean isVerifyCheckoutAssistanceContactNoDisplayed(){

        return isElementDisplayed(txt_CartAssistancePhone);
    }

    public boolean enterAndVerifyPromocodeErrorMsg(List<String> text){
        boolean flag = false;
        for (int i=0; i<text.size(); i++){
            waitFor(2000);
            enterTextWithoutScroll(txt_Promocodetextbox,text.get(i));
            clickButtonWithOutScroll(Btn_PromocodeApplyBtn);
            if (isElementDisplayed(txt_PromoCodeErrorMsg)){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
    return flag;
    }

    public boolean isVerifySelectedQtyDisplayed(){
        getProductQuantity();
        return (ProductDetailPage.selectedProductQty.equals(displayedproductQty));
    }

    public void getProductQuantity(){

        displayedproductQty = txt_ProductQuantity.getAttribute("value");
    }

    public boolean isSelectedRandomProductDisplayedInMyBagPage() {
        boolean flag = false;
        for (WebElement element : lst_ProductNameInMyBag) {

            if (getText(element).equalsIgnoreCase(ProductDetailPage.selectedRandomProductName)) {

                flag = true;
                break;
            }
        }
        return flag;
    }


    public boolean isRandomSelectedProductSelectedColorDisplayedInMyBag() {
        String xpath = "//a[contains(text(), '" + ProductDetailPage.selectedRandomProductName + "')]//ancestor::div[9]/div[1]//p[contains(@class,'Color')]";
        WebElement colorInMyBagPage = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(colorInMyBagPage), ProductDetailPage.selectedProductColor);

    }

    public boolean isSelectedRandomProductInDetailPagePriceDisplayed() {
        String xpath = "//a[contains(text(), '" + ProductDetailPage.selectedRandomProductName + "')]/ancestor::div[9]/div[2]//span[@class='sales']/span";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ProductDetailPage.selectedProductPrice);
    }

    public boolean isRandomlySelectedProductStyleDisplayed() {
        String xpath = "//a[contains(text(), '" + ProductDetailPage.selectedRandomProductName + "')]//ancestor::div[9]/div[1]//p[contains(text(),'Style')]";
        WebElement styleCodeInMyBagPage = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(styleCodeInMyBagPage), ProductDetailPage.selectedProductNameCode);
    }


    public void getSubtotalOnMyBag(){

        subtotal = getText(txt_SubTotalMyBag);
    }

    public void getOrderDiscountOnMyBag(){

        orderdiscount = getText(txt_Orderdiscount);
    }

    public void getShippingCostMyBag(){

        shippingcost = getText(txt_ShippingCost);
    }

    public void getEstimatedTaxOnMyBag(){

        estimatedTax = getText(txt_EstimatedTax);
    }



}




