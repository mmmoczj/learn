package learn.design_pattern.flyweight.example2.factory;

import learn.design_pattern.flyweight.example2.flyweight.ChessFlyWeight;
import learn.design_pattern.flyweight.example2.flyweight.ConcreteChess;

import java.util.HashMap;

// 享元工厂
public class ChessFlyWeightFactory {
    private static HashMap<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        ChessFlyWeight chess = map.get(color);
        if (chess == null) {
            chess = new ConcreteChess(color);
            map.put(color, chess);
        }
        return chess;
    }
}
