package learn.design_pattern.chain_of_responsibility.example.handler;

public class ClassAdviser extends Leader {
    @Override
    public void handlerRequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("班主任批准了" + leaveDays + "的假期");
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
