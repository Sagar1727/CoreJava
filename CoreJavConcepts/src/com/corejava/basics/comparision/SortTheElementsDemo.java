package com.corejava.basics.comparision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheElementsDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(34, 12, 23, 89, 56, 47, 67, 90);
        System.out.println("Before Sorting:");
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        System.out.println("After Sorting:");
        Collections.sort(integerList);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

    }
}
