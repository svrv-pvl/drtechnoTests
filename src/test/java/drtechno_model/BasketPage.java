package drtechno_model;

import com.codeborne.selenide.ElementsCollection;
import drtechno_model.page_parts.BasketProductLine;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasketPage extends BasePage{
    private String header;
    public ArrayList<BasketProductLine> productLines;

    private final By HEADER_XPATH = By.xpath("//div[contains(@class, 'page_title')]/p");
    private final By PRODUCT_LINES_TABLE_XPATH = By.xpath("//table[@class='baskettable']/tbody/tr");

    public BasketPage(){
        super();

        header = $(HEADER_XPATH).text();

        productLines = new ArrayList<>();
        ElementsCollection productsTable = $$(PRODUCT_LINES_TABLE_XPATH);
        for(int i = 1; i < productsTable.size() - 1; i++){   // i = 1 to skip table header. Size - 1 to skip total line
            productLines.add(new BasketProductLine(productsTable.get(i)));
        }
    }

    public String getHeader(){
        return header;
    }
}
