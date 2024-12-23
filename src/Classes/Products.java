package Classes;

public class  Products{
    String Array_Product_OPEN;
    ProductElement productElement ;
    String Array_Product_CLOSE;

    public String getArray_Product_OPEN() {
        return Array_Product_OPEN;
    }

    public void setArray_Product_OPEN(String array_Product_OPEN) {
        Array_Product_OPEN = array_Product_OPEN;
    }

    public ProductElement getProductElement() {
        return productElement;
    }

    public void setProductElement(ProductElement productElement) {
        this.productElement = productElement;
    }

    public String getArray_Product_CLOSE() {
        return Array_Product_CLOSE;
    }

    public void setArray_Product_CLOSE(String array_Product_CLOSE) {
        Array_Product_CLOSE = array_Product_CLOSE;
    }

    @Override
    public String toString() {
        return "Products{" +
                "Array_Product_OPEN='" + Array_Product_OPEN + '\'' +
                ", productElement=" + productElement +
                ", Array_Product_CLOSE='" + Array_Product_CLOSE + '\'' +
                '}';
    }
}