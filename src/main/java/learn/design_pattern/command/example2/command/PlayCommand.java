package learn.design_pattern.command.example2.command;


import learn.design_pattern.command.example2.receiver.AudioPlayer;

public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
