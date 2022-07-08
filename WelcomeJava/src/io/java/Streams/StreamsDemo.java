package io.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {

       // Filtering
        String message ="{1,2,3,4,5}";

        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        // Sorting
        List<String>  names = Arrays.asList("Gohul", "Arjun", "Arun");
        List<String> sortedNames = names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
