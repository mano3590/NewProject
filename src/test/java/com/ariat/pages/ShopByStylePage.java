package com.ariat.pages;

import com.ariat.pagefactory.ShopByStylePageFactory;
import org.openqa.selenium.support.PageFactory;

public class ShopByStylePage extends ShopByStylePageFactory {
    public static String selectedProductLinkName,selectedShopByStylelinkName;

    public ShopByStylePage() {

        PageFactory.initElements(driver, this);
    }

    public void clickRandomProductLink() {
        int random = getRandomNumber(lst_ShopByStyleProductLink.size());
        selectedProductLinkName = getText(lst_ShopByStyleProductLink.get(random));
        click(lst_ShopByStyleProductLink.get(random));
    }

    public boolean isVerifyPage(String pageheader){

        return getText(txt_pageHeader).equalsIgnoreCase(pageheader);
    }

    public boolean clickAndVerifyProductLinks(){
        boolean flag = false;
        for (int i=0; i<lst_ShopByStyleProductLink.size();i++) {
            waitVisibilityOfElement(lst_ShopByStyleProductLink.get(i));
            String url = lst_ShopByStyleProductLink.get(i).getAttribute("href");
            selectedShopByStylelinkName = getText(lst_ShopByStyleProductLink.get(i));
            clickButtonWithOutScroll(lst_ShopByStyleProductLink.get(i));
            String currenturl = driver.getCurrentUrl();
            waitVisibilityOfElement(lbl_ProductListHeader);
            waitFor(3000);
            String producttitle = getText(lbl_ProductListHeader);
            if (selectedShopByStylelinkName.equalsIgnoreCase(producttitle)||currenturl.equals(url)) {
                if ((!lst_ProductList.isEmpty())) {
                    flag = true;
                }
             else {
                flag = false;
                break;
            }
        } else {
                flag = false;
//                break;
            }
            driver.navigate().to("https://www.ariat.com/shop-by-style.html");
        }
    return flag;
    }
}
