package learn.design_pattern.factory_pattern.abstract_factory.example1.factory;


import learn.design_pattern.factory_pattern.abstract_factory.example1.product.computer.Computer;
import learn.design_pattern.factory_pattern.abstract_factory.example1.product.phone.Phone;

public interface AbstractFactory {

    public Phone producePhone();

    public Computer produceComputer();
}
