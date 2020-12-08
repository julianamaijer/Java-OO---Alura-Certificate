package br.com.bytebank.bank.test.io;

import br.com.bytebank.bank.model.CheckingAccount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cc.bin"));
        CheckingAccount checkingAccount = (CheckingAccount) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.getHolder());

    }
}
