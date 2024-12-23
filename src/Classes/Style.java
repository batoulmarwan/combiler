package Classes;
public class Style {
    String STYLES_OPEN;
    Stylesbody stylebady;
    String STYLES_CLOSE;

    public String getSTYLES_OPEN() {
        return STYLES_OPEN;
    }

    public void setSTYLES_OPEN(String STYLES_OPEN) {
        this.STYLES_OPEN = STYLES_OPEN;
    }

    public Stylesbody getStylebady() {
        return stylebady;
    }

    public void setStylebady(Stylesbody stylebady) {
        this.stylebady = stylebady;
    }

    public String getSTYLES_CLOSE() {
        return STYLES_CLOSE;
    }

    public void setSTYLES_CLOSE(String STYLES_CLOSE) {
        this.STYLES_CLOSE = STYLES_CLOSE;
    }

    @Override
    public String toString() {
        return "Style{" +
                "STYLES_OPEN='" + STYLES_OPEN + '\'' +
                ", stylebady=" + stylebady +
                ", STYLES_CLOSE='" + STYLES_CLOSE + '\'' +
                '}';
    }
}