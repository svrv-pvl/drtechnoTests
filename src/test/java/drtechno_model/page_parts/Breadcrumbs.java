package drtechno_model.page_parts;

public class Breadcrumbs {
    private int amountOfLevels;
    private String[] breadCrumbsValues;

    public Breadcrumbs(){
        breadCrumbsValues = new String[amountOfLevels];
    }

    public int getAmountOfLevels(){
        return amountOfLevels;
    }

    public String[] getBreadCrumbsValues(){
        return breadCrumbsValues;
    }
}