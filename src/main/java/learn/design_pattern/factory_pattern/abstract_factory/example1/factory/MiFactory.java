package learn.design_pattern.factory_pattern.abstract_factory.example1.factory;


import learn.design_pattern.factory_pattern.abstract_factory.example1.product.computer.Computer;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.computer.MiComputer;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.phone.MiPhone;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.phone.Phone;

public class MiFactory implements AbstractFactory {
    @Override
    public Phone producePhone() {
        return new MiPhone();
    }

    @Override
    public Computer produceComputer() {
        return new MiComputer();
    }
}
