package com.corejava.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOf1To100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("Sum:" + sum);

        System.out.println(IntStream.rangeClosed(1, 100).sum());

        List<Integer> integerList = Arrays.asList(2, 4, 5, 1, 7, 45, 78, 90, 45, 67, 89, 67, 23, 34, 45);
        int sumList = 0;
        for (Integer integer : integerList) {
            sumList = sumList + integer;
        }

        System.out.println("SumList:" + sumList);

        System.out.println("With Java 8:" + integerList.stream().reduce(0, (a, b) -> a + b));
    }
}
