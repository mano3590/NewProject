package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyOrdersPageFactory extends GenericWrappers {

    @FindBy(xpath="//h3[contains(text(),'Order No')]")
    public List<WebElement> lst_OrderNo;

    @FindBy(css=".col.page-title")
    public WebElement lbl_orderDetail;

    @FindBy(xpath="//span[contains(text(),'Order Number')]//following::span[1]")
    public WebElement txt_orderNumberInOrderDetail;

    @FindBy(css=".summary-details.order-date")
    public WebElement txt_orderDateInOrderDetail;

    @FindBy(css=".line-item-name")
    public WebElement txt_productNameInOrderDetail;

    @FindBy(css=".line-item-total-price")
    public WebElement txt_productPriceInOrderDetail;

    @FindBy(css=".grand-total-sum")
    public WebElement txt_GrandTotalInOrderDetail;

    @FindBy(css=".order-receipt-label.grand-total-label")
    public WebElement txt_TotalItemsInOrderDetail;

    @FindBy (xpath = "//div[contains(@class,'order-history-select')]")
    public WebElement ddl_OrderHistorydropdown;

    @FindBy (xpath = "//div[@class='account-help-wrapper']//a[text()='Contact us']")
    public WebElement lnk_ContactUsLink;

    @FindBy (xpath = "//div[@class='account-help-wrapper']//a[contains(@href,'tel')]")
    public WebElement txt_CustomerServiceNumber;

    @FindBy (xpath = "//div[@class='account-help-wrapper']//a[contains(@href,'mail')]")
    public WebElement txt_customerserviceEmail;

    @FindBy (xpath = "//div[contains(@class,'order-list-container')]//div[@class='card mb-4']")
    public List<WebElement> lst_OrdersList;

    @FindBy (css = ".float-left")
    public List<WebElement> lst_OrderNumber;

    @FindBy (xpath = "//a[contains(text(),'Order Details')]")
    public List<WebElement> lst_OrderDetailsLink;

    @FindBy (xpath = "//div[contains(@class,'card-body')]//p[contains(text(),'Date Ordered:')]")
    public List<WebElement> lst_DateOrdered;

    @FindBy (xpath = "//div[contains(@class,'card-body')]//p[contains(text(),'Order Status:')]")
    public List<WebElement> lst_OrderStatus;

    @FindBy (xpath = "//div[contains(@class,'card-body')]//p[contains(text(),'Shipped to:')]")
    public List<WebElement> lst_ShippedTo;

    @FindBy (xpath = "//div[contains(@class,'card-body')]//p[contains(text(),'Items:')]//following-sibling::p")
    public List<WebElement> lst_OrderedItemsName;

    @FindBy (xpath = "//div[contains(@class,'card-footer')]//div[contains(@class,'dashboard-order-card-footer-columns')][1]")
    public List<WebElement> lst_TotalItemsInOrderList;

    @FindBy (xpath = "//div[contains(@class,'card-footer')]//div[contains(@class,'dashboard-order-card-footer-columns')][2]")
    public List<WebElement> lst_TotalPriceInOrderList;

    @FindBy (xpath = "//div[contains(@class,'content-header-container')]//h1")
    public WebElement txt_PageHeader;

    @FindBy(css=".profile-back-to-account-link")
    public WebElement lnk_BackToMyAccount;

    @FindBy (xpath = "//span[contains(@class,'order-number-label') and text()='Order Number:']//following::span[1]")
    public WebElement txt_OrderNumberInSummary;

    @FindBy (xpath = "//span[contains(@class,'order-date-label') and text()='Order Date:']//following::span[1]")
    public WebElement txt_OrderdateInSummary;

    @FindBy (xpath = "//span[contains(@class,'order-number-label') and text()='Order Status:']//following::span[1]")
    public WebElement txt_OrderStatusInSummary;

    @FindBy (xpath = "//span[contains(@class,'grand-total-label')]")
    public WebElement txt_ProductItemsCountInSummary;

    @FindBy (className = "grand-total-sum")
    public WebElement txt_TotalPrice;

    @FindBy (className = "line-item-name")
    public List<WebElement> lst_ProductName;

    @FindBy (xpath = "//a[contains(text(),'Order Details')]")
    public WebElement txt_Orderdetaillink;


}
