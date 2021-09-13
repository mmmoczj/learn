package learn.design_pattern.bridge.example.abstraction;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.paint("矩形");
    }
}
