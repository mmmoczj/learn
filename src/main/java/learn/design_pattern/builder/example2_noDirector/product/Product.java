package learn.design_pattern.builder.example2_noDirector.product;

public class Product {
    private String buildA = "香辣鸡腿堡";
    private String buildB = "奥尔良烤翅";
    private String buildC = "劲霸鸡条";
    private String buildD = "橙汁";

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("套餐{")
                .append("buildA=").append(buildA).append(",")
                .append("buildB=").append(buildB).append(",")
                .append("buildC=").append(buildC).append(",")
                .append("buildD=").append(buildD)
                .append("}");
        return sb.toString();
    }
}
