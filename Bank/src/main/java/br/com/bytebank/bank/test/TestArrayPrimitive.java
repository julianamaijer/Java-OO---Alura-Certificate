package br.com.bytebank.bank.test;



public class TestArrayPrimitive {

    public static void main(String[] args) {

        int [] age = new int [5];

        for (int i = 0; i < age.length; i++){
            age[i] = i * i;
        }

        for (int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }
    }
}
