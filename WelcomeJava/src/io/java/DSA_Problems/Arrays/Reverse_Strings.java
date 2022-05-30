package io.java.DSA_Problems.Arrays;

// Write a program to reverse the array or string
public class Reverse_Strings {
    static void reverseArray(int[] arr, int start, int end){
        int temp;
        if(start>=end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

    static void printArray(int arr[], int size){
        for(int i =0; i< size; i++)
            System.out.println(arr[i]+" ");
        System.out.println("");
    }
   
   // declaring main method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        printArray(arr, len);
        reverseArray(arr, 0, len-1);
        System.out.println("Reversed array is : ");
        printArray(arr,len);
    }

}
