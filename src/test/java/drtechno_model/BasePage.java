package drtechno_model;

import drtechno_model.page_parts.CatalogSection;
import drtechno_model.page_parts.MainMenu;

public class BasePage {
    public MainMenu mainMenu;
    public CatalogSection catalogSection;

    public BasePage(){
        mainMenu = new MainMenu();
        catalogSection = new CatalogSection();
    }
}
