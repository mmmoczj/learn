package learn.design_pattern.command.example3_macro;

import learn.design_pattern.command.example2.command.Command;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {
    List<Command> commandList = new ArrayList<>();

    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }

    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }

    @Override
    public void execute() {
        commandList.forEach(Command::execute);
    }
}
