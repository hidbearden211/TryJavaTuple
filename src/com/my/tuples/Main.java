package com.my.tuples;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private static Tuple3<Integer, Boolean, List<String>> testTuple() {
        int val = 10;
        boolean boolVal = true;
        List<String> strs = new LinkedList<>();
        strs.add("first string");
        strs.add("second string");
        strs.add("third string");
        return new Tuple3<>(val, boolVal, strs);
    }

    public static void main(String[] args) {
        System.out.println(testTuple());
    }
}
