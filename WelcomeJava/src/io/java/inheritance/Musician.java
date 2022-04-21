package io.java.inheritance;

public class Musician extends Human{ //here I extended other class
    public void speak(){ //here I'm overloading the methods with same name. due to the feature of inheritance, it calls the local methods first.
        System.out.println(name+" is speaking softly and changes his voice accordingly for the music");
    }

    public void prepareMusic(){
        System.out.println(name+" is preparing lists for singing song in the stage");
    }

    public static void main(String[] args) {
        Musician m = new Musician();
        m.name = "Anirudh";
        m.age = 21;
        m.prepareMusic();
        m.speak();
    }
}
