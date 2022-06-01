package io.java;
// Revision 2
public class ArraySample {
    public static void main(String[] args) {
        int[] myIntArray = new int[5]; //this one way of declaring elements in array
        String[] myStringArray = {"Hello", "World", "one", "two", "three"}; //this is another way of creating elements
        myIntArray[0] = 56;
        myIntArray[1] = 54;
        myIntArray[2] = 44;
        myIntArray[3] = 42;
        myIntArray[4] = 53;
        System.out.println(myIntArray[0]); //this is one way of getting elements from an array.

//        for(int elements: myIntArray){
//            System.out.println(elements); //this is another way of getting all the elements in an array.
//        }

        System.out.println(myStringArray[1]);

//        for(String elements: myStringArray){
//            System.out.println(elements);
//        }

    }
}
