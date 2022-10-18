package drtechno_model;

import drtechno_model.page_parts.Breadcrumbs;

public class BaseShoppingPage extends BasePage{
    public Breadcrumbs breadcrumbs;

    public BaseShoppingPage(){
        super();
        breadcrumbs = new Breadcrumbs();
    }
}
