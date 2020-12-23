package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoBlockPageFactory extends GenericWrappers {


    @FindBy (id="photo_lightbox_wrapper_desktop")
    public WebElement img_PhotoLightBox;

    @FindBy (xpath = "//a[@class='cta_item_container']//following-sibling::div[@class='product_name']")
    public WebElement txt_SelectedPhotoBlockName;

    @FindBy (id = "cta_button")
    public WebElement btn_BuyNow;

    @FindBy (xpath = "//div[@class='mfp-preloader']//following-sibling::button[@title='Next']")
    public WebElement btn_NextButton;

    @FindBy (xpath = "//iframe[@id='pixlee_lightbox_iframe']")
    public WebElement iframe_pixleelightboxiframe;

    @FindBy (xpath = "//button[@class='mfp-close']")
    public WebElement Btn_PhotoLightBoxCloseBtn;

    @FindBy (xpath = "//button[@aria-label='Next']")
    public WebElement Btn_PhotoLightBoxNext;

    @FindBy (xpath = "//button[@aria-label='Previous']")
    public WebElement Btn_PhotoLightBoxPrevious;


}
