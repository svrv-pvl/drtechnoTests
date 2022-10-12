package ui_tests.main_page_tests;

import drtechno_model.BasketPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldAddProductToBasketByAddToBasketLinkOnLeadersCardTest extends MainPageBaseTest{
    private static final int LEADERS_PRODUCTS_INDEX = 2;

    @BeforeAll
    public static void arrangeTest(){
        openMainPage();
    }

    @Test
    public void actAndAssert(){
        //Act
        mainPage.leaderProducts.get(LEADERS_PRODUCTS_INDEX).clickAddProductToBasketButton();
        String expectedProductName = mainPage.leaderProducts.get(LEADERS_PRODUCTS_INDEX).getName();
        int expectedProductAmount = 1;
        //Assert
        BasketPage basketPage = mainPage.miniBasket.openBasket();
        String actualProductName = basketPage.productLines.get(0).getProductName();
        int actualProductAmount = basketPage.productLines.get(0).getProductAmount();
        assertEquals(expectedProductName, actualProductName);
        assertEquals(expectedProductAmount, actualProductAmount);
    }
}
