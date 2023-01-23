package com.corejava.basics.wrappers;

public class WrapperClassesDemo2 {
    public static void main(String[] args) {
        double a = 10;

        //Integer integer = a;//Boxing done automatically
        //Integer integer = new Integer(a);
        Double integer = Double.valueOf(a);
        double i = integer.doubleValue();
    }
}

// The purpose of valueOf() is boxing
// The purpose of intValue() -> unboxing
