package learn.design_pattern.visitor.example1.element;

import learn.design_pattern.visitor.example1.visitor.AccountBookViewer;

public interface Bill {
    void accept(AccountBookViewer viewer);
}
