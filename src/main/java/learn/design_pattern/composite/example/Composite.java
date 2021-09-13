package learn.design_pattern.composite.example;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<Component>();

    @Override
    public void addComposite(Component c) {
        list.add(c);
    }

    @Override
    public void removeComposite(Component c) {
        list.remove(c);
    }

    @Override
    public Component getComposite(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        list.forEach(Component::operation);
    }
}
