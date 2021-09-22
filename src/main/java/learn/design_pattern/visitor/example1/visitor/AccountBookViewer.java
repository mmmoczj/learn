package learn.design_pattern.visitor.example1.visitor;

import learn.design_pattern.visitor.example1.element.ConsumeBill;
import learn.design_pattern.visitor.example1.element.IncomeBill;

public interface AccountBookViewer {
    void view(ConsumeBill bill); // 查看消费的单子

    void view(IncomeBill bill); // 查看收入的单子
}
