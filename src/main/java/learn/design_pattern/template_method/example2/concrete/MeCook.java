package learn.design_pattern.template_method.example2.concrete;

import learn.design_pattern.template_method.example2.template.Cook;

public class MeCook extends Cook {

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
        System.out.println("自己:放葱");
    }

    @Override
    public void addEgge() {
        System.out.println("自己:放一个鸡蛋");
    }

    @Override
    public void addTomato() {
        System.out.println("自己:放一个西红柿");
    }
}
