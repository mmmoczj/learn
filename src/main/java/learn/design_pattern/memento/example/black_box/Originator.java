package learn.design_pattern.memento.example.black_box;

// 发起人角色类Originator中定义了一个内部类Memento，
// 由此Memento类的全部接口都是私有的，
// 因此只有它自己和发起人角色对象类可以调用
public class Originator {
    private String state;

    public void restoreMemento(MementoIF memento) {
        Memento m = (Memento) memento;
        this.state = m.getState();
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("current state:" + state);
    }

    public String getState() {
        return state;
    }

    public MementoIF createMemento() {
        return new Memento(this.state);
    }

    private class Memento implements MementoIF {
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
