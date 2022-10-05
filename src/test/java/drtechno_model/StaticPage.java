package drtechno_model;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StaticPage {
    private String header;

    private final String HEADER_XPATH = "//div[@class='page_title redef_pt']/p";

    public StaticPage(){
        header = $(By.xpath(HEADER_XPATH)).text();
    }

    public String getHeader(){
        return header;
    }
}