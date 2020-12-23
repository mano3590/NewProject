package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductEditPageFactory extends GenericWrappers {

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
    public WebElement btn_Update;

    @FindBy (css = ".row.product-wishlist div button")
    public WebElement btn_WishList;

}
