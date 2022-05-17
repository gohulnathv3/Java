package io.java.Collections.Lists.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
// Revision 1
public class ArrayExample1 {
    public static void main(String[] args) {
//        old non-generic array list
//        ArrayList list = new ArrayList();

//        creating generic arraylist
        ArrayList<String > list = new ArrayList<String >();
        list.add("Gohul");
        list.add("b");
        list.add("c");
        // print array
        System.out.println(list);

        System.out.println("\nTraversing list through iterator");
        // iterate the list
//        Iterator itr = list.iterator();
        Iterator<String> itr = list.iterator(); //getting iterator
        while (itr.hasNext()){ //check if the iterator has the elements
            System.out.println(itr.next()); // printing elements and move to next
        }

        System.out.println("\nTraversing list through for-each");
        for (String elements:list){
            System.out.println(elements);
        }

        System.out.println("\nget() and set() method in the ArrayList");

        // get() and set() method is ArrayList
        // Both are used to access and change the element

        // accessing elements
        System.out.println("\nReturning second element in the list Array[n-1] to be added : "+list.get(1));
        list.set(1,"Babu");
        list.set(2,"Castro");

        for (String names: list){
            System.out.println("Returning elements in an array "+names);
        }


    }
}
