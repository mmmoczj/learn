package learn.design_pattern.builder.example.builder;


import learn.design_pattern.builder.example.product.Computer;

public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
