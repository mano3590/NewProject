package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareerPageFactory extends GenericWrappers {

    @FindBy (xpath = "//a[@title='VIEW OPEN POSITIONS']")
    public List<WebElement> lst_ViewOpenPositionBtn;

    @FindBy (css = ".amp-dc-image-pic")
    public List<WebElement> lst_CareerPageWidgets;

    @FindBy (xpath = "//img[@alt='Ariat values graphic']//preceding::div//following-sibling::a[@title='VIEW OPEN POSITIONS']")
    public WebElement Btn_OurValuesViewOpenPositionsBtn;

    @FindBy (xpath = "//a[@title='VIEW OPEN POSITIONS']//preceding::div[@class='ms_desktop-only' and contains(text(),'Ariat Benefits')]//following::div//a[@title='VIEW OPEN POSITIONS']")
    public WebElement Btn_AriatBenefitViewOpenPositionsBtn;

    @FindBy (xpath = "//h1[text()='Career Opportunities']")
    public WebElement txt_CareerOpportunities;

}
