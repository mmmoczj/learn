package learn.design_pattern.adapter.example.objectAdapter;

public class Adapter implements Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
