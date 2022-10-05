package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import drtechno_model.CatalogPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CatalogSection {
    private SelenideElement catalogButton;
    private final By catalogButtonLocator = By.linkText("Каталог товаров");

    public CatalogPage openCatalog(){
        $(catalogButtonLocator).click();
        return page(CatalogPage.class);
    }
}
