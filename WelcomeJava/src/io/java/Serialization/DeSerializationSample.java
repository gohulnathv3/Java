package io.java.Serialization;
// Revision 1

import java.io.*;


public class DeSerializationSample {
    public static void main(String[] args) {
        Vehicle polo = null;
        try {
            FileInputStream fileIn = new FileInputStream("polo.ser");
            ObjectInputStream in= new ObjectInputStream(fileIn);
            polo = (Vehicle)in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(polo.model);
    }
}
