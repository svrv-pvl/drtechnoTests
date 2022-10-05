package drtechno_model.page_parts;

import com.codeborne.selenide.SelenideElement;
import drtechno_model.StaticPage;
import drtechno_model.StaticPagesEnum;
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
        guaranteeLink = navElement.find(byText(GUARANTEE_LINK_SEARCH_STRING));
        deliveryLink = navElement.find(byText(DELIVERY_LINK_SEARCH_STRING));
        pickupLink = navElement.find(byText(PICKUP_LINK_SEARCH_STRING));
        paymentLink = navElement.find(byText(PAYMENT_LINK_SEARCH_STRING));
        contactsLink = navElement.find(byText(CONTACTS_LINK_SEARCH_STRING));
    }

    public StaticPage openStaticPage(StaticPagesEnum pageType){
        switch (pageType){
            case ABOUT_COMPANY -> aboutCompanyLink.click();
            case GUARANTEE -> guaranteeLink.click();
            case DELIVERY -> deliveryLink.click();
            case PICKUP -> pickupLink.click();
            case PAYMENT -> paymentLink.click();
            case CONTACTS -> contactsLink.click();
        }
        return page(StaticPage.class);
    }
}
