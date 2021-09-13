package learn.design_pattern.bridge.example2.abstraction;


import learn.design_pattern.bridge.example2.implementor.MessageImplementor;

public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
