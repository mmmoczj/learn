package learn.design_pattern.flyweight.example.factory;

import learn.design_pattern.flyweight.example.flyweight.ConcreteFlyweight;
import learn.design_pattern.flyweight.example.flyweight.FlyWeight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, FlyWeight> flyWeightMap = new HashMap<>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyWeightMap.get(key);
        if (flyWeight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyWeight = new ConcreteFlyweight(key);
            flyWeightMap.put(key, flyWeight);
        }
        return flyWeight;
    }
}
