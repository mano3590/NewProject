package com.ariat.pages;

import com.ariat.pagefactory.MyOrdersPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyOrdersPage extends MyOrdersPageFactory {

    public MyOrdersPage()
    {
        PageFactory.initElements(driver,this);
    }

    public static String selectedordernumber,selectedorderdate,selectedshippedto,selectedProductItemscount,selectedtotalprice,selectedorderstatus;
    public static List <String> selectedproductName;

    public boolean isOrderNumberDisplayedInMyOrdersPage(){
        String xpath="//div//following::h3[contains(text(),'"+SecureCheckoutCompletePage.orderNumberInSecureComplete+"')]";
        WebElement orderNo=driver.findElement(By.xpath(xpath));
        return isTextContain(getText(orderNo),(SecureCheckoutCompletePage.orderNumberInSecureComplete));
    }

    public boolean isTotalDisplayedInMyOrdersPage()
    {
        String xpath = "//div//following::h3[contains(text(),'"+SecureCheckoutCompletePage.orderNumberInSecureComplete+"')]//following::div[6]//p[text()='Total ']//following-sibling::p";
        WebElement totalPrice = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(totalPrice),SecureCheckoutCompletePage.totalPriceInCheckoutComplete);
    }

    public boolean isOrderedDateDisplayedInMyOrdersPage()
    {
        String xpath = "//div//following::h3[contains(text(),'"+SecureCheckoutCompletePage.orderNumberInSecureComplete+"')]//following::div[1]//following-sibling::p[contains(text(),'Date')]";
        WebElement orderedDate = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(orderedDate),SecureCheckoutCompletePage.orderDateInSecureComplete);

    }

    public boolean isTotalItemsDisplayedInMyOrdersPage()
    {
        String xpath = "//div//following::h3[contains(text(),'"+SecureCheckoutCompletePage.orderNumberInSecureComplete+"')]//following::div[6]//child::div//child::p[contains(text(),'Total items')]//following-sibling::p";
        WebElement totalItems = driver.findElement(By.xpath(xpath));
        return isTextContain(SecureCheckoutCompletePage.totalItems,getText(totalItems));
    }

    public boolean isSelectedProductNameDisplayedInMyOrdersPage(){
        String xpath ="//div//following::h3[contains(text(),'"+SecureCheckoutCompletePage.orderNumberInSecureComplete+"')]//following::div[4]//child::p//following-sibling::p";
        List<WebElement> lst_productNames = driver.findElements(By.xpath(xpath));
        boolean flag = false;
        for (WebElement element : lst_productNames) {
            if(getText(element).equalsIgnoreCase(ProductListPage.selectedProductName)) {

                flag = true;
                break;

            }
        }
        return flag;
    }

    public boolean isOrderDetailsTitleDisplay()
    {
        return isElementDisplayed(lbl_orderDetail);
    }

    public boolean isOrderNoDisplayedInOrderDetailPage()
    {
        return getText(txt_orderNumberInOrderDetail).equalsIgnoreCase(SecureCheckoutCompletePage.orderNumberInSecureComplete);
    }

    public boolean isOrderedDateDisplayedInOrderDetailPage()
    {
        return getText(txt_orderDateInOrderDetail).equalsIgnoreCase(SecureCheckoutCompletePage.orderDateInSecureComplete);
    }

    public boolean isProductNameDisplayedInOrderDetailPage()
    {
        scrollByPixel();
        return getText(txt_productNameInOrderDetail).equalsIgnoreCase(ProductListPage.selectedProductName);
    }

    public boolean isProductPriceDisplayedInOrderDetailPage()
    {
        return isTextContain(getText(txt_productPriceInOrderDetail),ProductDetailPage.selectedProductPrice);
    }

    public boolean isGrandTotalDisplayedInOrderDetailPage()
    {
        waitFor(3000);
        return getText(txt_GrandTotalInOrderDetail).equalsIgnoreCase(SecureCheckoutCompletePage.totalPriceInCheckoutComplete);
    }

    public boolean isTotalItemsDisplayedInOrderDetailPage()
    {
        return isTextContain(getText(txt_TotalItemsInOrderDetail),SecureCheckoutCompletePage.totalItems);
    }

    public void clickOrderHistoryDropdown() {
        waitFor(3000);
        clickButtonWithOutScroll(ddl_OrderHistorydropdown);
    }

    public void clickMyorderdropdownItems(String myorderdropdownlistitem) {
        waitForAriatLoadIconDisappear();
        String xpath = "//div[contains(@class,'order-history-select')]//li[contains(text(),'" + myorderdropdownlistitem + "')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public boolean verifyAccountHelpHeaders(String headers) {
        String xpath = " //div[@class='account-help-wrapper']//h5[contains(text(),'" + headers + "')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(element), headers.toUpperCase());
    }

    public boolean verifyContactuslink(String linkname) {

        return getText(lnk_ContactUsLink).equalsIgnoreCase(linkname);
    }

    public void clickContactuslink() {
        waitFor(3000);
        clickButtonWithOutScroll(lnk_ContactUsLink);
        switchToLastWindow();
    }

    public boolean verifyCustomerServiceContactNumber() {
        switchToParentWindow();
        return isElementDisplayed(txt_CustomerServiceNumber);
    }

    public boolean verifyCustomerServiceEmail() {

        return isElementDisplayed(txt_customerserviceEmail);
    }

    public boolean verifyOrderNoIsDisplayed() {
        boolean flag = true;
        for (int i = 0; i < lst_OrderNumber.size(); i++) {

            if (!isElementDisplayed(lst_OrderNumber.get(i))) {

                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean verifyOrderDetaillinkIsDisplayed() {
        boolean flag = true;
        for (int i = 0; i < lst_OrderDetailsLink.size(); i++) {
            if (!isElementDisplayed(lst_OrderDetailsLink.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean verifyOrderTextsDisplayed(List<String> orderdetailtext) {
        boolean flag = true;
        for (int i = 0; i < orderdetailtext.size(); i++) {
            String xpath = "//div[contains(@class,'card-body')]//p[contains(text(),'" + orderdetailtext.get(i) + "')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            if (!isElementDisplayed(element)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean verifyNoItemTextDisplayed() {
        boolean flag = true;
        for (int i = 0; i < lst_TotalItemsInOrderList.size(); i++) {
            if (!isElementDisplayed(lst_TotalItemsInOrderList.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean verifyProductTotalPriceDisplayed() {
        boolean flag = true;
        for (int i = 0; i < lst_TotalPriceInOrderList.size(); i++) {
            if (!isElementDisplayed(lst_TotalPriceInOrderList.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void getOrderDetails() {
        int randomNumber = getRandomNumber(lst_OrderNumber);
            String[] order = getText(lst_OrderNumber.get(randomNumber)).split(" ");
            selectedordernumber = order[2];
            List<WebElement> productname = driver.findElements(By.xpath("//h3[@class='float-left' and contains(text(),'"+selectedordernumber+"')]//following::div[1]//p[text()='Items:']//following-sibling::p"));

            selectedproductName = new ArrayList<>();
            for (int i=0; i<productname.size();i++){
                selectedproductName.add(productname.get(i).getText());
            }

            String xpath = "//h3[@class='float-left' and contains(text(),'"+selectedordernumber+"')]//following-sibling::a[contains(text(),'Order Details')]";
            WebElement orderDetaillinkelement = driver.findElement(By.xpath(xpath));

            WebElement element = driver.findElement(By.xpath("//h3[@class='float-left' and contains(text(),'" + selectedordernumber + "')]//following::div[1]//p[contains(text(),'Date Ordered:')]"));
            String[] orderdate = getText(element).split(" ");
            selectedorderdate = orderdate[2];

            WebElement orderstatuselement = driver.findElement(By.xpath("//h3[@class='float-left' and contains(text(),'"+ selectedordernumber + "')]//following::div[1]//p[contains(text(),'Order Status:')]//span"));
            selectedorderstatus = getText(orderstatuselement);

            WebElement shippedelement = driver.findElement(By.xpath("//h3[@class='float-left' and contains(text(),'" + selectedordernumber + "')]//following::div[1]//p[contains(text(),'Shipped to:')]"));
            String[] shipped = getText(shippedelement).split(" ");
            selectedshippedto = shipped[2];

            WebElement totalitemelement = driver.findElement(By.xpath("//h3[@class='float-left' and contains(text(),'" + selectedordernumber + "')]//following::div[5]//p[text()='Total items']//following-sibling::p"));
            selectedProductItemscount = getText(totalitemelement);

            WebElement totalpriceElement = driver.findElement(By.xpath("//h3[@class='float-left' and contains(text(),'"+ selectedordernumber +"')]//following::div[5]//p[text()='Total ']//following-sibling::p"));
            selectedtotalprice = getText(totalpriceElement);

            clickButtonWithOutScroll(orderDetaillinkelement);
            waitVisibilityOfElement(txt_PageHeader);
    }

    public boolean isVerifySelectedOrderNumberDisplayed(){

       return isTextContain(getText(txt_OrderNumberInSummary),selectedordernumber);
    }

    public boolean isVerifySelectedOrderDateDisplayed(){

        return isTextContain(getText(txt_OrderdateInSummary),selectedorderdate);
    }

    public boolean isVerifySelectedOrderStatusDisplayed(){

        return isTextContain(getText(txt_OrderStatusInSummary),selectedorderstatus);
    }

    public boolean isVerifySelectedOrderProductCountDisplayed(){

        return isTextContain(getText(txt_ProductItemsCountInSummary),selectedProductItemscount);
    }

    public boolean isVerifySelectedOrderProductTotalpriceDisplayed(){

        return isTextContain(getText(txt_TotalPrice),selectedtotalprice);
    }

    public boolean isVerifySelectedProductNamesDisplayed(){

        boolean flag = false;
        for (int i=0; i<lst_ProductName.size();i++){
            waitFor(4000);
           if(isTextContain(getText(lst_ProductName.get(i)),selectedproductName.get(i))){
               flag = true;
           } else{
               flag = false;
               break;
           }
        }
    return flag;
    }


    public void verifyMyOrderdropdown(String dropdown) throws ParseException {

        DateFormat dateformat = new SimpleDateFormat("MM/dd/yy");
        Calendar sixMonthsAgo = Calendar.getInstance();
        sixMonthsAgo.add(Calendar.MONTH, -12);
        System.out.println(dateformat.format(sixMonthsAgo.getTime()));

        }


    }


