package io.java.ExceptionHandling;

public class ExceptionSample {
    public static void main(String[] args) {
       int userInput = 2;

        try {
             userInput = Integer.parseInt("abc");
        }catch (NumberFormatException e){
            System.out.println("Enter the valid number please");
        }

        String[] fruits = {"Apple", "Banana", "Grapes", "Mango"};
        System.out.println("Users picked: "+ fruits[userInput-1]);
    }
}