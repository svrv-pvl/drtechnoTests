package drtechno_model;

import drtechno_model.page_parts.CatalogSection;
import drtechno_model.page_parts.MainMenu;
import drtechno_model.page_parts.MiniBasket;

public class BasePage {
    public MainMenu mainMenu;
    public CatalogSection catalogSection;
    public MiniBasket miniBasket;

    public BasePage(){
        mainMenu = new MainMenu();
        catalogSection = new CatalogSection();
        miniBasket = new MiniBasket();
    }
}
