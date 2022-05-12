package DataStructures.Arrays;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        // Single dimensional array
        int array[] = new int[4];

        // Initialization
        array[0] = 10;
        array[1] = 11;
        array[2] = 12;
        array[3] = 13;

        // Print array with index
        System.out.println("Print the array with index");
        System.out.println(array[0]);

        // Print all the elements in the array
        for(int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }

        // Getting input from user to store data into array
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements you want to add ?");
        int n = input.nextInt();

        int array_input[] = new int[n];
        System.out.println("Enter "+ n + " Elements: ");
        for(int i=0;i<n;i++){
            array_input[i]= input.nextInt();
        }

        
    }
}
