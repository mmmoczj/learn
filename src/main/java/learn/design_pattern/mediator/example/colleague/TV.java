package learn.design_pattern.mediator.example.colleague;

import learn.design_pattern.mediator.example.mediator.Mediator;

/**
 * 中介者模式，电视机对象，属于中介者控制的组件
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("it's time to start tv");
    }

    public void stopTV() {
        System.out.println("stop tv");
    }
}
