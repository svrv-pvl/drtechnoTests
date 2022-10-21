package drtechno_model.page_parts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import drtechno_model.CatalogPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.page;

public class CatalogGroupSection {
    private SelenideElement groupHeader;
    private SelenideElement[] elements;

    private By HEADER_URL_XPATH = By.xpath(".//a");
    private By GROUP_ELEMENT_XPATH = By.xpath(".//a");

    public CatalogGroupSection(SelenideElement groupHeader, SelenideElement groupParentElement){
        this.groupHeader = groupHeader;
        ElementsCollection allProductElements = groupParentElement.$$(GROUP_ELEMENT_XPATH);
        elements = new SelenideElement[allProductElements.size()];
        for(int i = 0; i < allProductElements.size(); i++){
            elements[i] = allProductElements.get(i);
        }
        int x = 0;
    }

    public String getGroupHeader(){
        return groupHeader.text();
    }

    public String getHeaderURL(){
        return groupHeader.find(HEADER_URL_XPATH).attr("href");
    }

    public CatalogPage clickGroupHeader(){
        groupHeader.click();
        return page(CatalogPage.class);
    }
}
