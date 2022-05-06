package io.java.Collections.Arrays;

import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator itr = list.iterator(); //getting iterator
        while (itr.hasNext()){ //check if the iterator has the elements
            System.out.println(itr.next()); // printing elements and move to next
        }

        System.out.println("\nTraversing list through for-each");
        for (String elements:list){
            System.out.println(elements);
        }

    }
}
