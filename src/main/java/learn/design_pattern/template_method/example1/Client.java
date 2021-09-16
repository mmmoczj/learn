package learn.design_pattern.template_method.example1;

import learn.design_pattern.template_method.example1.concrete.HookConcreteClass;
import learn.design_pattern.template_method.example1.template.HookAbstractClass;

public class Client {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}
