package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<Account> list = new LinkedList<Account>();

        Account cc = new CheckingAccount(22,11);
        list.add(cc);

        Account cc2 = new CheckingAccount(22,22);
        list.add(cc2);

        System.out.println(list.size());

        Account ref = (Account) list.get(0);

        System.out.println(ref.getNumber());

        list.remove(0);
        System.out.println("Tamanho " + list.size());

        Account cc3 = new CheckingAccount(33,331);
        list.add(cc3);

        Account cc4 = new CheckingAccount(33,332);
        list.add(cc4);

        for (int i = 0; i < list.size(); i++){
            Account oRef = list.get(i);
            System.out.println(list.get(i));
        }

        for (Account oRef : list){
            System.out.println(oRef);
        }

    }
}
