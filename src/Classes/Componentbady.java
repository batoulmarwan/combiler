package Classes;

import java.util.ArrayList;
import java.util.List;

public class Componentbady {
    List<String> SELECTOR = new ArrayList<String>();
    List<String> STANDALONE = new ArrayList<String>();
    List<String> IMPORT = new ArrayList<String>();
    List<Templat> templat = new ArrayList<Templat>();
    List<Style> style = new ArrayList<Style>();
    List<String> Component_COMMA = new ArrayList<String>();
    //String Component_COMMA;

    public List<String> getSELECTOR() {
        return SELECTOR;
    }

    public void setSELECTOR(List<String> SELECTOR) {
        this.SELECTOR = SELECTOR;
    }

    public List<String> getSTANDALONE() {
        return STANDALONE;
    }

    public void setSTANDALONE(List<String> STANDALONE) {
        this.STANDALONE = STANDALONE;
    }

    public List<String> getIMPORT() {
        return IMPORT;
    }

    public void setIMPORT(List<String> IMPORT) {
        this.IMPORT = IMPORT;
    }

    public List<Templat> getTemplat() {
        return templat;
    }

    public void setTemplat(List<Templat> templat) {
        this.templat = templat;
    }

    public List<Style> getStyle() {
        return style;
    }

    public void setStyle(List<Style> style) {
        this.style = style;
    }

    public List<String> getComponent_COMMA() {
        return Component_COMMA;
    }

    public void setComponent_COMMA(List<String> component_COMMA) {
        Component_COMMA = component_COMMA;
    }

    @Override
    public String toString() {
        if (SELECTOR != null){
            return '\n' +"SELECTOR='" + SELECTOR + '\n' + '}';
        }
        if (STANDALONE != null) {
            return '\n' + "STANDALONE='" + STANDALONE + '\n' + '}';
        }
        if (IMPORT != null) {
            return '\n' + "IMPORT='" + IMPORT + '\n' + '}';
        }
        if (templat != null) {
            return '\n' + "templat='" + templat + '\n' + '}';
        }
        if (style != null) {
            return '\n' + "style='" + style + '\n' + '}';
        }
        return '\n' + "Component_COMMA=" + Component_COMMA + '\n';
        }
        }