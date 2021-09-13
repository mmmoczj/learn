package learn.design_pattern.adapter.example.classAdapter.Adapter;


import learn.design_pattern.adapter.example.classAdapter.Adaptee.Adaptee;
import learn.design_pattern.adapter.example.classAdapter.Target.Target;

public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
