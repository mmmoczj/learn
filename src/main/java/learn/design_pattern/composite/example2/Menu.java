package learn.design_pattern.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private String name;
    private String desc;
    private List<MenuComponent> list = new ArrayList<>();

    public Menu(String _name, String _desc) {
        this.name = _name;
        this.desc = _desc;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.desc;
    }

    @Override
    public void print() {
        System.out.println("Menu:{" + name + "," + desc + "}");
        list.forEach(MenuComponent::print);
    }

    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return list.get(index);
    }
}
