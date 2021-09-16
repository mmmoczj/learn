package learn.design_pattern.memento.example.black_box;

public class Caretaker {
    private MementoIF memento;

    // 备忘录的取值方法
    public MementoIF retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }

}
