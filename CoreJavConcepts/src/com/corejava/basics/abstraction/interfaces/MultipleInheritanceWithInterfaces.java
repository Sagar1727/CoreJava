package com.corejava.basics.abstraction.interfaces;

public class MultipleInheritanceWithInterfaces {
    public static void main(String[] args) {
        ChildClassToImplementMoreThenOneInterface childClassToImplementMoreThenOneInterface = new ChildClassToImplementMoreThenOneInterface();
        childClassToImplementMoreThenOneInterface.display();
        childClassToImplementMoreThenOneInterface.show();


        /*MyInterface1 myInterface1 = new ChildClassToImplementMoreThenOneInterface();
        myInterface1.display();

        MyInterface2 myInterface2 = new ChildClassToImplementMoreThenOneInterface();
        myInterface2.show();*/
    }
}

interface MyInterface1 {
    void display();
}

interface MyInterface2 {
    void show();
}

class ChildClassToImplementMoreThenOneInterface implements MyInterface1, MyInterface2{

    @Override
    public void display() {
        System.out.println("Display in Child class");
    }

    @Override
    public void show() {
        System.out.println("Show in Child class");
    }
}
