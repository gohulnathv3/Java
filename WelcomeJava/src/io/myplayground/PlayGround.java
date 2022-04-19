package io.myplayground;
public class PlayGround{
    public static void main(String[] args) {
        System.out.println("Hello guys");
        methodOne(); //calling method
        System.out.println(methodTwo(2,5));
    }
    public static void methodOne(){
        System.out.println("methodOne");
    }
    public static int methodTwo(int num1, int num2){ //parameters adding

        return num1+num2;
    }
}

class AnotherClass{
    String person_name;
    String person_gender;
    int person_age;
    void showPersonName(){
        System.out.println();
    }
}



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