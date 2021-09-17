package learn.design_pattern.memento.example.multiple_checkpoint;

import java.util.ArrayList;
import java.util.List;

// 备忘录角色类，这个实现可以存储任意多的状态，外界可以使用检查点指数index来取出检查点上的状态
public class Memento {
    private List<String> states;
    private int index;

    public Memento(List<String> states, int index) {
        // 该处需要注意，我们在这里重新构建了一个新的集合，拷贝状态集合到新的集合中，保证原有集合变化不会影响到我们记录的值
        this.states = new ArrayList<>(states);
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public int getIndex() {
        return index;
    }
}
