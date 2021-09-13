package learn.design_pattern.adapter.example.classAdapter;


import learn.design_pattern.adapter.example.classAdapter.Adapter.Adapter;
import learn.design_pattern.adapter.example.classAdapter.Target.Target;

public class Client {
    public static void main(String[] args) {
        Target t = new Adapter();
        t.handleReq();
    }
}
