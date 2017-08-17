package view;

public class GeneralBean {
    private String default_Product_Category="PRODUCT_CATEGORY";

    public GeneralBean() {
    }
    
    //return default value for create product category page input text
 

    public void setDefault_Product_Category(String default_Product_Category) {
        this.default_Product_Category = default_Product_Category;
    }

    public String getDefault_Product_Category() {
        return default_Product_Category;
    }
}
