package io.java.inheritance;

public class Musician implements Human{

    Keyboard myKeyboard = new Keyboard();
    //here I extended other class
    public void speak(){ //here I'm overloading the methods with same name. due to the feature of inheritance, it calls the local methods first.
        System.out.println("Musician is speaking softly and changes his voice accordingly for the music");
    }

    public void walk(){
        System.out.println("this is how Musician walk");
    }

    public void sleep(){
        System.out.println("This is how humans will sleep like this");
    }

    public void prepareMusic(){
        System.out.println("Musician is preparing lists for singing song in the stage");
    }

    public static void main(String[] args) {
        Musician m = new Musician();

//
//        m.name = "Anirudh";
//        m.age = 21;
//        m.prepareMusic();
//        m.speak();
        System.out.println(m.myKeyboard.noOfKeys);
        m.myKeyboard.speak();
    }
}
