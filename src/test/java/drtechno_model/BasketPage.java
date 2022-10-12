package drtechno_model;

import com.codeborne.selenide.ElementsCollection;
import drtechno_model.page_parts.BasketProductLine;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$;

public class BasketPage extends BasePage{
    public ArrayList<BasketProductLine> productLines;

    private final By PRODUCT_LINES_TABLE_XPATH = By.xpath("//table[@class='baskettable']/tbody/tr");

    public BasketPage(){
        super();

        productLines = new ArrayList<>();
        ElementsCollection productsTable = $$(PRODUCT_LINES_TABLE_XPATH);
        for(int i = 1; i < productsTable.size() - 1; i++){   // i = 1 to skip table header. Size - 1 to skip total line
            productLines.add(new BasketProductLine(productsTable.get(i)));
        }
    }
}
