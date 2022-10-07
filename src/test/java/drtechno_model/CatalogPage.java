package drtechno_model;

import com.codeborne.selenide.ElementsCollection;
import drtechno_model.page_parts.ProductLargeCard;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPage extends BasePage{
    private String header;
    public ArrayList<ProductLargeCard> productCards;

    private final By HEADER_XPATH = By.xpath("//div[@class='page_title']/p");
    private final By PRODUCT_CARDS_XPATH = By.xpath("//ul[@class='catalog_list']/li");

    public CatalogPage(){
        super();
        header = $(HEADER_XPATH).text();

        productCards = new ArrayList<>();
        ElementsCollection productCardsElement = $$(PRODUCT_CARDS_XPATH);
        for(int i = 0; i < productCardsElement.size(); i++){
            productCards.add(new ProductLargeCard(productCardsElement.get(i)));
        }
    }

    public String getHeader(){
        return header;
    }
}
