package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductLargeCard extends ProductShortCard{
    private SelenideElement productDetailsLink;

    private final By PRODUCT_DETAILS_LINK_XPATH = By.xpath(".//div[@class='right_column']/a");

    public ProductLargeCard(SelenideElement cardParentElement){
        super(cardParentElement);
        productDetailsLink = cardParentElement.find(PRODUCT_DETAILS_LINK_XPATH);
    }
}
