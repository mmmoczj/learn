package learn.design_pattern.memento.example.white_box.caretaker;

import learn.design_pattern.memento.example.white_box.memento.Memento;

// 负责人角色类，负责人角色类负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容
public class Caretaker {
    private Memento memento;

    // 备忘录取值的方法
    public Memento retrieveMemento() {
        return this.memento;
    }

    // 备忘录赋值的方法
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
