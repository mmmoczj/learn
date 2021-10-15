package learn.design_pattern.factory_pattern.simple_factory.factory;

import learn.design_pattern.factory_pattern.simple_factory.product.ConcreteProduct1;
import learn.design_pattern.factory_pattern.simple_factory.product.ConcreteProduct2;
import learn.design_pattern.factory_pattern.simple_factory.product.Product;

public class ProductFactory {
    public static Product makeProduct(int kind) {
        if (Const.PRODUCT_1 == kind) {
            return new ConcreteProduct1();
        } else if (Const.PRODUCT_2 == kind) {
            return new ConcreteProduct2();
        }
        return null;
    }

}
