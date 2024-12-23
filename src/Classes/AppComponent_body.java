package Classes;

import java.util.ArrayList;
import java.util.List;

public class AppComponent_body {
    //Products products;
    List<Products> products = new ArrayList<Products>();
    List<String> SelectedProduct = new ArrayList<String>();
   // String SelectedProduct;
   List<Click> click = new ArrayList<Click>();

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<String> getSelectedProduct() {
        return SelectedProduct;
    }

    public void setSelectedProduct(List<String> selectedProduct) {
        SelectedProduct = selectedProduct;
    }

    public List<Click> getClick() {
        return click;
    }

    public void setClick(List<Click> click) {
        this.click = click;
    }

    @Override
    public String toString() {
        if (products != null){
            return '\n' +"products='" + products + '\n' + '}';
        }
        if (SelectedProduct != null){
            return '\n' +"SelectedProduct='" + SelectedProduct + '\n' + '}';
        }
            return '\n' +"click='" + click + '\n' + '}';
    }
}