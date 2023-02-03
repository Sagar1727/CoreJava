package com.corejava.basics.collections;

public abstract class Car {
    void parts() {
        System.out.println("common parts");
    }

    abstract void model();
}


class Hyundai extends Car{

    @Override
    void model() {
        System.out.println("Hyundai model");
    }
}

class BMW extends Car{

    @Override
    void model() {
        System.out.println("BMW model");
    }
}
