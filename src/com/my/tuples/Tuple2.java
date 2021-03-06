package com.my.tuples;

public class Tuple2<T1,T2> {
    private final T1 value1;
    private final T2 value2;

    public Tuple2(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 _1() {
        return value1;
    }

    public T2 _2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Tuple2{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
