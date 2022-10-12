package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import drtechno_model.BasketPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MiniBasket {
    private int amountOfProducts;
    private int price;

    private String basketLink = "http://drtechno.ru/?page=basket";
    private final By AMOUNT_OF_PRODUCTS_XPATH = By.xpath("(//div[@class='basket_prices']//span)[1]");
    private final By PRICE_XPATH = By.xpath("(//div[@class='basket_prices']//span)[2]");

    public int getAmountOfProducts(){
        SelenideElement amountOfProductsElement = $(AMOUNT_OF_PRODUCTS_XPATH);
        if (amountOfProductsElement.exists()){
            amountOfProducts = Integer.parseInt(amountOfProductsElement.text());
        } else {
            amountOfProducts = 0;
        }
        return amountOfProducts;
    }

    public int getPrice(){
        SelenideElement priceElement = $(PRICE_XPATH);
        if (priceElement.exists()){
            String priceString = $(PRICE_XPATH).text();
            priceString = priceString.substring(0, priceString.length() - 2);
            price = Integer.parseInt(priceString);
        } else {
            price = 0;
        }
        return price;
    }

    public BasketPage openBasket() {
        return open(basketLink, BasketPage.class);
    }
}