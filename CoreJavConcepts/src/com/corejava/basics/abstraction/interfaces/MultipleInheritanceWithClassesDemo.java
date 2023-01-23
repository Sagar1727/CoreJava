package com.corejava.basics.abstraction.interfaces;

public class MultipleInheritanceWithClassesDemo {
    public static void main(String[] args) {
        B b = new B();
        b.test();//Ambiguity, So multiple inheritance with classes not possible in Java
    }
}

class A {
    void test(){
        System.out.println("test() in A");
    }

    void display() {
        System.out.println("display() in A");
    }
}

class A1 {
    void test(){
        System.out.println("test() in A1");
    }

    void show() {
        System.out.println("show() in A1");
    }
}

/*class B extends A, A1 {

}*/

class B extends A{

}

/*class B extends A1{

}*/

class C extends B {

}

//Inheritance 1) Single Level, 2) Multi Level 3)Multiple
//Single Level: A child has only one parent
//Multi Level:
//Multiple : A child has more than on Parent