package learn.design_pattern.bridge.example2.abstraction;


import learn.design_pattern.bridge.example2.implementor.MessageImplementor;

public abstract class AbstractMessage {
    MessageImplementor messageImplementor;

    public AbstractMessage(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    public void sendMessage(String message, String toUser) {
        this.messageImplementor.send(message, toUser);
    }
}
