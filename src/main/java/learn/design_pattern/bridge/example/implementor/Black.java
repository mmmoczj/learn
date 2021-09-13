package learn.design_pattern.bridge.example.implementor;

public class Black implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
