package learn.design_pattern.state.example2.state;

public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turn off");
    }
}
