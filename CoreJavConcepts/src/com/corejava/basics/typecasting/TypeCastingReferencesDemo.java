package com.corejava.basics.typecasting;

public class TypeCastingReferencesDemo {
    public static void main(String[] args) {

        //Scenario 1:
        /*Person person = new LocalPerson();
        person.test();*/

        //Scenario: 2
        /*Person person = new LocalPerson();
        person.test();*///but there is not test() in Person, it leads to compile time error

        //Scenario 3:
        /*Person person = new LocalPerson();
        LocalPerson localPerson = (LocalPerson) person;
        localPerson.test();*/

        //Scenario : 4
        /*Person person = new LocalPerson();
        Employee employee = (Employee) person;*/ // while type casting there should be inheritance relationship.

        //Scenario 5:
        /*Person person = new Person();
        LocalPerson localPerson = (LocalPerson) person;//Down casting leads to ClassCastException
        person.test();*/


        //new LocalPerson().test();
    }
}

class Person {
    void test() {
        System.out.println("test() in Person");
    }
}

class LocalPerson extends Person {
    void test() {
        System.out.println("test() in LocalPerson");
    }
}

class NoNLocalPerson extends LocalPerson {
    void test() {
        System.out.println("test() in LocalPerson");
    }
}

class Employee {

}

// Compile time, checks for syntax rules
// Runtime, it checks for object, which class object is created.
//Super class reference variable can hold subclass object
