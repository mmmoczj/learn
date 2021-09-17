package learn.design_pattern.memento.example.multiple_checkpoint;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        originator.setState("state 0");
        caretaker.createMemento();
        originator.setState("state 1");
        caretaker.createMemento();
        originator.setState("state 2");
        caretaker.createMemento();
        originator.setState("state 3");
        caretaker.createMemento();
        originator.setState("state 4");
        caretaker.createMemento();
        originator.printStates();

        System.out.println("--------恢复检查点---------");
        caretaker.restoreMemento(1);
        originator.printStates();
        caretaker.printAll();
    }
}
