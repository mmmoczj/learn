package learn.design_pattern.bridge.example2.implementor;

public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法,发送" + message + "给" + toUser);
    }
}
