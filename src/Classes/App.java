package Classes;

public class App {
    Component component;
    AppComponent appComponent;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    @Override
    public String toString() {
        return "App{" +
                "component=" + component +
                ", appComponent=" + appComponent +
                '}';
    }
}
