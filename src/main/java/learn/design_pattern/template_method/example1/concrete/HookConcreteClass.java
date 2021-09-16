package learn.design_pattern.template_method.example1.concrete;

import learn.design_pattern.template_method.example1.template.HookAbstractClass;

public class HookConcreteClass extends HookAbstractClass {


    @Override
    public void abstractMethod1() {
        System.out.println("abstractMethod1实现 && 调用");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("abstractMethod2实现 && 调用");
    }

    public void HookMethod1() {
        System.out.println("钩子方法1被重写 && 调用");
    }

    public boolean HookMethod2() {
        return true;
    }

    @Override
    public void SpecificMethod() {
        System.out.println("SpecificMethod被重写 && 调用");
    }
}
