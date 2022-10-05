package ui_tests.common_elements_tests.catalog_section;

import drtechno_model.CatalogPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui_tests.main_page_tests.MainPageBaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenCatalogByCatalogButtonTest extends MainPageBaseTest {
    private final String expectedPageHeader = "КАТАЛОГ";

    @BeforeAll
    public static void arrange(){
        openMainPage();
    }

    @Test
    public void actAndAssert(){
        CatalogPage catalogPage = mainPage.catalogSection.openCatalog();
        assertEquals(expectedPageHeader, catalogPage.getHeader());
    }
}
