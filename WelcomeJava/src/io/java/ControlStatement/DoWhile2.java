package io.java.ControlStatement;

public class DoWhile2 {
    public static void main(String[] args) {
        int x = 21, sum =0;
        do{
            sum+=x;
            x--;

        }
        while(x>10);
        System.out.println("Summation");
    }
}
