package learn.design_pattern.memento.example.history_on_self;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.changeState("state 0");
        MementoIF mementoIF = originator.createMemento();
        originator.changeState("state 1");
        originator.restoreMemento(mementoIF);
    }
}
