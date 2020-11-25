package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {

    public static void main(String[] args) {

        int age = 29;
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(Integer.valueOf(29));

        System.out.println(Integer.MAX_VALUE);

        String s = args[0];

        //Integer number = Integer.valueOf(s);
        int number = Integer.parseInt(s);
        System.out.println(number);

    }
}
