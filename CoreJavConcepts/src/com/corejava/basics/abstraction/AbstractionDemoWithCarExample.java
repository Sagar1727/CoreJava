package com.corejava.basics.abstraction;

public class AbstractionDemoWithCarExample {
    public static void main(String[] args) {
        //Car car = new Car(); We cannot create objects ofr abstract class
        //car.display();


        Car car = new BMW();
        car.display();
        car.model();
    }
}

abstract class Car {

    private final int WHEELS = 4;
    private final int LIGHTS = 4;
    private final int DOORS = 5;

    public void display() {
        System.out.println(WHEELS);
        System.out.println(LIGHTS);
        System.out.println(DOORS);
    }

    public abstract void model();

}


class Hyundai extends Car {

    @Override
    public void model() {
        System.out.println("THis is Hyundai's Model");
    }
}


class Honda extends Car {

    @Override
    public void model() {
        System.out.println("THis is Honda's Model");
    }
}

class BMW extends Car {

    @Override
    public void model() {
        System.out.println("THis is BMW's Model");
    }
}
