package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import drtechno_model.MainPage;
import drtechno_model.ProductPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.page;

public class ProductShortCard {
    private SelenideElement productNameLink;
    private SelenideElement productImage;
    private SelenideElement addToBasketButton;

    private final By PRODUCT_NAME_LINK_XPATH = By.xpath(".//div[@class='product_title']/a");
    private final By PRODUCT_IMAGE_XPATH = By.xpath(".//img");
    private final By ADD_PRODUCT_TO_BASKET_XPATH = By.xpath(".//div[@class='product_buy_button']/a");

    public ProductShortCard(SelenideElement cardParentElement){
        productNameLink = cardParentElement.find(PRODUCT_NAME_LINK_XPATH);
        productImage = cardParentElement.find(PRODUCT_IMAGE_XPATH);
        addToBasketButton = cardParentElement.find(ADD_PRODUCT_TO_BASKET_XPATH);
    }

    public String getName(){
        return productNameLink.text();
    }

    public ProductPage clickProductNameLink(){
        productNameLink.click();
        return page(ProductPage.class);
    }

    public void clickAddProductToBasketButton(){
        addToBasketButton.click();
    }
}
