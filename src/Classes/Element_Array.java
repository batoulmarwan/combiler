package Classes;

public class Element_Array {
    String Array_element_Open;
    Element_body element_body;
    String Element_Array_Close;

        public String getArray_element_Open() {
            return Array_element_Open;
        }

        public void setArray_element_Open(String array_element_Open) {
            Array_element_Open = array_element_Open;
        }

    public Element_body getElement_body() {
        return element_body;
    }

    public void setElement_body(Element_body element_body) {
        this.element_body = element_body;
    }

    public String getElement_Array_Close() {
            return Element_Array_Close;
        }

        public void setElement_Array_Close(String element_Array_Close) {
            Element_Array_Close = element_Array_Close;
        }

        @Override
        public String toString() {
            return "Element_Array{" +
                    "Array_element_Open='" + Array_element_Open + '\'' +
                    ", element_body=" + element_body +
                    ", Element_Array_Close='" + Element_Array_Close + '\'' +
                    '}';
        }
    }