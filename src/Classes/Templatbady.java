package Classes;
public class Templatbady {
    String OPEN_DIV;
    String IN_DIV;
    Divbady divbady;
    String CLOSE_DIV;

    public String getOPEN_DIV() {
        return OPEN_DIV;
    }

    public void setOPEN_DIV(String OPEN_DIV) {
        this.OPEN_DIV = OPEN_DIV;
    }

    public String getIN_DIV() {
        return IN_DIV;
    }

    public void setIN_DIV(String IN_DIV) {
        this.IN_DIV = IN_DIV;
    }

    public Divbady getDivbady() {
        return divbady;
    }

    public void setDivbady(Divbady divbady) {
        this.divbady = divbady;
    }

    public String getCLOSE_DIV() {
        return CLOSE_DIV;
    }

    public void setCLOSE_DIV(String CLOSE_DIV) {
        this.CLOSE_DIV = CLOSE_DIV;
    }

    @Override
    public String toString() {
        return "Templatbady{" +
                "OPEN_DIV='" + OPEN_DIV + '\'' +
                ", IN_DIV='" + IN_DIV + '\'' +
                ", divbady=" + divbady +
                ", CLOSE_DIV='" + CLOSE_DIV + '\'' +
                '}';
    }
}