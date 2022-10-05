package drtechno_model;

import com.codeborne.selenide.ElementsCollection;
import drtechno_model.page_parts.MainMenu;
import drtechno_model.page_parts.ProductShortCard;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public MainMenu mainMenu;
    public List<ProductShortCard> leaderCards;

    public MainPage(){
        mainMenu = new MainMenu();

        leaderCards = new ArrayList<>();

        ElementsCollection leaderProducts = $$(By.xpath("//article/div[1]/div[3]/ul/li"));

        for(int i = 0; i < leaderProducts.size(); i++){
            leaderCards.add(new ProductShortCard(leaderProducts.get(i)));
        }
    }
}