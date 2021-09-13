package learn.design_pattern.builder.example2_noDirector.builder;


import learn.design_pattern.builder.example2_noDirector.product.Product;

public abstract class Builder {
    public abstract Builder buildA(String mes);

    public abstract Builder buildB(String mes);

    public abstract Builder buildC(String mes);

    public abstract Builder buildD(String mes);

    public abstract Product build();
}
