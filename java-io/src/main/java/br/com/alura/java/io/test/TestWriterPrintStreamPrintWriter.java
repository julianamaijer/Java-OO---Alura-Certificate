package br.com.alura.java.io.test;

import java.io.*;

public class TestWriterPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

/*        OutputStream outputStream = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);*/

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem2.txt"));

        //PrintStream printStream = new PrintStream(new File("lorem4.txt"));

        PrintWriter printWriter = new PrintWriter("lorem2.txt", "UTF-8");
        printWriter.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        printWriter.println();
        printWriter.println("nnfwepwe wlflfwewlef");

        printWriter.close();

    }


}
