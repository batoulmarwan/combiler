package Classes;

import java.util.ArrayList;
import java.util.List;

public class ProductElement {
    List<Element_Array>element_Array=new ArrayList<Element_Array>();
    List<String>Array_COMMA=new ArrayList<String>();

    public List<Element_Array> getElement_Array() {
        return element_Array;
    }

    public void setElement_Array(List<Element_Array> element_Array) {
        this.element_Array = element_Array;
    }

    public List<String> getArray_COMMA() {
        return Array_COMMA;
    }

    public void setArray_COMMA(List<String> array_COMMA) {
        Array_COMMA = array_COMMA;
    }

    @Override
    public String toString() {
        return "ProductElement{" +
                "element_Array=" + element_Array +
                ", Array_COMMA='" + Array_COMMA + '\'' +
                '}';
    }
}