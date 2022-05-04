package io.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HandsOnList {
    public static void main(String[] args) {
//        // Array List
//        ArrayList<String> list = new ArrayList<String>(); // creating Array list
//        list.add("Gohul"); // Adding objects in arraylist
//        list.add("Akash");
//        list.add("Ajay");
//        list.add("Vicky");
//        // Traversing through iterator
//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        // Linked List
        LinkedList<String> list = new LinkedList<String>();
        list.add("Gohul");
        list.add("Akash");
        list.add("Ajay");
        list.add("Vicky");

        // Traversing through iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
