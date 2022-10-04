package drtechno_model;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private String final productName;

    private final String PRODUCT_NAME_XPATH = "//div[@class='catalog_product']//div[@class='product_title']";

    public ProductPage(){
        productName = $(By.xpath(PRODUCT_NAME_XPATH)).text();
    }

    public String getProductName(){
        return productName;
    }
}
