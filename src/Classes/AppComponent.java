package Classes;

public class AppComponent {
    String APPComponent_OPEN;
   // List<AppComponent_body> appComponent_body = new ArrayList<AppComponent_body>();
    AppComponent_body appComponent_body;
    String APPComponent_CLOSE;

    public String getAPPComponent_OPEN() {
        return APPComponent_OPEN;
    }

    public void setAPPComponent_OPEN(String APPComponent_OPEN) {
        this.APPComponent_OPEN = APPComponent_OPEN;
    }

    public AppComponent_body getAppComponent_body() {
        return appComponent_body;
    }

    public void setAppComponent_body(AppComponent_body appComponent_body) {
        this.appComponent_body = appComponent_body;
    }

    public String getAPPComponent_CLOSE() {
        return APPComponent_CLOSE;
    }

    public void setAPPComponent_CLOSE(String APPComponent_CLOSE) {
        this.APPComponent_CLOSE = APPComponent_CLOSE;
    }

    @Override
    public String toString() {
        return "AppComponent{" +
                "APPComponent_OPEN='" + APPComponent_OPEN + '\'' +
                ", appComponent_body=" + appComponent_body +
                ", APPComponent_CLOSE='" + APPComponent_CLOSE + '\'' +
                '}';
    }
}

