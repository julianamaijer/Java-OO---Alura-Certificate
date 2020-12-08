package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

/*        String name = "Juliana Zanon";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
        oos.writeObject(name);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
        String name = (String)ois.readObject();
        ois.close();
        System.out.println(name);

    }
}
