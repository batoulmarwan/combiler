package Classes;
public class Component {
    String Component_OPEN;
    Componentbady componentbady;
    String Component_CLOSE;

    public String getComponent_OPEN() {
        return Component_OPEN;
    }

    public void setComponent_OPEN(String component_OPEN) {
        Component_OPEN = component_OPEN;
    }

    public Componentbady getComponentbady() {
        return componentbady;
    }

    public void setComponentbady(Componentbady componentbady) {
        this.componentbady = componentbady;
    }

    public String getComponent_CLOSE() {
        return Component_CLOSE;
    }

    public void setComponent_CLOSE(String component_CLOSE) {
        Component_CLOSE = component_CLOSE;
    }

    @Override
    public String toString() {
        return "Component{" +
                "Component_OPEN='" + Component_OPEN + '\'' +
                ", componentbady=" + componentbady +
                ", Component_CLOSE='" + Component_CLOSE + '\'' +
                '}';
    }
}



