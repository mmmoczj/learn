package learn.design_pattern.memento.example.multiple_checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Originator {

    private List<String> states;

    private int index;// 检查点序号

    public Originator() {
        this.states = new ArrayList<>();
        index = 0;
    }

    public Memento createMemento() {
        return new Memento(states, index);
    }

    public void restoreMemento(Memento memento) {
        this.states = memento.getStates();
        this.index = memento.getIndex();
    }

    public void setState(String state) {
        this.states.add(state);
        this.index++;
    }

    public List<String> getStates() {
        return states;
    }

    public void printStates() {
        System.out.println("current states size:" + states.size());
        states.forEach(System.out::println);
    }

}
