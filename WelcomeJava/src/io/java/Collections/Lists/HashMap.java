package io.java.Collections.Lists;
import java.util.*;
// revision 1
public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> myMap = new java.util.HashMap<>();
        myMap.put(1, "Gohul");
        myMap.put(2, "Ajay");
        myMap.put(3, "Arun");

        for(Map.Entry m: myMap.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }
    }
}
