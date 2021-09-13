package learn.design_pattern.builder.example.director;


import learn.design_pattern.builder.example.builder.ComputerBuilder;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder) {
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
