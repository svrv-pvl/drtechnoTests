package ui_tests.main_page_tests;

import drtechno_model.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class MainPageBaseTest {
    protected static MainPage mainPage;

    protected static void openMainPage(){
        mainPage = open("http://drtechno.ru/", MainPage.class);
    }
}
