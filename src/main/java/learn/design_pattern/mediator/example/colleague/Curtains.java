package learn.design_pattern.mediator.example.colleague;

import learn.design_pattern.mediator.example.mediator.Mediator;

/**
 * 中介者模式，窗帘对象，属于中介者控制的组件
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void upCurtains() {
        System.out.println("i am holding up curtains");
    }
}
