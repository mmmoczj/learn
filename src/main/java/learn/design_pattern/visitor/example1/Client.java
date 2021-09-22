package learn.design_pattern.visitor.example1;

import learn.design_pattern.visitor.example1.element.ConsumeBill;
import learn.design_pattern.visitor.example1.element.IncomeBill;
import learn.design_pattern.visitor.example1.objectStruture.AccountBook;
import learn.design_pattern.visitor.example1.visitor.Boss;
import learn.design_pattern.visitor.example1.visitor.CPA;

public class Client {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        accountBook.addBill(new IncomeBill(1000, "卖商品"));
        accountBook.addBill(new IncomeBill(2000, "卖广告"));
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(200, "材料"));

        Boss boss = new Boss();
        CPA cpa = new CPA();

        accountBook.show(cpa);
        accountBook.show(boss);

        boss.getTotalConsume();
        boss.getTotalIncome();
    }
}
