package io.java.ExceptionHandling;

public class MyException extends Exception{
    String message;

    MyException(String message) {
        this.message = message;
    }
}
