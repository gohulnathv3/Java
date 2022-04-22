package io.java.inheritance;

public class TempHuman {
    public static void main(String[] args) {
        Artist a = new Artist();
        Artist b = new Artist();

        if(a.equals(b)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}
