package learn.design_pattern.memento.example.black_box;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("off");
        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println("current state:" + originator.getState());
    }
}
