package ui_tests.common_elements_tests.main_menu;

import drtechno_model.*;

import static com.codeborne.selenide.Selenide.open;

public class MainMenuBaseTest {
    protected static BasePage testPage;

    protected static void openPage(AllPagesEnum page){
        switch (page){
            case MAIN -> testPage = open("http://drtechno.ru/", MainPage.class);
            case ABOUT -> testPage = open("http://drtechno.ru/about/", StaticPage.class);
            case GUARANTEE -> testPage = open("http://drtechno.ru/garantia/", StaticPage.class);
            case DELIVERY -> testPage = open("http://drtechno.ru/delivery/", StaticPage.class);
            case PICKUP -> testPage = open("http://drtechno.ru/samovyvoz/", StaticPage.class);
            case PAYMENT -> testPage = open("http://drtechno.ru/payment/", StaticPage.class);
            case CONTACTS -> testPage = open("http://drtechno.ru/contact_us/", StaticPage.class);
            case CATALOG -> testPage = open("http://drtechno.ru/?page=product", CatalogPage.class);
            case PRODUCT -> {
                CatalogPage productPage = open("http://drtechno.ru/?page=product", CatalogPage.class);
                testPage = productPage.productCards.get(1).clickProductNameLink();
            }
        }
    }
}
