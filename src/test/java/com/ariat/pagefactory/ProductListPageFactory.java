package com.ariat.pagefactory;

import com.ariat.pages.WishListPage;
import com.ariat.utils.GenericWrappers;
import cucumber.api.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductListPageFactory extends GenericWrappers {

    @FindBy(css = "#product-search-results div:nth-child(2)  div:nth-child(2) .search-results-title")
    public WebElement lbl_ProductListHeader;

    @FindBy(css = ".pdp-link span")
    public List<WebElement> lst_ProductName;

    @FindBy (xpath = "//ul[@id='search-results']//following::div[contains(@class,'search_suggestions-product_name')]")
    public List<WebElement> lst_SearchSuggestedProductName;

    @FindBy (xpath = "//ul[@id='search-results']//following::div[contains(@class,'price')]")
    public List<WebElement> lst_SearchSuggestedProductPrice;

    @FindBy (xpath = "//span[contains(@id,'product')]")
    public List<WebElement> lst_SearchSuggestedProductImg;

    @FindBy(css = ".product-tile_image_container a img")
    public List<WebElement> lst_ProductImg;

    @FindBy(css = ".sales span")
    public List<WebElement> lst_ProductPrice;

    @FindBy(className = "tile-colors")
    public List<WebElement> lst_ProductColor;

    @FindBy(xpath="//div[contains(@class,'js_clp-top-banner')]")
    public WebElement img_workTopBanner;

    @FindBy(xpath= "//button[@aria-label='Next']")
    public WebElement btn_WorkBannerArrow;

    @FindBy(css=".breadcrumb")
    public WebElement lnk_BreadCrumb;

    @FindBy (xpath = "//div[@id='refinements']//div[contains(@class,'Color')]//li//button")
    public List<WebElement> lst_insideColorFilter;

    @FindBy (xpath = "//div[@id='refinements']//div[contains(@class,'Gender')]//li//button")
    public List<WebElement> lst_insideGenderFilter;

    @FindBy (xpath = "//div[@id='refinements']//div[contains(@class,'Color')]")
    public WebElement lnk_ColorFilter;

    @FindBy (xpath = "//div[@id='refinements']//div[contains(@class,'Gender')]")
    public WebElement lnk_GenderFilter;

    @FindBy (css=".color-attribute-label")
    public List<WebElement> lst_FilterColorName;

    @FindBy (xpath = "//div[@class='js_slide']//a[contains(@href,'https')]//following-sibling::div[contains(@class,'hero-banner-4up-cta-module__wrapper')]")
    public List<WebElement> lst_DenimBannerlinkimg;

    @FindBy (xpath = "//ul[@id='refinement-category_refinement']//a")
    public List<WebElement> lst_ProductCategory;

    @FindBy (xpath = "//ul[@id='refinement-category_refinement']//a//span[contains(@title,'Refine by Category:')]")
    public List<WebElement> lst_ProductCategoryName;

    @FindBy (css=".refinements__title.category_title.d-none.d-lg-block")
    public WebElement txt_Category;

    @FindBy (xpath = "//span[contains(@title,'Refine by Category:')]")
    public List<WebElement> lst_CategoryName;

    @FindBy (xpath = "//a[contains(@class,'quickview')]")
    public List<WebElement> lst_QuickView;

    @FindBy (xpath = "//a[contains(@class,'quickview')]")
    public WebElement lnk_QuickView;

    @FindBy (xpath = "//a[contains(@class,'product-description_link')]")
    public WebElement lnk_ViewDescription;

    @FindBy(css=".refinement-body")
    public List<WebElement> lst_Filters;

    @FindBy(xpath="//a[@class='breadcrumb-link']//following::li[@class='breadcrumb-item']//following-sibling::li//following-sibling::li")
    public WebElement lnk_BreadCrumbKidsFootwear;

    @FindBy (xpath = "//a[@class='breadcrumb-link' and @aria-current='page']")
    public WebElement txt_BreadCrum;

    @FindBy (id = "sortbyDropdown")
    public WebElement ddl_ProductSortByDropdown;

    @FindBy (className = "badge")
    public List<WebElement> lst_Badge;

    @FindBy (xpath = "//div[contains(@class,'refinements__title category_title d-none')]")
    public WebElement txt_Categorytext;

    @FindBy (xpath = "//div[@id='category_refinement']//following::ul[@id='refinement-category_refinement']//li//a")
    public List<WebElement> lst_Categorieslist;

    @FindBy (xpath = "//div[@id='category_refinement']//following::ul[@id='refinement-category_refinement']//li//span[contains(@title,'Refine by Category:')]")
    public List<WebElement> lst_CategoriesName;

    @FindBy (xpath = "//button[contains(text(),'More Results')]")
    public WebElement Btn_MoreResults;

    @FindBy (xpath = "//div[@class='float-left d-block']")
    public List<WebElement> lst_Filtername;

    @FindBy (className = "product-tile_image_container")
    public List<WebElement> lst_ProductList;

    @FindBy (className = "bv_stars_svg_no_wrap")
    public List<WebElement> lst_StarsOnProduct;

    @FindBy (className = "bv_text")
    public List<WebElement> lst_StarsCountOnProduct;

    @FindBy (xpath = "//img[contains(@class,'js_tile-swatch-img')]")
    public List<WebElement> lst_colourswatches;

    @FindBy (xpath = "//div[contains(@class,'product-quickview')]")
    public WebElement popup_QuickView;

    @FindBy (xpath = "//button[contains(@class,'quickview-close')]")
    public WebElement Btn_QuickViewCloseBtn;

    @FindBy (xpath = "//h1[@class='search-results-title']//following-sibling::span")
    public WebElement txt_ProductCount;

    @FindBy (id = "paginationDropdown")
    public WebElement ddl_Pagination;

    @FindBy (xpath = "//button[@id='paginationDropdown']//following::div[contains(@class,'dropdown-menu-right show')]//a")
    public List<WebElement> ddl_paginationdropdownitems;

    @FindBy (xpath = ".js_current-pagination-page")
    public WebElement txt_pagination;

    @FindBy (xpath = "//h2[contains(@class,'refinements__title')]")
    public WebElement txt_Filters;

    @FindBy (xpath = "//div[@class='refinement-body']//div[contains(@class,'float-left')]")
    public List <WebElement> lst_ProductFilters;

    @FindBy (css = ".refinement-body > div>div.float-left.d-block")
    public List<WebElement> lst_Filter;

    @FindBy(id = "refinements")
    public List<WebElement> lst_FilterBlock;

    @FindBy (xpath = "//div[contains(@class,'collapse show')]//span[@aria-hidden='true']")
    public List<WebElement> lst_InnerFilters;

    @FindBy (xpath = "//div[@class='badge' and contains(text(),'New')]")
    public List<WebElement> lst_NewArrivalsBadge;

    @FindBy (xpath = "//button[@aria-label='Previous']")
    public WebElement Btn_BannerPreviousBtn;

    @FindBy (xpath = "//button[@aria-label='Next']")
    public WebElement Btn_BannerNextBtn;

    @FindBy (xpath = "//button[contains(text(),'Back to top')]")
    public WebElement Btn_BackToTopButton;

    @FindBy (css = ".header-banner")
    public WebElement lnk_HeaderBanner;

    @FindBy (xpath = "//img[@class='amp-dc-image-pic']//following::div[@class='ms_desktop-only']//following::div[3]//a")
    public List<WebElement> lst_DenimFilterLinks;

    @FindBy (xpath = "//img[@class='amp-dc-image-pic']//following::div[@class='ms_desktop-only']")
    public List<WebElement> lst_DenimFiltertext;

    @FindBy (xpath = "//img[@class='amp-dc-image-pic']//following::div[@class='ms_desktop-only']//preceding::img[@class='amp-dc-image-pic']")
    public List<WebElement> lst_DenimFilterImg;

    @FindBy (xpath = "//li[@class='filter-value']//span[@aria-hidden='true']")
    public WebElement txt_appliedFilter;

    @FindBy (xpath = "//button[contains(text(),'Clear All Filters')]")
    public WebElement lnk_ClearAllFilter;

    @FindBy (xpath = "//div[@id='refinements']//h2")
    public WebElement txt_ProductSearchResultCount;

    @FindBy (xpath = "//div[@id='refinement-Gender']//span[@class='refinement-value ']")
    public List<WebElement> lst_GenderInnerFilters;

    @FindBy (css = ".badge")
    public List<WebElement> lst_productBadgeId;

    @FindBy (css = ".product-tile_image_container")
    public List<WebElement> lst_productImages;

}
