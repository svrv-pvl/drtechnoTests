package drtechno_model.page_parts;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class Breadcrumbs {
    private int amountOfLevels;
    private String[] breadCrumbsValues;

    private final By BREADCRUMBS_XPATH = By.xpath("//ul[@class='bradcrumbs']/li");

    public Breadcrumbs(){
        ElementsCollection breadcrumbsElements = $$(BREADCRUMBS_XPATH);
        amountOfLevels = breadcrumbsElements.size();
        breadCrumbsValues = new String[amountOfLevels];
        for(int i = 0; i < amountOfLevels; i++){
            breadCrumbsValues[i] = breadcrumbsElements.get(i).text();
        }
    }

    public int getAmountOfLevels(){
        return amountOfLevels;
    }

    public String[] getBreadCrumbsValues(){
        return breadCrumbsValues;
    }
}