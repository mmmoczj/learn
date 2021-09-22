package learn.design_pattern.iterator.example_black.aggregate;

import learn.design_pattern.iterator.example_black.iterator.Iterator;

public abstract class Aggregate {
    public abstract Iterator createIterator();
}
