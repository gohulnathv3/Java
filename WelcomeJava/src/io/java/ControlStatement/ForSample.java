package io.java.ControlStatement;
// Revision 3
public class ForSample {
    public static void main(String[] args) {
        int i = 0;
        int sum=0;
        for (i =0;i<10;i++){
            sum = sum+i;
            System.out.println("Each iteration value is: "+sum);
            System.out.println("Each iteration value of i is: "+i);
        }
        System.out.println("The sum of first 10 natural numbers is "+sum);
    }
}
