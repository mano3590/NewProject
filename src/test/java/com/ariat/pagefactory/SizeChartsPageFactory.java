package com.ariat.pagefactory;

import com.ariat.pages.WishListPage;
import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SizeChartsPageFactory extends GenericWrappers {

    @FindBy (xpath = "//button[contains(@class,'box-accordion__top-button')]")
    public List<WebElement> lst_SizeChartsButton;

    @FindBy (css = ".box-accordion__top-button")
    public List<WebElement> lst_BoxAccordion;

    @FindBy (xpath = "//section[@class='box-accordion__sub __active']//h5[@class='box-accordion__content-title']")
    public List<WebElement> lst_SubSectionHeader;

    @FindBy (xpath = "//section[@class='box-accordion__sub __active']//h5[@class='box-accordion__content-title']//following::table[1]")
    public List<WebElement> lst_activeTables;

    @FindBy (xpath = "//section[@class='box-accordion __active']//section[@class='box-accordion__sub __active']//div[@class='__description']//p")
    public List<WebElement> lst_ActivetablesClickHereText;

    @FindBy (xpath = "//section[@class='box-accordion __active']//section[@class='box-accordion__sub __active']//div[@class='__description']//p//a")
    public WebElement lnk_ActivetablesClickHereText;

    @FindBy (xpath = "//embed[@type='application/pdf']")
    public WebElement txt_Pdfpage;
}
