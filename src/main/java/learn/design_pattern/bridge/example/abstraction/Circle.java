package learn.design_pattern.bridge.example.abstraction;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.paint("圆形");
    }
}
