package io.java.Collections;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("IN", "India");
        myMap.put("US", "America");
        myMap.put("CAD", "Canada");
        myMap.put("UK", "London");

        System.out.println(myMap.get("IN"));

    }
}
