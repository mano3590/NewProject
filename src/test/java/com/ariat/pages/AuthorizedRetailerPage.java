package com.ariat.pages;

import com.ariat.pagefactory.AuthorizedRetailerPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AuthorizedRetailerPage extends AuthorizedRetailerPageFactory {

    public AuthorizedRetailerPage() {
        PageFactory.initElements(driver, this);
    }


    public boolean isAuthorizedRetailerPageLinksDisplayed(List<String> link) {
        boolean flag = true;
        for (int i = 0; i < link.size(); i++) {
            if (!isAuthorizedRetailerLinksDisplayed(link.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isAuthorizedRetailerLinksDisplayed(String link) {
        boolean flag = false;
        for (int j = 0; j < lst_StoreList.size(); j++) {
            if (link.equalsIgnoreCase(getText(lst_StoreList.get(j)))) {
                flag = isElementDisplayed(lst_StoreList.get(j));
                break;
            }
        }
        return flag;

    }

    public void clickBrandShops() {
        clickButtonWithOutScroll(lnk_BrandShops);
    }


    public boolean isShopNamesAndImagesDisplayed(List<String> shopNames)
    {
        boolean flag = true;
        for (int i = 0; i < shopNames.size(); i++) {
            if (!isShopNamesAndImagesDisplayedInBrandShops(shopNames.get(i))) {
                flag = false;
                break;
            }
        }
        return flag;

    }


    public boolean isShopNamesAndImagesDisplayedInBrandShops(String shopNames)
    {
        boolean flag = false;
        WebElement image= driver.findElement(By.xpath("//h2//a[contains(text(),'"+shopNames+"')]//parent::h2//parent::div//parent::div//img"));
        for(WebElement shops:lst_ShopTitle)
        {
            if (getText(shops).equalsIgnoreCase(shopNames)) {
                scrollByPixel();
                flag = isElementDisplayed(image);

            }
        }
        return flag;
    }




    public void clickGoToShopButton( String goToShoPage ) {
        for (int i = 0; i < lst_GoToShopButton.size(); i++) {
            if (lst_GoToShopButton.get(i).getText().contains(goToShoPage)) {
                clickButtonWithOutScroll(lst_GoToShopButton.get(i));
                break;
            }
        }


    }

    public void clickOutsideTheUs() {
        clickButtonWithOutScroll(lnk_OutsideTheUs);
    }

    public boolean isStoreLocatorDetailsDisplayed() {
        return isElementDisplayed(lbl_StoreLoactorContent);
    }

    public boolean isStoreCountryNameDisplayed(String country) {
        boolean flag=false;
        for (int i=0;i<lst_storeCountry.size();i++) {
            if(getText(lst_storeCountry.get(i)).equalsIgnoreCase(country))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }

    public boolean isCountryEmailIdDisplayed(String email)
    {
        boolean flag=false;
        for (int i=0;i<lst_EmailLink.size();i++) {
            if(isTextContain(getText(lst_EmailLink.get(i)),email))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }

    public boolean isStoreCountryContactNoDisplayed(String phoneNo)
    {
        boolean flag=false;
        for (int i=0;i<lst_PhoneNumber.size();i++) {
            if(isTextContain(getText(lst_PhoneNumber.get(i)),phoneNo))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }

    public void clickStore()
    {
        clickButtonWithOutScroll(lnk_Stores);
    }

    public boolean isZipCodeDisplayed()
    {
        highLighterMethod(driver,txt_postalCode);
        return isElementDisplayed(txt_postalCode);
    }

    public boolean isRadiusDisplayed()
    {
        highLighterMethod(driver,ddl_RadiusButton);
        return isElementDisplayed(ddl_RadiusButton);
    }

    public boolean isFilterByCheckBoxDisplayed(List<String> filterResultsBy)
    {
        boolean flag=true;
        for(int i=0;i<filterResultsBy.size();i++)
        {
            if(!isFilterByCheckBoxDisplayedInStoresPage(filterResultsBy.get(i)))
            {
                flag=false;
                break;
            }
        }
        return flag;
    }

    public boolean isFilterByCheckBoxDisplayedInStoresPage(String filterResultsBy)
    {
        boolean flag=false;
        for(int i=0;i<ckb_filter.size();i++)
        {
            if(filterResultsBy.equalsIgnoreCase(getText(ckb_filter.get(i))))
            {
                flag=true;
            }
        }
        return flag;
    }


    public boolean isSearchButtonDisplayed()
    {
        highLighterMethod(driver,btn_Search);
        return isElementDisplayed(btn_Search);
    }

    public void enterZipCode(String zipcode)
    {
        click(txt_postalCode);
        txt_postalCode.clear();
        enterTextWithoutScroll(txt_postalCode,zipcode);
    }


    public void selectRadius(String radius)
    {
        waitFor(2000);
        click(ddl_RadiusButton);
        for (int j = 0; j < lst_Radius.size(); j++) {
            if (lst_Radius.get(j).getText().equalsIgnoreCase(radius)) {
                clickButtonWithOutScroll(lst_Radius.get(j));
                break;
            }
        }
    }


    public void clickSearchButton()
    {
        clickButtonWithOutScroll(btn_Search);
        waitFor(3000);

    }

    public boolean isStoreNamesDisplayed()
    {
        boolean flag = false;
        waitFor(3000);
        for(WebElement stores : lst_StoreLocatorResult)
        {
            highLighterMethod(driver,stores);
            isElementDisplayed(stores);
            flag=true;
        }
        return flag;
    }

    public boolean isCheckboxAllSelectedByDefault()
    {
        highLighterMethod(driver, ckb_all);
        return ckb_all.isSelected();
    }

    public void selectFilter(String filter)
    {
        for (int j = 0; j < ckb_filter.size(); j++) {
            if (ckb_filter.get(j).getText().contains(filter)) {
                click(ckb_filter.get(j));
                break;
            }
        }

    }

    public boolean isErrorMessageDisplayed(String errorMessage)
    {
        highLighterMethod(driver,txt_zipcodeErrorMessage);
        return isTextContain(txt_zipcodeErrorMessage.getText(), errorMessage);
    }

    public boolean isInvalidZipCodeErrorMessageDisplayed(String invalidZipcodeErrorMessage)
    {
        highLighterMethod(driver,txt_invalidZipCodeErrorMessage);
        return isTextContain(txt_invalidZipCodeErrorMessage.getText(), invalidZipcodeErrorMessage);


    }

    public boolean isUrlOfThePageDisplayed(String url)
    {
        waitFor(3000);
        return isTextContain(driver.getCurrentUrl(),url);

    }

    public boolean isAriatEmailIdDisplayedInOutsideTheUsPage()
    {
        return isElementDisplayed(lnk_StoreAriatEmailLink);
    }

}
