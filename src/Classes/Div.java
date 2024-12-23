package Classes;
public class Div {
            String OPEN_NEW_DIV;
            String IN_DIV;
            Divbady div_body;
            String CLOSE_DIV;

    public String getOPEN_NEW_DIV() {
        return OPEN_NEW_DIV;
    }

    public void setOPEN_NEW_DIV(String OPEN_NEW_DIV) {
        this.OPEN_NEW_DIV = OPEN_NEW_DIV;
    }

    public String getIN_DIV() {
        return IN_DIV;
    }

    public void setIN_DIV(String IN_DIV) {
        this.IN_DIV = IN_DIV;
    }

    public Divbady getDiv_body() {
        return div_body;
    }

    public void setDiv_body(Divbady div_body) {
        this.div_body = div_body;
    }

    public String getCLOSE_DIV() {
        return CLOSE_DIV;
    }

    public void setCLOSE_DIV(String CLOSE_DIV) {
        this.CLOSE_DIV = CLOSE_DIV;
    }

    @Override
    public String toString() {
        return "Div{" +
                "OPEN_NEW_DIV='" + OPEN_NEW_DIV + '\'' +
                ", IN_DIV='" + IN_DIV + '\'' +
                ", div_body=" + div_body +
                ", CLOSE_DIV='" + CLOSE_DIV + '\'' +
                '}';
    }
}
