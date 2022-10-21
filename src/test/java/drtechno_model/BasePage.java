package drtechno_model;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import drtechno_model.page_parts.CatalogGroupSection;
import drtechno_model.page_parts.CatalogSection;
import drtechno_model.page_parts.MainMenu;
import drtechno_model.page_parts.MiniBasket;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$$;

public class BasePage {
    public MainMenu mainMenu;
    public CatalogSection catalogSection;
    public ArrayList<CatalogGroupSection> catalogGroupSections;
    public MiniBasket miniBasket;
    protected String header;

    private final By PAGE_HEADER_XPATH = By.xpath("//div[contains(@class, 'page_title')]/p");
    private final By PRODUCT_GROUP_HEADER_XPATH = By.xpath("//div[@class='prod_title blue']");
    private final By PRODUCT_GROUP_XPATH = By.xpath("//div[@class='prod_list'] ");

    public BasePage(){
        baseUrl = "http://drtechno.ru";
        mainMenu = new MainMenu();
        catalogSection = new CatalogSection();
        miniBasket = new MiniBasket();
        header = $(PAGE_HEADER_XPATH).text();

        ElementsCollection allProductGroupHeaders = $$(PRODUCT_GROUP_HEADER_XPATH);
        ElementsCollection allProductGroups = $$(PRODUCT_GROUP_XPATH);
        catalogGroupSections = new ArrayList<>();
        for(int i = 0; i < allProductGroupHeaders.size(); i++){
            catalogGroupSections.add(new CatalogGroupSection(allProductGroupHeaders.get(i), allProductGroups.get(i)));
        }
        int x = 0;
    }

    public String getHeader(){
        return header;
    }
}
