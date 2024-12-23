package Classes;
public class Templat {
    String TEMPLATE_OPEN;
    Templatbady templatbady;
    String Template_Close;

    public String getTEMPLATE_OPEN() {
        return TEMPLATE_OPEN;
    }

    public void setTEMPLATE_OPEN(String TEMPLATE_OPEN) {
        this.TEMPLATE_OPEN = TEMPLATE_OPEN;
    }

    public Templatbady getTemplatbady() {
        return templatbady;
    }

    public void setTemplatbady(Templatbady templatbady) {
        this.templatbady = templatbady;
    }

    public String getTemplate_Close() {
        return Template_Close;
    }

    public void setTemplate_Close(String template_Close) {
        Template_Close = template_Close;
    }

    @Override
    public String toString() {
        return "Templat{" +
                "TEMPLATE_OPEN='" + TEMPLATE_OPEN + '\'' +
                ", templatbady=" + templatbady +
                ", Template_Close='" + Template_Close + '\'' +
                '}';
    }
}