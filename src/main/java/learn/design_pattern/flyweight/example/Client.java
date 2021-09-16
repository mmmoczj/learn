package learn.design_pattern.flyweight.example;

import learn.design_pattern.flyweight.example.factory.FlyweightFactory;
import learn.design_pattern.flyweight.example.flyweight.FlyWeight;
import learn.design_pattern.flyweight.example.flyweight.UnsharedConcreteFlyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        FlyWeight f1 = factory.getFlyWeight("连接池1");
        FlyWeight f2 = factory.getFlyWeight("连接池1");
        FlyWeight f3 = factory.getFlyWeight("连接池1");

        FlyWeight f4 = factory.getFlyWeight("连接池2");
        FlyWeight f5 = factory.getFlyWeight("连接池2");

        f1.operation(new UnsharedConcreteFlyweight("第一次获取连接池1"));
        f2.operation(new UnsharedConcreteFlyweight("第二次获取连接池1"));
        f3.operation(new UnsharedConcreteFlyweight("第仨次获取连接池1"));

        f4.operation(new UnsharedConcreteFlyweight("第四次获取连接池2"));
        f5.operation(new UnsharedConcreteFlyweight("第五次获取连接池2"));

        System.out.println(f1==f2);

    }
}
