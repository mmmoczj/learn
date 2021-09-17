package learn.design_pattern.chain_of_responsibility.example.handler;

public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handlerRequest(int leaveDays);
}
