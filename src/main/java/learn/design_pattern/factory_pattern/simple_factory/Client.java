package learn.design_pattern.factory_pattern.simple_factory;

import learn.design_pattern.factory_pattern.simple_factory.factory.Const;
import learn.design_pattern.factory_pattern.simple_factory.factory.ProductFactory;

public class Client {
    public static void main(String[] args) {
        ProductFactory.makeProduct(Const.PRODUCT_2).show();
    }
}
