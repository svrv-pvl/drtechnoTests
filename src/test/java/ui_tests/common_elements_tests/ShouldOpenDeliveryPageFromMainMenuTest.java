package ui_tests.common_elements_tests;

import drtechno_model.StaticPage;
import drtechno_model.StaticPages;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui_tests.main_page_tests.MainPageBaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenDeliveryPageFromMainMenuTest extends MainPageBaseTest {
    private static final int LEADER_PRODUCT_CARD_INDEX = 2;
    private static final String ABOUT_COMPANY_PAGE_HEADER = "Доставка";

    @BeforeAll
    public static void arrange(){
        openMainPage();
    }

    @Test
    public void actAndAssert(){
        StaticPage aboutCompanyPage = mainPage.mainMenu.openStaticPage(StaticPages.DELIVERY);
        assertEquals(ABOUT_COMPANY_PAGE_HEADER, aboutCompanyPage.getHeader());
    }
}
