package com.ariat.pages;

import com.ariat.pagefactory.PhotoBlockPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PhotoBlockPage extends PhotoBlockPageFactory {

    public static String selectedProductName;

    public PhotoBlockPage(){

        PageFactory.initElements(driver, this);
    }

    public boolean isSelectedPhotoLightBoxDisplayed(){
        driver.switchTo().frame(iframe_pixleelightboxiframe);
        waitFor(2000);
        return isElementDisplayed(img_PhotoLightBox);

    }

    public void clickBuyNowButton() {

        for (int i = 0; i <= 10; i++) {
            if (isElementDisplayed(btn_BuyNow)) {
                selectedProductName = getText(txt_SelectedPhotoBlockName);
                clickButtonWithOutScroll(btn_BuyNow);
                break;
            }
            clickButtonWithOutScroll(btn_NextButton);
        }
        switchToDefaultContent();
    }

    public boolean verifySelectedPhotoLightBoxCloseBtnDisplayed(){

        return isElementDisplayed(Btn_PhotoLightBoxCloseBtn);
    }

    public boolean verifySelectedPhotoLightBoxNextBtnDisplayed(){

        return isElementDisplayed(Btn_PhotoLightBoxNext);
    }

    public boolean verifySelectedPhotoLightBoxPreviousBtnDisplayed(){

        return isElementDisplayed(Btn_PhotoLightBoxPrevious);
    }

    public void clickCloseBtnSelectedPhotoLight(){

        clickButtonWithOutScroll(Btn_PhotoLightBoxCloseBtn);
    }


}
