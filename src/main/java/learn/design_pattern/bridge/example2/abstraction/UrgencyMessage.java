package learn.design_pattern.bridge.example2.abstraction;


import learn.design_pattern.bridge.example2.implementor.MessageImplementor;

public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急消息:" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        return null;
    }
}
