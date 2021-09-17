package learn.design_pattern.state.example2;

import learn.design_pattern.state.example2.context.TVContext;
import learn.design_pattern.state.example2.state.State;
import learn.design_pattern.state.example2.state.TVStartState;
import learn.design_pattern.state.example2.state.TVStopState;

public class Client {
    public static void main(String[] args) {
        State start = new TVStartState();
        State stop = new TVStopState();

        TVContext context = new TVContext();
        context.setState(start);
        context.doAction();

        context.setState(stop);
        context.doAction();
    }
}
