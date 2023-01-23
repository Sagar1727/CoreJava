package com.corejava.basics.abstraction.interfaces;

public class ExtendingInterfacesDemo {
    public static void main(String[] args) {
        MyInt2 myInt2 = new MyClassImplementsExtendingInts();
        myInt2.show();
        myInt2.display();
    }
}

interface MyInt1 {
    void display();
}

interface MyInt2 extends MyInt1 {
    void show();
}

class MyClassImplementsExtendingInts implements MyInt2 {
    @Override
    public void show() {
        System.out.println("Show in child");
    }

    @Override
    public void display() {
        System.out.println("Display in child");
    }
}
