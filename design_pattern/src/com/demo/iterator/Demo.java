package com.demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LiHaoHan Created on 2023/11/2
 */

public class Demo {

    public static void main(String[] args) {
        ValueLoader<Integer> valueLoader = new ValueLoader<Integer>() {
            @Override
            public List<Integer> load(long offset, int limit) {
                List<Integer> data = new ArrayList<>();
                for (int i = 0; i < limit; i++) {
                    data.add((int) (offset + i));
                }
                return data;
            }
        };
        LazyIterator<Integer> lazyLoader = new LazyIterator<>(valueLoader, 0, 5);
        for (int num : lazyLoader) {
            System.out.println(num);
        }
    }
}

class LazyIterator<T> implements Iterable<T> {

    private final ValueLoader<T> valueLoader;
    private final int offset;
    private final int limit;

    public LazyIterator(ValueLoader<T> valueLoader, int offset, int limit) {
        this.valueLoader = valueLoader;
        this.offset = offset;
        this.limit = limit;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private final List<T> values;
        private int index;

        public Itr() {
            this.values = valueLoader.load(offset, limit);
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if (values.isEmpty()) {
                return false;
            }
            return index < values.size();
        }
        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            T t = values.get(index);
            index++;
            return t;
        }
    }
}

interface ValueLoader<T> {
    List<T> load(long offset, int limit);
}