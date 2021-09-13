package learn.design_pattern.adapter.example.objectAdapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.handleReq();
    }
}
