package learn.design_pattern.iterator.example_black;


import learn.design_pattern.iterator.example_black.aggregate.Aggregate;
import learn.design_pattern.iterator.example_black.aggregate.ConcreteAggregate;
import learn.design_pattern.iterator.example_black.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Object[] objectArr = {"one", "two", "three", "four", "five", "six", "seven"};
        Aggregate aggregate = new ConcreteAggregate(objectArr);
        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
        List<String> ls = new ArrayList<>();
        ls.forEach(d -> {

        });
    }
}
