package drtechno_model;

import drtechno_model.page_parts.CatalogSection;
import drtechno_model.page_parts.MainMenu;
import drtechno_model.page_parts.MiniBasket;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public MainMenu mainMenu;
    public CatalogSection catalogSection;
    public MiniBasket miniBasket;
    protected String header;

    private final By HEADER_XPATH = By.xpath("//div[contains(@class, 'page_title')]/p");

    public BasePage(){
        mainMenu = new MainMenu();
        catalogSection = new CatalogSection();
        miniBasket = new MiniBasket();
        header = $(HEADER_XPATH).text();
    }

    public String getHeader(){
        return header;
    }
}
