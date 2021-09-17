package learn.design_pattern.chain_of_responsibility.example.handler;

public class Dean extends Leader {
    @Override
    public void handlerRequest(int leaveDays) {
        if (leaveDays <= 10) {
            System.out.println("院长批准" + leaveDays + "的假期");
        } else {
            Leader next = getNext();
            if (next != null) {
                next.handlerRequest(leaveDays);
            } else {
                System.out.println("请假人数太多,无法批准");
            }
        }
    }
}
