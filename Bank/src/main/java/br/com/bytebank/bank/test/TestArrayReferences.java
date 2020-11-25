package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.SavingsAccount;

public class TestArrayReferences {

    public static void main(String[] args) {
        Object[] references = new Object[5];

        CheckingAccount account = new CheckingAccount(22,11);
        references[0] = account;

        SavingsAccount account1 = new SavingsAccount(22,22);
        references[1] = account1;

        Client client = new Client();
        references[2] = client;

        //System.out.println(account1.getNumber());
        //System.out.println(accounts[1].getNumber());

        SavingsAccount ref = (SavingsAccount) references[1];
        System.out.println(account1.getNumber());
        System.out.println(ref.getNumber());

    }
}
