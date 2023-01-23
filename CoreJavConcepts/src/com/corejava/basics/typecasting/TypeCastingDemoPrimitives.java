package com.corejava.basics.typecasting;

public class TypeCastingDemoPrimitives {

    static byte b = 10;
    static short sh = 100;
    static int i = 200;
    static long l = 300L;
    static float f = 4.5F;
    static double d = 45.78;
    static char ch = 'A';
    static String str = "Java 8";
    static boolean bool = true;

    public static void main(String[] args) {
        //Integers
        System.out.println(b);
        sh = b;//Implicit type casting
        b = (byte) sh;//Explicit type casting
        i = (int) l;
        l = i;

        //Floating point numbers
        d = f;
        f = (float) d;
    }
}
