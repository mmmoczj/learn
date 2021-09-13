package learn.design_pattern.builder.example;


import learn.design_pattern.builder.example.builder.ComputerBuilder;
import learn.design_pattern.builder.example.builder.MacComputerBuilder;
import learn.design_pattern.builder.example.director.ComputerDirector;
import learn.design_pattern.builder.example.product.Computer;

public class Client {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new MacComputerBuilder("I5处理器", "16G");
        director.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        System.out.println(macComputer.toString());
    }
}
