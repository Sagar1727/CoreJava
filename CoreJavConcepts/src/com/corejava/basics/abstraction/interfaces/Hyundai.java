package com.corejava.basics.abstraction.interfaces;

public class Hyundai implements MyInterfaceCar {

    @Override
    public void model() {
        final int a = 10;
        System.out.println("Model in Hyundai");
    }

    @Override
    public void acceleration() {
        System.out.println("acceleration in Hyundai");
    }

    @Override
    public void clutch() {
        System.out.println("clutch in Hyundai");
    }

    @Override
    public void breaks() {
        System.out.println("breaks in Hyundai");
    }
}
