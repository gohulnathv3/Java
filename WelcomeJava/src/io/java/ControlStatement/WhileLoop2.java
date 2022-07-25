package io.java.ControlStatement;
// Revision 3
public class WhileLoop2 {
    public static void main(String[] args) {
        int x = 1, sum = 0;
        while (x<=10){
            sum = sum+x;
            x++;
        }
        System.out.println("Summation: "+sum);
    }
}
