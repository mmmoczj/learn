package learn.design_pattern.template_method.example2;

import learn.design_pattern.template_method.example2.concrete.ChefCook;
import learn.design_pattern.template_method.example2.concrete.MeCook;
import learn.design_pattern.template_method.example2.template.Cook;

public class Client {
    public static void main(String[] args) {
        MeCook me = new MeCook();
        me.setIsAddShallot(false);
        me.cook();

        Cook chefCook = new ChefCook();
        chefCook.cook();
    }
}
