package learn.design_pattern.iterator.example_white;


import learn.design_pattern.iterator.example_white.aggregate.Aggregate;
import learn.design_pattern.iterator.example_white.aggregate.ConcreteAggregate;
import learn.design_pattern.iterator.example_white.iterator.Iterator;

public class Client {
    public static void main(String[] args) {
        Object[] objectArr = {"one", "two", "three", "four", "five", "six", "seven"};
        Aggregate aggregate = new ConcreteAggregate(objectArr);
        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
