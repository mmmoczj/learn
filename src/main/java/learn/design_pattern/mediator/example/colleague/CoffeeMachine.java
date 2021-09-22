package learn.design_pattern.mediator.example.colleague;

import learn.design_pattern.mediator.example.mediator.Mediator;

/**
 * 中介者模式，咖啡机对象，属于中介者控制的组件
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startCoffee() {
        System.out.println("It's time to start coffee");
    }

    public void finishCoffee() {
        System.out.println("after 5 minutes");
        System.out.println("coffee is ok");
        sendMessage(0);
    }
}
