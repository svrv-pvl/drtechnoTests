package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import drtechno_model.ProductPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.page;

public class ProductShortCard {
    private SelenideElement productNameLink;
    private SelenideElement productImage;
    private SelenideElement addToBasketButton;

    private final By PRODUCT_NAME_LINK_XPATH = By.xpath(".//div/div[1]/a[1]");
    private final By PRODUCT_IMAGE_XPATH = By.xpath(".//div/div[2]/div[1]/a/img");
    private final By ADD_PRODUCT_TO_BASKET_XPATH = By.linkText("купить");

    public ProductShortCard(SelenideElement productShortCardParentElement){
        productNameLink = productShortCardParentElement.find(PRODUCT_NAME_LINK_XPATH);
        productImage = productShortCardParentElement.find(PRODUCT_IMAGE_XPATH);
        addToBasketButton = productShortCardParentElement.find(ADD_PRODUCT_TO_BASKET_XPATH);
    }

    public String getName(){
        return productNameLink.text();
    }

    public ProductPage clickProductNameLink(){
        productNameLink.click();
        return page(ProductPage.class);
    }
}
