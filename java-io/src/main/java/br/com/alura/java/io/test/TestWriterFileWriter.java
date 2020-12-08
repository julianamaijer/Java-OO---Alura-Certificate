package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriterFileWriter {

    public static void main(String[] args) throws IOException {

/*        OutputStream outputStream = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);*/

        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("lorem2.txt"));
        bufferedWriter.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        bufferedWriter.newLine();
        bufferedWriter.write("amv,sdp aldnfskfnfks");

        bufferedWriter.close();

    }


}
