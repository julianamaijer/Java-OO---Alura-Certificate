package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.ReferencesGenericKeeper;

public class TestReferencesGenericKeeper {

    public static void main(String[] args) {

        ReferencesGenericKeeper keeper = new ReferencesGenericKeeper();

        Account cc = new CheckingAccount(22,11);
        keeper.add(cc);

        Account cc2 = new CheckingAccount(22,22);
        keeper.add(cc2);

        int size = keeper.getAmountElements();
        System.out.println(size);

        Account ref = (Account) keeper.getReference(1);
        System.out.println(ref.getNumber());
    }
}
