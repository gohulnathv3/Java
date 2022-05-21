package io.java.ControlStatement;
// Revision 1
public class SwitchSample {
    public static void main(String[] args) {
        int num = 5;
        switch (num){
            case 0:
                System.out.println("Entered number is zero");
                break;
            case 1:
                System.out.println("Entered number is one");
                break;
            case 2:
                System.out.println("Entered number is two");
                break;
            case 3:
                System.out.println("Entered number is three");
                break;
            default:
                System.out.println("Sorry, your coded cases missed your guess, so entered number is "+num);
        }
    }
}
