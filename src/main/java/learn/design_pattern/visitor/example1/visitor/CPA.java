package learn.design_pattern.visitor.example1.visitor;

import learn.design_pattern.visitor.example1.element.ConsumeBill;
import learn.design_pattern.visitor.example1.element.IncomeBill;

// 会计师
public class CPA implements AccountBookViewer {

    @Override
    public void view(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("会计查看工资是否交个人所得税");
        }
    }

    @Override
    public void view(IncomeBill bill) {
        System.out.println("会计查看收入交税了没");
    }
}
