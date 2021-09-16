package learn.design_pattern.memento.example.white_box.originator;

import learn.design_pattern.memento.example.white_box.memento.Memento;

// 发起人角色类，发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    // 将发起人的状态恢复到备忘录对象所记录的状态
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("current state:" + this.state);
    }
}
