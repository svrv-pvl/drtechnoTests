package ui_tests.main_page_tests;

import drtechno_model.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Configuration.baseUrl;

public class MainPageBaseTest {
    protected static MainPage mainPage;

    protected static void openMainPage(){
        baseUrl = "http://drtechno.ru";
        mainPage = open("/", MainPage.class);
    }
}
