package learn.design_pattern.bridge.example2;


import learn.design_pattern.bridge.example2.abstraction.AbstractMessage;
import learn.design_pattern.bridge.example2.abstraction.UrgencyMessage;
import learn.design_pattern.bridge.example2.implementor.MessageEmail;
import learn.design_pattern.bridge.example2.implementor.MessageImplementor;

public class Client {
    public static void main(String[] args) {
        MessageImplementor implementor = new MessageEmail();
        AbstractMessage message = new UrgencyMessage(implementor);
        message.sendMessage("你好!", "czj");
    }
}
