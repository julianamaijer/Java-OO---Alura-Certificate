package br.com.alura.java.io.test;

import java.io.*;
import java.net.Socket;

public class TestCopyNetwork {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream); //get the stream bits/bytes and convert to character
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //take and array and convert to lines

        OutputStream outputStream = socket.getOutputStream(); //new FileOutputStream("lorem3.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = bufferedReader.readLine();

        while (line != null && !line.isEmpty()){

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush(); //aparece no output na hora
            line = bufferedReader.readLine();

        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
