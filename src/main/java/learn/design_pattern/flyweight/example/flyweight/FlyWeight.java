package learn.design_pattern.flyweight.example.flyweight;

// 抽象享元角色
public interface FlyWeight {
    public void operation(UnsharedConcreteFlyweight state);
}
