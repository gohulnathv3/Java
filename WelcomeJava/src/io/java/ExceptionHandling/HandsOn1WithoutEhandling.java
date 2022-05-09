package io.java.ExceptionHandling;

public class HandsOn1WithoutEhandling {
    public static void main(String[] args) {

        // Unchecked exceptions
//        int data = 100/0; // throw ArithmeticException
//        System.out.println(data);

        // NullPointerException
//        String s = null;
//        System.out.println(s.length());

        // ArrayIndexOutOfBoundException
        int a[] = new int[3];
        a[1] = 21;
//        a[3]  = 21;
        System.out.println(a[1]);
//        System.out.println(a[3]);

    }
}
