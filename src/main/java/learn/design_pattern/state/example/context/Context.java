package learn.design_pattern.state.example.context;

import learn.design_pattern.state.example.state.State;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter) {
        state.handle(sampleParameter);
    }
}
