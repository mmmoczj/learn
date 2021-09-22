package learn.design_pattern.mediator.example.colleague;

import learn.design_pattern.mediator.example.mediator.Mediator;

/**
 * 中介者模式，闹钟对象，属于中介者控制的组件
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
