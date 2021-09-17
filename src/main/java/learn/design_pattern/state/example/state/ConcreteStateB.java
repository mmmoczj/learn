package learn.design_pattern.state.example.state;

public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle:" + sampleParameter);
    }
}
