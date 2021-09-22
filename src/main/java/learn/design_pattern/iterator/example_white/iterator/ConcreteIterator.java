package learn.design_pattern.iterator.example_white.iterator;

import learn.design_pattern.iterator.example_white.aggregate.ConcreteAggregate;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate; // 持有被迭代的具体的聚合对象
    private int index = 0; // 内部索引，记录当前迭代到的索引位置
    private int size = 0; // 记录当前聚集对象的大小

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }
}
