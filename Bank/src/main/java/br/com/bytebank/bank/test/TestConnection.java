package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Connection;

public class TestConnection {

    public static void main(String[] args) {

        try (Connection connection = new Connection()){
            connection.readData();
        }catch (IllegalStateException exception){
            System.out.println("Deu erro na conexão");
        }


/*        Connection connection = null;
        try{
            connection = new Connection();
            connection.readData();
        }catch (IllegalStateException exception){
            System.out.println("Deu erro na conexão");
        }finally {
            if (connection != null){
                connection.close();
            }
        }*/
    }
}
