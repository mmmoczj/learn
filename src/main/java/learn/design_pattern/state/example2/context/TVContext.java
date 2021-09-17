package learn.design_pattern.state.example2.context;


import learn.design_pattern.state.example2.state.State;

public class TVContext implements State {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
