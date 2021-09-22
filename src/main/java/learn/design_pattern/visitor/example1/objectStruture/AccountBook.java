package learn.design_pattern.visitor.example1.objectStruture;

import learn.design_pattern.visitor.example1.element.Bill;
import learn.design_pattern.visitor.example1.visitor.AccountBookViewer;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    private final List<Bill> billList = new ArrayList<>();

    public void addBill(Bill bill) {
        billList.add(bill);
    }

    public void show(AccountBookViewer viewer) {
        billList.forEach(bill -> {
            bill.accept(viewer);
        });
    }
}
