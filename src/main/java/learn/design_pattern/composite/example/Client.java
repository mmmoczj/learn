package learn.design_pattern.composite.example;

public class Client {
    public static void main(String[] args) {
        Component component = new Composite();
        component.addComposite(new Leaf());
        component.addComposite(new Leaf());
        component.addComposite(new Composite());
        component.operation();
    }
}
