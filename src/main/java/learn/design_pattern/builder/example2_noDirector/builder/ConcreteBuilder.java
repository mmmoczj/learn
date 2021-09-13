package learn.design_pattern.builder.example2_noDirector.builder;


import learn.design_pattern.builder.example2_noDirector.product.Product;

public class ConcreteBuilder extends Builder {
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public Builder buildA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    public Builder buildB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    public Builder buildC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    public Builder buildD(String mes) {
        product.setBuildD(mes);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
