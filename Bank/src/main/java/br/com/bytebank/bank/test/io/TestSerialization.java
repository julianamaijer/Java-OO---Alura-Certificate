package br.com.bytebank.bank.test.io;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        Client client = new Client();
        client.setName("Juliana Maijer");
        client.setOccupation("dev");
        client.setNumberRegister("35248561245");

        CheckingAccount checkingAccount = new CheckingAccount(222,333);
        checkingAccount.setHolder(client);
        checkingAccount.deposit(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(checkingAccount);
        oos.close();

    }
}
