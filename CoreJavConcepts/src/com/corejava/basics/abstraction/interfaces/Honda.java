package com.corejava.basics.abstraction.interfaces;

public class Honda implements MyInterfaceCar {
    @Override
    public void model() {
        System.out.println("Model in Honda");
    }

    @Override
    public void acceleration() {
        System.out.println("acceleration in Honda");
    }

    @Override
    public void clutch() {
        System.out.println("clutch in Honda");
    }

    @Override
    public void breaks() {
        System.out.println("breaks in Honda");
    }
}
