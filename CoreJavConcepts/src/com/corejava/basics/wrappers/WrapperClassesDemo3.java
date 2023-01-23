package com.corejava.basics.wrappers;

public class WrapperClassesDemo3 {
    public static void main(String[] args) {

        try{
            String str = "200a";
            Integer value = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("Check the number");
        }


        String str2 = "2345.789";

        Double aDouble = Double.parseDouble(str2);
    }
}
