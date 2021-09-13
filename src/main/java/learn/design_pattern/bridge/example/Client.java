package learn.design_pattern.bridge.example;


import learn.design_pattern.bridge.example.abstraction.Rectangle;
import learn.design_pattern.bridge.example.abstraction.Shape;
import learn.design_pattern.bridge.example.implementor.Color;
import learn.design_pattern.bridge.example.implementor.White;

public class Client {
    public static void main(String[] args) {
        Color white = new White();
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
