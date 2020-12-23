package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureCheckoutCompletePageFactory extends GenericWrappers {
    @FindBy(className = "grand-total-sum")
    public WebElement lbl_GrandTotalInCheckoutComplete;

    @FindBy(css=".summary-details.order-number")
    public WebElement txt_orderNumber;

    @FindBy(css=".summary-details.order-date")
    public WebElement txt_orderDate;

    @FindBy(css=".order-receipt-label.grand-total-label")
    public WebElement txt_TotalItems;
}
