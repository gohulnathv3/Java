package io.myplayground;
public class PlayGround {

    public static void main(String[] args) {
        System.out.println(calAvg(7,9,11));
    }

    public static double calAvg(int a, int b, int c){
        return (a+b+c)/3;
    }
}

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