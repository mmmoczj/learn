package learn.design_pattern.mediator.example.colleague;

import learn.design_pattern.mediator.example.mediator.Mediator;

// 中介者模式，各组件实现的抽象类
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
