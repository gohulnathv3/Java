package io.java.Strings;
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Gohul";
        String s2 = "Gohul";
        String s3 = new String("Gohul");
        String s4 = "GOHUL";


        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s1));


    }
}
