package learn.design_pattern.visitor.example1.element;

import learn.design_pattern.visitor.example1.visitor.AccountBookViewer;

public class IncomeBill implements Bill {
    private double amount;
    private String item;

    public IncomeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
