package learn.design_pattern.visitor.example1.visitor;

import learn.design_pattern.visitor.example1.element.ConsumeBill;
import learn.design_pattern.visitor.example1.element.IncomeBill;

public class Boss implements AccountBookViewer {
    private double totalIncome;
    private double totalConsume;

    // 老板只关注一共花了多少钱,以及一共收入多少钱
    @Override
    public void view(ConsumeBill bill) {
        totalIncome += bill.getAmount();
    }

    @Override
    public void view(IncomeBill bill) {
        totalConsume += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少,数目是:" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少,数目是:" + totalConsume);
        return totalConsume;
    }
}
