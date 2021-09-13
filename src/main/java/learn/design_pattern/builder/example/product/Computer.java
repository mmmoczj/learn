package learn.design_pattern.builder.example.product;

public class Computer {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyboard;
    private String display;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{")
                .append("cpu=").append(cpu).append(",")
                .append("ram=").append(ram).append(",")
                .append("usbCount=").append(usbCount).append(",")
                .append("keyboard=").append(keyboard).append(",")
                .append("display").append(display)
                .append("}");
        return sb.toString();
    }
}
