package com.ariat.pages;

import com.ariat.pagefactory.SecureCheckoutCompletePageFactory;
import org.openqa.selenium.support.PageFactory;

public class SecureCheckoutCompletePage extends SecureCheckoutCompletePageFactory {
    public static String orderNumberInSecureComplete,orderDateInSecureComplete,totalItems,totalPriceInCheckoutComplete;
    public SecureCheckoutCompletePage()
    {
        PageFactory.initElements(driver,this);
    }

    public boolean isVerifyGrandTotalAndTotalSameOnCheckoutComplete()
    {
        waitFor(2000);
        totalPriceInCheckoutComplete=getText(lbl_GrandTotalInCheckoutComplete);
        return isTextMatch((SecureCheckoutPage.grandTotalPriceInSecureCheckout),getText(lbl_GrandTotalInCheckoutComplete));
    }

    public void getOrderNumberOrderedDateAndTotalNoOfOrderedItems()
    {
        totalItems =  getText(txt_TotalItems);
        scrollToTop();
        orderNumberInSecureComplete = getText(txt_orderNumber);
        orderDateInSecureComplete=getText(txt_orderDate);

    }

}
