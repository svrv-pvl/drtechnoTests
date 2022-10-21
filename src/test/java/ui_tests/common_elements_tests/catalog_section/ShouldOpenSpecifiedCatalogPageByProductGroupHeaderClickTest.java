package ui_tests.common_elements_tests.catalog_section;

import drtechno_model.CatalogPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui_tests.main_page_tests.MainPageBaseTest;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldOpenSpecifiedCatalogPageByProductGroupHeaderClickTest extends MainPageBaseTest {
    private final int EXPECTED_AMOUNT_OF_LEVELS = 2;
    private final int GROUP_HEADER_BREADCRUMB_INDEX = 1;

    @BeforeAll
    public static void arrange(){
        openMainPage();
    }

    @Test
    public void actAndAssert(){
        int amountOfGroups = mainPage.catalogGroupSections.size();
        String[] expectedGroupHeaders = new String[amountOfGroups];
        String[] groupHeadersURLs = new String[amountOfGroups];
        for (int i = 0; i < amountOfGroups; i++){
            expectedGroupHeaders[i] = mainPage.catalogGroupSections.get(i).getGroupHeader();
            groupHeadersURLs[i] = mainPage.catalogGroupSections.get(i).getHeaderURL();
        }
        CatalogPage catalogPage;
        for (int i = 0; i < amountOfGroups; i++){
             catalogPage = open(groupHeadersURLs[i], CatalogPage.class);
             assertEquals(EXPECTED_AMOUNT_OF_LEVELS, catalogPage.breadcrumbs.getAmountOfLevels());
             assertEquals(catalogPage.breadcrumbs.getBreadCrumbsValues()[GROUP_HEADER_BREADCRUMB_INDEX], expectedGroupHeaders[i]);
        }
    }
}
