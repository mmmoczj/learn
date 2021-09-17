package learn.design_pattern.state.example2.state;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned on");
    }
}
