package learn.design_pattern.composite.example;

public abstract class Component {

    public abstract void addComposite(Component c); // 添加成员

    public abstract void removeComposite(Component c); // 移除成员

    public abstract Component getComposite(int i); // 添加子容器

    public abstract void operation(); // 业务方法
}
