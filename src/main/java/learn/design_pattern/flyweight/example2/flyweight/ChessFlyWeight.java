package learn.design_pattern.flyweight.example2.flyweight;

// 抽象享元类
public interface ChessFlyWeight {
    void setColor(String color);

    String getColor();

    void display(Coordinate coordinate);
}
