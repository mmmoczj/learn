package learn.design_pattern.composite.example2;

public class MenuItem extends MenuComponent {

    private String name;
    private String desc;
    private boolean vegetarian;
    private double price;

    public MenuItem(String _name, String _desc, boolean _vegetarian, double _price) {
        this.name = _name;
        this.desc = _desc;
        this.vegetarian = _vegetarian;
        this.price = _price;
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
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        System.out.println("MenuItem={" + name + "," + desc + "," + price + "}");
    }
}
