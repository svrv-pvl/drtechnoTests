package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class GoodShortCard {
    private SelenideElement goodNameLink;
    private SelenideElement goodImage;
    private SelenideElement addToBasketButton;

    private final By GOOD_NAME_LINK_XPATH = By.xpath(".//div/div[1]/a[1]");
    private final By GOOD_IMAGE_XPATH = By.xpath(".//div/div[2]/div[1]/a/img");
    private final By ADD_GOOD_TO_BASKET_XPATH = By.linkText("купить");

    public GoodShortCard(SelenideElement goodShortCardParentElement){
        goodNameLink = goodShortCardParentElement.find(GOOD_NAME_LINK_XPATH);
        goodImage = goodShortCardParentElement.find(GOOD_IMAGE_XPATH);
        addToBasketButton = goodShortCardParentElement.find(ADD_GOOD_TO_BASKET_XPATH);
    }

    public String getName(){
        return goodNameLink.text();
    }
}
