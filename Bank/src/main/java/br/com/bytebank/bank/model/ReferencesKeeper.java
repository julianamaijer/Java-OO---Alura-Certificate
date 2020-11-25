package br.com.bytebank.bank.model;

public class ReferencesKeeper {

    private Account[] references;
    private int freePosition;

    public ReferencesKeeper() {
        this.references = new Account[10];
        this.freePosition = 0;
    }

    public void add(Account ref){
        this.references[this.freePosition] = ref;
        this.freePosition++;
    }

    public int getElementsAmount() {
        return this.freePosition;
    }

    public Account getReference(int i) {
        return this.references[i];
    }
}
