package io.java.Collections;

import java.util.Iterator;
import java.util.ArrayList;
// Revision 4
public class HandsOnList {
    public static void main(String[] args) {
//        // Array List
        ArrayList<String> list = new ArrayList<String>(); // creating Array list
        list.add("Gohul"); // Adding objects in arraylist
        list.add("Akash");
        list.add("Ajay");
        list.add("Vicky");

        try {
            list.get(9);
        }catch (Exception e){
            System.out.println("This is not executed due to some error. "+ e);
        }
        // Traversing through iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

////         Linked List
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("Gohul");
//        list.add("Akash");
//        list.add("Ajay");
//        list.add("Vicky");
//        list.add("Vicky");
//
//        // Operations
//        list.remove("Vicky");
//
//        // Traversing through iterator
//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

    }
}
