package learn.design_pattern.memento.example.history_on_self;

public class Originator {
    private String state;

    public void changeState(String state) {
        this.state = state;
        System.out.println("current state:" + state);
    }

    public MementoIF createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(MementoIF mementoIF) {
        Memento m = (Memento) mementoIF;
        changeState(m.getState());
    }

    public class Memento implements MementoIF {
        private String state;

        private Memento(Originator originator) {
            this.state = originator.state;
        }

        private String getState() {
            return state;
        }
    }
}
