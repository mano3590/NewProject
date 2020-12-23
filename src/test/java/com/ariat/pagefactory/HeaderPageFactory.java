package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.checkerframework.framework.qual.FieldInvariant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderPageFactory extends GenericWrappers {

    @FindBy(className =  "user-message")
    public WebElement btn_SignIn;

    @FindBy (className = "search")
    public WebElement btn_Search;

    @FindBy(css = ".switch-2-24__cover.__to-two24")
    public WebElement lnk_Two24;

    @FindBy(css = ".switch-2-24__cover.__to-ariat")
    public WebElement lnk_Ariat;

    @FindBy(css = ".minicart a")
    public WebElement icon_ViewCart;

    @FindBy(className = "header-logo")
    public WebElement logo_AriatInternational;

    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    public WebElement btn_AcceptButton;

    @FindBy(id = "Men")
    public WebElement lnk_MenSubmenu;

    @FindBy(id = "Women")
    public WebElement lnk_WomenSubMenu;

    @FindBy (id = "Kids")
    public WebElement lnk_KidsSubMenu;

    @FindBy (id = "clearance")
    public WebElement lnk_ClearanceSubMenu;

    @FindBy (id="new-arrivals")
    public WebElement lnk_NewArrivals;

    @FindBy (id="best-sellers")
    public WebElement lnk_BestSellers;

    @FindBy (id = "new-best")
    public WebElement lnk_NewandBest;

    @FindBy (xpath = "//a[contains(text(),'Clothing')]/..//ul/..//ul[@aria-label='Kids-Boots']/li/a")
    public List<WebElement> lst_KidsClothingItems;

    @FindBy (xpath = "//a[contains(text(),'Kids')]/..//ul/..//ul[@aria-label='clearance-women']/li/a")
    public List<WebElement> lst_ClearanceKidsClothing;

    @FindBy (xpath = "//a[contains(text(),'Men')]/..//ul/..//ul[@aria-label='clearance']/li/a[text()='Clothing']")
    public WebElement lnk_ClearanceMenClothing;

    @FindBy(xpath = "//a[contains(text(),'Footwear')]/..//ul[@aria-label='Men']/li/a")
    public List<WebElement> lst_MenFootwearItems;

    @FindBy (xpath = "//a[contains(text(),'Footwear')]/..//ul[@aria-label='Men']/li/a[text()='Work']")
    public WebElement lnk_MenWork;

    @FindBy (xpath = "//a[contains(text(),'Clothing')]/..//ul[@aria-label='Men-Boots']/li/a[text()='Denim']")
    public WebElement lnk_MenDenim;

    @FindBy (xpath = "//a[contains(text(),'Clothing')]/..//ul[@aria-label='Men-Boots']/li/a[text()='Jeans']")
    public WebElement lnk_MenJeans;

    @FindBy(xpath = "//a[contains(text(),'Clothing')]/..//ul[@aria-label='Men-Boots']/li/a")
    public List<WebElement> lst_MenClothingItems;

    @FindBy (xpath = "//a[contains(text(),'Featured')]/..//ul[@aria-label='Men-Accessories']/li//..//..//a[text()='Extended Sizes: Footwear']")
    public WebElement lnk_MenFeaturedExtendedSizesFootwear;

    @FindBy (xpath = "//a[contains(text(),'Accessories')]/..//ul[@aria-label='Men-Clothing']/li/a")
    public List<WebElement> lst_MenAccessoriesItems;

    @FindBy(xpath = "//a[contains(text(),'Featured')]/..//ul[@aria-label='Men-Accessories']/li/a")
    public List<WebElement> lst_MenFeaturedItems;

    @FindBy (xpath = "//a[contains(text(),'Clothing')]/..//ul/..//ul[@aria-label='Women-Boots']/li/a")
    public List<WebElement> lst_WomanClothingItems;

    @FindBy (xpath = "//a[contains(text(),'Accessories')]/..//ul/..//ul[@aria-label='Women-Clothing']/li/a")
    public List<WebElement> lst_WomanAccessoriesItems;

    @FindBy (xpath = "//a[contains(text(),'New Arrivals')]/..//ul/..//ul[@aria-label='new-best']/li/a")
    public List<WebElement> lst_NewArrivalItems;

    @FindBy (xpath = "//a[contains(text(),'Footwear')]/..//ul[@aria-label='Women']/li//..//..//a[text()='Work']")
    public WebElement lnk_WomenFootwearWork;

    @FindBy (xpath = "//a[contains(text(),'Footwear')]/..//ul[@aria-label='Women']/li/a")
    public List<WebElement> lst_WomenFootwearItems;

    @FindBy (xpath = "//a[contains(text(),'Clothing')]/..//ul[@aria-label='Women-Boots']/li//..//..//a[text()='Sweatshirts & Sweaters']")
    public WebElement lnk_WomenClothingSweatshirtsandSweaters;

    @FindBy (xpath = "//a[contains(text(),'Accessories')]/..//ul[@aria-label='Women-Clothing']/li//..//..//a[text()='Accessories']")
    public WebElement lnk_WomenAccessories;

    @FindBy (xpath = "//a[contains(text(),'Accessories')]/..//ul[@aria-label='Women-Clothing']/li//..//..//a[text()='Footwear Accessories']")
    public WebElement lnk_WomenAccessoriesFootwearAccessories;

    @FindBy (xpath = "//a[contains(text(),'Clothing')]/..//ul[@aria-label='Kids-Boots']/li//..//..//a[text()='Denim']")
    public  WebElement lnk_KidsClothingDenim;

    @FindBy (css=".subscription-popup")
    public List<WebElement> popup_Subscriptionpopup;

    @FindBy (xpath = "//button[@title='Close']")
    public WebElement btn_SubscriptionCloseButton;

    @FindBy (id = "searchfield")
    public WebElement txt_Searchfield;

    @FindBy (xpath = "//a[contains(text(),'Featured')]/..//ul[@aria-label='Men-Accessories']//li/a[text()='FR Workwear']")
    public WebElement lnk_FRWorkWear;

    @FindBy (css="grand-total")
    public WebElement txt_EstimatedTotalPrice;

    @FindBy(xpath="//span[contains(text(),'Shop by')]/..//ul[@aria-label='Men']/li/a[text()='Work']")
    public WebElement lnk_MenShopByWork;

    @FindBy(css=".sign-in__link.js-sign-in__link")
    public WebElement lnk_userMyAccount;

    @FindBy(xpath="//li[@class='nav-item __whishlist']")
    public WebElement lnk_Wishlist;

    @FindBy (xpath = "//a[contains(text(),'Featured')]/..//ul[@aria-label='Women-Accessories']//li/a[text()='Denim Fit Guide']")
    public WebElement lnk_DenimFitGuide;

    @FindBy (xpath = "//li[contains(@class,'country-switch')]")
    public WebElement btn_CountrySelector;

    @FindBy (xpath = "//div[@id='countrySelectorModal']//div[@class='modal-content']")
    public WebElement popup_CountrySelector;

    @FindBy (xpath = "//button[contains(@class,'dropdown-item')]//span")
    public List<WebElement> lst_CountrySelector;

    @FindBy (id = "countryDropdown")
    public WebElement ddl_CountrySelector;

    @FindBy (id = "countryCurrency")
    public WebElement ddl_CountryCurrency;

    @FindBy (xpath = "//a[contains(@class,'js_select-country-btn')]")
    public WebElement btn_SaveandContinue;

    @FindBy (xpath = "//a[contains(@class,'js_select-country-btn')]//following::a")
    public WebElement lnk_CountrySelectorLearnMoreLink;

    @FindBy (xpath = "//div[@id='countrySelectorModal']//button[@aria-label='label.close']//span")
    public WebElement btn_CountrySelectorCloseBtn;

    @FindBy(css = ".about-us__link")
    public WebElement btn_Aboutus;

    @FindBy(css = "#product-search-results div:nth-child(2)  div:nth-child(2) .search-results-title")
    public WebElement lbl_ProductListHeader;

    @FindBy(css = ".switch-2-24__cover.__to-two24")
    public WebElement lnk_AriatWork;

    @FindBy(css=".global-header")
    public WebElement lnk_HeaderSection;

    @FindBy(css=".content")
    public WebElement lbl_return;

    @FindBy(xpath = "//span[text()='Details']/ancestor::a")
    public WebElement lnk_DetailsInFreeShipping;

    @FindBy(css = ".country-switch.js_country-selector-open")
    public  WebElement ddl_countrySelection;

    @FindBy(xpath = "//div[@class='modal-header js_modal-header']/parent::div")
    public WebElement lbl_popUpCountrySelector;

    @FindBy (css=".about-us")
    public WebElement btn_AboutUs;

    @FindBy(css=".find-a-retailer__link")
    public WebElement lnk_AuthorizedRetailer;

    @FindBy(xpath="//label[@class='header_search-label']/parent::div")
    public WebElement txt_SearchBar;

    @FindBy(css=".js-search-suggestions-toggle.icon-close.header_search-close")
    public WebElement btn_CloseSearch;

    @FindBy(css = "ul.nav.navbar-nav .nav-item a.nav-link.js_nav-menu-link")
    public List<WebElement> lst_SubMenu;

    @FindBy(xpath = "//a[@id = 'Men']/..//li/a")
    public List<WebElement> lst_MenSection;

    @FindBy(xpath = "//a[@id = 'Women']/..//li/a")
    public List<WebElement> lst_WomenSection;

    @FindBy(xpath = "//a[@id = 'Kids']/..//li/a")
    public List<WebElement> lst_KidsSection;

    @FindBy(xpath = "//a[@id = 'clearance']/..//li/a")
    public List<WebElement> lst_ClearanceSection;

    @FindBy(xpath = "//a[@id = 'new-arrivals']/..//li/a")
    public List<WebElement> lst_NewArrivalsSection;

    @FindBy(xpath = "//a[@id = 'best-sellers']/..//li/a")
    public List<WebElement> lst_BestSellersSection;

    @FindBy(css = ".breadcrumb")
    public WebElement lbl_BreadCrumb;

    @FindBy(css=".user-message")
    public WebElement lnk_userProfile;

    @FindBy(xpath="//a[text()='Account Info']")
    public WebElement lnk_accountInfo;

    @FindBy(xpath="//a[contains(text(),'Footwear')]/..//ul/..//ul[@aria-label='Kids']/li/a")
    public List<WebElement> lnk_KidsFootwear;

    @FindBy(xpath="//a[contains(text(),'Featured')]/..//ul/..//ul[@aria-label='Men-Accessories']//li//a")
    public List<WebElement> lnk_MenFeatured;

    @FindBy (xpath = "//div[contains(@class,'search_suggestions-phrase') and contains(text(),'Product results for:')]//span")
    public WebElement txt_ProductResulttext;

    @FindBy (xpath = "//div[contains(@class,'search_suggestions-phrase')]//a[contains(@class,'search_suggestions-see_all')]")
    public WebElement lnk_SeeAllProducts;

    @FindBy (xpath = "//div[contains(@class,'search_suggestions-categories_title')]")
    public WebElement txt_Categories;

    @FindBy (xpath = "//div[@class='refinements__title category_title d-none d-lg-block']")
    public WebElement txt_ProductCategoriestext;

    @FindBy (id = "refinement-category_refinement")
    public WebElement txt_ProductCategories;

    @FindBy (css = ".search_suggestions-categories_link")
    public List<WebElement> lst_Categories;

    @FindBy (xpath = "//div[@id='category_refinement']//following::ul[@id='refinement-category_refinement']//li//a")
    public List<WebElement> lst_Categorieslist;

    @FindBy (xpath = "//div[@id='category_refinement']//following::ul[@id='refinement-category_refinement']//li//span[contains(@title,'Refine by Category:')]")
    public List<WebElement> lst_CategoriesName;

    @FindBy (xpath = "//span[contains(@id,'product')]")
    public List<WebElement> lst_SearchSuggestedProductList;

    @FindBy (xpath = "//div[contains(@class,'search_suggestions-product_name')]")
    public List<WebElement> lst_SearchSuggestedProductName;

    @FindBy (xpath = "//div[contains(@class,'price')]")
    public List<WebElement> lst_SearchSuggestedProductPrice;

    @FindBy (xpath = "//div[text()='No Products were found']")
    public WebElement txt_NoProductFoundErrorMsg;

    @FindBy (xpath = "//a[@class='search_suggestions-categories_link']//span[@class='name']")
    public List<WebElement> lst_ProductCategoriesList;





}

