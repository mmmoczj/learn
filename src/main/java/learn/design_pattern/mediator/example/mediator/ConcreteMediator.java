package learn.design_pattern.mediator.example.mediator;

import learn.design_pattern.mediator.example.colleague.*;

import java.util.HashMap;

/**
 * 中介者模式，中介者，用于集中管理所有的组件控制，协调各组件的功能
 */
public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> colleagueNameMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        colleagueNameMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            colleagueNameMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            colleagueNameMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            colleagueNameMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            colleagueNameMap.put("Curtains", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        Colleague colleague = colleagueMap.get(colleagueName);
        if (colleague instanceof Alarm) {
            if (stateChange == 0) {
                String coffeeMachineName = colleagueNameMap.get("CoffeeMachine");
                CoffeeMachine coffeeMachine = (CoffeeMachine) colleagueMap.get(coffeeMachineName);
                coffeeMachine.startCoffee();

                String tvMachineName = colleagueNameMap.get("TV");
                TV tv = (TV) colleagueMap.get(tvMachineName);
                tv.startTV();
            } else {
                String tvMachineName = colleagueNameMap.get("TV");
                TV tv = (TV) colleagueMap.get(tvMachineName);
                tv.stopTV();
            }
        } else if (colleague instanceof CoffeeMachine) {
            String curtainsMachineName = colleagueNameMap.get("Curtains");
            Curtains curtains = (Curtains) colleagueMap.get(curtainsMachineName);
            curtains.upCurtains();
        } else if (colleague instanceof TV) {

        } else if (colleague instanceof Curtains) {

        }
    }

    @Override
    public void sendMessage() {

    }
}
