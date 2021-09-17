package learn.design_pattern.state.example;

import learn.design_pattern.state.example.context.Context;
import learn.design_pattern.state.example.state.ConcreteStateB;
import learn.design_pattern.state.example.state.State;

public class Client {
    public static void main(String[] args) {
        State state = new ConcreteStateB();
        Context context = new Context();
        context.setState(state);
        context.request("test");
    }
}
