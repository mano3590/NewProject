package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnsPageFactory extends GenericWrappers {
    @FindBy(css=".row.justify-content-center")
    public WebElement btn_AllReturn;

    @FindBy(id="returns-section-one--heading")
    public WebElement btn_FirstReturn;

    @FindBy(id="returns-section-one--content")
    public WebElement lbl_FirstContent;

    @FindBy(id="returns-section-two--heading")
    public WebElement btn_SecondReturn;

    @FindBy(id="returns-section-two--content")
    public WebElement lbl_SecondContent;

    @FindBy(id="returns-section-three--heading")
    public WebElement btn_ThirdReturn;

    @FindBy(id="returns-section-three--content")
    public WebElement lbl_ThirdContent;

    @FindBy(id="returns-section-four--heading")
    public WebElement btn_FourReturn;

    @FindBy(id="returns-section-four--content")
    public WebElement lbl_FourContent;

    @FindBy(id="returns-section-five--heading")
    public WebElement btn_FiveReturn;

    @FindBy(id="returns-section-five--content")
    public WebElement lbl_FiveContent;

    @FindBy(id="returns-section-one--heading")
    public WebElement lbl_FirstButtonHeader;

    @FindBy(id="returns-section-two--heading")
    public WebElement lbl_SecondButtonHeader;

    @FindBy(id="returns-section-three--heading")
    public WebElement lbl_ThirdButtonHeader;

    @FindBy(id="returns-section-four--heading")
    public WebElement lbl_FourthButtonHeader;

    @FindBy(id="returns-section-five--heading")
    public WebElement lbl_FifthButtonHeader;

    @FindBy(xpath="//div[@id='returns-section-one--content']//ancestor::a[text()='clicking here']")
    public WebElement lnk_RequestReturnFirstButton;

    @FindBy(xpath="//div[@id='returns-section-one--content']//ancestor::a[contains(@href,'tel')]")
    public WebElement lnk_PhoneNoFirstButton;

    @FindBy(xpath="//div[@id='returns-section-one--content']//ancestor::a[contains(@href,'mail')]")
    public WebElement lnk_EmailFirstButton;

    @FindBy(xpath="//div[@id='returns-section-two--content']//ancestor::a[text()='clicking here']")
    public WebElement lnk_RequestReturnSecondButton;

    @FindBy(xpath="//div[@id='returns-section-two--content']//ancestor::a[contains(@href,'tel')]")
    public WebElement lnk_PhoneNoSecondButton;

    @FindBy(xpath="//div[@id='returns-section-two--content']//ancestor::a[contains(@href,'mail')]")
    public WebElement lnk_EmailSecondButton;

    @FindBy(xpath="//div[@id='returns-section-three--content']//ancestor::a[contains(text(),'international')]")
    public WebElement lnk_EmailThirdButton;

    @FindBy(xpath="//div[@id='returns-section-four--content']//ancestor::a[text()='here']")
    public WebElement lnk_RequestReturnFourthButton;

    @FindBy(css=".card-header.track-order-header.register-title")
    public WebElement lbl_RequestReturn;

}
