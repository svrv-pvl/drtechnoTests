package ui_tests.main_page_tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldHaveOnly4GoodsInLeaderListTest extends MainPageBaseTest{
    private int AMOUNT_OF_LEADERS_ON_MAIN_PAGE = 4;

    @BeforeAll
    public static void act(){
        openMainPage();
    }

    @Test
    public void assertMethod(){
        assertEquals(AMOUNT_OF_LEADERS_ON_MAIN_PAGE , mainPage.leaderCards.size());
    }
}
