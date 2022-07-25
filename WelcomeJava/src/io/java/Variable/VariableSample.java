package io.java.Variable;

public class VariableSample{
    static final int m = 100; // static variable
    public static void main(String[] args) {
        int data = 200; // Instance Variable
        System.out.println(m);
        System.out.println("Instance variable is : "+data);
    }

    void method(){
        // Local variable cannot be static
        int n = 9; // local variable, it is used to declare the variable within method onl
    }
}
class Addition{

}