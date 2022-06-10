package io.java.ExceptionHandling;
// Revision 2
public class HandsOn1{
    public static void main(String[] args) {
        try {
            int data = 100/0;
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Enter valid string and current error is "+e);
        }
        System.out.println("To check if program is running");

        try {
            int a[] = new int[10];
            a[12] = 23;
            System.out.println(a[12]);
        }catch(Exception e){
            System.out.println("Please enter value between 0 and 9 and current error is "+e);
        }

    }
}
