package io.myplayground;

import java.util.Locale;

public class PlayGround {
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult() {
        String finalStr = "       JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy    ";
//        finalStr = finalStr.trim();
//        finalStr = finalStr.toLowerCase(Locale.ROOT);
//        finalStr = finalStr.replace(",", "-");
        finalStr = finalStr.trim().toLowerCase(Locale.ROOT).replace(",","-");

        //to create an array to store the elements to count how much of them.

        String strArray[] = finalStr.split(" ");
        return finalStr+"\nTotal words in this string is "+strArray.length;
    }
}





//    public static void main(String[] args) {
//    //logic 3 using for each loop
//
//        //create an array to store the elements for squaring numbers
//        int[] squareNumbers = new int[10];
//
//        //creating a loop to write
//        for(int i = 0; i<10; i++){
//            int square = (i+1)*(i+1);
//            squareNumbers[i] = square;
//        }
//
//        //more elegant way to print an array is by for-each loop
//        for(int square: squareNumbers){
//            System.out.println(square);
//        }




//        //logic 2 to print 10 sqr numbers to store in array.
        //Now you can see the difference in intialization of array for both logic 1 and logic 2
        // we need to always reduce the memory size of an array then only we can achieve the code efficiency and effectively
//        int[] squareNumbers = new int[10];
//        for(int i=0;i<10;i++){
//            int square = (i+1)*(i+1);
//            //to storing these numbers to array
//            squareNumbers[i] = square;
//            //to print all these square numbers in array using looping
//            System.out.println("Square numbers are :"+squareNumbers[i]);
//        }

        //       //logic 1 to print 10 squre numbers and store it in array
//        int[] squareNumbers = new int[11];
//        for(int i=1;i<=10;i++){
//            int square = i*i;
//            squareNumbers[i] = square;
//            System.out.println(squareNumbers[i]);
//        }



//one way of generating pattern in java using direct method in main class.
//public class PlayGround {
//    public static void main(String[] args) {
//        int i, j;
//        for (i = 1; i <= 10; i++) {
//            for (j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println("\n");
//        }
//
//    }
//}



//    public void String printResult(){
//        int i,j;
//        for(i=1;i<=10;i++){
//            for(j=1;j<=i;j++){
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
//
//    }



//public class PlayGround {
//
//    public static void main(String[] args) {
//        System.out.println(calAvg(7,9,11));
//    }
//
//    public static double calAvg(int a, int b, int c){
//        return (a+b+c)/3;
//    }
//}

//public class PlayGround {
//    public static void main(String[] args) {
//        Float floatwrap = Float.valueOf(234.12f);
//        int floatToint = floatwrap.intValue(); //conversion of float value to int
//        String floatToString = floatwrap.toString();
//        System.out.println(floatToint);
//        System.out.println(floatToString);
//        System.out.println(((Object)floatToint).getClass().getSimpleName());
//        System.out.println(((Object)floatToString).getClass().getSimpleName());
//    }
//}