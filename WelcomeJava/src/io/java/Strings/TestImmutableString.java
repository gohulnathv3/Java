package io.java.Strings;

public class TestImmutableString {
    public static void main(String[] args) {
        String s = "Sachin";
//        s.concat("Tendulkar");
        s = s.concat(" Tendulkar");
        System.out.println(s);
    }
}
