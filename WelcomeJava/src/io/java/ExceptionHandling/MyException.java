package io.java.ExceptionHandling;
// Revision 1
public class MyException extends Exception{
    String message;

    MyException(String message) {
        this.message = message;
    }
}
