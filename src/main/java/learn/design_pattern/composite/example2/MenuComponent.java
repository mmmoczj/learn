package learn.design_pattern.composite.example2;

public abstract class MenuComponent {

    public String getName() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void print() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }
}
