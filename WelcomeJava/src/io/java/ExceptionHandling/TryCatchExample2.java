package io.java.ExceptionHandling;
// Revision 2
public class TryCatchExample2 {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;

        // try-catch " RESOLVE the exception in catch block
        try
        {
            data = i/j; // may throw exception
        }catch (Exception e){ // Handling exception
            data = i/(j+1); // Resolving the exception
            System.out.println(data);
        }
    }
}
