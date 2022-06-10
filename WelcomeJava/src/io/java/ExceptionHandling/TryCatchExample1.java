package io.java.ExceptionHandling;
// Revision 3
public class TryCatchExample1 {
    public static void main(String[] args) {
        try
        {
            int data = 100/0;
            System.out.println("Check this block of code is executed");
            //Handling exception
        }catch (Exception e){
//            Here, we can give also custom error message
            System.out.println("Integer not divided by zero");
//            System.out.println(e);
        }

        // To check if the rest of the code is executed.
        System.out.println("Remaining code is executing");
    }
}
