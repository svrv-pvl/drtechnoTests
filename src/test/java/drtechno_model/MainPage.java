package drtechno_model;

import com.codeborne.selenide.ElementsCollection;
import drtechno_model.page_parts.CatalogSection;
import drtechno_model.page_parts.MainMenu;
import drtechno_model.page_parts.ProductShortCard;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends BasePage{
    public List<ProductShortCard> leaderProducts;

    private final String LEADER_PRODUCTS_XPATH = "(//ul[@class='catalog_list'])[1]/li";

    public MainPage(){
        super();

        leaderProducts = new ArrayList<>();

        ElementsCollection leaderProducts = $$(By.xpath(LEADER_PRODUCTS_XPATH));

        for(int i = 0; i < leaderProducts.size(); i++){
            this.leaderProducts.add(new ProductShortCard(leaderProducts.get(i)));
        }
    }
}