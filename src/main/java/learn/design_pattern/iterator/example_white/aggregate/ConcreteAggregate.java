package learn.design_pattern.iterator.example_white.aggregate;

import learn.design_pattern.iterator.example_white.iterator.ConcreteIterator;
import learn.design_pattern.iterator.example_white.iterator.Iterator;

public class ConcreteAggregate extends Aggregate {
    private Object[] objectArr = null;

    /**
     * 构造方法，传入聚合对象的具体内容
     */
    public ConcreteAggregate(Object[] objectArr) {
        this.objectArr = objectArr;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index) {
        if (index < objectArr.length) {
            return objectArr[index];
        } else {
            return null;
        }
    }

    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size() {
        return objectArr.length;
    }
}
