package learn.design_pattern.bridge.example.abstraction;


import learn.design_pattern.bridge.example.implementor.Color;

public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
