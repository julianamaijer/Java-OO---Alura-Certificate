package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestOthersWrappers {

    public static void main(String[] args) {

        Integer ageRef = Integer.valueOf(29); //autoboxing
        System.out.println(ageRef.doubleValue()); //unboxing

        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        Number number = Float.valueOf(29);

        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(32.6);
        list.add(10.5f);

    }
}
