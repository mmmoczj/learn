package learn.design_pattern.strategy_pattern.example;


import learn.design_pattern.strategy_pattern.example.context.Price;
import learn.design_pattern.strategy_pattern.example.strategy.AdvancedMemberStrategy;
import learn.design_pattern.strategy_pattern.example.strategy.MemberStrategy;

public class Client {
    public static void main(String[] args) {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(300);
        System.out.println("图书价格为:" + quote);
    }
}
