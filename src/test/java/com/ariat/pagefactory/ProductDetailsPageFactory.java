package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsPageFactory extends GenericWrappers {

    @FindBy(css = ".product-name")
    public WebElement lbl_ProductName;

    @FindBy(css = ".prices .sales .value")
    public WebElement lbl_ProductPrice;

    @FindBy(id = "sizeDropdown")
    public List<WebElement> ddl_Size;

    @FindBy(css = ".product-attribute_width .product-width-attribute div:nth-child(1)")
    public List<WebElement> lst_WidthVariationCode;

    @FindBy(css = ".product-attribute_width .product-width-attribute div:nth-child(2)")
    public List<WebElement> lst_WidthVariationText;

    @FindBy(id = "product-color-selected-attribute")
    public WebElement lbl_SelectedColor;

    @FindBy(css = ".attribute.variation-color a")
    public List<WebElement> lst_ProductColors;

    @FindBy(id = "Quantity")
    public WebElement txt_ProductQuantity;

    @FindBy(css = ".variation-size_items a")
    public List<WebElement> lst_ProductSize;

    @FindBy(css = ".variation-size_items a.product-Size-attribute.d-none")
    public List<WebElement> lst_ProductSizeNotInTheList;

    @FindBy(css = ".variation-size_items a span")
    public List<WebElement> lst_ProductSizeOutOfStock;

    @FindBy(css = ".row.cart-and-ipay div button")
    public WebElement btn_AddToBag;

    @FindBy(xpath = "//a[@id='sizeDropdown']/div[contains(text(), 'Calf')]")
    public List<WebElement> lst_Calf;

    @FindBy(xpath = "//a[@id='sizeDropdown']/div[contains(text(), 'Height')]")
    public List<WebElement> lst_Height;

    @FindBy (xpath = "//div[@class='afterpay-message']//preceding::span[@class='sales']")
    public WebElement txt_ProductPrice;

    @FindBy (xpath = "//button[contains(@class,'js_increase')]")
    public WebElement btn_Qtyincrease;

    @FindBy (xpath = "//button[contains(@class,'js_decrease')]")
    public WebElement btn_Qtydecrease;

    @FindBy (xpath = "//a[contains(@class,'afterpay-info-link')]")
    public WebElement btn_AfterPayInfoIcon;

    @FindBy (xpath = "//div[@id='afterpay-dialog']//following-sibling::span[@aria-hidden='true']")
    public WebElement btn_AfterPayPopupCloseBtn;

    @FindBy (xpath = "//button[@type='submit']//span[text()='Wishlist']")
    public WebElement btn_WishList;

    @FindBy (css=".add-to-wishlist-messages")
    public WebElement txt_WishlistSuccessmsg;

    @FindBy(css=".product-quickview.product-variant.col.product-wrapper.product-detail.modal-body.js_product-quickview")
    public WebElement popup_slickSlide;

    @FindBy(xpath="//div[contains(@class,'product-quickview')]//following-sibling::div[contains(@class,'product-color_label')]//following-sibling::a")
    public List<WebElement> lst_ProductColorSlickPopUp;

    @FindBy(xpath="//div[contains(@class,'product-quickview')]//following-sibling::div[contains(@class,'product-color_label')]//span")
    public WebElement lbl_SelectedColorSlickPopUp;

    @FindBy(xpath="//div[contains(@class,'product-quickview')]//span[@class='afterpay-logo']//following::a")
    public WebElement lnk_AfterPayInSlickSlidePopUp;

    @FindBy(xpath="//div[@class='modal-body js_modal-body']//following::div[@class='modal-body afterpay-modal-body']")
    public WebElement popup_AfterPaySlickSlidePopUp;

    @FindBy(css=".update-cart-product-global.btn.btn-primary.btn-block.update-product.js_product-detail-impressions")
    public WebElement btn_UpdateslickSlidePopUp;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]//following::span[@class='sales']")
    public WebElement txt_ProductPriceInQuickview;

    @FindBy(css=".breadcrumb")
    public WebElement lnk_BreadCrumb;

    @FindBy(xpath="//div[@class='slick-slide slick-current slick-active']//child::div//child::img")
    public WebElement img_ProductImage;

    @FindBy(css=".product-gender_text")
    public WebElement txt_SelectedMenu;

    @FindBy(css=".product-style.js_product-style")
    public WebElement txt_ProductCode;

    @FindBy (xpath = "//p[contains(@class,'product-style')]")
    public WebElement txt_productID;

    @FindBy (css = ".product-gender_text")
    public WebElement txt_ProductGendertext;

    @FindBy(css=".bv_avgRating_component_container.notranslate")
    public WebElement txt_AvgRatingCount;

    @FindBy(xpath="//button[@id='ratings-summary']//child::div[@class='bv_stars_component_container'] ")
    public WebElement lbl_Stars;

    @FindBy(xpath="//button[@id='ratings-summary']//child::div[@class='bv_stars_component_container'] //following-sibling::div//child::div")
    public WebElement txt_ReviewsCount;

    @FindBy(id="WAR")
    public WebElement lnk_WriteAReview;

    @FindBy(xpath="//div[@Class='col js_anchor-scroll-link product-description_link']//child::a")
    public WebElement lnk_ViewDescription;

    @FindBy(css=".attribute.dropdown.variation-size")
    public WebElement ddl_SizeBox;

    @FindBy(css=".js_product-attribute.variation-item.product-width-attribute")
    public List<WebElement> lst_WidthBox;

    @FindBy(css=".afterpay-message")
    public WebElement txt_AfterPay;

    @FindBy(id="Quantity")
    public WebElement txt_QuantityInputBox;

    @FindBy(css=".add-to-cart.btn.btn-primary.btn-block.text-uppercase ")
    public WebElement btn_AddToBagDisabled;

    @FindBy(css=".atypicalSpan")
    public WebElement txt_FreeShippingAndFreeReturns;

    @FindBy(css=".row.details.product-details.collapsible-sm")
    public WebElement txt_Description;

    @FindBy(xpath="//h2[contains(text(),'Description')]")
    public WebElement txt_DescriptionHeading;

    @FindBy(css=".row.product-attributes.collapsible-sm ")
    public WebElement txt_SpecificationDetails;

    @FindBy(xpath="//h2[contains(text(),'Specifications')]")
    public WebElement txt_SpecificationTitle;

    @FindBy(xpath="//h2[contains(text(),'Complete the Look')]")
    public WebElement txt_CompleteTheLookTitle;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Complete the Look')]//following::div[2]//a[@class='image-link'] ")
    public List<WebElement> lst_CompleteTheLookImages;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Complete the Look')]//following::div[2]//a[@class='image-link'] //following::div[3]//span[@class='link'] ")
    public List<WebElement> lst_CompleteTheLookProductNames;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Complete the Look')]//following::div[2]//a[@class='image-link'] //following::div[3]//span[@class='sales'] ")
    public List<WebElement> lst_CompleteTheLookProductPrices;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Complete the Look')]//following::div[2]//a[@class='image-link'] //following::div[3]//div[@class='bv_stars_component_container'] ")
    public List<WebElement> lst_CompleteTheLookProductStars;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Complete the Look')]//following::div[2]//a[@class='image-link'] //following::div[3]//div[@class='bv_text'] ")
    public List<WebElement> lst_CompleteTheLookProductsReviewCounts;

    @FindBy(xpath="//h2[contains(text(),'You May Also Like')]")
    public WebElement txt_YouMayAlsoLikeTitle;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'You May Also Like')]//following::div[2]//a[@class='image-link'] ")
    public List<WebElement> lst_YouMayAlsoLikeImages;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'You May Also Like')]//following::div[2]//a[@class='image-link'] //following::div[3]//span[@class='link'] ")
    public List<WebElement> lst_YouMayAlsoLikeProductNames;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'You May Also Like')]//following::div[2]//a[@class='image-link'] //following::div[3]//span[@class='sales'] ")
    public List<WebElement> lst_YouMayAlsoLikeProductPrices;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'You May Also Like')]//following::div[2]//a[@class='image-link'] //following::div[3]//div[@class='bv_stars_component_container'] ")
    public List<WebElement> lst_YouMayAlsoLikeProductStars;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'You May Also Like')]//following::div[2]//a[@class='image-link'] //following::div[3]//div[@class='bv_text'] ")
    public List<WebElement> lst_YouMayAlsoLikeProductsReviewCounts;

    @FindBy(xpath="//h2[contains(text(),'Recently viewed')]")
    public WebElement txt_RecentlyViewedTitle;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Recently viewed')]//following::div[2]//a[@class='image-link'] ")
    public List<WebElement> lst_RecentlyViewedImages;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Recently viewed')]//following::div[2]//a[@class='image-link'] //following::div[3]//span[@class='link'] ")
    public List<WebElement> lst_RecentlyViewedProductNames;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Recently viewed')]//following::div[2]//a[@class='image-link'] //following::div[3]//span[@class='sales'] ")
    public List<WebElement> lst_RecentlyViewedProductPrices;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Recently viewed')]//following::div[2]//a[@class='image-link'] //following::div[3]//div[@class='bv_stars_component_container'] ")
    public List<WebElement> lst_YouRecentlyViewedProductStars;

    @FindBy(xpath="//h2[@class='title product-info_title' and contains(text(),'Recently viewed')]//following::div[2]//a[@class='image-link'] //following::div[3]//div[@class='bv_text'] ")
    public List<WebElement> lst_RecentlyViewedProductsReviewCounts;

    @FindBy(css=".bv-content-list-container")
    public WebElement txt_ReviewsContent;

    @FindBy(xpath="//h2[contains(text(),'Reviews')]")
    public WebElement txt_Reviews;

    @FindBy(css=".pdp-link")
    public List<WebElement> lst_productNames;

    @FindBy(css=".image-link")
    public List<WebElement> lst_Images;

    @FindBy(css=".bv-write-review-label.bv-text-link.bv-focusable.bv-submission-button")
    public WebElement txt_BeTheFirstReviewMessage;

    @FindBy (xpath = "//li[@class='attribute-values']//div[text()='Certification:']//following-sibling::div")
    public WebElement txt_CertificationFilter;

    @FindBy (xpath = "//button[contains(@class,'bonus-product-btn') and contains(text(),'No, Thanks')]")
    public WebElement btn_NoThanksBtn;

    @FindBy (xpath = "//div[@id='chooseBonusProductModal']//div[@class='modal-content']")
    public WebElement popup_GiftPopupScreen;
}
