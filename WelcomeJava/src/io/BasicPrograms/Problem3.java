package io.BasicPrograms;

import java.util.Scanner;
// Revision 2
public class Problem3 {
    public static void main(String[] args) {
        // declare the required data type and variable to store the data
        int num;
        // To deliver the message to user to do
        System.out.println("Enter the number: ");
        // For scanning purpose, we created a scanner object.
        Scanner input = new Scanner(System.in);
        num = input.nextInt(); // read user input

        System.out.println("Entered number is: "+num); // user output
    }
}
