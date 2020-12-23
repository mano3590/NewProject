package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AboutUsPageFactory extends GenericWrappers {

    @FindBy (xpath = "//div[contains(@class,'ms_desktop-only')]//div[contains(@class,'amp-dc-banner-eybrowText')]")
    public WebElement txt_OurStoryHeader;

    @FindBy (xpath = "//div[contains(@class,'item')]//a[@title='OUR STORY']")
    public WebElement lnk_OurStory;

    @FindBy (xpath = "//div[contains(@class,'item')]//a[@title='CAREERS']")
    public WebElement lnk_Careers;

    @FindBy (xpath = "//div[contains(@class,'item')]//a[@title='SUSTAINABILITY']")
    public WebElement lnk_Sustainability;

    @FindBy (xpath = "//div[contains(@class,'item')]//a[@title='PRESS']")
    public WebElement lnk_Press;

    @FindBy (xpath = "//div[contains(@class,'item')]//a[@title='GIVING']")
    public WebElement lnk_Giving;

    @FindBy (xpath = "//div[@class='new-content ']//following-sibling::div[contains(@class,'item')]//a")
    public List<WebElement> lst_Aboutuslinks;

    @FindBy (css = ".amp-dc-image-pic")
    public List<WebElement> lst_AboutusWidgetsimg;

    @FindBy (xpath = "//div[contains(@class,'amp-dc-card-link')]//a")
    public List<WebElement> lst_AboutusPressReadMoreLinks;
}
