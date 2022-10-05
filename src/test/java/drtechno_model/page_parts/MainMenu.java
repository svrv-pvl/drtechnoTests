package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import drtechno_model.AboutCompanyPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainMenu {
    public SelenideElement aboutCompanyLink;
    public SelenideElement guaranteeLink;
    public SelenideElement deliveryLink;
    public SelenideElement pickupLink;
    public SelenideElement paymentLink;
    public SelenideElement contactsLink;

    private final String NAVIGATION_XPATH = "//nav";
    private final String ABOUT_COMPANY_LINK_SEARCH_STRING = "О компании";
    private final String GUARANTEE_LINK_SEARCH_STRING = "Гарантия";
    private final String DELIVERY_LINK_SEARCH_STRING = "Доставка";
    private final String PICKUP_LINK_SEARCH_STRING = "«Самовывоз»";
    private final String PAYMENT_LINK_SEARCH_STRING = "Оплата";
    private final String CONTACTS_LINK_SEARCH_STRING = "Контакты";

    public MainMenu(){
        SelenideElement navElement = $(By.xpath(NAVIGATION_XPATH));
        aboutCompanyLink = navElement.find(byText(ABOUT_COMPANY_LINK_SEARCH_STRING));
    }

    public AboutCompanyPage openAboutCompanyPage(){
        aboutCompanyLink.click();
        return page(AboutCompanyPage.class);
    }
}
