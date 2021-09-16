package learn.design_pattern.memento.example.multiple_checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator originator;
    private List<Memento> mementoList = new ArrayList<>();
    private int current;

    public Caretaker(Originator originator) {
        this.originator = originator;
        this.current = 0;
    }

    public int createMemento() {
        Memento memento = this.originator.createMemento();
        this.mementoList.add(memento);
        return this.current++;
    }


}
