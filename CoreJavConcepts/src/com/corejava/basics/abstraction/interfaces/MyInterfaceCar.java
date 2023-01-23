package com.corejava.basics.abstraction.interfaces;

public interface MyInterfaceCar {

    public final static int WHEELS = 4;//By default Data members are public static final
    int DOORS = 4;
    int MIRRORS = 2;

    public abstract void model(); //By Default it is public and abstract

    void acceleration();

    void clutch();

    void breaks();
}