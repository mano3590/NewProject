package com.ariat.pages;

import com.ariat.pagefactory.SizeChartsPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SizeChartsPage extends SizeChartsPageFactory {

    public SizeChartsPage() {
        PageFactory.initElements(driver, this);

    }

    public boolean isVerifySizeChartsBoxAccordionsDisplayed(List<String> boxaccordionsnames){
        boolean flag = false;

        for (int i=0; i<lst_BoxAccordion.size();i++){
            if (getText(lst_BoxAccordion.get(i)).equalsIgnoreCase(boxaccordionsnames.get(i))){
                flag = true;
            }else{
                flag = false;
                break;
            }

        }
   return flag;
    }

    public boolean isVerifySizeChartsBoxAccordionsSubSectionsDisplayed(String boxaccordionsnames, List<String> subsection) {
        boolean flag = false;
            String xpath = "//section[@class='box-accordion']//button[contains(text(),'"+boxaccordionsnames+"')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            clickButtonWithOutScroll(element);
            for (int i=0; i<subsection.size();i++){
                WebElement subsectionelement = driver.findElement(By.xpath("//section[@class='box-accordion __active']//section//button[contains(text(),'" + subsection.get(i) + "')]"));
                if (getText(subsectionelement).equalsIgnoreCase(subsection.get(i))) {
                    clickButtonWithOutScroll(subsectionelement);

                        if (subsection.get(i).equalsIgnoreCase("Men & Women")){
                            subsection.get(i).replace("Men & Women","Men's and Women's");
                        }

                    for (int j = 0; j < lst_SubSectionHeader.size(); j++) {
                        if (getText(lst_SubSectionHeader.get(j)).contains(subsection.get(i))) {
                            waitFor(2000);
                            if (isElementDisplayed(lst_activeTables)) {
                                flag = true;
                            } else {
                                flag = false;
                                break;
                            }

                        } else{
                            flag = false;
                            break;
                        }
                    }
                clickButtonWithOutScroll(subsectionelement);
            } else {
                    flag = false;
                    break;
                }
        }

            clickButtonWithOutScroll(element);
    return flag;
    }

}
