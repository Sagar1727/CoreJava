package com.corejava.basics.comparision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);
        integerList.add(21);
        integerList.add(25);

        integerList.remove(21);

        //System.out.println(integerList);
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }

        System.out.println();
        integerList.forEach(System.out::println);

        Integer[] arr = {34, 56, 78, 90};
        List<Integer> integers = Arrays.asList(arr);


        List<Integer> integerList1 = Arrays.asList(23, 45, 67, 89, 90);
    }
}
