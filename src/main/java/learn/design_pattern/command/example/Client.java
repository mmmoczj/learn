package learn.design_pattern.command.example;

import learn.design_pattern.command.example.command.Command;
import learn.design_pattern.command.example.command.ConcreteCommand;
import learn.design_pattern.command.example.invoker.Invoker;
import learn.design_pattern.command.example.recevier.Receiver;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
