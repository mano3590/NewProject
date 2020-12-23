package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AriatHomePageFactory extends GenericWrappers {

    @FindBy (css = ".amp-dc-card-img-wrap")
    public List<WebElement> lst_Homepagewidgetimg;

    @FindBy (css = ".amp-dc-card-img-wrap>a")
    public List<WebElement> lst_Homepagewidgets;

    @FindBy (xpath = "//div[contains(@class,'amp-dc-card-link')]//a")
    public List<WebElement> lst_HomePageWidgetLinks;

    @FindBy (xpath = "//div[@id='frame']//ul//li")
    public List<WebElement> img_PhotoBlock;

    @FindBy (css = ".btn.next")
    public WebElement btn_Next;

    @FindBy (xpath = "//button[contains(@class,'disabled')]")
    public WebElement btn_NextDisabled;

    @FindBy(xpath="//div[contains(@class,'transparent-block')]//a[contains(@class,'amp-dc-banner-button')]")
    public List<WebElement> btn_HomePageBanner;

    @FindBy(css=".splitblock-card-header.proximanova-extrabold")
    public WebElement label_WidgetTiltle;

    @FindBy(css = ".product-recommendations__title")
    public WebElement lbl_NewArrivals;

    @FindBy(css=".homepage-cta_wrapper")
    public List<WebElement> btn_WorkBanner;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='Shop By Style']")
    public WebElement lnk_ShopByStyle;

    @FindBy (xpath = "//a[@class='footer-submenu__link' and text()='Wish List']")
    public WebElement lnk_WishList;

    @FindBy (xpath = "//div[@id='frame']//ul//li[1]")
    public WebElement img_FirstPhotoBlock;

    @FindBy (xpath = "//iframe[contains(@id,'pixlee_widget')]")
    public WebElement img_PhotoBlockFrameID;

    @FindBy (id = "pixlee_social_auth")
    public WebElement frame_SigninWithYourSocialFrame;

    @FindBy(css=".pdp-link")
    public List<WebElement> lst_ProductNameInNewArrivals;

    @FindBy(xpath="//span[@class='value']")
    public List<WebElement> lst_ProductPriceInNewArrivals;

    @FindBy(css=".image-link")
    public List<WebElement> lst_ImageNewArrivals;

    @FindBy (xpath = "//div[@class='amp-dc-banner-pic-wrap']//following::div[contains(@class,'button')][1]//a")
    public List<WebElement>  lst_HomePageBannerButton;

    @FindBy(css = "#product-search-results div:nth-child(2)  div:nth-child(2) .search-results-title")
    public WebElement lbl_ProductListHeader;

    @FindBy (id = "hashtag_holder")
    public WebElement txt_MyAriat;

    @FindBy (id = "description_holder")
    public WebElement txt_MyAriatDescription;

    @FindBy (id = "upload_now")
    public WebElement lnk_AddYourPhoto;

    @FindBy(id = "view_gallery")
    public WebElement lnk_ViewGallery;

    @FindBy (xpath = "//h3[@class='product-recommendations__title']")
    public WebElement txt_NewArrivals;

    @FindBy (xpath = "//iframe[@id='pixlee_uploader']")
    public WebElement iFrameid;

    @FindBy (id="uploader_frame")
    public WebElement dialogue_uploaderframe;

    @FindBy (id = "source_header")
    public WebElement txt_SourceHeader;

    @FindBy (id = "source_desktop")
    public WebElement lnk_source_desktop;

    @FindBy (id = "source_instagram")
    public WebElement lnk_source_instagram;

    @FindBy (id = "source_facebook")
    public WebElement lnk_source_facebook;

    @FindBy (id = "source_google_photos")
    public WebElement lnk_source_google_photos;

    @FindBy (id = "pick_source")
    public WebElement lnk_pick_source;

    @FindBy (id = "select_content")
    public WebElement lnk_select_content;

    @FindBy (id = "review_submission")
    public WebElement lnk_review_submission;

    @FindBy (id = "submit_content")
    public WebElement lnk_submit_content;

    @FindBy (xpath = "//div[@id='pick_source' and contains(@class,'active')]")
    public WebElement lnk_ChooseSourceBreadCrum;

    @FindBy (xpath = "//div[@id='select_content' and contains(@class,'active')]")
    public WebElement lnk_select_contentBreadCrum;

    @FindBy (xpath = "//div[@id='review_submission' and contains(@class,'active')]")
    public WebElement lnk_review_submissionBreadCrum;

    @FindBy (xpath = "//div[@id='submit_content' and contains(@class,'active')]")
    public WebElement lnk_submit_contentBreadCrum;

    @FindBy (xpath = "//div[@id='pick_source' and contains(@class,'breadcrum')]")
    public WebElement lnk_pick_sourceBreadCrumlink;

    @FindBy (xpath = "//div[@id='select_content' and contains(@class,'breadcrum')]")
    public WebElement lnk_select_contentBreadCrumlink;

    @FindBy (xpath = "//div[@id='review_submission' and contains(@class,'breadcrum')]")
    public WebElement lnk_review_submissionBreadCrumlink;

    @FindBy (xpath = "//div[@id='submit_content' and contains(@class,'breadcrum')]")
    public WebElement lnk_submit_contentBreadCrumlink;

    @FindBy (id = "fileuploader")
    public WebElement lnk_FileUploader;

    @FindBy (id="uploader_alert")
    public WebElement dialogue_AlertMsg;

    @FindBy (xpath = "//div[@id='alert_option']//button[@id='no']")
    public WebElement Btn_AlertNoBtn;

    @FindBy (xpath = "//div[@id='alert_option']//button[@id='yes']")
    public WebElement Btn_AlertYesBtn;

    @FindBy (xpath = "//button[@id='close']")
    public WebElement Btn_UploadFrameCloseBtn;

    @FindBy (css = ".photo_block .img_holder")
    public List<WebElement> lst_PhotoBlocks;

    @FindBy (css = ".load_more")
    public WebElement Btn_LoadMoreBtn;

    @FindBy (xpath = "//button[@id='end_uploader_tile_inside' and contains(text(),'Add Your Photo')]")
    public WebElement Btn_EndUploader;

    @FindBy (id = "search_box")
    public WebElement txt_Searchbox;

    @FindBy (id = "clear_search")
    public WebElement Btn_SearchCloseBtn;

    @FindBy (xpath = "//div[@id='filter_personalization']//span[@class='checked_items']")
    public WebElement ddl_YourPersonalizedContent;

    @FindBy (xpath = "//div[@id='filter_personalization']//ul[@class='filter_dropdown']//li")
    public List<WebElement> lst_YourPersonalizedContentlist;

    @FindBy (id = "sort_filter_button")
    public WebElement ddl_SortFilterDropDown;

    @FindBy (id = "social_sign_in_container")
    public WebElement dialogue_socialsignincontainer;

    @FindBy (id = "close")
    public WebElement Btn_socialsignincontainerCloseButton;

    @FindBy (id = "social_login_button")
    public WebElement ddl_social_login_button;

    @FindBy (className="delete_content")
    public WebElement lnk_DeleteInUploadFrame;

    @FindBy (className = "image_holder")
    public WebElement img_UploadedImage;

    @FindBy (css = ".caption ")
    public WebElement txt_txtAreaInUploadFrame;

    @FindBy (css = "button#next")
    public WebElement Btn_NextButtonInUploadFrame;

    @FindBy (id = "sort_filter_button")
    public WebElement ddl_SortByFilterdropdown;

    @FindBy (xpath = "//span[@id='sort_filter_button']//following::ul[@class='filter_dropdown']")
    public WebElement ddl_SortByDropDownBlock;

    @FindBy (xpath = "//span[@id='sort_filter_button']//following::ul[@class='filter_dropdown']//li")
    public List<WebElement> lst_SortBydropdownList;

    @FindBy (id = "social_sign_in_container")
    public WebElement popup_SocialSignInPopup;

    @FindBy (id = "close")
    public WebElement Btn_CloseButtonIbSocialSigninPopup;

    @FindBy (xpath = "//div[@id='filter_personalization']//ul[@class='filter_dropdown']//label[contains(@dropdown-value,'photos near me')]")
    public WebElement ddl_PhotosNearMeInYourPersonalizedDropdown;

    @FindBy (id = "search_region")
    public WebElement Btn_SearchBtnInPhotoBlock;

    @FindBy (xpath = "//div[@id='search_region' and contains(@class,'active')]")
    public WebElement txt_PhotoBlockSearchFieldDisplayed;

    @FindBy (id = "clear_search")
    public WebElement Btn_SearchCloseBtnInPhotoBlock;

    @FindBy (id = "search_box")
    public WebElement txt_PhotoBlockSearchInputBox;

    @FindBy (xpath = "//div[@class='filter_item_word filter_text']")
    public WebElement txt_PhotoBlockSearchFilterName;

    @FindBy (id = "clear_all_button")
    public WebElement Btn_clearAllBtn;

    @FindBy (className = "filter_item_clear")
    public WebElement Btn_PhotoBlockSearchFilterNameclearBtn;

    @FindBy (id = "results_bar")
    public WebElement txt_resultbar;

    @FindBy(css = ".product-name")
    public WebElement lbl_ProductName;

    @FindBy (xpath = "//div[@class='ms_desktop-only' and contains(text(),'ARIAT LIFE')]")
    public WebElement txt_Ariat;

}
