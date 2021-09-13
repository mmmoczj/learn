package learn.design_pattern.bridge.example2.implementor;

public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内短消息的方法,发送" + message + "给" + toUser);
    }
}
