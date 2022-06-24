package io.java.Collections;

import java.util.Vector;
// Revision 4
public class VectorListSample {
    public static void main(String[] args) {
        Vector<String> myList = new Vector();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.addElement("Hello"); //this is the additional feature in the vector list

        for(String s:myList){
            System.out.println(s);
        }
    }
}
