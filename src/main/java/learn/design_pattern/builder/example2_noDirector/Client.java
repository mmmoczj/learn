package learn.design_pattern.builder.example2_noDirector;


import learn.design_pattern.builder.example2_noDirector.builder.ConcreteBuilder;
import learn.design_pattern.builder.example2_noDirector.product.Product;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Product product = builder.buildA("奥尔良鸡腿堡")
                .buildB("薯条")
                .buildC("鸡块")
                .buildD("可乐")
                .build();
        System.out.println(product.toString());
    }
}
