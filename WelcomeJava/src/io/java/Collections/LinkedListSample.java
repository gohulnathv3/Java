package io.java.Collections;

import java.util.LinkedList;

//this is about LinkedList sample
// Revision 4
public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();
        myList.add("H");
        myList.addFirst("A");
        myList.addLast("End");
//        myList.remove(); // it will remove the first element of linked list.

        for(String s:myList){
            System.out.println(s);
        }

    }
}
