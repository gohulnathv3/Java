package io.java.Serialization;
// Revision 1

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationSample {
    public static void main(String[] args) {
        Vehicle polo = new Vehicle("Volkswagen", "Polo GT", 2021);
        try {
            FileOutputStream fileout = new FileOutputStream("polo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(polo);
            out.close();
            fileout.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Serialized data is saved in polo.ser");

    }
}
