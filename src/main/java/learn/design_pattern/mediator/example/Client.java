package learn.design_pattern.mediator.example;

import learn.design_pattern.mediator.example.colleague.Alarm;
import learn.design_pattern.mediator.example.colleague.CoffeeMachine;
import learn.design_pattern.mediator.example.colleague.Curtains;
import learn.design_pattern.mediator.example.colleague.TV;
import learn.design_pattern.mediator.example.mediator.ConcreteMediator;
import learn.design_pattern.mediator.example.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "mAlarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "mCoffeeMachine");
        Curtains curtains = new Curtains(mediator, "mCurtains");
        TV tv = new TV(mediator, "mTv");
        alarm.sendMessage(0);
        coffeeMachine.finishCoffee();
        alarm.sendMessage(1);
    }
}
