package learn.design_pattern.command.example.invoker;

import learn.design_pattern.command.example.command.Command;

public class Invoker {
    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
