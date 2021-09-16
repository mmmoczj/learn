package learn.design_pattern.flyweight.example2;

import learn.design_pattern.flyweight.example2.factory.ChessFlyWeightFactory;
import learn.design_pattern.flyweight.example2.flyweight.ChessFlyWeight;
import learn.design_pattern.flyweight.example2.flyweight.Coordinate;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess3 = ChessFlyWeightFactory.getChess("白色");

        System.out.println(chess1 == chess2);
        chess1.display(new Coordinate(3, 4));
    }
}
