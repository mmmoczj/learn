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

    // 创建一个新的检查点
    public int createMemento() {
        Memento memento = this.originator.createMemento();
        this.mementoList.add(memento);
        return this.current++;
    }

    // 将发起人对象状态恢复到某一个检查点
    public void restoreMemento(int index) {
        Memento memento = this.mementoList.get(index);
        originator.restoreMemento(memento);
    }

    // 将某一个检查点删除
    public void removeMemento(int index) {
        mementoList.remove(index);
    }

    public void printAll() {
        for (int i = 0; i < mementoList.size(); i++) {
            System.out.println("index i : " + i + " : " + mementoList.get(i) + " : " + mementoList.get(i).getStates());
            System.out.println("---------------------------------");
        }
    }

}
