package learn.design_pattern.visitor.example1.element;

import learn.design_pattern.visitor.example1.visitor.AccountBookViewer;

public class ConsumeBill implements Bill {
    private double amount;
    private String item;

    public ConsumeBill(double amount, String item) {
        super();
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
