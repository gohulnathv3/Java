package io.java.ExceptionHandling;
// Revision 1
public class ExceptionSample {
    public static void main(String[] args) {

        try {
            doSomething();
            throw new MyException("My message");
        }catch (NumberFormatException e){
            System.out.println("Enter the valid number please");
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Enter the numbers between 1 and 4");
            //another way of throwing exception
            throw new ArrayIndexOutOfBoundsException("Enter the numbers between 1 and 4");
        }catch (MyException e){
            System.out.println("This is from my customized exception handling");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
//        finally {
//            System.out.println("This finally block will execute always");
//        }
    }
    public static void doSomething(){
        int userInput,userInput2;
        userInput = Integer.parseInt("1");
        userInput2 = Integer.parseInt("2");
        String[] fruits = {"Apple", "Banana", "Grapes", "Mango"};
        System.out.println("Users picked: "+ fruits[userInput-1]);
        System.out.println("Users picked: "+ fruits[userInput2-1]);
    }

}