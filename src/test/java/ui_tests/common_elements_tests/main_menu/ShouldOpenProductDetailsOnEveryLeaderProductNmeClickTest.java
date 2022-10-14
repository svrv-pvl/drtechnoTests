package ui_tests.common_elements_tests.main_menu;

import drtechno_model.ProductPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui_tests.main_page_tests.MainPageBaseTest;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenProductDetailsOnEveryLeaderProductNmeClickTest extends MainPageBaseTest {
    @BeforeAll
    public static void arrange(){
        openMainPage();
        int amountOfLeaders = mainPage.getAmountOfLeaders();
    }

    @Test
    public void actAndAssert(){
        //Act
        int leadersAmount = mainPage.getAmountOfLeaders();
        String[] productNamesArray = new String[leadersAmount];
        String[] productLinks = new String[leadersAmount];
        for (int i = 0; i < leadersAmount; i++){
            productNamesArray[i] = mainPage.leaderProducts.get(i).getName();
            productLinks[i] = mainPage.leaderProducts.get(i).getProductDetailsURL();
        }
        for (int i = 0; i < leadersAmount; i++){
            ProductPage productPage = open(productLinks[i], ProductPage.class);
            //Assert
            assertEquals(productNamesArray[i], productPage.getProductName());
        }
    }
}
