package io.BasicPrograms;
// Revision 2
// Task: create one array and copy the elements and print it to other array

public class CopyArray {
    // Let's call main method
    public static void main(String[] args) {
        //Creating two array. One is with elements and another is with empty array
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        System.out.println("Printing array 1");
        // Printing the array elements in arr1
        for(int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("Printing array 2");
        // Printing the array elements in arr2
        for(int j = 0; j<arr2.length; j++){
            System.out.print(arr2[j]+" ");
        }

        // copying elements from one array to another.
        for(int i=0 ; i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

        // printing array 2 to check elements are copied.
        System.out.println("\nAfter copying elements from Array 1, then Array 2 have below elements");
        for(int elements:arr2){
            System.out.print(elements+" ");
        }



    }
}
