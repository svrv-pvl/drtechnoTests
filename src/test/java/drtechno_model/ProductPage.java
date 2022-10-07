package drtechno_model;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage{
    private final String productName;

    private final String PRODUCT_NAME_XPATH = "//div[@class='catalog_product']//div[@class='product_title']";

    public ProductPage(){
        super();
        productName = $(By.xpath(PRODUCT_NAME_XPATH)).text();
    }

    public String getProductName(){
        return productName;
    }
}
