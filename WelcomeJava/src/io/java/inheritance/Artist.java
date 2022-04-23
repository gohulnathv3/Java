package io.java.inheritance;

public class Artist implements Human { //here I extend the parent class for this child class


    public void prepareDrawing(){
        System.out.println("this is ready for drawing");
    }

    public void sleep(){
        System.out.println("Artists will sleep like this");
    }
    public void walk(){
        System.out.println("Artist is waling like this");
    }


//    public void speak(){
//        System.out.println("Artist is speak like this");
//    }

//    public void thinkingIdeas(){
//        System.out.println(name+" is ready for exploring different ideas");
//    }

    public static void main(String[] args) {
        Human a = new Artist();

//        a.name = "Arun";
//        a.age = 22;

//        a.prepareDrawing();
        a.walk();
        a.speak();
    }

}
