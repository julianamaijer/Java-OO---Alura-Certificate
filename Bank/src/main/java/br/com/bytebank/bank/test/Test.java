package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.SavingsAccount;

public class Test {

    public static void main(String[] args) {

        Object cc = new CheckingAccount(22, 33);
        Object cp = new SavingsAccount(33,22);

        System.out.println(cc);
        System.out.println(cp);
    }
}
