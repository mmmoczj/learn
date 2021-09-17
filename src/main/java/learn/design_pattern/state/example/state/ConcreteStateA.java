package learn.design_pattern.state.example.state;

public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle:" + sampleParameter);
    }
}
