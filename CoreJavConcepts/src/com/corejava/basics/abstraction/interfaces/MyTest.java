package com.corejava.basics.abstraction.interfaces;

public class MyTest {
    public static void main(String[] args) {
        MyInterfaceCar myInterfaceCar = new Honda();//new Hyundai();
        myInterfaceCar.model();
        myInterfaceCar.acceleration();
        myInterfaceCar.breaks();
        myInterfaceCar.clutch();
    }
}
