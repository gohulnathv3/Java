package io.java.ExceptionHandling;
// Revision 1
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample3 {
    public static void main(String[] args) {
        PrintWriter pw;

        try{
//            pw = new PrintWriter("goh.txt");
            pw = new PrintWriter("");
            pw.println("saved");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        // check the program flow
        System.out.println("File Saved Successfully");
    }
}
