package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.SavingsAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        Account cc1 = new CheckingAccount(22,33);
        Client clientCC1 = new Client();
        clientCC1.setName(("Nico"));
        cc1.setHolder(clientCC1);
        cc1.deposit(333.0);

        Account cc2 = new SavingsAccount(22,44);
        Client clientCC2 = new Client();
        clientCC2.setName(("Guilherme"));
        cc2.setHolder(clientCC2);
        cc2.deposit(444.0);

        Account cc3 = new CheckingAccount(22,11);
        Client clientCC3 = new Client();
        clientCC3.setName(("Paulo"));
        cc3.setHolder(clientCC3);
        cc3.deposit(111.0);

        Account cc4 = new SavingsAccount(22,22);
        Client clientCC4 = new Client();
        clientCC4.setName(("Ana"));
        cc4.setHolder(clientCC4);
        cc4.deposit(222.0);

        List<Account> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(cc4);

        list.sort(
                (c1, c2) -> Integer.compare(c1.getNumber(), c2.getNumber())
            );

        Comparator<Account> comparator = (Account c1, Account c2) -> {
            String nameC1 = c1.getHolder().getName();
            String nameC2 = c2.getHolder().getName();
            return nameC1.compareTo(nameC2);
        };

        list.sort(comparator);

        list.forEach(
                (account) -> System.out.println(account + ", " + account.getHolder().getName())
        ); //for each element, it works sout
    }
}


