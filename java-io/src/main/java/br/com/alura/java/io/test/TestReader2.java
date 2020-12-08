package br.com.alura.java.io.test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestReader2 {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String accountType = lineScanner.next();
            int bankNumber = lineScanner.nextInt();
            int number = lineScanner.nextInt();
            String holder = lineScanner.next();
            double balance = lineScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d - %08d. %s: %08.2f", accountType, bankNumber, number, holder, balance);
            System.out.println(valorFormatado);

            lineScanner.close();

/*            String[] valores =  line.split(",");
            //System.out.println(Arrays.toString(valores));
            System.out.println(valores[3]);*/
        }
        scanner.close();

    }

}
