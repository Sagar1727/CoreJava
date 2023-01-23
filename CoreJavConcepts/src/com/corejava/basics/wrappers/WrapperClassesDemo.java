package com.corejava.basics.wrappers;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        //List<int> list = new ArrayList<>(); // Collections would work only with Reference types cannot be possible with primitives
        int a = 100;
        Integer integer = a;//Boxing and Un Boxing would be done automatically

        int b = integer;//Un Boxing

        System.out.println(a);
        System.out.println(b);
        System.out.println(integer);
    }
}

//Wrapper Classes
// For every primitive we have corresponding Wrapper class present in Java
//int -> Integer
//byte -> Byte
//short -> Short
//long -> Long
//float -> Float
//double -> Double
//boolean -> Boolean
//char -> Character


//valueOf()