package learn.design_pattern.bridge.example.implementor;

public class White implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("白色的" + shape);
    }
}
