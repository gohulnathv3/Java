package io.java.inheritance;

public class Artist extends Human { //here I extend the parent class for this child class
    public void prepareDrawing(){
        System.out.println(name+" is ready for drawing");
    }

    public void thinkingIdeas(){
        System.out.println(name+" is ready for exploring different ideas");
    }

    public static void main(String[] args) {
        Artist a = new Artist();
        a.name = "Arun";
        a.age = 22;

        a.prepareDrawing();
        a.sleep();
    }

}
