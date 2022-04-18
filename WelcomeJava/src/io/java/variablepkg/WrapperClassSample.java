package io.java.variablepkg;

public class WrapperClassSample {
    public static void main(String[] args) {
        //wrapper class example
        //int, String conversion using float wrapper class

        Float floatWrap = new Float(123.53f);
        System.out.println(floatWrap.getClass().getSimpleName()); //to print the type of floatWrap value

        //float to int conversion using wrapper C
        int floatToInt = floatWrap.intValue();
        System.out.println(floatToInt);
        System.out.println(((Object)floatToInt).getClass().getSimpleName()); //to get the type of primitive type


        //String conversion using wrapper class
        String floatToString = floatWrap.toString();
        System.out.println(floatToString);
        System.out.println(((Object)floatToString).getClass().getSimpleName());

        //binary to integer conversion sample
        Integer five = Integer.valueOf("101", 2);
        System.out.println(five);



    }
}
