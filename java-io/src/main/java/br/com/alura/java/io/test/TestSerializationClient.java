package br.com.alura.java.io.test;

import java.io.*;

public class TestSerializationClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Client client = new Client();
        client.setName("Juliana Maijer");
        client.setOccupation("dev");
        client.setNumberRegister("35248561245");

/*        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("client.bin"));
        oos.writeObject(client);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("client.bin"));
        Client client1 = (Client) ois.readObject();
        ois.close();
        System.out.println(client1.getName());

    }
}
