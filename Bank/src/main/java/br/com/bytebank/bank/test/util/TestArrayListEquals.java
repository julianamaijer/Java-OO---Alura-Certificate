package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

import java.util.ArrayList;

public class TestArrayListEquals {

    public static void main(String[] args) {
/*
        Account cc1 = new CheckingAccount(22,11);
        Account cc2 = new CheckingAccount(22,22);

        boolean equal = cc1.isEqual(cc2);
        System.out.println(equal);*/

        ArrayList <Account> list = new ArrayList<Account>();

        Account cc = new CheckingAccount(22,11);
        list.add(cc);

        Account cc2 = new CheckingAccount(22,22);
        list.add(cc2);

        Account cc3 = new CheckingAccount(22,22);
        boolean exist = list.contains(cc3);

        System.out.println("Já existe? " + exist);

        for (Account oRef : list){
            System.out.println(oRef);
        }

    }
}
