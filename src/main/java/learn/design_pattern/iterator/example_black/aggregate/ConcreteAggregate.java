package learn.design_pattern.iterator.example_black.aggregate;

import learn.design_pattern.iterator.example_black.iterator.Iterator;

public class ConcreteAggregate extends Aggregate {
    private Object[] objectArr = null;

    public ConcreteAggregate(Object[] objectArr) {
        this.objectArr = objectArr;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        private int index = 0; // 内部索引，记录当前迭代到的索引位置
        private int size = 0; // 记录当前聚集对象的大小

        public ConcreteIterator() {
            this.size = objectArr.length;
            this.index = 0;
        }

        @Override
        public void first() {
            this.index = 0;
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
            return objectArr[index];
        }
    }
}
