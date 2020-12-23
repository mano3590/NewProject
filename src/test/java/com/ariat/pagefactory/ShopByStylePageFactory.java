package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopByStylePageFactory extends GenericWrappers {

    @FindBy (xpath = "//h2[text()='Shop Men’s Cowboy Boots']//following-sibling::p//a")
    public List<WebElement> lst_ShopByStyleProductLink;

    @FindBy (xpath = "//h1[contains(@class,'shipping--title')]")
    public WebElement txt_pageHeader;

    @FindBy (className = "product-tile_image_container")
    public List<WebElement> lst_ProductList;

    @FindBy(css = "#product-search-results div:nth-child(2)  div:nth-child(2) .search-results-title")
    public WebElement lbl_ProductListHeader;
}
