package com.corejava.lambda;
import java.util.*;
public class OddLengthTest {

public static void main(String[] args) {

	List<Integer> ints = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
        ints.add(i);
    }
    System.out.println(ints);
    ints.removeIf(i -> i%2 ==0);
    System.out.println(ints);
}
}
