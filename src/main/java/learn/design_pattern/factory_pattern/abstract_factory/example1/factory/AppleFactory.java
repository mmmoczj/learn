package learn.design_pattern.factory_pattern.abstract_factory.example1.factory;

import learn.design_pattern.factory_pattern.abstract_factory.example1.product.computer.Computer;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.computer.Mac;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.phone.Iphone;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.phone.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone producePhone() {
        return new Iphone();
    }

    @Override
    public Computer produceComputer() {
        return new Mac();
    }
}
