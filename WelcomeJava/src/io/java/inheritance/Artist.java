package io.java.inheritance;
// Revision 2
public class Artist extends Human {

    public void walk(){
        System.out.println("This is from Artist!!");
    }

    public static void main(String[] args) {

        Artist a = new Artist();
        a.walk();
        a.speak();

    }

}

//    //here I extend the parent class for this child class
//
//
//    public void prepareDrawing(){
//        System.out.println("this is ready for drawing");
//    }
//
//    public void sleep(){
//        System.out.println("Artists will sleep like this");
//    }
//    public void walk(){
//        System.out.println("Artist is waling like this");
//    }
//
//    //here we're declaring speak to choose which method we would like to call whether it's from Human or HumanTempInterface
//
//    public void speak() {
//        HumanTempInterface.super.speak();
//    }
//
//
////    public void speak(){
////        System.out.println("Artist is speak like this");
////    }
//
////    public void thinkingIdeas(){
////        System.out.println(name+" is ready for exploring different ideas");
////    }
//
//    public static void main(String[] args) {
//        Human a = new Artist();
//
////        a.name = "Arun";
////        a.age = 22;
//
////        a.prepareDrawing();
//        a.walk();
//        a.speak();
//    }


