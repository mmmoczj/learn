package learn.design_pattern.facade.example;

import learn.design_pattern.facade.example.facade.Facade;

public class Client {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }
}
