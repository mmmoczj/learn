package learn.design_pattern.memento.example.white_box;

import learn.design_pattern.memento.example.white_box.caretaker.Caretaker;
import learn.design_pattern.memento.example.white_box.originator.Originator;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        caretaker.saveMemento(originator.createMemento());

        originator.setState("off");

        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("originator current state:" + originator.getState());
    }
}
