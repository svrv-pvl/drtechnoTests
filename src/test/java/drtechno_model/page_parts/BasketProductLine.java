package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class BasketProductLine {
    private SelenideElement productNameLink;
    private String productName;
    private int productAmount;
    private int onePiecePrice;
    private int totalPrice;

    private final By PRODUCT_NAME_LINK_XPATH = By.xpath(".//big/b");
    private final By PRODUCT_AMOUNT_XPATH = By.xpath("(.//td[@align='center']/input)[2]");
    private final By ONE_PIECE_PRICE_XPATH = By.xpath("(.//td[@align='right'])[1]");
    private final By TOTAL_PRICE_XPATH = By.xpath("(.//td[@align='right'])[2]");

    public BasketProductLine(SelenideElement parentLineElement){
        productNameLink = parentLineElement.find(PRODUCT_NAME_LINK_XPATH);
        productName = productNameLink.text();
        productAmount = Integer.parseInt(parentLineElement.find(PRODUCT_AMOUNT_XPATH).attr("value"));
        String onePiecePriceString = parentLineElement.find(ONE_PIECE_PRICE_XPATH).text();
        onePiecePrice = convertPriceToIntRemovingRubleSign(onePiecePriceString);
        String totalPriceString = parentLineElement.find(TOTAL_PRICE_XPATH).text();
        totalPrice = convertPriceToIntRemovingRubleSign(totalPriceString);
    }

    private int convertPriceToIntRemovingRubleSign(String priceString){
        String priceWithoutRubleSign = priceString.substring(0, priceString.length() - 2);
        return Integer.parseInt(priceWithoutRubleSign);
    }

    public String getProductName(){
        return productName;
    }

    public int getProductAmount(){
        return productAmount;
    }
}
