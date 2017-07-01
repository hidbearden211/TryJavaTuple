package com.my.tuples;

public class Tuple3<T1, T2, T3> {
    private final T1 value1;
    private final T2 value2;
    private final T3 value3;

    public Tuple3(T1 value1, T2 value2, T3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T1 _1() {
        return value1;
    }

    public T2 _2() {
        return value2;
    }

    public T3 _3() {
        return value3;
    }

    @Override
    public String toString() {
        return "Tuple3{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                ", value3=" + value3 +
                '}';
    }
}
