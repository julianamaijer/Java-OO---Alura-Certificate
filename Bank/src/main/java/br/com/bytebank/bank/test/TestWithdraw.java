package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.InsufficientFundsException;

public class TestWithdraw {

    public static void main(String[] args) {
        Account account = new CheckingAccount(123,321);
        account.deposit(200.0);

        try{
            account.withdraw(210.0);
        }catch (InsufficientFundsException exception){
            System.out.println("Exception: " + exception.getMessage());
        }

        System.out.println(account.getBalance());
    }
}
