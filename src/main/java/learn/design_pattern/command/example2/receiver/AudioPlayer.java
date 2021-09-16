package learn.design_pattern.command.example2.receiver;

public class AudioPlayer {
    public void play() {
        System.out.println("play...");
    }

    public void rewind() {
        System.out.println("rewind...");
    }

    public void stop() {
        System.out.println("stop...");
    }
}
