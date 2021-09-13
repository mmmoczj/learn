package learn.design_pattern.composite.example2;

public class Client {
    public static void main(String[] args) {
        MenuComponent menu = new Menu("餐厅", "...");
        MenuComponent zaocan = new Menu("早餐", "早餐");
        zaocan.add(new MenuItem("包子","早餐",false,10.0));
        zaocan.add(new MenuItem("豆浆","早餐",false,10.0));
        MenuComponent wucan = new Menu("午餐","午餐");
        wucan.add(new MenuItem("炒饭","午餐",false,10.0));

        menu.add(zaocan);
        menu.add(wucan);
        menu.print();
    }
}
