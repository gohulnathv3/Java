package io.java.methodspkg;
// Revision 1

public class MethodSample2 {
    public static void main(String[] args) {
        MethodSample2 obj = new MethodSample2();
        obj.sayHellotoGender("male");

    }
    public void sayHellotoGender(String gender){
//        String result = gender.equals("Male")? "Hello, Sir": "Hello, Madam";

        String result = gender.equalsIgnoreCase("Male")? "Hello, Sir": "Hello, Madam"; //equalsIgnoreCase is used to find the text either in uppercase or lower case.
        System.out.println(result);
    }
}
