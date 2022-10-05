package ui_tests.main_page_tests;

import drtechno_model.ProductPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenProductPageWithCorrectProductOnProductShortCardLinkNameClickTest extends MainPageBaseTest{
    private static String expectedProductName;
    private static final int leaderProductIndex = 2;

    @BeforeAll
    public static void arrange(){
        openMainPage();
        expectedProductName = mainPage.leaderProducts.get(leaderProductIndex).getName();
    }

    @Test
    public void actAndAssert(){
        //act
        ProductPage productPage = mainPage.leaderProducts.get(leaderProductIndex).clickProductNameLink();
        //assert
        assertEquals(expectedProductName, productPage.getProductName());
    }
}
