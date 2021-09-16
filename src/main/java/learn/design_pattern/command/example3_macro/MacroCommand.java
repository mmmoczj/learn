package learn.design_pattern.command.example3_macro;

import learn.design_pattern.command.example2.command.Command;

public interface MacroCommand extends Command {
    public void add(Command cmd);

    public void remove(Command cmd);
}
