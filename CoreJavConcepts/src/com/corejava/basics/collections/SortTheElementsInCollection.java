package com.corejava.basics.collections;

import java.util.*;

public class SortTheElementsInCollection {
    public static void main(String[] args) {
        //Collections would work only with Object types int - Integer
        //List<Integer> integers = new ArrayList<>();
        List<Integer> integers = Arrays.asList(70, 20, 50, 10, 5, 80);

        /*integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);*/
        System.out.println("Before Sorting");
        System.out.println(integers);

        /*for (Integer integer : integers){
            System.out.println(integer);
        }*/

        System.out.println("After Sorting:");
        Collections.sort(integers);
        System.out.println(integers);
        /*int[] arr = {10, 20, 30, 40, 50, 60};//To create collection of homogeneous elements

        *//*arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        arr[6]=80;
        arr[7]=70;*//*

        System.out.println(arr.length);

        for (int element : arr){
            System.out.println(element);
        }*/

























        Integer integer = Integer.valueOf(10);//Auto Boxing(Primitive to Object/Wrapper)

        int a = integer.intValue(); //UnBoxing(Object/Wrapper into primitive)


        //Double wd = Double.valueOf(4.5);
        Double wd = 4.5;

        //double d = wd.doubleValue();
        double d = wd;

    }

}
