package com.my.tuples;

public class Tuple1<T1> {
    private final T1 value1;

    public Tuple1(T1 value1) {
        this.value1 = value1;
    }

    public T1 _1() {
        return value1;
    }

    @Override
    public String toString() {
        return "Tuple1{" +
                "value1=" + value1 +
                '}';
    }
}
