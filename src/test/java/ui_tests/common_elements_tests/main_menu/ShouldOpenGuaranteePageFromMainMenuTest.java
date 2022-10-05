package ui_tests.common_elements_tests.main_menu;

import drtechno_model.StaticPage;
import drtechno_model.StaticPagesEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui_tests.main_page_tests.MainPageBaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenGuaranteePageFromMainMenuTest extends MainPageBaseTest {
    private static final int LEADER_PRODUCT_CARD_INDEX = 2;
    private static final String ABOUT_COMPANY_PAGE_HEADER = "ГАРАНТИЯ";

    @BeforeAll
    public static void arrange(){
        openMainPage();
    }

    @Test
    public void actAndAssert(){
        StaticPage aboutCompanyPage = mainPage.mainMenu.openStaticPage(StaticPagesEnum.GUARANTEE);
        assertEquals(ABOUT_COMPANY_PAGE_HEADER, aboutCompanyPage.getHeader());
    }
}
