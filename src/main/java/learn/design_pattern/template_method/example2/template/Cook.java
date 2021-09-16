package learn.design_pattern.template_method.example2.template;

public abstract class Cook {
    // 加葱
    public abstract void addShallot();

    // 放鸡蛋
    public abstract void addEgge();

    // 放西红柿
    public abstract void addTomato();

    // 钩子方法
    public boolean isAddShallot() {
        return true;
    }

    // 模板
    final public void cook() {
        this.addEgge();
        this.addTomato();
        if (this.isAddShallot()) {
            this.addShallot();
        }
    }
}
