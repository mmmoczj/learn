package learn.design_pattern.command.example3_macro;

import learn.design_pattern.command.example2.command.Command;
import learn.design_pattern.command.example2.command.PlayCommand;
import learn.design_pattern.command.example2.command.RewindCommand;
import learn.design_pattern.command.example2.command.StopCommand;
import learn.design_pattern.command.example2.receiver.AudioPlayer;

public class Julia {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand macroCommand = new MacroAudioCommand();
        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);

        macroCommand.execute();
    }
}
