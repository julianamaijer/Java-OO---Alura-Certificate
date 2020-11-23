package br.com.bytebank.bank.model;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String msg){
        super(msg);
    }


}
