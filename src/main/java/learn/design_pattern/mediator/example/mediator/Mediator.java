package learn.design_pattern.mediator.example.mediator;

import learn.design_pattern.mediator.example.colleague.Colleague;

/**
 * 中介者模式，中介者的接口，用于注册加入中介，发送消息和接收消息
 */
public interface Mediator {
    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
