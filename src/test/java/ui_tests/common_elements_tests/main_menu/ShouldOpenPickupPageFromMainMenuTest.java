package ui_tests.common_elements_tests.main_menu;

import drtechno_model.AllPagesEnum;
import drtechno_model.StaticPage;
import drtechno_model.StaticPagesEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenPickupPageFromMainMenuTest extends MainMenuBaseTest {
    private static final int LEADER_PRODUCT_CARD_INDEX = 2;
    private static final String PICKUP_PAGE_HEADER = "САМОВЫВОЗ";

    @ParameterizedTest
    @EnumSource(AllPagesEnum.class)
    public void test(AllPagesEnum page){
        //arrange
        openPage(page);
        //act
        StaticPage pickupPage = testPage.mainMenu.openStaticPage(StaticPagesEnum.PICKUP);
        //assert
        assertEquals(PICKUP_PAGE_HEADER, pickupPage.getHeader());
    }
}
