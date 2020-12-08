package br.com.alura.java.io.test;

import java.io.*;

public class TestReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("lorem.txt"); //Input for files
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); //get the stream bits/bytes and convert to character
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //take and array and convert to lines

        String line = bufferedReader.readLine();

        while (line != null){

            System.out.println(line);
            line = bufferedReader.readLine();

        }

        bufferedReader.close(); // closing BufferedReader

    }


}
