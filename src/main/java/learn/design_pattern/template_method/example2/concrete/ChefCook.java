package learn.design_pattern.template_method.example2.concrete;

import learn.design_pattern.template_method.example2.template.Cook;

public class ChefCook extends Cook {

    private boolean isAddShallot = true;

    public void setIsAddShallot(boolean isAddShallot) {
        this.isAddShallot = isAddShallot;
    }

    @Override
    public boolean isAddShallot() {
        return this.isAddShallot;
    }

    @Override
    public void addShallot() {
        System.out.println("大厨:放很多葱");
    }

    @Override
    public void addEgge() {
        System.out.println("大厨:放很多鸡蛋");
    }

    @Override
    public void addTomato() {
        System.out.println("大厨:放很多西红柿");
    }
}
