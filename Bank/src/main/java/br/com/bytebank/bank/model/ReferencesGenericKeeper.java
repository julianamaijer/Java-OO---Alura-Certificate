package br.com.bytebank.bank.model;

public class ReferencesGenericKeeper {

    private Object [] objects;
    private int freePosition;

    public ReferencesGenericKeeper(){
        this.objects = new Object[10];
        this.freePosition = 0;
    }

    public void add(Object ref){
        this.objects[this.freePosition] = ref;
        this.freePosition++;
    }

    public int getAmountElements(){
        return this.freePosition;
    }

    public Object getReference(int pos){
        return this.objects[pos];
    }
}
